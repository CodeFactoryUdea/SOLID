/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaceSegregation;

/*Interfaz que define las operaciones comunes para los usuarios

En este ejemplo, tenemos una interfaz User que define las operaciones
comunes para los usuarios del portal web universitario. La interfaz 
User incluye los métodos getUsername() y displayDashboard().
 */
public interface User {
     String getUsername();

    void displayDashboard();
}
