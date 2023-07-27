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
import org.newdawn.slick.opengl.Texture;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.glu.Cylinder;
import org.lwjgl.util.glu.Disk;

/**
 *
 * @author DamianBautista
 */
public class Paredes {

    DibujarCaras dC = new DibujarCaras();
    
    public final static int NUMERO = 20;
    private float x = 0;
    private float y = 0;
    
    /*Codigo para el modelo 
    */
    
    
    
    //-*********---------------PRIMERA PIRAMIDE--------------*********--//

    public void drawCubeF() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, -0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(0, 0, 0);

            /**
             * ********Paredes frontales*********
             */
            glTranslated(0, 0, 0);
            dC.drawRect(28f, 10f, 15f);//atras c1
            glTranslated(0, 0, 0);
            
            //Primer cuadrado Izquierdo, Edificio H
            glTranslated(-2, 10.8, -2);
            dC.drawRect(4f, 0.2f, 5f);//atras c1
            glTranslated(2, -10.8, 2);
            
            //Primer cuadrado Izquierdo, Edificio H
            glTranslated(-22, 10.8, -2);
            dC.drawRect(4f, 0.2f, 5f);//atras c1
            glTranslated(22, -10.8, 2);
            
            //Segundo piso, parte superior verde sona verde del edificio
            glTranslated(-7, 12.8, -2);
            dC.drawRect(14f, 0.2f, 8f);
            glTranslated(7, -12.8, 2);
            
            
            //-************EDIFICIO I Y G ***************-//

            //--*****************SEGUNDO PISO DEL EDIFICIO I Y G parte verde--------------*******//
            // ancho de la segunda base
            glTranslated(21.01, 8.8, -0);
            dC.drawRect(15f, 0.2f, 15f);//atras c1
            glTranslated(-21.01, -8.8, 0);
            
           
            //Piedra ancho de la segunda base
            glTranslated(-36.01, 8.8, -0);
            dC.drawRect(15f, 0.2f, 15f);//atras c1
            glTranslated(36.01, -8.8, 0);
            
