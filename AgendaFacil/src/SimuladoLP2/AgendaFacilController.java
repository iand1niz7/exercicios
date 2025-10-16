package SimuladoLP2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class AgendaFacilController  {
	private Map<String, Usuarios> estudantes = new HashMap<>();
	private Map<Integer, Eventos> eventos = new HashMap<>();
	private int proximoId = 1;
	
	public AgendaFacilController(Map<String, Usuarios> estudantes, Map<Integer, Eventos> eventos) {
		super();
		this.estudantes = estudantes;
		this.eventos = eventos;
	}
	public boolean cadastrarEstudante(String nome, String email) {
		
		if(nome == null || nome.trim().isEmpty()|| email == null || email.trim().isEmpty()) {
			return false;
		}
		if(estudantes.containsKey(email)) {
			return false;
		}
		estudantes.put(email, new Usuarios(nome, email));
		return true;
	}
	public String exibirEstudantes(String email) {
		if(!estudantes.containsKey(email)) {
			throw new IllegalArgumentException("Esse estudante não existe!");
		}
		return estudantes.get(email).toString();
	}
	
	public String[] listarEstudantes() {
	ArrayList<Usuarios> lista = new ArrayList<>(estudantes.values());
	lista.sort(Comparator.comparingInt(Usuarios::getQtdPontos).reversed());
	
	String[] saida = new String[lista.size()];
	for(int i = 0; i < lista.size(); i++) {
		saida[i] = lista.get(i).toString();
	
	}
	return saida;
	}
	public int cadastrarPalestra(String titulo, String descricao, String data, int maxParticipantes) {
		if(titulo == null || titulo.trim().isEmpty() || descricao == null ||
				descricao.trim().isEmpty() || data == null || data.trim().isEmpty() ||
				maxParticipantes <= 0) {
			throw new IllegalArgumentException("Dados inválidos!");
		}
		Palestra palestra = new Palestra(titulo, descricao, data, maxParticipantes);
		int id = proximoId++;
		eventos.put(id, palestra);
		return id;
	}
	public int cadastrarWorkShop(String titulo, String descricao, String data, int maxParticipantes, int duracao) {
		if(titulo == null || titulo.trim().isEmpty() || descricao == null ||
				descricao.trim().isEmpty() || data == null || data.trim().isEmpty() ||
				maxParticipantes <= 0 || duracao <= 0) {
			throw new IllegalArgumentException("Dados inválidos!");
		}
		Workshop workshop = new Workshop(titulo, descricao, data, maxParticipantes, duracao);
		int idWorkShop = proximoId++;
		eventos.put(idWorkShop, workshop);
		return idWorkShop;
	}
	public int cadastrarOficinaAprendizagem(String titulo, String descricao, String data, int maxParticipantes, int duracao, boolean certificacao) {
		if(titulo == null || titulo.trim().isEmpty() || descricao == null ||
				descricao.trim().isEmpty() || data == null || data.trim().isEmpty() ||
				maxParticipantes <= 0 || duracao <= 0) {
			throw new IllegalArgumentException("Dados inválidos");
		}
		OficinaAprendizagem oficina = new OficinaAprendizagem(titulo, descricao, data, maxParticipantes, duracao, certificacao);
		int idOficina = proximoId++;
		eventos.put(idOficina, oficina);
		return idOficina;
	}
	public boolean inscreverParticipanteEmEvento(String emailParticipante, int idEvento) {
		Eventos evento = eventos.get(idEvento);
		if(evento == null) {
			throw new IllegalArgumentException("Evento não encontrado!");
		}
		if(evento.getParticipantes().contains(emailParticipante)) {
			throw new IllegalArgumentException("Já participa do evento");
		}
		if(evento.getParticipantes().size() >evento.getMaxParticipantes()) {
			throw new IllegalArgumentException("Evento lotado!");
		}
		evento.getParticipantes().add(emailParticipante);
		return true;
		}
	}

