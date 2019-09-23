package questao01;


public class PrimoBruto {
	
	private boolean ePrimo;
	private long avaliado;
	

	public PrimoBruto(long avaliado) {

		this.setePrimo(false);
		this.setAvaliado(avaliado);
	}
	
	public void run(){
		this.validaPrimo();
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

	public long getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(long avaliado) {
		this.avaliado = avaliado;
	}
	
}
