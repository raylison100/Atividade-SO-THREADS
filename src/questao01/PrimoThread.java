package questao01;

public class PrimoThread extends Thread{	
	
	
	private boolean ePrimo;
	private long avaliado;
	private long inicio;
	private long fim;
	private long time;

	public PrimoThread(long avaliado, long inicio,long fim) {

		this.setePrimo(false);
		this.setAvaliado(avaliado);
		this.setInicio(inicio);
		this.setFim(fim);
	} 

	public boolean validaPrimo() {
		
		long start = System.currentTimeMillis();

		for (long i = inicio; i < this.fim; i++) {
			if ((avaliado % i) == 0)
				return false;
		}
		
		this.setTime(System.currentTimeMillis() - start);
		
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

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getInicio() {
		return inicio;
	}

	public void setInicio(long inicio) {
		this.inicio = inicio;
	}

	public long getFim() {
		return fim;
	}

	public void setFim(long fim) {
		this.fim = fim;
	}
}
