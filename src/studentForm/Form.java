/*
 CBTLPR2 - Trabalho Prático 02

 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/

package studentForm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Form extends JPanel implements ActionListener{
	
	private JTextField nomeAluno;
	private JTextField idadeAluno;
	private JTextField enderecoAluno;
	private List<Aluno> alunos;
	
	public Form() {
		alunos = new ArrayList<>();
		// Painel Base
		Frame painel = new Frame("FlowLayout");
		painel.setLayout(new BorderLayout(10,10));
		painel.setSize(400,180);
		painel.addWindowListener(new FechaJanela());
		
		// Painel Superior
		JPanel painelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));
		
		painelSuperior.add(new JLabel("Nome:"));
		nomeAluno = new JTextField();
		painelSuperior.add(nomeAluno);
		painelSuperior.add(new JLabel("Idade:"));
		idadeAluno = new JTextField();
		painelSuperior.add(idadeAluno);
		painelSuperior.add(new JLabel("Endereço:"));
		enderecoAluno = new JTextField();
		painelSuperior.add(enderecoAluno);
		
		// Painel Inferior
		JPanel painelInferior = new JPanel(new GridLayout(1, 4, 10, 10));
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(this);
		JButton mostrar = new JButton("Mostrar");
		mostrar.addActionListener(this);
		JButton sair = new JButton("Sair");
		sair.addActionListener(this);
		
		painelInferior.add(ok);
		painelInferior.add(limpar);
		painelInferior.add(mostrar);
		painelInferior.add(sair);
		
		painel.add(painelSuperior, BorderLayout.CENTER);
		painel.add(painelInferior, BorderLayout.SOUTH);
		
		painel.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command) {
			case "Ok": adicionarAluno();
			break;
			case "Limpar": limparCampos();
			break;
			case "Mostrar": JOptionPane.showMessageDialog(this, mostrarAlunos());
			break;
			case "Sair": System.exit(0);
			break;
		}
	}
	
	public void adicionarAluno() {
		alunos.add(new Aluno(
				nomeAluno.getText(),
				Integer.parseInt(idadeAluno.getText()),
				enderecoAluno.getText(),
				UUID.randomUUID()
		));
		
		limparCampos();
	}
	
	private void limparCampos() {
		nomeAluno.setText("");
		idadeAluno.setText("");
		enderecoAluno.setText("");
	}
	
	public String mostrarAlunos() {
		String resultado = "Resultado:";
		for(Aluno aluno : alunos) {
			resultado += "\n" + aluno.getUuid() + " Nome: " + aluno.getNome();
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		new Form();
	}
}
