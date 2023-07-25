/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovSubstitution;

/* Clase base que representa un usuario del portal

En este ejemplo, tenemos una clase base User que representa un usuario 
del portal web universitario. Tiene un método abstracto 
displayDashboard() que se implementa de manera específica en las clases
derivadas Student y Professor. Cada clase derivada representa un tipo 
de usuario (estudiante y profesor, respectivamente) y proporciona su 
propia implementación del método displayDashboard()
 */
public abstract class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public abstract void displayDashboard();
}
