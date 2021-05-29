/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// librerias para utilizar en el programa
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Manejo_de_Eventos extends JFrame { // se hereda la clase a la subclase
// declaracion de los componentes
    private JPanel mi_panel;
    private JLabel captar_nombre;
    private JTextField nombre, apellidos;
    private JButton btn_aceptar;

    public Manejo_de_Eventos() {// metodo para el evento

        setBounds(50, 50, 500, 500);// localizacion y tamaño del panel 
        iniciar_componentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // establece la operación de cierre predeterminada 

    }

    public void iniciar_componentes() { // metodo de componentes

        panel(); // se utilizara para crear el panel 
        Etiquetas(); // se utiliza para las etiquetas
        Etiquetas1();
        cajas_de_texto();
        cajas_de_texto1();
        botones();
    }

    private void panel() { // metodo de panel 
        mi_panel = new JPanel();// instanciacion
        mi_panel.setLayout(null);// todo lo que se dibuja se va ir comodando (organizar)
        this.add(mi_panel);

    }

    private void Etiquetas() { // metodo de etiquetas 
        captar_nombre = new JLabel("Ingrese un nombre:"); //El JLabel permitirá dibujar en el formulario una etiqueta.

        captar_nombre.setBounds(30, 10, 200, 30); // nos permitira cambiar las propiedades de la etiqueta
        mi_panel.add(captar_nombre); // agrega la etiqueta al panel 
    }

    private void Etiquetas1() { // metodo para otra etiqueta
        captar_nombre = new JLabel("Ingrese el apellido:"); // instanciacion 

        captar_nombre.setBounds(30, 80, 290, 30);
        mi_panel.add(captar_nombre);
    }

    private void cajas_de_texto() { // metodo para la caja de texto
        nombre = new JTextField(); // se instancia
        nombre.setBounds(30, 50, 300, 30); // mueve y cambia el tamaño de la caja de texto
        //evento_teclado();// captura que es lo que esta haciento el panel
        mi_panel.add(nombre); // agrega nuevo componente al panel
    }

    private void cajas_de_texto1() { // se crea otro metodo para la caja de texto 
        apellidos = new JTextField(); // se instancia
        apellidos.setBounds(30, 110, 300, 30);// mueve y cambia el tamaño de la caja de texto
        //evento_teclado();// captura que es lo que esta haciento el panel
        mi_panel.add(apellidos);
    }

    private void botones() { // metodo para poder agregar boton 
        btn_aceptar = new JButton("ACEPTAR");
        btn_aceptar.setBounds(150, 200, 150, 40);
        btn_aceptar.setFont(new Font("arial", 0, 15));// establece el tipo de fuentes que va manejar
        evento_boton();
        mi_panel.add(btn_aceptar);// se agrega al panel el boton aceptar

    }

    public void evento_boton() { // metodo para capturar boton
        ActionListener captar_evento = new ActionListener() {// Instanciacion 

            @Override // sobreescribe el metodo
            public void actionPerformed(ActionEvent e) { // metodo para la accion realiza en el metodo evento
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, nombre.getText() + ("  ") + apellidos.getText(),
                        "DATOS CAPTURADOS DE:",
                        JOptionPane.INFORMATION_MESSAGE);// se envia un mensaje calq
                nombre.setText(""); // para limpiar la caja de texto
            }
        };
        btn_aceptar.addActionListener(captar_evento);//  se asocia el envento
    }

    public void evento_teclado() { // metodo para captar los componentes del evento agregado desde el teclado
        KeyListener eventos_teclado = new KeyListener() { // instanciacion 

            @Override
            public void keyTyped(KeyEvent e) { // se sobreescribe el metodo
                // TODO Auto-generated method stub

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyPressed(KeyEvent e) { // metodo para mostrar la accion realizada en el panel
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, null, "USTED A PRESIONADO UNA TECLA:",
                        JOptionPane.WARNING_MESSAGE);
            }
        };
        nombre.addKeyListener(eventos_teclado);// agrega las acciones realizadas en el panel 

    }

    /**
     *
     * @param args
     */
    public static void main (String[] args) { // clase main
        Manejo_de_Eventos obj = new Manejo_de_Eventos(); // instanciacion 
        obj.setVisible(true); // decimos que queremos el panel visible

    }
}
