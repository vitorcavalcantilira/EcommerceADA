package src;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import src.Usuario.Usuario;

public class Etapa01 extends JFrame implements Action {

    JButton btnLogin, btnCadastrar;
    JTextField fieldUsuario;
    JPasswordField fieldSenha;

    public Etapa01() {

        JLabel labelTitulo = new JLabel();
        labelTitulo.setBounds(200, 50, 600, 40);
        labelTitulo.setText("Digite usuário e senha");
        labelTitulo.setForeground(Color.black);
        labelTitulo.setFont(new Font("MV Boli", Font.PLAIN, 20));

        fieldUsuario = new JTextField();
        fieldUsuario.setBounds(200, 100, 200, 40);

        fieldSenha = new JPasswordField();
        fieldSenha.setBounds(200, 160, 200, 40);

        btnLogin = new JButton();
        btnLogin.setBounds(200, 210, 200, 40);
        btnLogin.addActionListener(this);
        btnLogin.setText("Login");
        btnLogin.setFocusable(false);
        btnLogin.setFont(new Font("Comic Sans", Font.BOLD, 16));

        btnCadastrar = new JButton();
        btnCadastrar.setBounds(200, 255, 200, 40);
        btnCadastrar.addActionListener(this);
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setFocusable(false);
        btnCadastrar.setFont(new Font("Comic Sans", Font.BOLD, 16));

        this.setTitle("Marketplace - Ada");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setVisible(true);
        this.setLayout(null);

        this.add(labelTitulo);
        this.add(fieldUsuario);
        this.add(fieldSenha);
        this.add(btnLogin);
        this.add(btnCadastrar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String usuario = fieldUsuario.getText();
        String senha = new String(fieldSenha.getPassword());

        if (e.getSource() == btnLogin) {
            int validacaoLogin = Usuario.login(usuario, senha);

            if (validacaoLogin == 1) {
                Etapa01Usuario m1 = new Etapa01Usuario();
                this.dispose();
            } else {
                System.out.println("Usuário não existe.");
                return;
            }
        } else if (e.getSource() == btnCadastrar) {
            Usuario.cadastrarUsuario(usuario, senha);
        }
    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub

    }

}
