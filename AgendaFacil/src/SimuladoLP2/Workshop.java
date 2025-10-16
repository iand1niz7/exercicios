package SimuladoLP2;

public class Workshop extends Eventos {
	private int duracao;

	public Workshop(String titulo, String descricao, String data, int maxParticipantes, int duracao) {
		super(titulo, descricao, data, maxParticipantes);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}
	public int calculaPontuacao(int duracao) {
		return duracao += 1;
	}
}
