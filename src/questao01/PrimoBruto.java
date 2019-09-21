package questao01;

public class PrimoBruto {

	private boolean ePrimo;
	private int avaliado;

	public PrimoBruto(int avaliado) {

		this.setePrimo(false);
		this.setAvaliado(avaliado);
	}

	public boolean validaPrimo() {

		for (int i = 2; i < this.avaliado; i++) {
			if ((avaliado % i) == 0)
				return false;
		}

		return true;
	}

	public boolean isePrimo() {
		return ePrimo;
	}

	public void setePrimo(boolean ePrimo) {
		this.ePrimo = ePrimo;
	}

	public int getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(int avaliado) {
		this.avaliado = avaliado;
	}

}
