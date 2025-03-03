/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomático;

/**
 *
 * @author TOLOZA
 */
public class SensorLuz {
    private boolean esDeNoche;

    public SensorLuz(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public boolean isEsDeNoche() {
        return esDeNoche;
    }

    public void setEsDeNoche(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }
}

