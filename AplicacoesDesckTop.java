package br.com.javadesktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AplicacoesDesckTop {
	public static void main(String[] args) {
		final String USER = "Bryan";
		final String PASS = "bryangabriel";

		JFrame frame = new JFrame("Acesso");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		JLabel lblUsuario = new JLabel("Usuario: ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe o usuario! ");

		JLabel lblSenha = new JLabel("Senha: ");
		JTextField txtSenha = new JTextField(20);
		txtSenha.setToolTipText("Indorme a senha: ");

		JButton btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(txtUsuario.getText().contentEquals(USER) && new String(txtSenha.getText()).equals(PASS)) {
					JOptionPane.showMessageDialog(frame, "Acesso concedido! ");
				} else {
					JOptionPane.showMessageDialog(frame, "Acesso negado! ");
				}
			}
			
		});

		panel.add(lblUsuario);
		panel.add(txtUsuario);

		panel.add(lblSenha);
		panel.add(txtSenha);

		panel.add(btnLogin);

		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);

	}
}
