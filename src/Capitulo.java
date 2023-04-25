import java.util.Scanner; 
import java.util.ArrayList;

public class Capitulo{
    private String texto;
    public ArrayList<Escolha> escolhas;    
    private Personagem perso;
    private int alterarEnergia;
    private Scanner escaneador;

    public Capitulo(String nome,
            String texto,
            Personagem perso,
            int alterarEnergia,
            Scanner escaneador)  {
        this.texto = texto;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<Escolha>();
        }
    public void mostrar(){
        System.out.println(this.texto);
        this.perso.alterarEnergia(this.alterarEnergia);
        System.out.println();
        if (this.escolhas.size() > 0) {
            for(Escolha escolha : escolhas){
                System.out.println(escolha.texto);
            }
			int idEscolha = escolher();
			this.escolhas.get(idEscolha).proximo.mostrar();
        }
    }
    private int escolher(){
        int idescolha = -1;
        String receba = escaneador.nextLine();
        for (int i = 0; i < escolhas.size(); i++) {
            if(receba.equals(escolhas.get(i).getTexto())){
                idescolha = i;
            }
        }
        return idescolha;
    }
    public void adicionarEscolha(Escolha escolha) {
        this.escolhas.add(escolha);
    }
}