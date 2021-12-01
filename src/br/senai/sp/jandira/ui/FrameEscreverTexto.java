package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;

public class FrameEscreverTexto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEscreverTexto frame = new FrameEscreverTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameEscreverTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 515);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArquivo = new JLabel("Arquivo: ");
		lblArquivo.setBounds(75, 26, 66, 27);
		lblArquivo.setForeground(SystemColor.text);
		lblArquivo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArquivo.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblArquivo);
		
		JLabel lblTexto = new JLabel("Texto:");
		lblTexto.setBounds(75, 82, 66, 27);
		lblTexto.setForeground(SystemColor.text);
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblTexto);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(73, 158, 551, 215);
		contentPane.add(textPane);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(75, 398, 130, 53);
		btnGravar.setForeground(new Color(0, 0, 0));
		btnGravar.setBackground(Color.RED);
		btnGravar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnGravar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(244, 398, 130, 53);
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(btnLimpar);
	}
}
