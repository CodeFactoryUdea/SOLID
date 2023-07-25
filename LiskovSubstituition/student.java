/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovSubstitution;

/* Clase derivada que representa un estudiante
 */
public class student extends User {
    public student(String username) {
        super(username);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Mostrando el panel de control del estudiante");
        // Lógica específica del estudiante
    }
}
