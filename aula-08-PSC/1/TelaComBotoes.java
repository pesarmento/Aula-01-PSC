import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaComBotoes {
    public static void main(String[] args) {
        // Criando a janela (frame)
        JFrame frame = new JFrame("Exemplo de Tela");
        frame.setSize(300, 200); // Tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar o programa ao fechar a janela
        frame.setLayout(new FlowLayout()); // Layout mais simples (fluxo)

        // Criando o rótulo (label) para o campo de texto
        JLabel labelTexto = new JLabel("Texto:");
        frame.add(labelTexto);

        // Criando o campo de texto
        JTextField campoTexto = new JTextField(20); // 20 caracteres de largura
        frame.add(campoTexto);

        // Criando o botão "Mostrar"
        JButton botaoMostrar = new JButton("Mostrar");
        frame.add(botaoMostrar);

        // Criando o botão "Limpar"
        JButton botaoLimpar = new JButton("Limpar");
        frame.add(botaoLimpar);

        // Criando o botão "Sair"
        JButton botaoSair = new JButton("Sair");
        frame.add(botaoSair);

        // Ação do botão "Mostrar"
        botaoMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o texto do campo e mostra em um JOptionPane
                String texto = campoTexto.getText();
                JOptionPane.showMessageDialog(frame, texto);
            }
        });

        // Ação do botão "Limpar"
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa o conteúdo do campo de texto
                campoTexto.setText("");
            }
        });

        // Ação do botão "Sair"
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Encerra o programa
                System.exit(0);
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
