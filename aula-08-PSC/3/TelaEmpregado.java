import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEmpregado extends JFrame {
    private JComboBox<String> comboTipoEmpregado;
    private JTextField txtNome, txtSalario, txtVendas, txtComissao, txtHoras, txtTarefas;
    private JLabel labelPagamento;
    private JButton btnCalcularPagamento;

    public TelaEmpregado() {
        setTitle("Cadastro de Empregados");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 2));

        // Componentes da tela
        add(new JLabel("Nome do Empregado:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("Tipo de Empregado:"));
        comboTipoEmpregado = new JComboBox<>(new String[]{"Mensalista", "Comissionado", "Horista", "Tarefeiro"});
        add(comboTipoEmpregado);

        // Campos dependentes do tipo de empregado
        add(new JLabel("Salário (Mensalista):"));
        txtSalario = new JTextField();
        txtSalario.setEnabled(false); // Desabilitado por padrão
        add(txtSalario);

        add(new JLabel("Vendas (Comissionado):"));
        txtVendas = new JTextField();
        txtVendas.setEnabled(false);
        add(txtVendas);

        add(new JLabel("Comissão (%) (Comissionado):"));
        txtComissao = new JTextField();
        txtComissao.setEnabled(false);
        add(txtComissao);

        add(new JLabel("Horas Trabalhadas (Horista):"));
        txtHoras = new JTextField();
        txtHoras.setEnabled(false);
        add(txtHoras);

        add(new JLabel("Tarefas Concluídas (Tarefeiro):"));
        txtTarefas = new JTextField();
        txtTarefas.setEnabled(false);
        add(txtTarefas);

        btnCalcularPagamento = new JButton("Calcular Pagamento");
        add(btnCalcularPagamento);

        labelPagamento = new JLabel("Pagamento: R$ 0.00");
        add(labelPagamento);

        // Ação do botão "Calcular Pagamento"
        btnCalcularPagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                double pagamento = 0.0;

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome do empregado.");
                    return;
                }

                switch ((String) comboTipoEmpregado.getSelectedItem()) {
                    case "Mensalista":
                        try {
                            double salario = Double.parseDouble(txtSalario.getText());
                            Mensalista mensalista = new Mensalista(nome, salario);
                            pagamento = mensalista.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o salário.");
                        }
                        break;

                    case "Comissionado":
                        try {
                            double vendas = Double.parseDouble(txtVendas.getText());
                            double comissao = Double.parseDouble(txtComissao.getText()) / 100;
                            Comissionado comissionado = new Comissionado(nome, vendas, comissao);
                            pagamento = comissionado.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para vendas e comissão.");
                        }
                        break;

                    case "Horista":
                        try {
                            double valorHora = Double.parseDouble(txtSalario.getText()); // Usando campo Salário para o valor da hora
                            int horas = Integer.parseInt(txtHoras.getText());
                            Horista horista = new Horista(nome, valorHora, horas);
                            pagamento = horista.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para hora e horas trabalhadas.");
                        }
                        break;

                    case "Tarefeiro":
                        try {
                            double valorTarefa = Double.parseDouble(txtSalario.getText()); // Usando campo Salário para o valor por tarefa
                            int tarefas = Integer.parseInt(txtTarefas.getText());
                            Tarefeiro tarefeiro = new Tarefeiro(nome, valorTarefa, tarefas);
                            pagamento = tarefeiro.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para valor por tarefa e número de tarefas.");
                        }
                        break;
                }

                labelPagamento.setText("Pagamento: R$ " + String.format("%.2f", pagamento));
            }
        });

        // Alterar campos conforme o tipo de empregado selecionado
        comboTipoEmpregado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) comboTipoEmpregado.getSelectedItem();

                // Habilitar/desabilitar os campos de acordo com o tipo
                txtSalario.setEnabled(tipo.equals("Mensalista") || tipo.equals("Horista") || tipo.equals("Tarefeiro"));
                txtVendas.setEnabled(tipo.equals("Comissionado"));
                txtComissao.setEnabled(tipo.equals("Comissionado"));
                txtHoras.setEnabled(tipo.equals("Horista"));
                txtTarefas.setEnabled(tipo.equals("Tarefeiro"));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaEmpregado().setVisible(true);
            }
        });
    }
}
``
