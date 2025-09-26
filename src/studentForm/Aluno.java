/*
 Nome: Kaik Persike Maiorquino
 Prontuário: CB3029689
 
 Nome: Matheus Penteado
 Prontuário: CB3031501
*/

package studentForm;

import java.util.UUID;

public class Aluno {
	private String endereco;
	private int idade;
	private String nome;
	private UUID uuid;
	
	public String getEndereco() {
		return endereco;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public UUID getUuid() {
		return uuid;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
    Aluno(String nome, int idade, String endereco, UUID uuid)
    {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.uuid = uuid;
    }
}
