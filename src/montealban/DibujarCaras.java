/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montealban;

/**
 *
 * @author kevin
 */
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author DamianBautista
 */
public class DibujarCaras {
    
    public void drawRect(float x, float y, float z) {
        glBegin(GL_QUADS);

        //Carafrontal
        glNormal3f(0, 0, 1);
        glTexCoord2d(0, 0);glVertex3d(-x, -0, 0);
        glTexCoord2d(0, 1);glVertex3d(0, -0, 0);
        glTexCoord2d(1, 1);glVertex3d(0, y, 0);
        glTexCoord2d(1, 0);glVertex3d(-x, y, 0);
        
        //posterior
        glNormal3f(0, 0, -1);
        glTexCoord2d(0, 0);glVertex3d(0, -0, -z);
        glTexCoord2d(0, 1);glVertex3d(-x, -0, -z);
        glTexCoord2d(1, 1);glVertex3d(-x, y, -z);
        glTexCoord2d(1, 0);glVertex3d(0, y, -z);

        //izquierda
        glNormal3f(-1, 0, 0);
        glTexCoord2d(0, 0);glVertex3d(-x, -0, -z);
        glTexCoord2d(0, 1);glVertex3d(-x, -0, 0);        
        glTexCoord2d(1, 1);glVertex3d(-x, y, 0);
        glTexCoord2d(1, 0);glVertex3d(-x, y, -z);

        //derecha
        glNormal3f(1, 0, 0);
        glTexCoord2d(0, 0);glVertex3d(0, -0, 0);
        glTexCoord2d(0, 1);glVertex3d(0, -0, -z);
        glTexCoord2d(1, 1);glVertex3d(0, y, -z);
        glTexCoord2d(1, 0);glVertex3d(0, y, 0);

        //superior
        glNormal3f(0, 1, 0);
        glTexCoord2d(0, 0);glVertex3d(-x, y, 0);
        glTexCoord2d(0, 1);glVertex3d(0, y, 0);
        glTexCoord2d(1, 1);glVertex3d(0, y, -z);
        glTexCoord2d(1, 0);glVertex3d(-x, y, -z);

        //inferior
        glNormal3f(0, -1, 0);
        glTexCoord2d(0, 0);glVertex3d(-x, -0, 0);
        glTexCoord2d(0, 1);glVertex3d(0, -0, 0);
        glTexCoord2d(1, 1);glVertex3d(0, -0, -z);
        glTexCoord2d(1, 0);glVertex3d(-x, -0, -z);
        glEnd();
    }
}
