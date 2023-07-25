/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyInversion.goodImplementation;

/* Así, tanto el módulo de alto nivel como el de bajo nivel dependen de
abstracciones, por lo que cumplimos el principio de inversión de 
dependencias. Además, esto nos forzará a cumplir el principio de Liskov
ya que los tipos derivados de Conexion (DatabaseService y APIService) 
son sustituibles por su abstracción (interfaz Conexion).
 */
public class DatabaseService  implements Conexion {

    @Override
    public Dato getDatos() { //... }

    @Override
    public void setDatos() { //... }
}
