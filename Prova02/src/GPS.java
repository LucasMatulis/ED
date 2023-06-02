import java.util.ArrayList;

public class GPS<T>{

    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;

    private double distancia;

    public GPS(){
        this.vertices=new ArrayList<Vertice<T>>();
        this.arestas=new ArrayList<Aresta<T>>();
    }

    public double getDistancia(){
        return distancia;
    }

    public void adicionarVertice(T dado){
        Vertice<T> novoVertice= new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim){
        Vertice<T> inicio= this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);
        Aresta<T> aresta= new Aresta<T>(peso,inicio,fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    public Vertice<T> getVertice(T dado){
        Vertice<T> vertice=null;
        for (int i=0;i<this.vertices.size();i++){
                if(this.vertices.get(i).getDado().equals(dado)){
                    vertice=this.vertices.get(i);
                    break;
                }
        }
        return vertice;
    }

    public ArrayList<T> encontrarCaminho(T partida, T chegada) {
        Vertice<T> verticePartida = getVertice(partida);
        Vertice<T> verticeChegada = getVertice(chegada);

        ArrayList<T> caminho = new ArrayList<>();
        distancia = 0;

        if (verticePartida == null || verticeChegada == null) {
            System.out.println("Nenhuma rota encontrada");
            return caminho; // Retorna lista vazia se os vértices de partida ou chegada não forem encontrados
        }

        // Utilizando o algoritmo de busca em profundidade (DFS) para encontrar o caminho
        dfs(verticePartida, verticeChegada, caminho);
        if(caminho.size()==0){
            System.out.println("Nenhuma rota encontrada");
        }
        else
            System.out.println("Distancia total: "+getDistancia()+"m");

        return caminho;
    }

    private boolean dfs(Vertice<T> atual, Vertice<T> chegada, ArrayList<T> caminho) {
        caminho.add(atual.getDado());

        if (atual == chegada) {
            return true;
        }

        for (Aresta<T> aresta : atual.getArestasSaida()) {
            Vertice<T> proximoVertice = aresta.getFim();
            if (!caminho.contains(proximoVertice.getDado()) && dfs(proximoVertice, chegada, caminho)) {
                distancia += aresta.getPeso();
                return true;
            }
        }
        caminho.remove(atual.getDado());
        return false;
    }

}
