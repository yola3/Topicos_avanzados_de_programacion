package hilos;

public class Hilo1 extends Thread {// se hereda de la clase thread

    @Override // se sobre escribe el metodo run
    public void run() {
        for (int i = 0; i <= 5; i++) {// se agrega un ciclo repetitiva para que nos pueda imprimir 11 veces la letra G
            System.out.print(i + ": G");// se imprime la letra G agregando el contador para que se vaya enumerando cada ciclo que se ejecuta por segundo.

            try { //se agrega la sentencia para que capte el error al ejecutar 
                Hilo1.sleep(1000); // hacemos que se duerma por un segundo
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo1 " + e); // le mandamos un mensaje que al ejecutar si esta mal la clase hilo1 nos mandara este mensje 
            }
        }
    }
}
