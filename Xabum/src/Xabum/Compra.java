package Xabum;

import java.util.Objects;

public class Compra {
	private int codigoCompra;
	private String cpfUsuario;
	private double valorTotal;
	private double valorFrete;
	
	public Compra(int codigoCompra, String cpfUsuario, double valorTotal, double valorFrete) {
		super();
		this.codigoCompra = codigoCompra;
		this.cpfUsuario = cpfUsuario;
		this.valorTotal = valorTotal;
		this.valorFrete = valorFrete;
	}
	public int getCodigoCompra() {
		return codigoCompra;
	}
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoCompra, cpfUsuario, valorFrete, valorTotal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return codigoCompra == other.codigoCompra && Objects.equals(cpfUsuario, other.cpfUsuario)
				&& Double.doubleToLongBits(valorFrete) == Double.doubleToLongBits(other.valorFrete)
				&& Double.doubleToLongBits(valorTotal) == Double.doubleToLongBits(other.valorTotal);
	}
	@Override
	public String toString() {
		return null;
	}
	
}
