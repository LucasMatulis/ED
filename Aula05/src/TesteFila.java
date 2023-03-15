public class TesteFila {
    public static void main(String[] args) {
        Fila<Integer> fila=new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println("A fila esta vazia? "+fila.estaVazia());
        System.out.println("Tamanho da fila: "+fila.tamanho());
        System.out.println(fila.toString());

        if(fila.espiar()==null)
            System.out.println("Ninguem na fila");
        else
            System.out.println("O elemento na primeira posicao é: "+fila.espiar());

        System.out.println(fila.desenfileira());

        System.out.println(fila.toString());

    }
}
