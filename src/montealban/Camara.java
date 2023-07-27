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
import org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;
import org.lwjgl.util.glu.GLU.*;
import static org.lwjgl.util.glu.GLU.gluPerspective;

/**
 *
 * @author DamianBautista
 */
public class Camara {
    private float x, y, z, rx, ry, rz;//Variables para moverse
    private float fov, aspect, near, far;//Variables de acercamiento
    
    public Camara(float fov, float aspect, float near, float far){
        x = 10; 
        y = -1; 
        z = 4;
        rx = 0; 
        ry = 90; 
        rz = 0;
        
        this.fov = fov;
        this.aspect = aspect;
        this.near = near;
        this.far = far;
        
        initProjection();
    }
    
    public void initProjection(){
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();//Reemplaza la matriz actual con la matriz identidad.
        gluPerspective(fov,aspect,near,far);//Especifica la distancia desde el espectador
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();//Reemplaza la matriz actual con la matriz identidad.
    }
    
    public void useView(){
        glRotatef(rx,1,0,0);//calcula una matriz que realiza
        glRotatef(ry,0,1,0);//una rotación en sentido antihorario
        glRotatef(rz,0,0,1);//de grados
        glTranslatef(x,y,z);
    }
    
    public float getX(){return x;}
    public void setX(float x){this.x = x;}
    
    public float getY(){return y;}
    public void setY(float y){this.y = y;}
    
    public float getZ(){return z;}
    public void setZ(float z){this.z = z;}
    
    public float getRx(){return rx;}
    public void setRx(float rx){this.rx = rx;}
    
    public float getRy(){return ry;}
    public void setRy(float ry){this.ry = ry;}
    
    public float getRz(){return rz;}
    public void setRz(float rz){this.rz = rz;}
    
    public void moveX(float amt){
        z += amt * Math.sin(Math.toRadians(ry));
        x += amt * Math.cos(Math.toRadians(ry));
    }
    
    public void moveY(float amt){
        y += amt;
    }
    
    public void moveZ(float amt){
        z += amt * Math.sin(Math.toRadians(ry+90));
        x += amt * Math.cos(Math.toRadians(ry+90));
    }
    
    public void rotateX(float amt){rx+=amt;}
    
    public void rotateY(float amt){ry+=amt;}
    
    public void rotateZ(float amt){rz+=amt;}
}
