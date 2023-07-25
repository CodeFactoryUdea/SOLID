/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openClosed;

/* Clase principal que muestra los módulos en el portal

La clase PortalWeb es la clase principal que representa el portal web
universitario. Permite agregar módulos al portal a través del método 
addModule(). El método displayModules() recorre la lista de módulos y 
llama al método display() en cada uno de ellos, sin necesidad de 
modificar la clase principal o los módulos existentes cuando se 
agreguen nuevos módulos en el futuro.

De esta manera, el principio Open/Closed se cumple, ya que la clase 
PortalWeb está abierta para la extensión al permitir agregar nuevos 
módulos sin necesidad de modificar el código existente. Al mismo tiempo
, está cerrada para la modificación, ya que no se necesita modificar la
clase PortalWeb cuando se agregan nuevos módulos. Esto facilita la 
escalabilidad y el mantenimiento del código a medida que se agregan
nuevos módulos al portal web universitario.
 */
public class portalWeb {
    private List<PortalModule> modules;

    public portalWeb() {
        modules = new ArrayList<>();
    }

    public void addModule(PortalModule module) {
        modules.add(module);
    }

    public void displayModules() {
        for (PortalModule module : modules) {
            module.display();
        }
    }

    public static void main(String[] args) {
        portalWeb portal = new portalWeb();
        portal.addModule(new moduloCursos());

        portal.displayModules();
    }
}
