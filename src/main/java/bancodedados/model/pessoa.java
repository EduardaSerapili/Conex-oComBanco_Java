package bancodedados.model;

public class pessoa {
	
	private String nome;
	private int id;
	
	public pessoa (String z) {
		this.nome = z;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
