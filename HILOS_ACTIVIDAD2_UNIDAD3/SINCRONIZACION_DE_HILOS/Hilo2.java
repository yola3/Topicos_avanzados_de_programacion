package hilos;

public class Hilo2 extends Thread{ // la clase se hereda de la clase padre en este caso Thread

    @Override /// se sobre escribe el metodo run
    public void run() {
        for (int i = 0; i <= 5; i++) { // se agrega un ciclo for para que vaya comparando si se cumple la condicion y se vaya incrementando
            System.out.print("E");
            
            try { 
                Hilo2.sleep(1000);// l hilo 2 se duerme en un 1 segundo.
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo2 " + e);
            }
        }
    }

}
