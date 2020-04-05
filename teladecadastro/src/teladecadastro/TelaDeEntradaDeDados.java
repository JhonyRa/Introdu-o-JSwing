package teladecadastro;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import teladecadastro.model.Pessoa;

public class TelaDeEntradaDeDados extends JPanel {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public TelaDeEntradaDeDados() {
		
		//GridLayout simula uma tabela
		//Tabela com 2 colunas
		this.setLayout(new GridLayout(0,2));
		
		JLabel nome = new JLabel("Nome");
		this.add(nome);
		
		JTextField nomeField = new JTextField();
		this.add(nomeField);
		
		JLabel endereco = new JLabel("Endereço");
		this.add(endereco);
		
		JTextField enderecoField = new JTextField();
		this.add(enderecoField);
		
		JLabel numero = new JLabel("Número");
		this.add(numero);
		
		JTextField numeroField = new JTextField();
		this.add(numeroField);
		
		JLabel telefone = new JLabel("Telefone");
		this.add(telefone);
		
		JTextField telefoneField = new JTextField();
		this.add(telefoneField);
		
		JButton btnAdicionar = new JButton("Adicionar");
		this.add(btnAdicionar);
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Pega o que digitamos no campo do nome
				String nome = nomeField.getText();
				
				//Pega o que digitamos no campo do nome endereco
				String endereco = enderecoField.getText();
				
				//Pega o que digitamos no campo do nome numero
				String numero = numeroField.getText();
				
				//Pega o que digitamos no campo do nome telefone
				String telefone = telefoneField.getText();
				
				Pessoa pessoa = new Pessoa(nome, endereco, numero, telefone);
				
				pessoas.add(pessoa);
				
				System.out.println("Pessoas cadastradas "+pessoas.size());
				
				nomeField.setText("");
				enderecoField.setText("");
				numeroField.setText("");
				telefoneField.setText("");
			}
			
		});
		
		JButton btnMostrarTodos = new JButton("Mostrar Todos");
		this.add(btnMostrarTodos);
		btnMostrarTodos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i=0; i < pessoas.size(); i++){
					System.out.println(pessoas.get(i));
				}
				
				Object[] titulos = {"Nome","Endereço", "Número", "Telefone" };
				
				Object[][] linhas = new Object[pessoas.size()][4];
				
				for (int i=0; i < pessoas.size(); i++){
					Object[] linha = new Object[] {pessoas.get(i).getNome(), pessoas.get(i).getEndereco(), pessoas.get(i).getNumero(), pessoas.get(i).getTelefone()};
					linhas[i] = linha;
				}
				
				JTable table = new JTable(linhas, titulos);
					
				JOptionPane.showMessageDialog(null, new JScrollPane(table));
				
			}	
			
		});
	
	}

}
