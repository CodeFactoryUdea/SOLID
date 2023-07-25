
package singleResponsability;

/* Mal uso del principio de responsabilidad única 
Esta clase UserLogin tiene como responsabilidad realizar el proceso de 
login pero además le dimos la responsabilidad de de enviar mensajes al 
usuario.

Este código viola el principio de responsabilidad unica. Está haciendo 
dos cosas con objetivos diferentes.

¿Entonces qué deberíamos hacer?

Sería conveniente separar la clase en dos. Una para lo específico del 
login y otra para la funcionalidad de envío de mensajes.

Llevemos entonces el método sendMail a otra clase que tenga como 
responsabilidad el envío de mensajes.
*/
public class UserLogin {

   private final DataBase db;

    UserLogin(DataBase db) {
        this.db = db;
    }

    void login(String userName, String password) {
        User user = db.findUserByUserName(userName);
        if (user == null) {
            // do something
        }
        // login process..
    }

    void sendEmail(User user, String msg) {
        // sendEmail email to user
    }
}
