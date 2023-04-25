public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }
    public String alterarEnergia(int alteracao) {
        String resultado = "";
        this.energia = this.energia + alteracao;
        if (alteracao > 0) {
            resultado = "Após a ação anterior, o " + this.nome + " recuperou " + alteracao + " pontos de energia!";
        }
        else if (alteracao < 0) {
            resultado = "Após a ação anterior, o " + this.nome + " perdeu " + alteracao + " pontos de energia!";
        }
        if (this.energia > 100) {
            this.energia = 100;
        }
        else if (this.energia <= 0) {
            this.energia = 0;
            resultado = "O " + this.nome + " foi derrotado!";
        }
        return resultado;
    }
}