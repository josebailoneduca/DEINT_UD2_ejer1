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
 * @author Jose Javier BO
 */
public class Coche extends Dibujo {

    public Coche(int x, int y) {
        super(x, y);
        
    }

    @Override
    public void dibujar(Graphics g) {
        //guardar pincel noermal
        Graphics2D g2 = (Graphics2D) g; 
        Stroke antiguoStroke= g2.getStroke();
        
        //cristal
        g.setColor(Colores.COLOR_CRISTAL.color);
        int[] crx={262,223,40,17};
        int[] cry={-80,-120,-120,-80};
         for (int i=0;i<crx.length;i++){
            crx[i]=escalarY(crx[i]+x);
            cry[i]=escalarY(cry[i]+y);
        }
         g.fillPolygon(crx, cry, crx.length);
         
        //carroceria inferior
        g.setColor(Colores.COLOR_COCHE.color);
        int[]cx={26,293,338,362,371, 371,365,262,11,9,14,20 };
        int[]cy={-21,-21,-28,-28,-36,-59,-72,-80,-80,-48,-35,-25};
        for (int i=0;i<cx.length;i++){
            cx[i]=escalarY(cx[i]+x);
            cy[i]=escalarY(cy[i]+y);
        }
        g.fillPolygon(cx, cy, cx.length);
        
        //techo y marcos ventanas
        g2.setStroke(new BasicStroke(escalarY(10)));
        int[] c2x={262,223,40,17};
        int[] c2y={-80,-120,-120,-80};
        
         for (int i=0;i<c2x.length;i++){
            c2x[i]=escalarY(c2x[i]+x);
            c2y[i]=escalarY(c2y[i]+y);
        }
         g.drawPolyline(c2x, c2y, c2x.length);
         g.drawLine(escalarY(183+x),escalarY(-80+y), escalarY(180+x), escalarY(-118+y));
         g.drawLine(escalarY(119+x),escalarY(-80+y), escalarY(130+x), escalarY(-118+y));
         g.drawLine(escalarY(74+x),escalarY(-80+y), escalarY(87+x), escalarY(-118+y));
         g2.setStroke(antiguoStroke);
        
        //faro
        int[] fx = {372, 372, 363, 359};
        int[] fy = {-48, -59, -70, - 48};
        for (int i = 0; i < fx.length; i++) {
            fx[i] = escalarY(fx[i] + x);
            fy[i] = escalarY(fy[i] + y);
        }
        g.setColor(Color.yellow);
        g.fillPolygon(fx, fy, fx.length);
        
        //marcas puerta
        g.setColor(Color.BLACK);
        g.drawLine(escalarY(184+x), escalarY(y-27),escalarY(184+x), escalarY(y-74));
        g.drawLine(escalarY(188+x), escalarY(y-72),escalarY(199+x), escalarY(y-72));
 
        //parachoques
        g.fillRoundRect(escalarY(2+x), escalarY(-47+y), escalarY(36), escalarY(14),escalarY(5),escalarY(5));
        
        //ruedas
        rueda(g,310,-27);
        rueda(g,98,-27);
        
    }

    private void rueda(Graphics g, int rx, int ry) {
        int radio = 30;
        int radio2 = 18;
        int radio3 = 15;
        
        //cubierta
        g.setColor(Color.black);
        g.fillOval(escalarY(rx+x-radio), escalarY(ry+y-radio), escalarY(radio*2), escalarY(radio*2));
        //filo llanta
        g.setColor(Color.WHITE);
        g.fillOval(escalarY(rx+x-radio2), escalarY(ry+y-radio2), escalarY(radio2*2), escalarY(radio2*2));
        //centro llanta
        g.setColor(Color.GRAY);
        g.fillOval(escalarY(rx+x-radio3), escalarY(ry+y-radio3), escalarY(radio3*2), escalarY(radio3*2));
        
    }
    
}
