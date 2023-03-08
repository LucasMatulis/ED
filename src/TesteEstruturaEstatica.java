import java.util.Stack;

public class TesteEstruturaEstatica {

    public static void main(String[] args) {
        Pilha<Integer> pilha= new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);
        System.out.println("Desempilhar elemento "+pilha.desempilha());
        System.out.println(pilha);


    }
}
