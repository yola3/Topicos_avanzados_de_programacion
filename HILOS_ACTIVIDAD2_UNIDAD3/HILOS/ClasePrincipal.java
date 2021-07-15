// COMPROBAR COMO SE COMPORTA UN PROGRAMA CUANDO NO TRABAJAMOS CON HILO 
package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
// ESTOS SE HACE CUANDO LA CLASE SE HEREDA DE THREAD
        Proceso1 hilo1 = new Proceso1(); // SE INSTANCIA UN NUEVO OBJETO PARA PODER VER EL RESULTADO DEL PROCESO   
        Proceso1 hilo3 = new Proceso1(); // SE INSTANCIA UN NUEVO OBJETO 
        // ESTO SE HACE CUANDO SE UTILIZA EL IMPLEMENTS 
        Thread hilo2 = new Thread(new Proceso2()); // INDICAR QUE NOS MUESTRE EL PROCESO QUE SE ENCUNETRA EN EL Thread
       // METODOS QUE NOS PERMITE ARRANCAR NUESTRO HILO
        hilo1.start();
        hilo3.start();
        hilo2.start();
        
    }
}


