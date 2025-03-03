/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomático;

public class Controlador {
    private SensorLuz sensorLuz;
    private SensorMovimiento sensorMovimiento;
    private Luz luz;

    public Controlador(SensorLuz sensorLuz, SensorMovimiento sensorMovimiento, Luz luz) {
        this.sensorLuz = sensorLuz;
        this.sensorMovimiento = sensorMovimiento;
        this.luz = luz;
    }

    public void actualizarEstado() {
        if (sensorLuz.isEsDeNoche() && sensorMovimiento.isHayMovimiento()) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }
}
