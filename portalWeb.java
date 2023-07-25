/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovSubstitution;

/* Clase principal que muestra el panel de control del usuario

La clase PortalWeb tiene un método displayUserDashboard() que acepta un
objeto de tipo User. Aquí es donde se aplica el principio de 
Sustitución de Liskov. Tanto los objetos Student como Professor se pueden
pasar como argumento al método displayUserDashboard() porque cumplen 
con la interfaz definida por la clase base User. Esto demuestra que los
objetos de la clase derivada pueden sustituir a los objetos de la clase
base sin afectar el comportamiento esperado.

Al llamar al método displayUserDashboard() en la clase principal, pasamos 
tanto un objeto Student como un objeto Professor, y en ambos casos, se 
muestra el panel de control correspondiente sin ningún problema.

De esta manera, el principio de Sustitución de Liskov se cumple, ya que
los objetos de las clases derivadas (Student y Professor) son 
completamente sustituibles por los objetos de la clase base (User) sin
afectar el comportamiento esperado del programa. Esto facilita la 
extensibilidad y la flexibilidad en el manejo de diferentes tipos de 
usuarios en el portal web universitario.
 */
public class portalWeb {
    public void displayUserDashboard(User user) {
        user.displayDashboard();
    }

    public static void main(String[] args) {
        portalWeb portal = new portalWeb();
        User Student = new student("student123");
        User Profesor = new profesor("prof123");

        portal.displayUserDashboard(Student);
        portal.displayUserDashboard(Profesor);
    }
}
