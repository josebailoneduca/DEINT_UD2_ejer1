/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package dibujos;

import java.awt.Graphics;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Dibujo {

    protected static int refLienzoX=800;
    protected static int refLienzoY=600;
    
    protected int x;
    protected int y;
    protected float escalax;
    protected float escalay;
    protected int lienzoAncho;
    protected int lienzoAlto;
    protected int capa;

    public Dibujo() {
        x = 0;
        y = 0;
        escalax = 1;
        escalay=1;
        lienzoAncho=800;
        lienzoAlto=600;
        capa=1;
    }

    public Dibujo(int x, int y) {
        this.x = x;
        this.y = y;
        this.escalax = 1;
        this.escalay = 1;
        this.lienzoAlto = 800;
        this.lienzoAncho = 600;
        capa=1;
    }

    public Dibujo(int x, int y, int escala) {
        this.x = x;
        this.y = y;
        this.escalax = escala;
        this.escalay=escala;
        this.lienzoAlto = 800;
        this.lienzoAncho = 600;
        capa=1;
    }

    public Dibujo(int x, int y,int lienzoAncho, int lienzoAlto) {
        this.x = x;
        this.y = y;
        this.escalax = 1;
        this.escalay=1;
        this.lienzoAncho = lienzoAncho;
        this.lienzoAlto = lienzoAlto;
    }

 

    
    public static int getRefLienzoX() {
        return refLienzoX;
    }

    public static int getRefLienzoY() {
        return refLienzoY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getLienzoAncho() {
        return lienzoAncho;
    }

    public int getLienzoAlto() {
        return lienzoAlto;
    }

    public int getPlano() {
        return capa;
    }

    public void setLienzoAncho(int lienzoAncho) {
        this.lienzoAncho = lienzoAncho;
        this.escalax=((float)this.lienzoAncho)/(float)refLienzoX;
    }

    public void setLienzoAlto(int lienzoAlto) {
        this.lienzoAlto = lienzoAlto;
        this.escalay=((float)this.lienzoAlto)/(float)refLienzoY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    protected int escalarX(int px){
        return (int) (px*escalax);
    }
    
    protected int escalarY(int py){
        return (int) (py*escalay);
    }    
    public void dibujar(Graphics g) {
    }
}//end Dibujo
