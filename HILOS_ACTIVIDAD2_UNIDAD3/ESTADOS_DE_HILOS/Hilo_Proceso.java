package clases;

public class Hilo_Proceso extends Thread {// se hereda de la clase Tread
    @Override// se sobreescribe el metodo run
    public void run() {
        for (int i = 0; i <= 5; i++) { // se agrega una sentencia para poder hacer un ciclo repetitivo.
            System.out.println(i + " " + getName()); // se manda imprimir la condicion i hasta que la condicion se cumpla
            
            try{
            Hilo_Proceso.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error dentro de la clase " + e);
            }
        }
    }
}
