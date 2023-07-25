/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovSubstitution;

/* Clase derivada que representa un profesor
 */
public class profesor extends User {
    public profesor(String username) {
        super(username);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Mostrando el panel de control del profesor");
        // Lógica específica del profesor
    }
}
