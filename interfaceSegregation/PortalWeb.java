/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceSegregation;

/* Clase principal que muestra los paneles de control de los usuarios
 
La clase PortalWeb tiene el método displayUserDashboard() que acepta 
un objeto de tipo User. Esto demuestra la segregación de la interfaz,
ya que solo se utiliza la parte común de la interfaz User sin 
depender de los métodos específicos para estudiantes o profesores.

En el método main(), creamos instancias de StudentUser y ProfessorUser
y las pasamos al método displayUserDashboard() de la clase PortalWeb.
Luego, si el usuario es un estudiante, verificamos si también 
implementa la interfaz Student para llamar al método displayCourses().
De manera similar, si el usuario es un profesor, verificamos si 
también implementa la interfaz Professor para llamar al método 
displayTeachingSchedule()

De esta manera, se cumple el principio de Segregación de la Interfaz,
ya que las interfaces están diseñadas de forma específica para los 
usuarios, evitando que los clientes dependan de métodos que no 
necesitan. Esto facilita la adaptación del portal web universitario a
diferentes roles de usuario y permite un diseño más modular y flexible.
*/
public class PortalWeb {
    public void displayUserDashboard(User user) {
        user.displayDashboard();
    }

    public static void main(String[] args) {
        PortalWeb portal = new PortalWeb();

        User student = new StudentUser("student123");
        User professor = new ProfessorUser("prof123");

        portal.displayUserDashboard(student);

        if (student instanceof Student) {
            ((Student) student).displayCourses();
        }

        portal.displayUserDashboard(professor);

        if (professor instanceof Professor) {
            ((Professor) professor).displayTeachingSchedule();
        }
    }
}
