package clases;
// CON ESTA CLASE SE VA EJECUTAR DIDTINTOS HILOS 
public class Proceso extends Thread{ // SE HEREDA LA CLASE A LA CLASE PADRE HILO
    
    int num_int; // SE DECLARA UNA VARIBALE DE AMBITO GLOBAL, VA SER LA QUE VA CONTENER EL VALOR QUE ESTAMOS ENVIANDO A TRAVEZ DEL PARAMETRO 
    
    public Proceso(String NombreHilo){ // SE CREA UN METODO CONSTRUCTOR  
        super(NombreHilo);     
    }
    
    @Override // SE AGREGA ESTA PALBRABRA PARA PODER SOBREESCRIBIR EL METODO 
    public void run(){ // SE AGREGA EL METODO RUN 
        for(int i = 0; i <= num_int; i++){ // SE AGREGA UN CICLO FOR REPETITIVA POSTERIORMENTE DIGO QUE I MENOR O IGUAL QUE 5, PUES QUE I SE INCREMENTE DE UNO EN UNO.   
            System.out.println(i + this.getName());// MIENTRAS SE ESTE EJECUTANDO LA CONDICION, DIGO QUE ME IMPRIMA EL VALOR DE LA VARIABLE I
        }
        System.out.println("");// ESTE CODIGO SE AGREGA PARA QUE CADA VEZ QUE SE TERMINE DE EJECUTAR UN CICLO FOR DE UN SALTO DE LINEA 
    }
    
    public void ValorDeLaCondicion(int valor){// ESTE METODO SE CREA PARA QUE RECIBA EL VALOR A TRAVES DE PARAMETRO 
        this.num_int = valor;// DIGO QUE VA RECIBIR UN VALOR ATRAVES DEL PARAMETRO Y SE VA GUARDAR EN LA VARIABLE GLOBAL NUM_INT
    }
    
}
