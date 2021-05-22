/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Importacion de las librerias para poder utilizar el boton,la ventana,color,para agregar cuadro de texto,y texto.
import java.awt.Color; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class D_Gui_ventana extends JFrame  {// se crea una clase se agrega el extends para que el Jframe herede de la clase principal 
    public D_Gui_ventana() { // Metodo constructor

        this.setTitle("ventanayGM"); // para crear el tiitulo de la ventana
        this.setBounds(300, 200, 400, 400); // para asignar el tamaño de la ventana
        
        JLabel e1 = new JLabel(); // para poder agregar las el texto que se desea
        e1.setText("Anota un nombre:"); // se agrega un texto
        e1.setBounds(5,25,150,240); //para definir el rectángulo delimitador de un componente.
        this.add(e1); // para agregar el elemento creado a la ventana
        e1.setForeground(Color.blue); // para agregar el color del texto
        
        JTextField e4 =new JTextField();//permite al operador del programa ingresar una cadena de caracteres por teclado. 
        e4.setText("");// se agrega el texto
        e4.setBounds(120,135,230,25);// para definir el rectángulo delimitador de un componente. Esto incluye su posición y tamaño. 
        this.add(e4);// para agregar el objeto en el JFrame
        
        JLabel e2 = new JLabel();
        e2.setText("Anota una contraseña:");
        e2.setBounds(60,30,140,220);
        e2.setForeground(Color.blue);
        this.add(e2);
        
        JTextField e3=new JTextField();
        e3.setText("");
        e3.setBounds(135,165,230,25);
        this.add(e3);
        
        JButton b=new JButton(); // se instancia para poder crear un botón 
        b.setText("Ingresar"); // para ingresar un texto el el botoon 
        b.setBounds(150,280,85,40); // se agrega el tamaño del botón.
        b.setForeground(Color.red);
           this.add(b); //para agregar el objeto en el JFrame
        
        
        // agregar un boton
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para terminar el código
        this.add(e2);
        

    }
    
        
    public static void main(String[] args) {
        D_Gui_ventana v1=new D_Gui_ventana(); // instanciacion 
        v1.setVisible(true);
        
        
        
    
}
    }
    

