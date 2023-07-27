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
import com.sun.j3d.loaders.objectfile.ObjectFile;
import java.io.*;
import java.util.logging.*;
import javafx.scene.Scene;
import org.lwjgl.*;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;
import org.newdawn.slick.opengl.*;

/**
 *
 * @author DamianBautista
 */
public class Piramide {

    public static Camara cam;

    public static void main(String[] args) {
        System.setProperty("org.lwjgl.librarypath",new File("D:\\OpenGL\\slick").getAbsolutePath());

        initDisplay();
        initGL();
        modelLoop();
        cleanUp();
    }
    
    public static void initGL() {
        cam = new Camara(70, (float) Display.getWidth() / Display.getHeight(), 0.3f, 1000);

        glClearColor(0, 0, 0, 1);
        glEnable(GL_DEPTH_TEST);// Si dibujamos objetos, no se sobreponen, no se mezclan
        //glEnable(GL_CULL_FACE);// Optimizacion, dibujar solo lo que está en pantalla
        glEnable(GL_LIGHTING);//Crear luces
        glEnable(GL_LIGHT0);//Posicionar luz
        glEnable(GL_COLOR_MATERIAL);// proporcionar color 
        glEnable(GL_TEXTURE_2D);// agregar texturas

    }

    public static void modelLoop() {
        Paredes cubos = new Paredes();
        Texture cesped = loadTexture("cesped");//blanquito
        //Texture tpared = loadTexture("tpared");
        Texture piramide = loadTexture("Apiramide");
        Texture piedra =  loadTexture("piedra");
        Texture muro =  loadTexture("muro");
        Texture suelo =  loadTexture("sueloF");
        
        ObjectFile loader = new ObjectFile(ObjectFile.RESIZE);
        Scene s = null;
        File file = new java.io.File("src/modelo/Piramide1.obj");

		
        
        //Imagenes de los muros 
        Texture muroPared =  loadTexture("dibujo");
        Texture cultura =  loadTexture("cultura");
        
        Texture zapoteca =  loadTexture("Zapoteca");
        
        Texture danza =  loadTexture("danza");
        Texture danzantepared =  loadTexture("DanzantePared");
        
        Texture cartel =  loadTexture("cartel");
        Texture carteldanzantes =  loadTexture("danzantes");
        Texture sol =  loadTexture("sol");
        Texture luna =  loadTexture("luna");
        Texture plaza =  loadTexture("granPlaza");
        Texture mono =  loadTexture("Grieta");
        Texture tumbac =  loadTexture("tumba");
        Texture esqueleto =  loadTexture("esqueleto");
        
        Texture piernad =  loadTexture("piernader");
        Texture piernai =  loadTexture("piernaIzq");
        Texture cuerpos =  loadTexture("cuerpo");
        Texture blazos =  loadTexture("blazo");
        Texture cabezas =  loadTexture("cabeza");
        Texture caras =  loadTexture("cara");
        
        while (!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glShadeModel(GL_SMOOTH);

            glLoadIdentity();

            cam.useView();

            cesped.bind();
            //cubos.terceraPiramide();
            
            glBegin(GL_QUADS);
            {
                glNormal3f(0, 1, 0);
                glTexCoord2f(0, 0);
                glVertex3f(-400f, 1f, -400f); // Vértice superior derecho
                glTexCoord2f(10, 0);
                glVertex3f(-400f, -1f, 400f); // Vértice superior izquierdo
                glTexCoord2f(10, 10);
                glVertex3f(400f, -1f, 400f); // Vértice inferior izquierdo
                glTexCoord2f(0, 10);
                glVertex3f(400f, -1f, -400f); // Vértice inferior derecho
            }
            glEnd();
            
            caras.bind();
            cubos.cara();
            
            cabezas.bind();
            cubos.cabeza();
            
            blazos.bind();
            cubos.blazo();
            
            cuerpos.bind();
            cubos.cuerpo();
            
            piernai.bind();
            cubos.piernaIzq();

            piernad.bind();
            cubos.piernaDer();
            
            muroPared.bind();
            cubos.muroPrimera();
            
            esqueleto.bind();
            cubos.carteTumba();
            
            cartel.bind();
            cubos.primerCarte();
            
            mono.bind();
            cubos.gritamono();
            
            tumbac.bind();
            cubos.tumba();
            
            plaza.bind();
            cubos.granCartel();
            
            sol.bind();
            cubos.solCartel();
            
            
            luna.bind();
            cubos.lunaCartel();
            
            carteldanzantes.bind();
            cubos.danzantesCarte();
            
            cultura.bind();
            cubos.culturaPared();
            cubos.mono();
            
            zapoteca.bind();
            cubos.zapotecaPared();
            
            danza.bind();
            cubos.danzaPared();
            
            danzantepared.bind();
            cubos.danzantePared();
            
            piramide.bind();
            cubos.drawCubeF();
            cubos.segundaPiramideVerde();
            cubos.terceraPiramideV();
           
            
            
            piedra.bind();
            cubos.piedraP();
            cubos.trianguloH1();
            cubos.segundaPiramideEscalera();
            cubos.terceraPiramideGris();
            
            
            muro.bind();
            cubos.segundaPiramide();
            cubos.CuartaPiramide();
            
            
            suelo.bind();
            cubos.terceraPiramide();
            cubos.trianguloZonaVerde();
            
            
            
            

            
//1024 *//1024
            controles();
            Display.update();
        }
    }



    