            //--*****************Terser piso PISO DEL EDIFICIO I Y G--------------*******//
            // ancho de la tercera base
            glTranslated(18.01, 12.8, -3);
            dC.drawRect(9f, 0.2f, 9f);//atras c1
            glTranslated(-18.01, -12.8, 3);
            
            
            //Piedra ancho de la tercera base
            glTranslated(-39.01, 12.8, -3);
            dC.drawRect(9f, 0.2f, 9f);//atras c1
            glTranslated(39.01, -12.8, 3);
            
            
            
            
            //ESCALERAS DE LADO IZQUIERDO Y DERECHO 
            
            
           
           
        }
        glEnd();

    }
    
    public void piedraP() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, -0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(0, 0, 0);

            
            //-----Base de la piramide Edificio H-----
            //Piedra primer ancho de la base
            glTranslated(3.01, 0, 0);
            dC.drawRect(3f, 10f, 15f);//atras c1
            glTranslated(-3.01, 0, 0);
            
           
            //Piedra ancho de la base
            glTranslated(-28.01, 0, 0);
            dC.drawRect(3f, 10f, 15f);//atras c1
            glTranslated(28.01, 0, 0);
            
            //---
            
            
           
            
            
            
            
            
         //-----------Escaleras--------------    
            //ESCALERAS
            glTranslated(3, 0, 1.01);
            dC.drawRect(34f, 9f, 1f);//atras c1
            glTranslated(-3, 0, -1.01);
            
            glTranslated(3, 0, 2);
            dC.drawRect(34f, 8f, 1f);//atras c1
            glTranslated(-3, 0, -2);
            
            glTranslated(3, 0, 3);
            dC.drawRect(34f, 7f, 1f);//atras c1
            glTranslated(-3, 0, -3);
            
            glTranslated(3, 0, 4);
            dC.drawRect(34f, 6f, 1f);//atras c1
            glTranslated(-3, 0, -4);
            
            glTranslated(3, 0, 5);
            dC.drawRect(34f, 5f, 1f);//atras c1
            glTranslated(-3, 0, -5);
            
            glTranslated(3, 0, 6);
            dC.drawRect(34f, 4f, 1f);//atras c1
            glTranslated(-3, 0, -6);
            
            glTranslated(3, 0, 7);
            dC.drawRect(34f, 3f, 1f);//atras c1
            glTranslated(-3, 0, -7);
            
            glTranslated(3, 0, 8);
            dC.drawRect(34f, 2f, 1f);//atras c1
            glTranslated(-3, 0, -8);
            
            glTranslated(3, 0, 9);
            dC.drawRect(34f, 1f, 1f);//atras c1
            glTranslated(-3, 0, -9);
            
            glTranslated(3, 0, 10);
            dC.drawRect(34f, 0.09f, 1f);//atras c1
            glTranslated(-3, 0, -10);
            
            
            
            
            //Escaleras Segundo ancho
            glTranslated(3, 0, -15.01);
            dC.drawRect(34f, 9f, 1f);//atras c1
            glTranslated(-3, 0, 15.01);
            
            glTranslated(3, 0, -16);
            dC.drawRect(34f, 8f, 1f);//atras c1
            glTranslated(-3, 0, 16);
            
            glTranslated(3, 0, -17);
            dC.drawRect(34f, 7f, 1f);//atras c1
            glTranslated(-3, 0, 17);
            
            glTranslated(3, 0, -18);
            dC.drawRect(34f, 6f, 1f);//atras c1
            glTranslated(-3, 0, 18);
            
            glTranslated(3, 0, -19);
            dC.drawRect(34f, 5f, 1f);//atras c1
            glTranslated(-3, 0, 19);
            
            glTranslated(3, 0, -20);
            dC.drawRect(34f, 4f, 1f);//atras c1
            glTranslated(-3, 0, 21);
            
            glTranslated(3, 0, -22);
            dC.drawRect(34f, 3f, 1f);//atras c1
            glTranslated(-3, 0, 22);
            
            glTranslated(3, 0, -23);
            dC.drawRect(34f, 2f, 1f);//atras c1
            glTranslated(-3, 0, 23);
            
            glTranslated(3, 0, -24);
            dC.drawRect(34f, 1f, 1f);//atras c1
            glTranslated(-3, 0, 24);
            
            glTranslated(3, 0, -25);
            dC.drawRect(34f, 0.09f, 1f);//atras c1
            glTranslated(-3, 0, 25);
            
            //------------SEGUNDO PISO DEL EDIFICIO---------------
           
            glTranslated(-7, 10, -3);
            dC.drawRect(14f, 2.8f, 8f);
            glTranslated(7, -10, 3);
            
            
            
     //------CUADRADOS DEL SEGUNDO PISO DEL EDIFICIO
            
            //Segundo cuadrado Izquierdo, Edificio H
            glTranslated(-2, 10, -3);
            dC.drawRect(4f, 0.8f, 5f);//atras c1
            glTranslated(2, -10, 3);
            
            //Segundo cuadrado Izquierdo, Edificio H
            glTranslated(-22, 10, -3);
            dC.drawRect(4f, 0.8f, 5f);//atras c1
            glTranslated(22, -10, 3);
            
            
            
    
            
            //-----MMUROS SUPERIORES DEL EDIFISIO h--------
            //Muro mas largo
            glTranslated(-8, 13.01, -4);
            dC.drawRect(12f, 4f, 1f);
            glTranslated(8, -13.01, 4);
            
            //Primer muro del lado
            glTranslated(-8, 13.01, -5);
            dC.drawRect(1f, 4f, 5f);
            glTranslated(8, -13.01, 5);
            
            //Segundo muro de alado 
            glTranslated(-19, 13.01, -5);
            dC.drawRect(1f, 4f, 5f);
            glTranslated(19, -13.01, 5);
            
            //Primer muro de lado de enfrente 
            glTranslated(-9, 13.01, -9);
            dC.drawRect(3f, 4f, 1f);
            glTranslated(9, -13.01, 9);
            
            //Segundo muro del lado de enfrente
            glTranslated(-16, 13.01, -9);
            dC.drawRect(3f, 4f, 1f);
            glTranslated(16, -13.01, 9);
            
            //Muro central del segundo piso
            //Primer muro centra 
            glTranslated(-16, 13.01, -6.5);
            dC.drawRect(3f, 4f, 1f);
            glTranslated(16, -13.01, 6.5);
            
            //Segundo muro central
            glTranslated(-9, 13.01, -6.5);
            dC.drawRect(3f, 4f, 1f);
            glTranslated(9, -13.01, 6.5);
            
            //--------ESCALERAS DEL PISO SUPERIRO-------------
            glTranslated(-8, 10.01, -11);
            dC.drawRect(12f, 3f, 1f);
            glTranslated(8, -10.01, 11);
            
            glTranslated(-8, 10.01, -12);
            dC.drawRect(12f, 2f, 1f);
            glTranslated(8, -10.01, 12);
            
            glTranslated(-8, 10.01, -13);
            dC.drawRect(12f, 1f, 1f);
            glTranslated(8, -10.01, 13);
            
            
            //--CUBOS QUE SE ENCUENTRAN A LADO DE LA ESCALERA DEL SEGUNDO PISO 
            //primer cubo 
            glTranslated(-5, 10.01, -10);
            dC.drawRect(4f, 3f, 4f);
            glTranslated(5, -10.01, 10);
            
            //Segundo piso
            glTranslated(-19, 10.01, -10);
            dC.drawRect(4f, 3f, 4f);
            glTranslated(19, -10.01, 10);
            
            
            
            
            
            //-************EDIFICIO I Y G ***************-//
            
            //Piedra primer ancho de la base
            glTranslated(26.01, 0, 4);
            dC.drawRect(25f, 5f, 25f);//atras c1
            glTranslated(-26.01, 0, -4);
            
           
            //Piedra ancho de la base
            glTranslated(-31.01, 0, 4);
            dC.drawRect(25f, 5f, 25f);//atras c1
            glTranslated(31.01, 0, -4);
            
            //--*****************SEGUNDO PISO DEL EDIFICIO I Y G--------------*******//
            // ancho de la segunda base
            glTranslated(21.01, 5, -1);
            dC.drawRect(15f, 3.8f, 15f);//atras c1
            glTranslated(-21.01, -5, 1);
            
           
            //Piedra ancho de la segunda base
            glTranslated(-36.01, 5, -1);
            dC.drawRect(15f, 3.8f, 15f);//atras c1
            glTranslated(36.01, -5, 1);
            
            //--*****************Terser piso PISO DEL EDIFICIO I Y G--------------*******//
            // ancho de la tercera base
            glTranslated(18.01, 9, -4);
            dC.drawRect(9f, 3.8f, 9f);//atras c1
            glTranslated(-18.01, -9, 4);
            
           
            //Piedra ancho de la tercera base
            glTranslated(-39.01, 9, -4);
            dC.drawRect(9f, 3.8f, 9f);//atras c1
            glTranslated(39.01, -9, 4);
            
            //--*******ESACALERAS DEL LADO DERECHO Y IZQUIERDO
            //----------****LADO IZQUIERDO**---------
            glTranslated(27.01, 0, -1);
            dC.drawRect(1f, 4f, 15f);//atras c1
            glTranslated(-27.01, -0, 1);
            
            glTranslated(28.01, 0, -1);
            dC.drawRect(1f, 3f, 15f);//atras c1
            glTranslated(-28.01, -0, 1);
            
            glTranslated(29.01, 0, -1);
            dC.drawRect(1f, 2f, 15f);//atras c1
            glTranslated(-29.01, -0, 1);
            
            glTranslated(30.01, 0, -1);
            dC.drawRect(1f, 1f, 15f);//atras c1
            glTranslated(-30.01, -0, 1);
            
            //Segundo piso de las escaleras
            glTranslated(25.01, 5, -1);
            dC.drawRect(1f, 1f, 15f);//atras c1
            glTranslated(-25.01, -5, 1);
            
            glTranslated(24.01, 5, -1);
            dC.drawRect(1f, 2f, 15f);//atras c1
            glTranslated(-24.01, -5, 1);
            
            glTranslated(23.01, 5, -1);
            dC.drawRect(1f, 3f, 15f);//atras c1
            glTranslated(-23.01, -5, 1);
            
            glTranslated(22.01, 5, -1);
            dC.drawRect(1f, 4f, 15f);//atras c1
            glTranslated(-22.01, -5, 1);
            
            //**--tercer piso 
            glTranslated(21.01, 9, -4);
            dC.drawRect(1f, 1f, 9f);//atras c1
            glTranslated(-21.01, -9, 4);
            
            glTranslated(20.01, 9, -4);
            dC.drawRect(1f, 2f, 9f);//atras c1
            glTranslated(-20.01, -9, 4);
            
            glTranslated(19.01, 9, -4);
            dC.drawRect(1f, 3f, 9f);//atras c1
            glTranslated(-19.01, -9, 4);
            
            
           
            //--**********LADO DERECHO----**********
            glTranslated(-56.01, 0, -1);
            dC.drawRect(1f, 4f, 15f);//atras c1
            glTranslated(56.01, -0, 1);
            
            glTranslated(-57.01, 0, -1);
            dC.drawRect(1f, 3f, 15f);//atras c1
            glTranslated(57.01, -0, 1);
            
            glTranslated(-58.01, 0, -1);
            dC.drawRect(1f, 2f, 15f);//atras c1
            glTranslated(58.01, -0, 1);
            
            glTranslated(-59.01, 0, -1);
            dC.drawRect(1f, 1f, 15f);//atras c1
            glTranslated(59.01, -0, 1);
            
            //segundo piso escaleras
            glTranslated(-54.01, 5, -1);
            dC.drawRect(1f, 1f, 15f);//atras c1
            glTranslated(54.01, -5, 1);
            
            glTranslated(-53.01, 5, -1);
            dC.drawRect(1f, 2f, 15f);//atras c1
            glTranslated(53.01, -5, 1);
            
            glTranslated(-52.01, 5, -1);
            dC.drawRect(1f, 3f, 15f);//atras c1
            glTranslated(52.01, -5, 1);
            
            glTranslated(-51.01, 5, -1);
            dC.drawRect(1f, 4f, 15f);//atras c1
            glTranslated(51.01, -5, 1);
            
            
            //Tercer piso
            glTranslated(-50.01, 9, -4);
            dC.drawRect(1f, 1f, 9f);//atras c1
            glTranslated(50.01, -9, 4);
            
            glTranslated(-49.01, 9, -4);
            dC.drawRect(1f, 2f, 9f);//atras c1
            glTranslated(49.01, -9, 4);
            
            glTranslated(-48.01, 9, -4);
            dC.drawRect(1f, 3f, 9f);//atras c1
            glTranslated(48.01, -9, 4);
        }
        glEnd();
    }
    
    public void trianguloH1() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, -0, 0);
            glTranslated(0, 0, 0);
            
            glTranslated(3.01, 0, 9);
            glRotated(45, -2, 0, 0);
            dC.drawRect(3f, 14.1f, 0.9f);
            glRotated(-45, 2, 0, -0);
            glTranslated(-3.01, 0, -9);
            
            glTranslated(-28.01, 0, 9);
            glRotated(-45, -2, 0, 0);
            dC.drawRect(3f, 14.1f, 0.9f);
            glRotated(45, 2, 0, -0);
            glTranslated(28.01, 0, -9);
            
            
            glTranslated(3.01, -0.6, -25.35);
            glRotated(-45, -2, 0, 0);
            dC.drawRect(3f, 14.1f, 0.9f);//atras c1
            glRotated(45, 1, 0, -0);
            glTranslated(-3.01, 0.6, 25.35);
            
           
            glTranslated(-28.01, -0.6, -25.35);
            glRotated(45, -2, 0, 0);
            dC.drawRect(3f, 14.1f, 0.9f);//atras c1
            glRotated(-45, 1, 0, -0);
            glTranslated(-28.01, 0.6, 25.35);
            
            
            
            //********EDIFICIO H Y I*********//
            
            glTranslated(-5, 0, -1);
            glRotated(135, -0, 0, -2);
            dC.drawRect(12.7f, 1f, 3f);//atras c1
            glRotated(-135, 0, 0, 2);
            glTranslated(5, -0, 1);
            
            
            glTranslated(-5, 0, -13);
            glRotated(225, -0, 0, -2);
            dC.drawRect(12.7f, 1f, 3f);//atras c1
            glRotated(-225, 0, 0, 2);
            glTranslated(5, -0, 13);
            
            
            glTranslated(85.61, 0, -1);
            glRotated(45, -0, 0, -2);
            dC.drawRect(11.7f, 1f, 3f);//atras c1
            glRotated(-45, 0, 0, 2);
            glTranslated(-86.51, -0, 1);
            
            glTranslated(86.5, 0, -13);
            glRotated(-45, -0, 0, -2);
            dC.drawRect(11.7f, 1f, 3f);//atras c1
            glRotated(45, 0, 0, 2);
            glTranslated(-86.5, -0, 13);
            
            
        }
        glEnd();

    }
    
    public void segundaPiramide(){
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(-0, -0, -0);

            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(100, 0, 100);
            dC.drawRect(35f, 1f, 20f);
            glTranslated(-100, -0, -100);
            
            
            //************PAREDES ******************************---
            //--Parede de al  fondo
            glTranslated(99, 1, 100);
            dC.drawRect(33f, 10f, 1f);//atras c1
            glTranslated(-99, -1, -100);
            
            //Parede de enfrente
            
            //PAREDES ANCHO
            glTranslated(100, 1, 100);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-100, -1, -100);
            
            glTranslated(66, 1, 100);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-66, -1, -100);
            
            //-***********************MUROS DE ENFRENTE DE LADO DE LA pUERTA******************************--
            glTranslated(99, 1, 81);
            dC.drawRect(5f, 10f, 1f);//atras c1
            glTranslated(-99, -1, -81);
            
            //Puerta
            glTranslated(94, 6, 81);
            dC.drawRect(2f, 5f, 1f);//atras c1
            glTranslated(-94, -6, -81);
            
            glTranslated(92, 1, 81);
            dC.drawRect(26f, 10f, 1f);//atras c1
            glTranslated(-92, -1, -81);
            
            //-------************MUROS DE LADO DE LAS ESCALERA***-
            
            glTranslated(77, 0, 80);
            dC.drawRect(12f, 7f, 6f);//atras c1
            glTranslated(-77, 0, -80);
            
            //ALADO DE LA PUERTA
            glTranslated(106, 0, 80);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-106, 0, -80);
            
            glTranslated(92, 0, 80);
            dC.drawRect(4f, 7f, 6f);
            glTranslated(-92, 0, -80);
            
            //PARTE SUPERIOR E INFERIOR DE LA PUERTA
            glTranslated(94, 0, 80);
            dC.drawRect(2f, 1f, 6f);
            glTranslated(-94, 0, -80);
            
            glTranslated(94, 6, 80);
            dC.drawRect(2f, 1f, 6f);
            glTranslated(-94, -6, -80);
            
            
            
            //Muro izquierdo modificado para poner pasto en la parte superior
            glTranslated(106, 0, 100);
            dC.drawRect(6f, 11f, 20f);
            glTranslated(-106, 0, -100);
            
            //***Muro de 7 sentimetros de alto
            glTranslated(112, 0, 106);
            dC.drawRect(6f, 7f, 32f);
            glTranslated(-112, 0, -106);
            
            //Muros de los dos lados anhos de 7 cm
            glTranslated(65, 0, 106);
            dC.drawRect(6f, 7f, 32f);
            glTranslated(-65, 0, -106);
            
            //muro de Atras de 7 cm
            
            glTranslated(106, 0, 106);
            dC.drawRect(41f, 7f, 6f);//atras c1
            glTranslated(-106, -0, -106);

        }
        glEnd();
    }
    
    public void segundaPiramideVerde(){
        
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
        //Techo 
            glTranslated(49, 11, 101);
            dC.drawRect(41f, 1f, 20f);//atras c1
            glTranslated(-49, -11, -101);
            
        }
    }
    
    public void segundaPiramideEscalera(){
        //-***********************ESCALERAS DE ENFRENTE ******************************--
            //ESCALERAS
            glTranslated(88, 0, 80);
            dC.drawRect(11f, 11f, 1f);//atras c1
            glTranslated(-88, 0, -80);
            
            glTranslated(88, 0, 79);
            dC.drawRect(11f, 10f, 1f);//atras c1
            glTranslated(-88, 0, -79);
            
            glTranslated(88, 0, 78);
            dC.drawRect(11f, 9f, 1f);//atras c1
            glTranslated(-88, 0, -78);
            
            glTranslated(88, 0, 77);
            dC.drawRect(11f, 8f, 1f);//atras c1
            glTranslated(-88, 0, -77);
            
            glTranslated(88, 0, 76);
            dC.drawRect(11f, 7f, 1f);//atras c1
            glTranslated(-88, 0, -76);
            
            glTranslated(88, 0, 75);
            dC.drawRect(11f, 6f, 1f);//atras c1
            glTranslated(-88, 0, -75);
            
            glTranslated(88, 0, 74);
            dC.drawRect(11f, 5f, 1f);//atras c1
            glTranslated(-88, 0, -74);
            
            glTranslated(88, 0, 73);
            dC.drawRect(11f, 4f, 1f);//atras c1
            glTranslated(-88, 0, -73);
            
            glTranslated(88, 0, 72);
            dC.drawRect(11f, 3f, 1f);//atras c1
            glTranslated(-88, 0, -72);
            
            glTranslated(88, 0, 71);
            dC.drawRect(11f, 2f, 1f);//atras c1
            glTranslated(-88, 0, -71);
            
            glTranslated(88, 0, 70);
            dC.drawRect(11f, 1f, 1f);//atras c1
            glTranslated(-88, 0, -70);
            
            
            //******TERCER PISO MUROS QUE ENTASN HASTA LA PARTE SUPERIOR****************
            //muro de atras
            glTranslated(90, 12, 100);
            dC.drawRect(15f, 2f, 2f);//atras c1
            glTranslated(-90, -12, -100);
            
            // muro izquierso ancho 
            glTranslated(90, 12, 98);
            dC.drawRect(2f, 2f, 13f);//atras c1
            glTranslated(-90, -12, -98);
            
            //muro derecho  ancho 
            glTranslated(77, 12, 98);
            dC.drawRect(2f, 2f, 13f);//atras c1
            glTranslated(-77, -12, -98);
            
            //muros de enfrente
            glTranslated(92, 12, 85);
            dC.drawRect(9f, 2f, 2f);//atras c1
            glTranslated(-92, -12, -85);
            
            //segundo muro de enfrente despues de la puerta
            glTranslated(82, 12, 85);
            dC.drawRect(9f, 2f, 2f);//atras c1
            glTranslated(-82, -12, -85);
            
            //PENULTIMO MURO DE ATRAS 
            glTranslated(88, 12, 95);
            dC.drawRect(5f, 2f, 1f);//atras c1
            glTranslated(-88, -12, -95);
            
            glTranslated(82, 12, 95);
            dC.drawRect(4f, 2f, 1f);//atras c1
            glTranslated(-82, -12, -95);
            
            //Muros de enfrente del medio
            glTranslated(88, 12, 90);
            dC.drawRect(3f, 2f, 1f);//atras c1
            glTranslated(-88, -12, -90);
            
            glTranslated(80, 12, 90);
            dC.drawRect(3f, 2f, 1f);//atras c1
            glTranslated(-80, -12, -90);
            
            //Muros centrales 
            //DE ENFREENE
            glTranslated(85, 12, 89);
            dC.drawRect(1f, 2f, 3f);//atras c1
            glTranslated(-85, -12, -89);
            
            glTranslated(81, 12, 89);
            dC.drawRect(1f, 2f, 3f);//atras c1
            glTranslated(-81, -12, -89);
            
            glTranslated(85, 12, 97);
            dC.drawRect(1f, 2f, 3f);//atras c1
            glTranslated(-85, -12, -97);
            
            glTranslated(81, 12, 98);
            dC.drawRect(1f, 2f, 3f);//atras c1
            glTranslated(-81, -12, -98);
            
            
            //---------*****CASITA PEQUEÑA DEL TERCER PISO MUROS DE LA SEGUNDA PIRAMIDE ------*
            //
            glTranslated(66, 12, 90);
            dC.drawRect(1f, 2f, 10f);//atras c1
            glTranslated(-66, -12, -90);
            
            //Tumba
            glTranslated(69, 12, 85);
            dC.drawRect(3f, 1f, 5f);//atras c1
            glTranslated(-69, -12, -85);
            
            glTranslated(69, 12, 86);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-69, -12, -86);
            
            glTranslated(69, 12, 90);
            dC.drawRect(3f, 2f, 1f);//atras c1
            glTranslated(-69, -12, -90);
            
            glTranslated(70, 12, 90);
            dC.drawRect(1f, 2f, 6f);//atras c1
            glTranslated(-70, -12, -90);
            
            glTranslated(70, 12, 83);
            dC.drawRect(1f, 2f, 3f);//atras c1
            glTranslated(-70, -12, -83);
            
            glTranslated(72, 12, 92);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-72, -12, -92);
            
            glTranslated(69, 12, 92);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-69, -12, -92);
            
            glTranslated(69, 13, 81);
            dC.drawRect(3f, 1f, 1f);//atras c1
            glTranslated(-69, -13, -81);
            
            
            //***---PRIMERA CASITA DE LADO DERECHO PIRAMIDE 2-----*
            //muros mas largos 
            glTranslated(106, 12, 89);
            dC.drawRect(1f, 2f, 9f);
            glTranslated(-106, -12, -89);
            
            //Primer muro serca de la puerta
            glTranslated(101, 12, 89);
            dC.drawRect(1f, 2f, 4f);
            glTranslated(-101, -12, -89);
            
            //Segundo muro serca de la puerta
            glTranslated(101, 12, 84);
            dC.drawRect(1f, 2f, 4f);
            glTranslated(-101, -12, -84);
            
            //Anchos
            glTranslated(105, 12, 89);
            dC.drawRect(4f, 2f, 1f);
            glTranslated(-105, -12, -89);
            
            glTranslated(105, 12, 81);
            dC.drawRect(4f, 2f, 1f);
            glTranslated(-105, -12, -81);
            
            
            
            
            //**********CRUZ ***************-
            //Parte larga
            glTranslated(96, 12, 98);
            dC.drawRect(2f, 0.5f, 8f);
            glTranslated(-96, -12, -98);
            
            glTranslated(98, 12, 94);
            dC.drawRect(2f, 0.5f, 2f);
            glTranslated(-98, -12, -94);
            
            glTranslated(94, 12, 94);
            dC.drawRect(2f, 0.5f, 2f);
            glTranslated(-94, -12, -94);
            
            
    }
    
    //***********TERCERA PIRAMIDE *****************//
    public void terceraPiramide(){
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(-0, -0, -0);

            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(390, 0, 120);
            dC.drawRect(100f, 10f, 150f);
            glTranslated(-390, -0, -120);
        }
        glEnd();
    } 
    
    public void terceraPiramideGris(){
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(-0, -0, -0);

            //-***PRIMRA BASE DE LA PIRAMIDE DEL SOL-------********
            glTranslated(360, 10, 100);
            dC.drawRect(40f, 1f, 40f);
            glTranslated(-360, -10, -100);
            
            //PAARED IZQUIERDA 
            glTranslated(360, 11, 100);
            dC.drawRect(1f, 9f, 40f);
            glTranslated(-360, -11, -100);
            
            //Ancho Primero
            glTranslated(359, 11, 100);
            dC.drawRect(39f, 9f, 1f);
            glTranslated(-359, -11, -100);
            
            glTranslated(359, 11, 61);
            dC.drawRect(39f, 9f, 1f);
            glTranslated(-359, -11, -61);
            
            
            //Lado de la piramide que contiene la puerta del primer piso
            glTranslated(321, 16, 99);
            dC.drawRect(1f, 4f, 38f);
            glTranslated(-321, -16, -99);
            
            //Lados mas pequeños donde se encuentra el huevo
            glTranslated(321, 11, 99);
            dC.drawRect(1f, 5f, 17f);
            glTranslated(-321, -11, -99);
            
            glTranslated(321, 11, 78);
            dC.drawRect(1f, 5f, 17f);
            glTranslated(-321, -11, -78);
            
            
            
            //ESCALERAS EMPESAMOS DESDE LA PARTE DE ABAJO DE LA PIRAMIDE
            //ESCALERAS DE LADO DE ENFRENTE
            glTranslated(361, 10, 60);
            dC.drawRect(42f, 10f, 1f);
            glTranslated(-361, -10, -60);
            
            glTranslated(362, 10, 59);
            dC.drawRect(44f, 9f, 1f);
            glTranslated(-362, -10, -59);
            
            glTranslated(363, 10, 58);
            dC.drawRect(46f, 8f, 1f);
            glTranslated(-363, -10, -58);
            
            glTranslated(364, 10, 57);
            dC.drawRect(48f, 7f, 1f);
            glTranslated(-364, -10, -57);
            
            glTranslated(365, 10, 56);
            dC.drawRect(50f, 6f, 1f);
            glTranslated(-365, -10, -56);
            
            glTranslated(366, 10, 55);
            dC.drawRect(52f, 6f, 1f);
            glTranslated(-366, -10, -55);
            
            glTranslated(367, 10, 54);
            dC.drawRect(54f, 6f, 1f);
            glTranslated(-367, -10, -54);
            
            //MOVI COORDENDAS
            glTranslated(368, 10, 53);
            //dC.drawRect(56f, 3f, 1f);
            dC.drawRect(56f, 6f, 1f);
            glTranslated(-368, -10, -53);
            
            glTranslated(369, 10, 52);
            dC.drawRect(58f, 2f, 1f);
            glTranslated(-369, -10, -52);
            
            glTranslated(370, 10, 51);
            dC.drawRect(60f, 1f, 1f);
            glTranslated(-370, -10, -51);
            
            //Segundo lado de atras 
            glTranslated(361, 10, 101);
            dC.drawRect(42f, 10f, 1f);
            glTranslated(-361, -10, -101);
            
            glTranslated(362, 10, 102);
            dC.drawRect(44f, 9f, 1f);
            glTranslated(-362, -10, -102);
            
            glTranslated(363, 10, 103);
            dC.drawRect(46f, 8f, 1f);
            glTranslated(-363, -10, -103);
            
            glTranslated(364, 10, 104);
            dC.drawRect(48f, 7f, 1f);
            glTranslated(-364, -10, -104);
            
            glTranslated(365, 10, 105);
            dC.drawRect(50f, 6f, 1f);
            glTranslated(-365, -10, -105);
            
            glTranslated(366, 10, 106);
            dC.drawRect(52f, 6f, 1f);
            glTranslated(-366, -10, -106);
            
            glTranslated(367, 10, 107);
            dC.drawRect(54f, 6f, 1f);
            glTranslated(-367, -10, -107);
            
            glTranslated(368, 10, 108);
            dC.drawRect(56f, 6f, 1f);
            glTranslated(-368, -10, -108);
            
            glTranslated(369, 10, 109);
            dC.drawRect(58f, 2f, 1f);
            glTranslated(-369, -10, -109);
            
            glTranslated(370, 10, 110);
            dC.drawRect(60f, 1f, 1f);
            glTranslated(-370, -10, -110);
            
            //ESCALERA QUE ESTA EN LA MISMA ORIENTACION DE LAS ESCALERA PERO ESTA A TRAS
            glTranslated(361, 10, 100);
            dC.drawRect(1f, 10f, 40f);
            glTranslated(-361, -10, -100);
            
            glTranslated(362, 10, 101);
            dC.drawRect(1f, 9f, 42f);
            glTranslated(-362, -10, -101);
            
            glTranslated(363, 10, 102);
            dC.drawRect(1f, 8f, 44f);
            glTranslated(-363, -10, -102);
            
            //-*
            glTranslated(364, 10, 103);
            dC.drawRect(1f, 7f, 46f);
            glTranslated(-364, -10, -103);
            
            glTranslated(365, 10, 104);
            dC.drawRect(1f, 6f, 48f);
            glTranslated(-365, -10, -104);
            
            glTranslated(366, 10, 105);
            dC.drawRect(1f, 6f, 50f);
            glTranslated(-366, -10, -105);
            
            glTranslated(367, 10, 106);
            dC.drawRect(1f, 6f, 52f);
            glTranslated(-367, -10, -106);
            
            glTranslated(368, 10, 107);
            dC.drawRect(1f, 6f, 54f);
            glTranslated(-368, -10, -107);
            
            glTranslated(369, 10, 108);
            dC.drawRect(1f, 2f, 56f);
            glTranslated(-369, -10, -108);
            
            glTranslated(370, 10, 109);
            dC.drawRect(1f, 1f, 58f);
            glTranslated(-370, -10, -109);
            
            
            //ESCALERAS EN FRENTE DE LA PUERTA
            
            glTranslated(320, 16, 100);
            dC.drawRect(1f, 4f, 40f);
            glTranslated(-320, -16, -100);
            
            glTranslated(319, 16, 101);
            dC.drawRect(1f, 3f, 42f);
            glTranslated(-319, -16, -101);
            
            glTranslated(318, 16, 102);
            dC.drawRect(1f, 2f, 44f);
            glTranslated(-318, -16, -102);
            
            glTranslated(317, 16, 103);
            dC.drawRect(1f, 1f, 46f);
            glTranslated(-317, -16, -103);
            
            //---
            glTranslated(316, 10, 104);
            dC.drawRect(1f, 6f, 22f);
            glTranslated(-316, -10, -104);
            
            glTranslated(315, 10, 105);
            dC.drawRect(1f, 6f, 23f);
            glTranslated(-315, -10, -105);
            
            glTranslated(314, 10, 106);
            dC.drawRect(1f, 6f, 24f);
            glTranslated(-314, -10, -106);
            
            glTranslated(313, 10, 107);
            dC.drawRect(1f, 6f, 25f);
            glTranslated(-313, -10, -107);
            
            glTranslated(312, 10, 108);
            dC.drawRect(1f, 2f, 26f);
            glTranslated(-312, -10, -108);
            
            glTranslated(311, 10, 109);
            dC.drawRect(1f, 1f, 27f);
            glTranslated(-311, -10, -109);
            
            //--
            glTranslated(320, 10, 78);
            dC.drawRect(4f, 6f, 21f);
            glTranslated(-320, -10, -78);
            
            glTranslated(320, 10, 103);
            dC.drawRect(4f, 6f, 21f);
            glTranslated(-320, -10, -103);
            
            //--
            glTranslated(316, 10, 78);
            dC.drawRect(1f, 6f, 22f);
            glTranslated(-316, -10, -78);
            
            glTranslated(315, 10, 78);
            dC.drawRect(1f, 6f, 23f);
            glTranslated(-315, -10, -78);
            
            glTranslated(314, 10, 78);
            dC.drawRect(1f, 6f, 24f);
            glTranslated(-314, -10, -78);
            
            glTranslated(313, 10, 78);
            dC.drawRect(1f, 6f, 25f);
            glTranslated(-313, -10, -78);
            
            glTranslated(312, 10, 78);
            dC.drawRect(1f, 2f, 26f);
            glTranslated(-312, -10, -78);
            
            glTranslated(311, 10, 78);
            dC.drawRect(1f, 1f, 27f);
            glTranslated(-311, -10, -78);
            
            
            //Segundo piso
            
            glTranslated(355, 21, 95);
            dC.drawRect(30f, 5f, 30f);
            glTranslated(-355, -21, -95);
            
            glTranslated(354, 22, 94);
            dC.drawRect(28f, 1f, 28f);
            glTranslated(-354, -22, -94);
            
            glTranslated(353, 23, 93);
            dC.drawRect(26f, 1f, 26f);
            glTranslated(-353, -23, -93);
            //
            glTranslated(352, 24, 92);
            dC.drawRect(24f, 1f, 24f);
            glTranslated(-352, -24, -92);
            
            glTranslated(351, 25, 91);
            dC.drawRect(22f, 1f, 22f);
            glTranslated(-351, -25, -91);
            /*
            glTranslated(270, 26, 90);
            dC.drawRect(20f, 1f, 20f);
            glTranslated(-270, -26, -90);
            
           */
            
             glTranslated(349, 27, 89);
            dC.drawRect(18f, 1f, 18f);
            glTranslated(-349, -27, -89);
            
            glTranslated(348, 28, 88);
            dC.drawRect(16f, 1f, 16f);
            glTranslated(-348, -28, -88);
            
            glTranslated(347, 29, 87);
            dC.drawRect(14f, 1f, 14f);
            glTranslated(-347, -29, -87);
            
            glTranslated(346, 30, 86);
            dC.drawRect(12f, 1f, 12f);
            glTranslated(-346, -30, -86);
            
            glTranslated(345, 30, 85);
            dC.drawRect(10f, 1f, 10f);
            glTranslated(-345, -30, -85);
            
            //DETALLES DE LA PARTE DE ARRIBA
            //PARTE BASE UNA DE 0.5
            glTranslated(345, 32, 85);
            dC.drawRect(7f, 0.5f, 10f);
            glTranslated(-345, -32, -85);
            
            //PARTE BASE DOS DE 0.5
            glTranslated(345, 32.5, 85);
            dC.drawRect(6.5f, 0.5f, 10f);
            glTranslated(-345, -32.5, -85);
            
            glTranslated(345, 33, 85);
            dC.drawRect(1f, 1f, 10f);
            glTranslated(-345, -33, -85);
            //ANCHITO
            glTranslated(344, 33, 85);
            dC.drawRect(3f, 1f, 1f);
            glTranslated(-344, -33, -85);
            
            glTranslated(344, 33, 76);
            dC.drawRect(3f, 1f, 1f);
            glTranslated(-344, -33, -76);
            
            
            
            //LADO PUERTA MAS PEQUEÑA PISO 3
            
            glTranslated(341, 33, 85);
            dC.drawRect(1f, 1f, 4f);
            glTranslated(-341, -33, -85);
            
            glTranslated(341, 33, 79);
            dC.drawRect(1f, 1f, 4f);
            glTranslated(-341, -33, -79);
            
            
            //***ESCALERAS DE LA BASE DE LA PIRAMIDE DEL SOL
            glTranslated(290, 0, 59);
            dC.drawRect(1f, 9f, 40f);
            glTranslated(-290, 0, -59);
            
            glTranslated(289, 0, 59);
            dC.drawRect(1f, 8f, 40f);
            glTranslated(-289, 0, -59);
            
            glTranslated(288, 0, 59);
            dC.drawRect(1f, 7f, 40f);
            glTranslated(-288, 0, -59);
            
            glTranslated(287, 0, 59);
            dC.drawRect(1f, 6f, 40f);
            glTranslated(-287, 0, -59);
            
            glTranslated(286, 0, 59);
            dC.drawRect(1f, 5f, 40f);
            glTranslated(-286, 0, -59);
            
            glTranslated(285, 0, 59);
            dC.drawRect(1f, 4f, 40f);
            glTranslated(-285, 0, -59);
            
            glTranslated(284, 0, 59);
            dC.drawRect(1f, 3f, 40f);
            glTranslated(-284, 0, -59);
            
            glTranslated(283, 0, 59);
            dC.drawRect(1f, 2f, 40f);
            glTranslated(-283, 0, -59);
            
            glTranslated(282, 0, 59);
            dC.drawRect(1f, 1f, 40f);
            glTranslated(-282, 0, -59);
            
            
            
        }
        glEnd();
    }
    
    
        public void terceraPiramideV(){
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(-0, -0, -0);

            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(303, 20, 101);
            dC.drawRect(40f, 1f, 40f);
            glTranslated(-303, -20, -101);
            
            //segunda base
            glTranslated(298, 26, 96);
            dC.drawRect(30f, 1f, 30f);
            glTranslated(-298, -26, -96);
            
            //Tercera base 
            glTranslated(288, 31, 86);
            dC.drawRect(10f, 1f, 10f);
            glTranslated(-288, -31, -86);
            
            //ESCALERAS PARTE LARGA DEL LA PIRAMIDE SOL
            
            glTranslated(233, 0, 70);
            dC.drawRect(1f, 9f, 10f);
            glTranslated(-233, 0, -70);
            
            glTranslated(232, 0, 70);
            dC.drawRect(1f, 8f, 10f);
            glTranslated(-232, 0, -70);
            
            glTranslated(231, 0, 70);
            dC.drawRect(1f, 7f, 10f);
            glTranslated(-231, 0, -70);
            
            glTranslated(230, 0, 70);
            dC.drawRect(1f, 6f, 10f);
            glTranslated(-230, 0, -70);
            
            
            glTranslated(229, 0, 70);
            dC.drawRect(1f, 5f, 10f);
            glTranslated(-229, 0, -70);
            
            glTranslated(228, 0, 70);
            dC.drawRect(1f, 4f, 10f);
            glTranslated(-228, 0, -70);
            
            glTranslated(227, 0, 70);
            dC.drawRect(1f, 3f, 10f);
            glTranslated(-227, 0, -70);
            
            glTranslated(226, 0, 70);
            dC.drawRect(1f, 2f, 10f);
            glTranslated(-226, 0, -70);
            
            glTranslated(225, 0, 70);
            dC.drawRect(1f, 1f, 10f);
            glTranslated(-225, 0, -70);
            
            glTranslated(233, 0, 20);
            dC.drawRect(1f, 9f, 10f);
            glTranslated(-233, 0, -20);
            
            glTranslated(232, 0, 20);
            dC.drawRect(1f, 8f, 10f);
            glTranslated(-232, 0, -20);
            
            glTranslated(231, 0, 20);
            dC.drawRect(1f, 7f, 10f);
            glTranslated(-231, 0, -20);
            
            glTranslated(230, 0, 20);
            dC.drawRect(1f, 6f, 10f);
            glTranslated(-230, 0, -20);
            
            
            glTranslated(229, 0, 20);
            dC.drawRect(1f, 5f, 10f);
            glTranslated(-229, 0, -20);
            
            glTranslated(228, 0, 20);
            dC.drawRect(1f, 4f, 10f);
            glTranslated(-228, 0, -20);
            
            glTranslated(227, 0, 20);
            dC.drawRect(1f, 3f, 10f);
            glTranslated(-227, 0, -20);
            
            glTranslated(226, 0, 20);
            dC.drawRect(1f, 2f, 10f);
            glTranslated(-226, 0, -20);
            
            glTranslated(225, 0, 20);
            dC.drawRect(1f, 1f, 10f);
            glTranslated(-225, 0, -20);
            
            
        }
        glEnd();
    }
        
        //MODIFICADO
    public void trianguloZonaVerde() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, -0, 0);
            glTranslated(0, 0, 0);
            
            glTranslated(283, 0, 120);
            glRotated(45, 0, -0, -2);
            dC.drawRect(1f, 12.3f, 150f);
            glRotated(-45, 0, 0, 2);
            glTranslated(-283, 0, -120);
            
            
        }
        glEnd();

    } 
    
    public void muroPrimera() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(35, 1, 100);
            dC.drawRect(5f, 5f, 0.1f);//atras c1
            glTranslated(-35, -1, -100);
        }
        glEnd();
    }
    
    public void culturaPared() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(25, 1, 100);
            dC.drawRect(5f, 5f, 0.1f);//atras c1
            glTranslated(-25, -1, -100);
        }
        glEnd();
    }
    
    public void zapotecaPared() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(20, 1, 100);
            dC.drawRect(5f, 8f, 0.1f);//atras c1
            glTranslated(-20, -1, -100);
        }
        glEnd();
    }
    
    public void danzaPared() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //-GRETAS
            glTranslated(55.1, 2.5, 107);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -107);
            
            glTranslated(55.1, 2.5, 102);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -102);
            
            glTranslated(55.1, 2.5, 97);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -97);
            
            glTranslated(55.1, 2.5, 92);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -92);
            
            glTranslated(55.1, 2.5, 87);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -87);
            
            glTranslated(55.1, 2.5, 82);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-55.1, -2.5, -82);
            
            glTranslated(55.1, 2.5, 77);
            dC.drawRect(0.1f,2, 2f);//atras c1
            glTranslated(-55.1, -2.5, -77);
            
            //PARED DE ENFRENTE 
            
            glTranslated(55.2, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-55.2, -2.5, -74.9);
            
            glTranslated(50.2, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-50.2, -2.5, -74.9);
            
            glTranslated(45.2, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-45.2, -2.5, -74.9);
            
            glTranslated(40.2, 2.5, 74.9);
            dC.drawRect(3.2f,2, 0.1f);//atras c1
            glTranslated(-40.2, -2.5, -74.9);
            
            glTranslated(35, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-35, -2.5, -74.9);
            
            glTranslated(20, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-20, -2.5, -74.9);
            
            glTranslated(15, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-15, -2.5, -74.9);
            
            glTranslated(10, 2.5, 74.9);
            dC.drawRect(5f,2, 0.1f);//atras c1
            glTranslated(-10, -2.5, -74.9);
            
            glTranslated(5, 2.5, 74.9);
            dC.drawRect(3f,2, 0.1f);//atras c1
            glTranslated(-5, -2.5, -74.9);
            
            glTranslated(2, 2.5, 80);
            dC.drawRect(0.1f,2, 5.2f);//atras c1
            glTranslated(-2, -2.5, -80);
            
            glTranslated(2, 2.5, 85);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-2, -2.5, -85);
            
            glTranslated(2, 2.5, 90);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-2, -2.5, -90);
            
            glTranslated(2, 2.5, 95);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-2, -2.5, -95);
            
            glTranslated(2, 2.5, 100);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-2, -2.5, -100);
            
            glTranslated(2, 2.5, 105);
            dC.drawRect(0.1f,2, 5f);//atras c1
            glTranslated(-2, -2.5, -105);
            
            glTranslated(2, 2.5, 107);
            dC.drawRect(0.1f,2, 2f);//atras c1
            glTranslated(-2, -2.5, -107);
        }
        glEnd();
    }
    
    public void danzantePared() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //-****PRIMERA BASE DE UN METRO de 35 * 5 * 15-------*********
            glTranslated(26, 1, 82.1);
            dC.drawRect(5f, 8f, 0.1f);//atras c1
            glTranslated(-26, -1, -82.1);
        }
        glEnd();
    }
    
    
    
    
    
