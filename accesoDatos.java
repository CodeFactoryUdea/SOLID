/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyInversion.goodImplementation;

/* Así, sin importar el tipo de conexión que se le pase al módulo 
AccesoADatos, ni este ni sus instancias tendrán que cambiar, por lo que
nos ahorraremos mucho trabajo.

Ahora, cada servicio que queramos pasar a AccesoADatos deberá 
implementar la interfaz Conexion
 */
public class accesoDatos {
    private Conexion conexion;

    public accesoDatos(Conexion conexion){
        this.conexion = conexion;
    }

    Dato getDatos(){
        conexion.getDatos();
    }
}
