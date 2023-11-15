/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Lista de paquetes:
 */
package logica;

import dibujos.Casa;
import dibujos.Coche;
import dibujos.Dibujo;
import dibujos.Fondo;
import dibujos.Kenny;
import gui.VPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Jose Javier BO
 */
public class Logica {

    static private ArrayList<Dibujo> dibujos = new ArrayList<Dibujo>();

    static int casas=0;
    
    public static void addDibujo(Dibujo d,int plano) {
        dibujos.add(d);
    }
    
    
    
    public static ArrayList<Dibujo> getDibujos() {
        return dibujos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    /**
     * Agregar paisaje. Como va a taparlo todo quitamos lo que hay
     */
    public static void addPaisaje() {
        dibujos.clear();
         casas=0;
        dibujos.add(new Fondo());
    }

    /**
     * Limpiar la lista de dibujos
     */
    public static void limpiar() {
        casas=0;
    dibujos.clear();    
    }

    /**
     * Agregar casa donde toca
     */
    public static void addCasa() {
        Casa c = new Casa(100,400);
        c.setX(c.getX()+(casas*400));
        dibujos.add(c);
        casas++;
    }

    /**
     * Agregar coche a la lista de dibujos
     */
    public static void addCoche() {
        Coche c = new Coche(400,450);
        dibujos.add(c);
    }

    public static void addKenny() {
                
        Kenny k = new Kenny(250,500);
        dibujos.add(k);
    }
}