//****************CUARTA PIRAMIDE **********************************************************//
    public void CuartaPiramide(){
        glBegin(GL_QUADS);
        {
            glTranslated(-0, 0, 0);
            dC.drawRect(0f, 0f, 0f);
            glTranslated(-0, 0, -0);

            //-*PRIMERA BASE DE UN METRO de 35 * 5 * 15-------****
            glTranslated(250, 0, 100);
            dC.drawRect(35f, 1f, 20f);
            glTranslated(-250, 0, -100);
            
            
            //*****PAREDES ***********---
            //--Parede de al  fondo
            glTranslated(249, 0, 100);
            dC.drawRect(33f, 10f, 1f);//atras c1
            glTranslated(-249, 0, -100);
            
            //Parede de enfrente
            
            //PAREDES ANCHO
            glTranslated(250, 0, 100);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-250, 0, -100);
            
            glTranslated(216, 0, 100);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-216, 0, -100);
            
            //-********MUROS DE ENFRENTE DE LADO DE LA pUERTA***********--
            glTranslated(249, 0, 81);
            dC.drawRect(5f, 10f, 1f);//atras c1
            glTranslated(-249, 0, -81);
            
            //Puerta
            glTranslated(244, 5, 81);
            dC.drawRect(2f, 5f, 1f);//atras c1
            glTranslated(-244, -5, -81);
            
            glTranslated(242, 0, 81);
            dC.drawRect(26f, 10f, 1f);//atras c1
            glTranslated(-242, 0, -81);
            
            //-------*****MUROS DE LADO DE LAS ESCALERA**-
            
            glTranslated(227, 0, 80);
            dC.drawRect(12f, 7f, 6f);//atras c1
            glTranslated(-227, 0, -80);
            
            //ALADO DE LA PUERTA
            glTranslated(256, 0, 80);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-256, 0, -80);
            
            glTranslated(242, 0, 80);
            dC.drawRect(4f, 7f, 6f);
            glTranslated(-242, 0, -80);
            
            //PARTE SUPERIOR E INFERIOR DE LA PUERTA
            glTranslated(244, 0, 80);
            dC.drawRect(2f, 1f, 6f);
            glTranslated(-244, 0, -80);
            
            glTranslated(244, 0, 80);
            dC.drawRect(2f, 1f, 6f);
            glTranslated(-244, 0, -80);
            
            //Muro izquierdo modificado para poner pasto en la parte superior
            glTranslated(256, 0, 100);
            dC.drawRect(6f, 11f, 20f);
            glTranslated(-256, 0, -100);
            
            //***Muro de 7 sentimetros de alto
            glTranslated(262, 0, 106);
            dC.drawRect(6f, 7f, 32f);
            glTranslated(-262, 0, -106);
            
            //Muros de los dos lados anhos de 7 cm
            glTranslated(215, 0, 106);
            dC.drawRect(6f, 7f, 32f);
            glTranslated(-215, 0, -106);
            
            //muro de Atras de 7 cm
            
            glTranslated(256, 0, 106);
            dC.drawRect(41f, 7f, 6f);//atras c1
            glTranslated(-256, 0, -106);
            
            //*********MUROS DE ENFRENTE ***********----
            
            
            glTranslated(256, 10, 100);
            dC.drawRect(41f, 1f, 20f);//atras c1
            glTranslated(-256, -10, -100);
            
            
            
            //ALADO DE LA PUERTA
            glTranslated(254, 11, 97);
            dC.drawRect(12f, 7f, 14f);
            glTranslated(-254, -11, -97);
            
            glTranslated(236, 11, 97);
            dC.drawRect(12f, 7f, 10f);
            glTranslated(-236, -11, -97);
            
            glTranslated(239, 11, 97);
            dC.drawRect(12f, 7f, 14f);
            glTranslated(-239, -11, -97);
            
           
            
            //ALADO DE LA PUERTA
            glTranslated(247, 11, 97);
            dC.drawRect(12f, 7f, 10f);
            glTranslated(-247, -11, -97);
                     
            
            //ESCALERAS
            glTranslated(238, 0, 80);
            dC.drawRect(11f, 11f, 1f);//atras c1
            glTranslated(-238, 0, -80);
            
            glTranslated(238, 0, 79);
            dC.drawRect(11f, 10f, 1f);//atras c1
            glTranslated(-238, 0, -79);
            
            glTranslated(238, 0, 78);
            dC.drawRect(11f, 9f, 1f);//atras c1
            glTranslated(-238, 0, -78);
            
            glTranslated(238, 0, 77);
            dC.drawRect(11f, 8f, 1f);//atras c1
            glTranslated(-238, 0, -77);
            
            glTranslated(238, 0, 76);
            dC.drawRect(11f, 7f, 1f);//atras c1
            glTranslated(-238, 0, -76);
            
            glTranslated(238, 0, 75);
            dC.drawRect(11f, 6f, 1f);//atras c1
            glTranslated(-238, 0, -75);
            
            glTranslated(238, 0, 74);
            dC.drawRect(11f, 5f, 1f);//atras c1
            glTranslated(-238, 0, -74);
            
            glTranslated(238, 0, 73);
            dC.drawRect(11f, 4f, 1f);//atras c1
            glTranslated(-238, 0, -73);
            
            glTranslated(238, 0, 72);
            dC.drawRect(11f, 3f, 1f);//atras c1
            glTranslated(-238, 0, -72);
            
            glTranslated(238, 0, 71);
            dC.drawRect(11f, 2f, 1f);//atras c1
            glTranslated(-238, 0, -71);
            
            glTranslated(238, 0, 70);
            dC.drawRect(11f, 1f, 1f);//atras c1
            glTranslated(-238, 0, -70);
            
            //esacleras segunda planta 
            
            glTranslated(242, 11, 87);
            dC.drawRect(13f, 7f, 1f);//atras c1
            glTranslated(-242, -11, -87);
            
            glTranslated(242, 11, 86);
            dC.drawRect(13f, 6f, 1f);//atras c1
            glTranslated(-242, -11, -86);
            
            glTranslated(242, 11, 85);
            dC.drawRect(13f, 5f, 1f);//atras c1
            glTranslated(-242, -11, -85);
            
            glTranslated(242, 11, 84);
            dC.drawRect(13f, 4f, 1f);//atras c1
            glTranslated(-242, -11, -84);
            
            glTranslated(242, 11, 83);
            dC.drawRect(13f, 3f, 1f);//atras c1
            glTranslated(-242, -11, -83);
            
            glTranslated(242, 11, 82);
            dC.drawRect(13f, 2f, 1f);//atras c1
            glTranslated(-242, -11, -82);
            
            glTranslated(242, 11, 81);
            dC.drawRect(13f, 1f, 1f);//atras c1
            glTranslated(-242, -11, -81);
            
            

            //-*PRIMERA BASE DE UN METRO de 35 * 5 * 15-------****
            glTranslated(254, 0, 160);
            dC.drawRect(37f, 18f, 36f);
            glTranslated(-254, 0, -160);
            
            glTranslated(254, 0, 130);
            dC.drawRect(37f, 18f, 36f);
            glTranslated(-254, 0, -130);
            
            //bordes 
            glTranslated(217, 0, 115);
            dC.drawRect(8f, 7f, 12f);
            glTranslated(-217, -0, -115);
            
            glTranslated(217, 0, 125);
            dC.drawRect(8f, 7f, 12f);
            glTranslated(-217, -0, -125);
            
            glTranslated(217, 6, 112);
            dC.drawRect(2f, 5f, 12f);
            glTranslated(-217, -6, -112);
            
            glTranslated(217, 6, 123);
            dC.drawRect(2f, 5f, 12f);
            glTranslated(-217, -6, -123);
            
            glTranslated(213, 0, 124);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-213, -0, -124);
            
            glTranslated(201, 0, 124);
            dC.drawRect(9f, 7f, 6f);
            glTranslated(-201, -0, -124);
            
            glTranslated(192, 0, 124);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-192, -0, -124);
            
            glTranslated(218, 6, 124);
            dC.drawRect(12f, 5f, 4f);
            glTranslated(-218, -6, -124);
            
            glTranslated(206, 6, 124);
            dC.drawRect(9f, 5f, 4f);
            glTranslated(-206, -6, -124);
            
            glTranslated(198, 6, 124);
            dC.drawRect(9f, 5f, 4f);
            glTranslated(-198, -6, -124);
            
            glTranslated(192, 0, 122);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-192, -0, -122);
            
            glTranslated(180, 0, 122);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-180, -0, -122);
            
            glTranslated(168, 0, 122);
            dC.drawRect(12f, 7f, 6f);
            glTranslated(-168, -0, -122);
            
            glTranslated(157, 0, 122);
            dC.drawRect(4f, 7f, 6f);
            glTranslated(-157, -0, -122);
            
            glTranslated(192, 6, 122);
            dC.drawRect(12f, 5f, 4f);
            glTranslated(-192, -6, -122);
            
            glTranslated(180, 6, 122);
            dC.drawRect(9f, 5f, 4f);
            glTranslated(-180, -6, -122);
            
            glTranslated(172, 6, 122);
            dC.drawRect(10f, 5f, 4f);
            glTranslated(-172, -6, -122);
            
            glTranslated(163, 6, 122);
            dC.drawRect(10f, 5f, 4f);
            glTranslated(-163, -6, -122);
            
            //*****PAREDES ***********---
            //--Parede de al  fondo
            glTranslated(253, 18, 150);
            dC.drawRect(36f, 10f, 1f);//atras c1
            glTranslated(-253, -18, -150);
            
            //Parede de enfrente
            
            //PAREDES ANCHO
            glTranslated(254, 18, 150);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-254, -18, -150);
            
            glTranslated(218, 18, 150);
            dC.drawRect(1f, 10f, 20f);//atras c1
            glTranslated(-218, -18, -150);
            
            //-********MUROS DE ENFRENTE DE LADO DE LA pUERTA***********--
            glTranslated(253, 18, 131);
            dC.drawRect(12f, 10f, 1f);//atras c1
            glTranslated(-253, -18, -131);
            
            //Puerta
            glTranslated(241, 18, 131);
            dC.drawRect(12f, 10f, 1f);//atras c1
            glTranslated(-241, -18, -131);
            
            glTranslated(229, 18, 131);
            dC.drawRect(12f, 10f, 1f);//atras c1
            glTranslated(-229, -18, -131);
            
            
            //*********MUROS DE ENFRENTE ***********----
            //Techo
            
            glTranslated(254, 28, 150);
            dC.drawRect(12f, 1f, 20f);//atras c1
            glTranslated(-254, -28, -150);
            
            glTranslated(242, 28, 150);
            dC.drawRect(12f, 1f, 20f);//atras c1
            glTranslated(-242, -28, -150);
            
            glTranslated(230, 28, 150);
            dC.drawRect(13f, 1f, 20f);//atras c1
            glTranslated(-230, -28, -150);
            
            //escaleras
                        
            glTranslated(242, 18, 130);
            dC.drawRect(13f, 10f, 1f);//atras c1
            glTranslated(-242, -18, -130);
            
            glTranslated(242, 18, 129);
            dC.drawRect(13f, 9f, 1f);//atras c1
            glTranslated(-242, -18, -129);
            
            glTranslated(242, 18, 128);
            dC.drawRect(13f, 7f, 1f);//atras c1
            glTranslated(-242, -18, -128);
            
            glTranslated(242, 18, 127);
            dC.drawRect(13f, 6f, 1f);//atras c1
            glTranslated(-242, -18, -127);
            
            glTranslated(242, 18, 126);
            dC.drawRect(13f, 5f, 1f);//atras c1
            glTranslated(-242, -18, -126);
            
            glTranslated(242, 18, 125);
            dC.drawRect(13f, 3f, 1f);//atras c1
            glTranslated(-242, -18, -125);
            
            glTranslated(242, 18, 124);
            dC.drawRect(13f, 2f, 1f);//atras c1
            glTranslated(-242, -18, -124);
            
            //Escaleras 90 grados
            glTranslated(217, 18, 146);
            dC.drawRect(1f, 10f, 13f);//atras c1
            glTranslated(-217, -18, -146);
            
            glTranslated(216, 18, 146);
            dC.drawRect(1f, 9f, 13f);//atras c1
            glTranslated(-216, -18, -146);
            
            glTranslated(215, 18, 146);
            dC.drawRect(1f, 7f, 13f);//atras c1
            glTranslated(-215, -18, -146);
            
            glTranslated(214, 18, 146);
            dC.drawRect(1f, 6f, 13f);//atras c1
            glTranslated(-214, -18, -146);
            
            glTranslated(213, 18, 146);
            dC.drawRect(1f, 5f, 13f);//atras c1
            glTranslated(-213, -18, -146);
            
            glTranslated(212, 18, 146);
            dC.drawRect(1f, 3f, 13f);//atras c1
            glTranslated(-212, -18, -146);
            
            glTranslated(211, 18, 146);
            dC.drawRect(1f, 2f, 13f);//atras c1
            glTranslated(-211, -18, -146);
            
            //pasillo
            glTranslated(217, 0, 160);
            dC.drawRect(37f, 18f, 36f);
            glTranslated(-217, 0, -160);
            
            glTranslated(190, 0, 155);
            dC.drawRect(37f, 18f, 36f);
            glTranslated(-190, 0, -155);
            
            glTranslated(190, 18, 155);
            dC.drawRect(28f, 10f, 28f);
            glTranslated(-190, -18, -155);
            
            //escaleras edificio 3
            
            glTranslated(197, 18, 146);
            dC.drawRect(1f, 2f, 13f);//atras c1
            glTranslated(-197, -18, -146);
            
            glTranslated(196, 18, 146);
            dC.drawRect(1f, 3f, 13f);//atras c1
            glTranslated(-196, -18, -146);
            
            glTranslated(195, 18, 146);
            dC.drawRect(1f, 5f, 13f);//atras c1
            glTranslated(-195, -18, -146);
            
            glTranslated(194, 18, 146);
            dC.drawRect(1f, 6f, 13f);//atras c1
            glTranslated(-194, -18, -146);
            
            glTranslated(193, 18, 146);
            dC.drawRect(1f, 7f, 13f);//atras c1
            glTranslated(-193, -18, -146);
            
            glTranslated(192, 18, 146);
            dC.drawRect(1f, 8f, 13f);//atras c1
            glTranslated(-192, -18, -146);
            
            glTranslated(191, 18, 146);
            dC.drawRect(1f, 9f, 13f);//atras c1
            glTranslated(-191, -18, -146);
            //cajas de los lados
            glTranslated(195, 18, 155);
            dC.drawRect(5f, 5f, 9f);
            glTranslated(-195, -18, -155);
            
            glTranslated(192, 23, 155);
            dC.drawRect(2f, 3f, 9f);
            glTranslated(-192, -23, -155);
            
            
            glTranslated(195, 18, 135);
            dC.drawRect(5f, 5f, 8f);
            glTranslated(-195, -18, -135);
            
            glTranslated(192, 23, 135);
            dC.drawRect(2f, 3f, 8f);
            glTranslated(-192, -23, -135);
            
            glTranslated(195, 18, 128);
            dC.drawRect(12f, 5f, 3f);
            glTranslated(-195, -18, -128);
            
            
            glTranslated(192, 23, 128);
            dC.drawRect(12f, 3f, 2f);
            glTranslated(-192, -23, -128);
            
            glTranslated(183, 18, 127);
            dC.drawRect(21f, 5f, 2f);
            glTranslated(-183, -18, -127);
            
             glTranslated(183, 23, 128);
            dC.drawRect(21f, 3f, 2f);
            glTranslated(-183, -23, -128);
            /***/
            //cajas sobresaliente escaleras dobles
            glTranslated(217, 18, 135);
            dC.drawRect(5f, 5f, 10f);
            glTranslated(-217, -18, -135);
            
            glTranslated(217, 23, 135);
            dC.drawRect(2f, 4f, 7f);
            glTranslated(-217, -23, -135);
            
            glTranslated(217, 18, 150);
            dC.drawRect(5f, 5f, 4f);
            glTranslated(-217, -18, -150);
            
            glTranslated(217, 23, 150);
            dC.drawRect(2f, 4f, 4f);
            glTranslated(-217, -23, -150);
            
            glTranslated(229, 18, 130);
            dC.drawRect(12f, 5f, 5f);
            glTranslated(-229, -18, -130);
            
            glTranslated(229, 23, 130);
            dC.drawRect(12f, 4f, 2f);
            glTranslated(-229, -23, -130);
            
            glTranslated(254, 18, 130);
            dC.drawRect(12f, 5f, 5f);
            glTranslated(-254, -18, -130);
            
            glTranslated(254, 23, 130);
            dC.drawRect(12f, 4f, 2f);
            glTranslated(-254, -23, -130);
        }
        
    }
    
    public void mono() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas
            glTranslated(26, 0, 60);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-26, -0, -60);
            
            glTranslated(24, 0, 60);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-24, -0, -60);
            
            //pansa
            
            glTranslated(26, 2, 60);
            dC.drawRect(3f, 3f, 1f);//atras c1
            glTranslated(-26, -2, -60);
            
            //cuello
            glTranslated(24.5, 5, 59.25);
            dC.drawRect(0.5f, 0.5f, 0.5f);//atras c1
            glTranslated(-24.5, -5, -59.25);
            
            glTranslated(25, 5.5, 60);
            dC.drawRect(1f, 1f, 1f);//atras c1
            glTranslated(-25, -5.5, -60);
        }
        glEnd();
    }
    
    
    
    public void primerCarte() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            
            //Patas del cartel danzante 
            glTranslated(45, 0, 70);
            dC.drawRect(1f, 5f, 1f);//atras c1
            glTranslated(-45, -0, -70);
            
            //Cartel danzante
            glTranslated(47, 3, 69.5);
            dC.drawRect(5f, 5f, 0.5f);//atras c1
            glTranslated(-47, -3, -69.5);

            //Patas del cartel danzante 
            glTranslated(15, 0, 12);
            dC.drawRect(1f, 5f, 1f);//atras c1
            glTranslated(-15, -0, -12);
            
            //Cartel danzante
            glTranslated(17, 3, 12.5);
            dC.drawRect(5f, 5f, 0.5f);//atras c1
            glTranslated(-17, -3, -12.5);
            
            
            //Patas del cartel danzante 
            glTranslated(15, 0, 12);
            dC.drawRect(1f, 5f, 1f);//atras c1
            glTranslated(-15, -0, -12);
            
            //Cartel danzante
            glTranslated(17, 3, 12.5);
            dC.drawRect(5f, 5f, 0.5f);//atras c1
            glTranslated(-17, -3, -12.5);
            
            
            //Patas del cartel LUNA 
            glTranslated(120, 0, 105);
            dC.drawRect(1f, 5f, 1f);//atras c1
            glTranslated(-120, -0, -105);
            
            //Cartel LUNA
            glTranslated(122, 3, 104);
            dC.drawRect(5f, 5f, 0.5f);//atras c1
            glTranslated(-122, -3, -104);
            
            //PATAS
            glTranslated(251.5, 10, 68);
            dC.drawRect(1f, 5f, 1f);//atras c1
            glTranslated(-251.5, -10, -68);
            
            //CARTEL del cartelSOL
            glTranslated(250.5, 13, 70);
            dC.drawRect(0.5f, 5f, 5f);//atras c1
            glTranslated(-250.5, -13, -70);

            
            //TUMBA 
            
            glTranslated(300, 11, 75);
            dC.drawRect(10f, 2f, 5f);//atras c1
            glTranslated(-300, -11, -75);
            
            //carte 
            glTranslated(302, 14, 75);
            dC.drawRect(0.5f, 5f, 5f);//atras c1
            glTranslated(-302, -14, -75); 
        }
        glEnd();
    }
    
    public void carteTumba(){
        glBegin(GL_QUADS);
        {
           glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            
            glTranslated(301.4, 14, 75);
            dC.drawRect(0.1f, 5f, 5f);//atras c1
            glTranslated(-301.4, -14, -75);
        }
    }
    
    public void tumba() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            
            glTranslated(300, 13, 75);
            dC.drawRect(10f, 0.1f, 5f);//atras c1
            glTranslated(-300, -13, -75);
        }
    }
    
    public void danzantesCarte() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(47, 3, 69);
            dC.drawRect(5f, 5f, 0.01f);//atras c1
            glTranslated(-47, -3, -69);

        }
        glEnd();
    }
    
    public void granCartel() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            //CARTEL LA GRAN PLAZA
            glTranslated(17, 3, 12.51);
            dC.drawRect(5f, 5f, 0.01f);//atras c1
            glTranslated(-17, -3, -12.51);

        }
        glEnd();
    }
    
    public void lunaCartel() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(122, 3, 103.49);
            dC.drawRect(5f, 5f, 0.01f);//atras c1
            glTranslated(-122, -3, -103.49);
            

        }
        glEnd();
    }
    
    public void solCartel() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(250, 13, 70);
            dC.drawRect(0.01f, 5f, 5f);//atras c1
            glTranslated(-250, -13, -70);

        }
        glEnd();
    }
    
    public void gritamono() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(135, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-135, -2, -117);
            
            glTranslated(132, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-132, -2, -117);
            
            glTranslated(129, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-129, -2, -117);
            
            glTranslated(126, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-126, -2, -117);
            
            glTranslated(123, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-123, -2, -117);
            
            glTranslated(120, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-120, -2, -117);
            
            glTranslated(117, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-117, -2, -117);
            
            glTranslated(114, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-114, -2, -117);
            
            glTranslated(111, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-111, -2, -117);
            
            glTranslated(108, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-108, -2, -117);
            
            glTranslated(105, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-105, -2, -117);
            
            glTranslated(102, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-102, -2, -117);
            
            glTranslated(99, 2, 117);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-99, -2, -117);
            
            glTranslated(138, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-138, -2, -119);
            
            glTranslated(141, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-141, -2, -119);
            
            glTranslated(144, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-144, -2, -119);
            
            glTranslated(147, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-147, -2, -119);
            
            glTranslated(150, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-150, -2, -119);
            
            glTranslated(153, 2, 119);
            dC.drawRect(3f, 3f, 0.1f);//atras c1
            glTranslated(-153, -2, -119);
        }
        glEnd();
    } 
    
    public void piernaDer() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(20, 0, 50);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-20, -0, -50);

        }
        glEnd();
    }
    
    public void piernaIzq() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(22, 0, 50);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-22, -0, -50);

        }
        glEnd();
    }
    
    public void cuerpo() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(22, 2, 50);
            dC.drawRect(3f, 3f, 1f);//atras c1
            glTranslated(-22, -2, -50);

        }
        glEnd();
    }
    
    public void blazo() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            

            //Blazo izquierdo
            glTranslated(23.1, 3, 50);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-23.1, -3, -50);
            
            //blazo izquierdo
            glTranslated(18.9, 3, 50);
            dC.drawRect(1f, 2f, 1f);//atras c1
            glTranslated(-18.9, -3, -50);
            
            //cuello
            glTranslated(20.75, 5, 50.25);
            dC.drawRect(0.5f, .5f, 0.5f);//atras c1
            glTranslated(-20.75, -5, -50.25);

        }
        glEnd();
    }
    
    public void cabeza() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(21, 5.25, 50);
            dC.drawRect(1f, 1f, 1f);//atras c1
            glTranslated(-21, -5.25, -50);

        }
        glEnd();
    }
    
    public void cara() {
        glBegin(GL_QUADS);
        {
            glTranslated(0, 0, 0);
            dC.drawRect(0, 0, 0);
            glTranslated(-0, -0, -0);
            //patas

            glTranslated(21, 5.25, 49);
            dC.drawRect(1f, 1f, 0.1f);//atras c1
            glTranslated(-21, -5.25, -49);

        }
        glEnd();
    }
    
    
    
    
}
