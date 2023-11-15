/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */

package dibujos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public class Casa extends Dibujo {

    public Casa(int x, int y) {
        super(x, y);
    }

    @Override
    public void dibujar(Graphics g) {

        //estructura
        g.setColor(Colores.MARRON_LADRILLO.color);
        g.fillRect(escalarY(x), escalarY(y-239),escalarY(207), escalarY(239));
        
        //TEJADO
        g.setColor(Colores.ROJO_TEJA.color);
        int[]tx={escalarY(x-14),escalarY(x+14),escalarY(x+195),escalarY(x+227)};
        int[]ty={escalarY(y-237),escalarY(y-309),escalarY(y-309),escalarY(y-237)};
        g.fillPolygon(tx, ty, tx.length);
        
        //chimenea
        g.setColor(Colores.MARRON_LADRILLO.color);
        g.fillRect(escalarY(x+128), escalarY(y-333),escalarY(30), escalarY(80));
        
        //puerta
        g.setColor(Colores.MARRON_ARBOL.color);
        g.fillRoundRect(escalarY(x+125), escalarY(y-100), escalarY(45),escalarY(100),escalarY(5), escalarY(5));
        g.setColor(Color.WHITE);
        g.fillOval(escalarY(x+133), escalarY(y-59), escalarY(10), escalarY(10));
        
        //ventanas
        this.ventana(g, 35, -98);
        this.ventana(g, 35, -198);
        this.ventana(g, 125, -198);
     }

    
    private void ventana(Graphics g,int vx, int vy){
    //cristal
    g.setColor(Color.WHITE);
    g.fillRoundRect(escalarY(vx+x), escalarY(vy+y), escalarY(50),escalarY(50),escalarY(5), escalarY(5));
    
    //marco
    g.setColor(Colores.MARRON_ARBOL.color);
    Graphics2D g2 = (Graphics2D)g;
    Stroke strokeanterior= g2.getStroke();
    g2.setStroke(new BasicStroke(escalarY(5)));
    g.drawRoundRect(escalarY(vx+x), escalarY(vy+y), escalarY(50),escalarY(50),escalarY(5), escalarY(5));
    
    //division
    g.drawLine(escalarY(vx+x), escalarY(vy+y+25),escalarY(vx+x+50), escalarY(vy+y+25));
    g2.setStroke(strokeanterior);
    }
    
}//end Casa
