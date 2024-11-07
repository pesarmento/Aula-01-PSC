import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPessoaFisica extends JFrame {
    private JComboBox<String> comboTipoPessoa;
    private JComboBox<String> comboTipoEmpregado;
    private JTextField txtNome, txtCpf, txtSalario, txtVendas, txtComissao, txtHoras, txtTarefas;
    private JLabel labelPagamento;
    private JButton btnCalcularPagamento;

    public TelaPessoaFisica() {
        setTitle("Cadastro de Pessoa Física");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 2));

        // Componentes da tela
        add(new JLabel("Nome:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        add(txtCpf);

        add(new JLabel("Tipo de Pessoa:"));
        comboTipoPessoa = new JComboBox<>(new String[]{"Desempregado", "Empregado"});
        add(comboTipoPessoa);

        // Campos dependentes do tipo de pessoa
        add(new JLabel("Tipo de Empregado:"));
        comboTipoEmpregado = new JComboBox<>(new String[]{"Mensalista", "Comissionado", "Horista", "Tarefeiro"});
        comboTipoEmpregado.setEnabled(false); // Desabilitado por padrão
        add(comboTipoEmpregado);

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
                String cpf = txtCpf.getText();
                double pagamento = 0.0;

                if (nome.isEmpty() || cpf.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome e o CPF.");
                    return;
                }

                if (comboTipoPessoa.getSelectedItem().equals("Desempregado")) {
                    Desempregado desempregado = new Desempregado(nome, cpf);
                    labelPagamento.setText("Status: " + desempregado.status());
                } else {
                    // Empregado selecionado
                    if (comboTipoEmpregado.getSelectedItem().equals("Mensalista")) {
                        try {
                            double salario = Double.parseDouble(txtSalario.getText());
                            Mensalista mensalista = new Mensalista(nome, cpf, salario);
                            pagamento = mensalista.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o salário.");
                        }
                    } else if (comboTipoEmpregado.getSelectedItem().equals("Comissionado")) {
                        try {
                            double vendas = Double.parseDouble(txtVendas.getText());
                            double comissao = Double.parseDouble(txtComissao.getText()) / 100;
                            Comissionado comissionado = new Comissionado(nome, cpf, vendas, comissao);
                            pagamento = comissionado.calcularPagamento();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos para vendas e comissão.");
                        }
                    } else if (comboTipoEmpregado.getSelectedItem().equals("Horista")) {
                        try {
                            double valorHora = Double.parseDouble(txtSalario.getText()); // Usando campo Salário para
