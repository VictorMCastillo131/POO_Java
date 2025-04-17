import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Horario extends JFrame {
    private JPanel pa;
    private HorarioInterfaz horarioInterfaz;

    public Horario() {
        setSize(1000, 1000);
        setTitle("¡Bienvenido! Este es tu Horario.");
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        horarioInterfaz = new HorarioInterfaz();
        add(horarioInterfaz, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton guardarButton = new JButton("Guardar");
        JButton borrarButton = new JButton("Borrar");
        JButton salirButton = new JButton("Salir");

        // Cambiar el tipo de letra para los botones
        Font buttonFont = new Font("Britannic Bold", Font.BOLD, 16);
        guardarButton.setFont(buttonFont);
        borrarButton.setFont(buttonFont);
        salirButton.setFont(buttonFont);

        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                horarioInterfaz.guardar();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                horarioInterfaz.borrar();
            }
        });

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.add(guardarButton);
        buttonPanel.add(borrarButton);
        buttonPanel.add(salirButton);

        add(buttonPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        Horario horario = new Horario();
        horario.mostrarVentana();
    }

    public void mostrarVentana() {
        setVisible(true);
    }
}

class HorarioInterfaz extends JPanel {
    private JTextField[][] camposTexto;
    private String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    private String[] horas = {"8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00"};
    private String[][] datosguardados; 

    public HorarioInterfaz() {
        setLayout(new GridLayout(7, 8)); 
        add(new JPanel());
        for (String dia : diasSemana) {
            JLabel label = new JLabel(dia, SwingConstants.CENTER);
            add(label);
        }
        camposTexto = new JTextField[6][7];
        datosguardados = new String[6][7]; 
        for (int horaIndex = 0; horaIndex < horas.length; horaIndex++) {
            JLabel horaLabel = new JLabel(horas[horaIndex], SwingConstants.LEFT);
            add(horaLabel);
            // Añadir campos de texto para cada hora y día
            for (int diaIndex = 0; diaIndex < diasSemana.length; diaIndex++) {
                camposTexto[horaIndex][diaIndex] = new JTextField();
                camposTexto[horaIndex][diaIndex].setFont(new Font("Britannic Bold", Font.PLAIN, 14)); // Cambiar el tipo de letra para el texto
                add(camposTexto[horaIndex][diaIndex]);
            }
        }
    }

    public void guardar() {
        for (int horaIndex = 0; horaIndex < horas.length; horaIndex++) {
            for (int diaIndex = 0; diaIndex < diasSemana.length; diaIndex++) {
                datosguardados[horaIndex][diaIndex] = camposTexto[horaIndex][diaIndex].getText();
            }
        }
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
    }

    public void borrar() {
        for (int horaIndex = 0; horaIndex < horas.length; horaIndex++) {
            for (int diaIndex = 0; diaIndex < diasSemana.length; diaIndex++) {
                camposTexto[horaIndex][diaIndex].setText("");
                datosguardados[horaIndex][diaIndex] = null;
            }
        }
    }
}