    public static void controles() {
        boolean forward = Keyboard.isKeyDown(Keyboard.KEY_W);
        boolean backward = Keyboard.isKeyDown(Keyboard.KEY_S);
        boolean left = Keyboard.isKeyDown(Keyboard.KEY_A);
        boolean right = Keyboard.isKeyDown(Keyboard.KEY_D);
        boolean subir = Keyboard.isKeyDown(Keyboard.KEY_E);
        boolean bajar = Keyboard.isKeyDown(Keyboard.KEY_Q);
        boolean reset = Keyboard.isKeyDown(Keyboard.KEY_R);
        boolean reset2 = Keyboard.isKeyDown(Keyboard.KEY_T);

        boolean pos = Keyboard.isKeyDown(Keyboard.KEY_SPACE);
        boolean coords = Keyboard.isKeyDown(Keyboard.KEY_P);
        float mx = Mouse.getDX();
        float my = Mouse.getDY();
        mx *= 0.10f;
        my *= 0.10f;
        float velMov = 0.09f;

        if (coords) {
            System.out.println("coorX=" + cam.getX());
            System.out.println("coorY=" + cam.getY());
            System.out.println("coorZ=" + cam.getZ());
            System.out.println("EcoorX=" + cam.getRx());
            System.out.println("EcoorY=" + cam.getRy());
            System.out.println("EcoorZ=" + cam.getRz());
        }
        if (forward && permitido()) {
             cam.moveZ(velMov);

        }

        if (backward) {
            cam.moveZ(-velMov);
        }
        if (left) {
            cam.moveX(velMov);
        }
        if (right) {
            cam.moveX(-velMov);
        }
        if (subir) {
            if (cam.getY() >= -50) {
                cam.moveY(-velMov);
            }
        }
        if (bajar) {
            if (cam.getY() <= 0.5) {
                cam.moveY(velMov);
            }
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            for (int aux = 0; aux <= 1; aux++) {
            }
        }

        if (Mouse.isButtonDown(0)) {
            cam.rotateY(mx);
            cam.rotateX(-my);
        }
        if (Mouse.isButtonDown(1)) {
            cam.rotateY(mx);
            cam.rotateY(-my);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
            cleanUp();
        }
        if (reset) {
            cam.setX(7);
            cam.setZ(-7);
            cam.setY(-7);
            cam.setRx(0);
            cam.setRz(0);
            cam.setRy(90);
        }
        if (reset2) {
            cam.setX(-22);
            cam.setZ(-7);
            cam.setY(-7);
            cam.setRx(32);
            cam.setRz(0);
            cam.setRy(269);
        }

    }

