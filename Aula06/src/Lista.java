public class Lista {
    public static void main(String[] args) {
        ListaEncadeada<String> lista= new ListaEncadeada<>();

        System.out.println("Tamanho da lista = "+lista.getTamanho());

        lista.adiciona("Claudio");
        lista.adiciona("Julio");
        lista.adiciona("Marcos");
        lista.adiciona("Lucas");

        System.out.println(lista);
        System.out.println("Tamnho da lista = "+lista.getTamanho());
        System.out.println("Inicio da lista = "+lista.getInicio().getElemento());
        System.out.println("Fim da lista = "+lista.getFim().getElemento());

        lista.remover("Claudio");

        System.out.println(lista);
        System.out.println("Tamnho da lista = "+lista.getTamanho());
        System.out.println("Inicio da lista = "+lista.getInicio().getElemento());
        System.out.println("Fim da lista = "+lista.getFim().getElemento());

    }
}
