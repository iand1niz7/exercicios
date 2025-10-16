package SimuladoLP2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Eventos {
	private String titulo;
	private String descricao;
	private String data;
	private int maxParticipantes;
	private List<String> participantes = new ArrayList<>();
	public Eventos(String titulo, String descricao, String data, int maxParticipantes) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		this.maxParticipantes = maxParticipantes;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getData() {
		return data;
	}
	public int getMaxParticipantes() {
		return maxParticipantes;
	}
	
	public List<String> getParticipantes() {
		return participantes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, descricao, maxParticipantes, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eventos other = (Eventos) obj;
		return Objects.equals(data, other.data) && Objects.equals(descricao, other.descricao)
				&& maxParticipantes == other.maxParticipantes && Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Eventos [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + ", maxParticipantes="
				+ maxParticipantes + "]";
	}

}
