/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependencyInversion.badImplementation;

/* Mala implementación 
Imaginemos que en el futuro queremos cambiar el servicio de BBDD por un
servicio que conecta con una API. Para un minuto a pensar qué habría que
hacer... ¿Ves el problema? Tendríamos que ir modificando todas las 
instancias de la clase AccesoADatos, una por una.

Esto es debido a que nuestro módulo de alto nivel (AccesoADatos) depende
de un módulo de más bajo nivel (DatabaseService), violando así el 
principio de inversión de dependencias. El módulo de alto nivel debería
depender de abstracciones.

Para arreglar esto, podemos hacer que el módulo AccesoADatos dependa de
una abstracción más genérica
 */
public class accesoDatos {
    private DatabaseService databaseService;

    public accesoDatos(DatabaseService databaseService){
        this.databaseService = databaseService;
    }

    Dato getDatos(){
        databaseService.getDatos();
        //...
    }
}
