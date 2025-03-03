/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controllucesautomático;

/**
 *
 * @author TOLOZA
 */
public class ControlLucesAutomático {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SensorLuz sensorLuz = new SensorLuz(true); // De noche
        SensorMovimiento sensorMovimiento = new SensorMovimiento(false); // Sin movimiento
        Luz luz = new Luz();
        Controlador controlador = new Controlador(sensorLuz, sensorMovimiento, luz);

        while (true) {
            controlador.actualizarEstado();
            try {
                Thread.sleep(10000); // Espera 10 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Simulación de cambio en sensores (Ejemplo: alternar movimiento)
            sensorMovimiento.setHayMovimiento(!sensorMovimiento.isHayMovimiento());
        }
    }
    
}
