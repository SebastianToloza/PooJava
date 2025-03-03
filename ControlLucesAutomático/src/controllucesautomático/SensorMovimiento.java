/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomático;


public class SensorMovimiento {
    private boolean hayMovimiento;

    public SensorMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }

    public boolean isHayMovimiento() {
        return hayMovimiento;
    }

    public void setHayMovimiento(boolean hayMovimiento) {
        this.hayMovimiento = hayMovimiento;
    }
}
