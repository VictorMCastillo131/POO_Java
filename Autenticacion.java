import java.awt.Color;  //coloresss
import java.awt.Font;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Autenticacion extends JFrame implements ActionListener {
    private JPanel p;
    private JLabel t, usuario, contraseña, imagenusu, imagenpass;
    private JTextField nombreUsu;
    private JPasswordField nombreCon;
    private JButton botonAceptar, botonCancelar;
    private ImageIcon ImageIcon;
    private Object Imagen;
    private Object Imagen2;

    public Autenticacion() {
        p = new JPanel();
        setVisible(true);
        setSize(800, 600);
        setTitle("Autenticacion");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        components();
        add(p);
    }

    private void components() {
        titulo();
        espacio();
        botones();
        botonAceptar.addActionListener(this);
        botonCancelar.addActionListener(this);
    }

    private void titulo() {
        t = new JLabel();
        p.setLayout(null);
        t.setBounds(90, 10, 300, 20);
        t.setHorizontalAlignment(SwingConstants.CENTER);
        t.setText("Bienvenido :)) Inicia Sesion");
        t.setForeground(Color.BLACK);
        t.setFont(new Font("Britannic Bold", 0, 20));
        p.add(t);

        usuario = new JLabel();
        usuario.setHorizontalAlignment(SwingConstants.CENTER);
        usuario.setText("Usuario");
        usuario.setBounds(160, 10, 100, 100);
        usuario.setForeground(Color.BLACK);
        usuario.setFont(new Font("Britannic Bold", 0, 20));
        p.add(usuario);

        contraseña = new JLabel();
        contraseña.setHorizontalAlignment(SwingConstants.CENTER);
        contraseña.setText("Contraseña"); //campo de contraseña
        contraseña.setBounds(160, 75, 110, 100);
        contraseña.setForeground(Color.BLACK);
        contraseña.setFont(new Font("Britannic Bold", 0, 20));
        p.add(contraseña);
        
        ImageIcon imagen = new ImageIcon("inicio-de-sesion-de-usuario.png");
        imagenusu = new JLabel();
        imagenusu.setBounds(100, 50, 10, 10);
        imagenusu.setIcon(new  ImageIcon(imagen.getImage().getScaledInstance(imagenusu.getWidth(),imagenusu.getHeight(), Image.SCALE_SMOOTH))); 
        p.add(imagenusu);
        
        ImageIcon imagen2 = new ImageIcon("cuenta.png");
        imagenpass = new JLabel();
        imagenpass.setBounds(150,50, 10 , 10);
        imagenpass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(imagenpass.getWidth(), imagenpass.getHeight(), Image.SCALE_SMOOTH)));
        p.add(imagenpass);
    }

    private void espacio() {
        nombreUsu = new JTextField();
        nombreUsu.setBounds(150, 75, 150, 20);
        p.add(nombreUsu);
        nombreCon = new JPasswordField();
        nombreCon.setBounds(150,150, 150, 20);
        p.add(nombreCon);
    }

    private void botones() {
        botonAceptar = new JButton();
        botonAceptar.setText("Aceptar");
        botonAceptar.setBounds(40, 200, 125, 35);
        botonAceptar.setEnabled(true);
        botonAceptar.setForeground(Color.DARK_GRAY);
        botonAceptar.setFont(new Font("Britannic Bold", 0, 20));
        p.add(botonAceptar);

        botonCancelar = new JButton();
        botonCancelar.setText("Borrar");
        botonCancelar.setBounds(180, 200, 150, 35);
        botonCancelar.setEnabled(true);
        botonCancelar.setForeground(Color.DARK_GRAY);
        botonCancelar.setFont(new Font("Britannic Bold", 0, 20));
        p.add(botonCancelar);
    }

    public static void main(String[] args) {
        Autenticacion obj = new Autenticacion();
    }

    int contador; //contador para error de usuario

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAceptar) {
            String usuario = nombreUsu.getText();
            String contraseña = new String(nombreCon.getPassword());
            if (usuario.equals("vic131") && contraseña.equals("12345")) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
                abrirVentanaHorario();
                dispose(); // Cierra la ventana de autenticación
                
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                nombreUsu.setText("");
                nombreCon.setText("");
                contador++;
                if (contador >= 3) {
                    JOptionPane.showMessageDialog(this, "Ha excedido el número de intentos\nIntentelo mas tarde ://");
                    dispose(); // Cierra la ventana de autenticación
                }
            }
        } else if (e.getSource() == botonCancelar) {
            nombreUsu.setText("");
            nombreCon.setText("");
        }
    }

    private void abrirVentanaHorario() {
        Horario horario = new Horario();
        horario.mostrarVentana();
    }
}
