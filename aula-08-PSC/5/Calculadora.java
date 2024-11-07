import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField display; // Mostrador de entrada e resultado
    private StringBuilder currentInput; // Entrada atual do usuário
    private int num1, num2; // Armazenamento dos números para operação
    private char operador; // Armazenamento do operador (+, -, *, /)

    public Calculadora() {
        // Configuração da janela principal
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        currentInput = new StringBuilder();

        // Layout
        setLayout(new BorderLayout());

        // Display (campo de texto para exibir números e resultados)
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Painel de botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); // Layout de 4x4 (4 linhas e 4 colunas)
        add(panel, BorderLayout.CENTER);

        // Botões de 0-9
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Adiciona os botões ao painel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
    }

    // Classe interna para lidar com os eventos de clique nos botões
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("C")) {
                // Limpar a entrada
                currentInput.setLength(0);
                display.setText("");
                num1 = num2 = 0;
                operador = ' ';
            } else if (buttonText.equals("=")) {
                // Realizar a operação e exibir o resultado
                num2 = Integer.parseInt(currentInput.toString());
                switch (operador) {
                    case '+':
                        num1 += num2;
                        break;
                    case '-':
                        num1 -= num2;
                        break;
                    case '*':
                        num1 *= num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            num1 /= num2;
                        } else {
                            display.setText("Erro");
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(num1));
                currentInput.setLength(0); // Limpa a entrada após calcular
            } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                // Definir o operador e armazenar o número atual
                if (currentInput.length() > 0) {
                    num1 = Integer.parseInt(currentInput.toString());
                    operador = buttonText.charAt(0);
                    currentInput.setLength(0); // Limpa a entrada para o próximo número
                }
            } else {
                // Atualizar a entrada atual
                currentInput.append(buttonText);
                display.setText(currentInput.toString());
            }
        }
    }

    public static void main(String[] args) {
        // Criação da instância da calculadora e exibição da interface
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}
