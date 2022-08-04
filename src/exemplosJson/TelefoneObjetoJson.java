package exemplosJson;

import com.google.gson.Gson;

public class TelefoneObjetoJson {
	
	private String marca;    
    private String nome;    
    private int memoria;  
    
    //Setter and Getters  
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
    public static void main(String args[]) {
    	TelefoneObjetoJson telefone = new TelefoneObjetoJson(); 
    	telefone.setMarca("samsung");
    	telefone.setNome("galaxy");
    	telefone.setMemoria(3);
    	System.out.println("JSON representando o objeto TelefoneMain");    
    	System.out.println(new Gson().toJson(telefone));    	
    }

}  


