package programacionObjetos.examen2018;

public class Carta {
	
	private int id;
	private int valor;
	private String palo;

	public Carta() {
		
	}

	/**
	 * 
	 * @param id
	 * @param valor
	 * @param palo
	 */
	public Carta(int id, int valor, String palo) {
		super();
		this.id = id;
		this.valor = valor;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "carta [id=" + id + ", valor=" + valor + ", palo=" + palo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	

}
