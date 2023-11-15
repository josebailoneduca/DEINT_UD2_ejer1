/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */

package dibujos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Fondo extends Dibujo{

    public Fondo( ) {
        super(0, 0);
    }

    
    
    @Override
    public void dibujar(Graphics g) {
        
        //calculos de proporciones
        int decimo = this.lienzoAlto/10;
        int quinto=this.lienzoAlto/5;
        int tercio=this.lienzoAlto/3;
        int dosTercios= this.lienzoAlto/3*2;
        int tresQuintos=quinto*3;
        if (decimo<1)decimo=1;
        if (quinto<1)quinto=1;
        if (tercio<1)tercio=1;
        if (dosTercios<1)dosTercios=1;
        
        
        //cielo
        g.setColor(Colores.AZUL_CIELO.color);
        g.fillRect(0, 0, this.lienzoAncho, tercio);
        
        //sol
        g.setColor(Colores.AMARILLO_SOL.color);
        g.fillOval(tercio, 10, quinto, quinto);
        
        //montañas
        //Se calcula las posiciones de los puntos siendo uno a una altura y otro a otra
        //creando asi picos. Luego cada pico se desfasa verticalmente por un valor 
        //proporcionado al seno de x para crear variedad
        //se dibujan picos hasta rebasar el tamaño del lienzo
        ArrayList<Integer> px = new ArrayList<Integer>();
        ArrayList<Integer> py = new ArrayList<Integer>();
        px.add(0);
        py.add(dosTercios);
        int xm=0;
        int ym=quinto;
        boolean salir=false;
        while (!salir){
            if (xm>this.lienzoAncho)
                salir=true;
            px.add(xm);
            if (ym==quinto){
                py.add((int)(tercio-(Math.abs(Math.sin(xm*0.3/decimo)*quinto))));
                ym=tercio;
                        }else{
                py.add(quinto);
                ym=quinto;
            }
            xm+=decimo;
        }
        px.add(this.lienzoAncho);
        py.add(dosTercios);
        
        //transformar el arraylist<Integer> en int[]
        int[] puntosEX=px.stream().mapToInt(Integer::valueOf).toArray();
        int[] puntosEY=py.stream().mapToInt(Integer::valueOf).toArray();       
        
        //pintar el poligonod e las montanas
        g.setColor(Colores.MARRON_MONTANA.color); 
        g.fillPolygon(puntosEX, puntosEY, puntosEX.length);
        
        //suelo
        g.setColor(Colores.VERDE.color);
       g.fillRect(0, tresQuintos, this.lienzoAncho, this.lienzoAlto-quinto);
       
       //arboles. Se dibujan hasta rebasar el ancho del lienzo
        salir=false;
         int nArb=0;
        while (!salir){
            int posArbolX=nArb*180+100;
            int calc=escalarY(posArbolX);
            if (calc>this.lienzoAncho)
                salir=true;
            arbol(g, posArbolX, 390);
            nArb+=1;
        }
    }

    /**
     * Dibuja un arbol
     * @param g Contexto
     * @param vx desfase en x
     * @param vy desfase en y
     */
    private void arbol(Graphics g,int vx, int vy){
        //tronco
        g.setColor(Colores.MARRON_ARBOL.color);
        g.fillRect(escalarY(vx), escalarY(vy-117), escalarY(20),escalarY(117));
        //copa 
        int radio = 40;
        int[]cx={-17,38,-7,-6,-36,53};
        int[]cy={-140,-137,-187,-245,-193,-209};
        g.setColor(Color.GREEN);
        for (int i=0;i<cx.length;i++){
         g.fillOval(escalarY(cx[i]+vx-radio), escalarY(cy[i]+vy-radio), escalarY(radio*2), escalarY(radio*2));
        }
   
    }
}//end Fondo
