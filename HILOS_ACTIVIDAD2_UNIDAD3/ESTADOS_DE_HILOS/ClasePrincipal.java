package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Hilo_Proceso hilo1 = new Hilo_Proceso(); // se instancia un nuevo ibjeto para poder solicitarlo de la clase hilo1 
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        hilo1.start(); // se crea el segundo hilo en donde se va ejecutar
        
        try{
        hilo1.sleep(1000);// tercer estado que es la que bloquera la ejecucion por tiempo definido 
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1 " + e);
        }
        
        hilo2.start();
        hilo2.stop();//hilo en estado muerto
        
        try{
        hilo2.sleep(1000);// decimos ue el segundo hilo se va dormir en un segundo para poder continuar ejecutar otro hilo
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 2 " + e);
        }
    }
}