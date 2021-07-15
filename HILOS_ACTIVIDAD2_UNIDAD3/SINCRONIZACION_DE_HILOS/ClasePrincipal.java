package hilos;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        Hilo1 hilo1 = new Hilo1(); // se instancia el nuevo objeto para poder solicitarlo desde la clase hilo
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        //Hilo1
        hilo1.start(); // arrancamos el hilo 1
        // se agrega la sincronizacion 
        try {// para que capte el error 
            hilo1.sleep(10);// aqui le decimos que la clase hilo1 se duerma 1o milisegundos
        } catch (InterruptedException e) {// dentro del catch ponemos la excepcion
            System.out.println("Error en el hilo1 " + e); // mandamos un mensaje para que nso diga en cuantoo el hilo esta mal y le concatenamos la variable
        }
        
        //Hilo2
        hilo2.start(); // se ejecuta el hilo 2
        try {
            hilo2.sleep(10); // se duerme un 10 milisegundo
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
        
        //Hilo3
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3 " + e);
        }
        
        //Hilo4
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4 " + e);
        }
    }
    
}
