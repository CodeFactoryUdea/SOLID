/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceSegregation;

/* Clase que representa a un estudiante

Las clases StudentUser y ProfessorUser implementan tanto la interfaz 
User como las interfaces adicionales correspondientes. Cada clase
proporciona su propia implementación de los métodos definidos en las
interfaces.
 */
public class StudentUser implements User, Student {
    private String username;

    public StudentUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void displayDashboard() {
        System.out.println("Mostrando el panel de control del estudiante");
    }

    public void displayCourses() {
        System.out.println("Mostrando los cursos del estudiante");
    }
}
