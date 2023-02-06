package src;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import src.Usuario.Cliente;

public class Etapa01Usuario extends JFrame implements Action {

    Cliente CLT1 = new Cliente("Vitor", "Algo", "1122-3344");

    JButton btnVerProdutos;
    JButton btnListarPorPreco;
    JButton btnListarPorNome;

    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;

    public Etapa01Usuario() {

        btnListarPorPreco = new JButton();
        btnListarPorPreco.setBounds(0, 10, 200, 60);
        btnListarPorPreco.addActionListener(this);
        btnListarPorPreco.setText("Dispor produtos por preco:");
        btnListarPorPreco.setFocusable(false);
        btnListarPorPreco.setFont(new Font("Comic Sans", Font.BOLD, 12));

        btnListarPorNome = new JButton();
        btnListarPorNome.setBounds(200, 10, 200, 60);
        btnListarPorNome.addActionListener(this);
        btnListarPorNome.setText("Dispor produtos por nome");
        btnListarPorNome.setFocusable(false);
        btnListarPorNome.setFont(new Font("Comic Sans", Font.BOLD, 12));


        this.setTitle("Ecommerce - Americanas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setVisible(true);
        this.setLayout(null);

        this.add(painelFundo);
      //  this.add(btnListarPorPreco);
       // this.add(btnListarPorNome);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnListarPorPreco) {
            CLT1.ordenarPorPreco();
        } else if (e.getSource() == btnListarPorNome) {
            CLT1.ordenarPorNome();
        }
    }

    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {
    }

}
