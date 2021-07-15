package hilos;

public class Hilo3 extends Thread{ // se hereda la subclase a la subclase padre

    @Override // se sobre escribe el metodo 
    public void run() { 
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            
            try {
                Hilo3.sleep(1000); // el hilo 3 se bloquera en un 1 segundo.
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo3 " + e);
            }
        }
    }
}
