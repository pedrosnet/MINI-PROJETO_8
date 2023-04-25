import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in);
        LeitorCarregador leitor = new LeitorCarregador();
        HashMap<String, Personagem> personagens = leitor.lerPersonagens("Texto/Personagens.txt");
        HashMap<String, Capitulo> capitulos = leitor.lerCapitulos("Texto/Capitulos.txt", personagens, escaneador);
        Capitulo raiz = capitulos.get("CAPITULO 1");
        raiz.mostrar();
        escaneador.close();
    }
}