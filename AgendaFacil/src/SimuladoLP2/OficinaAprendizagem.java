package SimuladoLP2;

public class OficinaAprendizagem extends Eventos {
	private boolean certificado;
	private int duracao;

	public OficinaAprendizagem(String titulo, String descricao, String data, int maxParticipantes, int duracao,
			boolean certificado) {
		super(titulo, descricao, data, maxParticipantes);
		this.certificado = certificado;
	}
	
	public void calcularPontuacao(int valor) {
		if(!certificado == true) {
			valor = duracao;
		}
		valor = duracao + 10;
		certificado = true;
	}
}