/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package dibujos;

import java.awt.Graphics;

/**
 * Clase básica de dibujo. Tiene referencias a posicion x,y 
 * Tambien escalax,y(basadas en el tamaño de lienzo respecto a la referencia 800x600)
 * @author Jose Javier Bailon Ortiz
 */
public class Dibujo {
/**
 * Valores predeterminados de dimensiones del lienzo.
 * A partir de estos valores se calcula la escala horizontal y vertical
 * Para un lienzo 800x600 la escala seria 1,1
 * Para un lienzo de 1600x1200 la escala sería 2,2
 */
    protected static int refLienzoX=800;
    protected static int refLienzoY=600;
    
    /**
     * Coordenada x del dibujo
     */
    protected int x;
    
    /**
     * Coordenada y del dibujo
     */
    protected int y;
    
    /**
     * Escala respecto al ancho del lienzo
     */
    protected float escalax;
    
    /**
     * Escala respecto al alto del lienzo
     */
    protected float escalay;
    
    /*
    Tamano actual del ancho del lienzo
    */
    protected int lienzoAncho;
    
    /**
     * Tamano actual del alto del lienzo
     */
    protected int lienzoAlto;

 
    /**
     * Constructor
     * @param x Coordenada x del dibujo
     * @param y Coordenada y del dibujo
     */
    public Dibujo(int x, int y) {
        this.x = x;
        this.y = y;
        this.escalax = 1;
        this.escalay = 1;
        this.lienzoAlto = 800;
        this.lienzoAncho = 600;
    }
   
 

    /**
     * Establece el ancho de lienzo y recalcula la escala respecto a la referencia 800
     * @param lienzoAncho El ancho a establecer 
     */
    public void setLienzoAncho(int lienzoAncho) {
        this.lienzoAncho = lienzoAncho;
        //escala es tamanoactual/referencia = tamanoactual/600
        this.escalax=((float)this.lienzoAncho)/(float)refLienzoX;
    }

     /**
     * Establece el alto de lienzo y recalcula la escala respecto a la referencia 600
     * @param lienzoAlto El alto a establecer 
     */
    public void setLienzoAlto(int lienzoAlto) {
        this.lienzoAlto = lienzoAlto;
        //escala es tamanoactual/referencia = tamanoactual/600
        this.escalay=((float)this.lienzoAlto)/(float)refLienzoY;
    }

    /**
     * Devuelve la coordenada x
     * @return  la x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Devuelve la coordenada y
     * @return  la y
     */
    public int getY() {
        return y;
    }

    
    /**
     * Establece la coordenada x del dibujo
     * @param x la x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Establece la coordenada y del dibujo
     * @param y la coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    /**
     * Recalcula un valor respecto a la escala horizontal del lienzo.
     * @param px valor a transformar
     * @return  el valor transformado
     */
    protected int escalarX(int px){
        return (int) (px*escalax);
    }


    /**
     * Recalcula un valor respecto a la escala vertical del lienzo
     * @param py valor a transformar
     * @return  valor transformado
     */
    protected int escalarY(int py){
        return (int) (py*escalay);
    }    
    
    /**
     * Dibujar en un contexto grafico
     * 
     * Usar los atributos x e y como desfase para las coordenadas en el lienzo.
     * Si el lienzo no es de 800x600 usar escalarX e escalrY para obtener un valor
     * proporional a un lienzo de 800x600.
     * 
     * Por ejemplo si se quiere que una posicion sea proporcional dentro de un lienzo
     * a como es para un lienzo de 800x600 escribir la coordenada como:
     *  x:cordenada x
     *  y:coordenada y
     *  escalarX(x),escalarY(y)
     * 
     * Si se quiere mantener las proporciones usar la misma escala para los dos
     * valores de la coordenada:
     *  x:cordenada x
     *  y:coordenada y
     *  escalarX(x),escalarX(y)
     * 
     * @param g  El contexto en el que dibujar
     */
    public void dibujar(Graphics g) {
    }
}//end Dibujo
