public class Escolha {
	public String texto;
	public  Capitulo proximo;
	
	public Escolha(String texto, Capitulo proximo) {
		this.texto = texto;
		this.proximo = proximo; 
	}
    public String getTexto() {
        return this.texto;
    }
    public Capitulo getProximo() {
        return this.proximo;
    }
}