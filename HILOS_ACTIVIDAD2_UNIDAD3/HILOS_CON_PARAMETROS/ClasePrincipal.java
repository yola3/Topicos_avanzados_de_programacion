package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo1"); // SE INTANCIA LA CLASE PROCESO
        Proceso hilo2 = new Proceso(" Hilo2");// SE INTANCIA OTRA CLASE PROCESO
        Proceso hilo3 = new Proceso(" Hilo3");
        // PASAR LOS PARAMETROS UTILIZANDO EL METODO CREADO DE LA CLASE PROCESO
        hilo1.ValorDeLaCondicion(5); // ENVIAMOS LOS PARAMETROS CUANTAS VECES QUEREMOS QUE SEA LA ITERACION DEL PROCESO
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(5);
        // PARA PODER ARRANCAR EL HILO.
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
