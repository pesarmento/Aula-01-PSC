import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrador extends JFrame {
    private Relogio relogio;
    private JLabel labelHora;
    private JButton btnTicTac;
    private JButton btnHora;
    private JButton btnMinuto;

    public Mostrador() {
        // Criação do relógio inicializado com a hora 0 e minuto 0
        relogio = new Relogio(0, 0);

        // Configuração do JFrame
        setTitle("Relógio");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout do painel
        setLayout(new BorderLayout());

        // Label para mostrar a hora
        labelHora = new JLabel(relogio.mostra(), SwingConstants.CENTER);
        labelHora.setFont(new Font("Serif", Font.PLAIN, 40));
        labelHora.setForeground(Color.BLACK);
        add(labelHora, BorderLayout.CENTER);

        // Painel para os botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        // Botão TicTac (aumenta 1 minuto)
        btnTicTac = new JButton("TicTac");
        btnTicTac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relogio.ticTac();
                labelHora.setText(relogio.mostra());
            }
        });

        // Botão Hora (acerta a hora)
        btnHora = new JButton("Hora");
        btnHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Digite a hora (0-23):");
                try {
                    int hora = Integer.parseInt(input);
                    relogio.setHora(hora);
                    labelHora.setText(relogio.mostra());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
                }
            }
        });

        // Botão Minuto (acerta o minuto)
        btnMinuto = new JButton("Minuto");
        btnMinuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Digite o minuto (0-59):");
                try {
                    int minuto = Integer.parseInt(input);
                    relogio.setMinuto(minuto);
                    labelHora.setText(relogio.mostra());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
                }
            }
        });

        // Adicionando os botões ao painel
        panel.add(btnTicTac);
        panel.add(btnHora);
        panel.add(btnMinuto);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Inicializa a interface gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mostrador().setVisible(true);
            }
        });
    }
}
