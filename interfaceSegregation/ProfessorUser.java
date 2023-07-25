/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceSegregation;

/* Clase que representa a un profesor
 */
public class ProfessorUser implements User, Professor {
    private String username;

    public ProfessorUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void displayDashboard() {
        System.out.println("Mostrando el panel de control del profesor");
    }

    public void displayTeachingSchedule() {
        System.out.println("Mostrando el horario de enseñanza del profesor");
    }
}
