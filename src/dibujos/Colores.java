/*
LICENCIA JOSE JAVIER BO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
Lista de paquetes:
 */
package dibujos;

import java.awt.Color;

/**
 *
 * @author Jose Javier Bailon Ortiz
 */
public enum Colores {

    

    VERDE (new Color(0.467f, 0.639f, 0.369f)),
    COLOR_COCHE (new Color(0.749f, 0.443f, 0f)),
    COLOR_CRISTAL (new Color(0.333f, 0.839f, 0.98f, 0.43f)),
    MARRON_MONTANA (new Color (0.69f, 0.592f, 0.451f)),
    MARRON_ARBOL (new Color (0.471f, 0.408f, 0.278f)),
    AMARILLO_SOL (new Color (1f, 0.792f, 0.075f)),
    MARRON_LADRILLO (new Color (0.851f, 0.792f, 0.576f)),
    ROJO_TEJA (new Color (0.788f, 0.294f, 0.141f)),
    NARANJA (new Color(1f, 0.459f, 0f)),
    PIEL (new Color(0.98f, 0.882f, 0.792f)),
    AZUL_CIELO (new Color ( 0.486f, 0.804f, 0.902f));
    
    Color color;
    
    Colores (Color c){
        this.color=c;
    }

    public Color getColor() {
        return color;
    }
    
    
}
