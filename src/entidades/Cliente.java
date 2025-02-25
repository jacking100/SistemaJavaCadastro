package entidades;

import java.util.Date;
import java.util.UUID;

public class Cliente {
	
	private UUID id;
	private String nome;
	private String email;
	private String telefone;
	private Date dataHoracadastro;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataHoracadastro() {
		return dataHoracadastro;
	}
	public void setDataHoracadastro(Date dataHoracadastro) {
		this.dataHoracadastro = dataHoracadastro;
	}
	

}