    public static boolean permitido() {
        float x = cam.getX(), y = cam.getY(), z = cam.getZ();
        //pare izquierda
        if (z > 0 && z < 17 && x > 14.5 && x < 15.6 && y < 0 && y > -10) {
            return false;
        }
        if (z > 19 && z < 30 && x > 14.5 && x < 15.6 && y < 0 && y > -10) {
            return false;
        }
        //b
        if (z > 2.5 && z < 3.5 && x > 7.2 && x < 7.9 && y < 0 && y > -10) {
            return false;
        }
        //pared derecha
        if (z > 0 && z < 30 && x > -0.45 && x < 0.6 && y < 0 && y > -10) {
            return false;
        }
        //pared atras
        if (z > 29 && z < 30.5 && x > 0 && x < 15 && y < 0 && y > -10) {
            return false;
        }
        //pared adelante
        if (z > 7.5 && z < 8.5 && x > 0 && x < 4.5 && y < 0 && y > -10) {
            return false;
        }
        if (z > 7.5 && z < 8.5 && x > 7.5 && x < 15.6 && y < 0 && y > -10) {
            return false;
        }
        //pared adentro
        if (z > 19.5 && z < 22.4 && x > 7.5 && x < 15.6 && y < 0 && y > -10) {
            return false;
        }
        
        //pared derecha dentro y bañera
        if (z > 18.4 && z < 22.4 && x > 0.5 && x < 5.4 && y < 0 && y > -10) {
            return false;
        }
        
        if (z > 18.4 && z < 22.4 && x > 0.5 && x < 5.4 && y < 0 && y > -10) {
            return false;
        }
        //CAMA
        if (z > 25.5 && z < 30 && x > 10.5&& x < 14.2 && y < 0 && y > -2) {
            return false;
        }
        //pared cuarto
        if (z > 24 && z < 30 && x >7.1 && x <8 && y < 0 && y > -5.5) {
            return false;
        }
        if (z > 24.6 && z < 25.5 && x >0.1 && x <5 && y < 0 && y > -5.5) {
            return false;
        }
        //sillones
        if (z > 10.7 && z < 15.3 && x >8.7 && x <10.4 && y < 0 && y > -1.5) {
            return false;
        }
        if (z > 15 && z < 16.8 && x >10.6&& x <14.4 && y < 0 && y > -1.5) {
            return false;
        }
        //comedor
        if (z > 10.4 && z < 14.9 && x >4.1&& x <7.1 && y < 0 && y > -2) {
            return false;
        }
        //cosina
        if (z > 8 && z < 17.5 && x >0.1&& x <2.1 && y < 0 && y > -4) {
            return false;
        }  
        //mesa afuera
        if (z > 5 && z < 8 && x >0.1&& x <1.5 && y < 0 && y > -2) {
            return false;
        } 
        
        return true;
    }

    public static void cleanUp() {
        Display.destroy();
        System.exit(0);
    }

    public static void initDisplay() {
        try {
            //Display.setDisplayMode(new DisplayMode(1600, 900));
            Display.setDisplayMode(new DisplayMode(1700, 900));
            Display.setTitle("PIRAMIDES");
            Display.create();
        } catch (LWJGLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }

    public static Texture loadTexture(String key) {
        try {
            return TextureLoader.getTexture("png", new FileInputStream(
                    new File("src//Imagenes//" + key + ".png")));

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Texture loadTextureJPG(String key) {
        try {
            return TextureLoader.getTexture("jpg", new FileInputStream(
                    new File("src//Imagenes//" + key + ".jpg")));

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(
                    Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean colision(float x1, float y1, float ancho, float alto, float x2, float y2, float anchoM, float altoM) {
        if (x2 > x1 && x2 < x1 + ancho && y2 > y1 && y2 < y1 + alto) {
            return true;
        } else {
            return false;
        }
    }
}
