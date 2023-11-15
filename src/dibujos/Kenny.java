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
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Jose Javier BO
 */
public class Kenny extends Dibujo {

    public Kenny(int x, int y) {
        super(x, y);
    }

    @Override
    public void dibujar(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        Stroke stOrig=g2.getStroke();

        //pantalones
        g.setColor(Colores.NARANJA.color);
        g.fillRect(escalarY(23+x), escalarY(-14+y), escalarY(67), escalarY(13));
        g.setColor(Color.BLACK);
        g.fillRoundRect(escalarY(20+x), escalarY(y-5), escalarY(73), escalarY(5), escalarY(5), escalarY(5));
        
        //blusa
         g.setColor(Colores.NARANJA.color);
        int[]bx={57,19,6,9,23,84,99,104,94};
         int[]by={-9,-15,-25,-41,-59,-59,-44,-27,-14};
         for (int i=0;i<bx.length;i++){
            bx[i]=escalarY(bx[i]+x);
            by[i]=escalarY(by[i]+y);
        }
         g.fillPolygon(bx, by, bx.length);
        g.setColor(Color.BLACK);
        int[] sbx={94,57,19};
        int[] sby={-14,-9,-15};
         for (int i=0;i<sbx.length;i++){
            sbx[i]=escalarY(sbx[i]+x);
            sby[i]=escalarY(sby[i]+y);
        }
        g.drawPolyline(sbx, sby, sbx.length);
        g.drawLine(escalarY(57+x), escalarY(-10+y), escalarY(57+x), escalarY(-45+y));
        g.drawLine(escalarY(92+x), escalarY(-23+y), escalarY(88+x), escalarY(-38+y));
        g.drawLine(escalarY(19+x), escalarY(-23+y), escalarY(23+x), escalarY(-38+y));
        //manos
        g.setColor(Colores.MARRON_MONTANA.color);
        g.fillOval(escalarY(2+x), escalarY(y-32), escalarY(18), escalarY(18));
        g.setColor(Color.BLACK);
        g.drawOval(escalarY(2+x), escalarY(y-32), escalarY(18), escalarY(18));
        g.setColor(Colores.MARRON_MONTANA.color);
        g.fillOval(escalarY(14+x), escalarY(y-28), escalarY(8), escalarY(8));
        g.setColor(Color.BLACK);
        g.drawOval(escalarY(14+x), escalarY(y-28), escalarY(8), escalarY(8));

        g.setColor(Colores.MARRON_MONTANA.color);
        g.fillOval(escalarY(90+x), escalarY(y-32), escalarY(18), escalarY(18));
        g.setColor(Color.BLACK);
        g.drawOval(escalarY(90+x), escalarY(y-32), escalarY(18), escalarY(18));
        g.setColor(Colores.MARRON_MONTANA.color);
        g.fillOval(escalarY(88+x), escalarY(y-28), escalarY(8), escalarY(8));
        g.setColor(Color.BLACK);
        g.drawOval(escalarY(88+x), escalarY(y-28), escalarY(8), escalarY(8));
        
        
        //piel: 55 98 111
        g.setColor(Colores.PIEL.color);
        g.fillOval(escalarY(5+x), escalarY(y-148), escalarY(100), escalarY(100));
        //ojos
        g.setColor(Color.WHITE);
        g.fillOval(escalarY(x+24), escalarY(y-124), escalarY(34), escalarY(34));
        g.fillOval(escalarY(x+56), escalarY(y-124), escalarY(34), escalarY(34));
         g2.setStroke(new BasicStroke(escalarY(18)));
        g.setColor(Colores.MARRON_MONTANA.color);
        g.drawArc(escalarY(x+20), escalarY(y-150), escalarY(115), escalarY(90), 125, 110);
        g.drawArc(escalarY(x-25), escalarY(y-150), escalarY(115), escalarY(90), 305, 110);
        g.setColor(Color.BLACK);
        g.fillOval(escalarY(x+42), escalarY(y-107), escalarY(5), escalarY(5));
        g.fillOval(escalarY(x+62), escalarY(y-107), escalarY(5), escalarY(5));
        
//        

        g2.setStroke(new BasicStroke(escalarY(18)));
        g.setColor(Colores.NARANJA.color);
        g.drawOval(escalarY(x+5), escalarY(y-153), escalarY(100), escalarY(100));
        g.drawOval(escalarY(x+5), escalarY(y-143), escalarY(100), escalarY(80));
        g2.setStroke(stOrig);
        g.setColor(Color.BLACK);
        g.drawArc(escalarY(x), escalarY(y-153), escalarY(110), escalarY(110), 230, 80);
        g2.setStroke(stOrig);
        
        
        g.setColor(Color.GRAY);
        g.drawLine(escalarY(56+x), escalarY(-65+y), escalarY(62+x),escalarY(-48+y));
        g.drawLine(escalarY(56+x), escalarY(-65+y), escalarY(53+x),escalarY(-45+y));
        g.drawOval(escalarY(14+x), escalarY(-135+y), escalarY(82),escalarY(72));
    }
    
    
}

