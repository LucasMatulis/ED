public class Teste {
    public static void main(String[] args) throws Exception{
        Vetor vetor= new Vetor(5);

        try{
            vetor.adiciona("Flamengo");
            vetor.adiciona("Corinthians");
            vetor.adiciona("São paulo");
            vetor.adiciona("Palmeiras");
            vetor.adiciona("Vasco");
            vetor.adiciona("Inter");
            vetor.adiciona("Gremio");
        }
        catch (Exception e){
            e.printStackTrace();

        }

        vetor.adicionaInicio(0,"Lucas");
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        vetor.remove(0);
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

    }
}
