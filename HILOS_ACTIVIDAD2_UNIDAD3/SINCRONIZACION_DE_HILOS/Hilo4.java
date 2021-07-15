package hilos;

public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("K");// en esta ultima letra que se va ejecutar se le agrega el salto de linea para que asi en cuando se termine un ciclo tendra que dar un salto de linea
            
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo4 " + e);
            }
        }
    }

}
