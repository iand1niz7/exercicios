package SimuladoLP2;

import java.util.Objects;

public class Usuarios {
	private String nome;
	private String email;
	private int qtdEventos;
	private int qtdPontos;
	
	public Usuarios(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Usuarios(String nome, String email, int qtdEventos, int qtdPontos) {
		super();
		this.nome = nome;
		this.email = email;
		this.qtdEventos = 0;
		this.qtdPontos = 0;
	}

	public int getQtdEventos() {
		return qtdEventos;
	}

	public int getQtdPontos() {
		return qtdPontos;
	}
	public void addPontuacao(int valor) {
		this.qtdPontos += valor;
	}
	public void addEventos() {
		this.qtdEventos++;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nome, qtdEventos, qtdPontos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome) && qtdEventos == other.qtdEventos
				&& qtdPontos == other.qtdPontos;
	}

	@Override
	public String toString() {
		return "Estudante: "+ nome + "\n" 
				+ "Email: " + email + "\n" 
				+ "Eventos: " + qtdEventos + "\n"
				+ "Pontuação: " + qtdPontos;
	}

}
