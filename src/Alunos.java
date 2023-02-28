public class Alunos {
    private String alunos[];
    private int tamanho;

    public Alunos(int capacidade){
        this.alunos=new String[capacidade];
        this.tamanho=0;


    }

    public void adiciona (String elemento) throws Exception {

        this.aumentaCapacidade();

        if(this.tamanho<this.alunos.length){
            this.alunos[this.tamanho]=elemento;
            this.tamanho++;
        }
        else {
            throw new Exception("O vetor ja esta cheio, não é possivel adicionar novos elementos");

        }

    }

    public int tamanho(){

        return  this.tamanho;
    }

    public String busca(int posicao)throws Exception{
        if(posicao>=0 && posicao<tamanho) {
            return alunos[posicao];
        }
        else {
            throw new Exception("Posicao invalida");
        }


    }

    public int busca1(String elemento){
        for (int i=0;i<tamanho;i++){

            if(alunos[i].equals(elemento)){

                return i;
            }
        }
        return -1;
    }

    public boolean adicionaInicio(int posicao,String elemento)throws Exception{

        this.aumentaCapacidade();
        if(posicao>=0 && posicao<tamanho){
            for (int i=this.tamanho-1;i>posicao;i--){

                this.alunos[i+1]=this.alunos[i];
            }
            this.alunos[posicao]=elemento;
            this.tamanho++;
        }
        else {
            throw new Exception("Posicao Invalida");
        }
        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho==this.alunos.length){
            String[] elementosNovos= new String [this.alunos.length*2];

            for (int i=0;i<this.alunos.length;i++){
                elementosNovos[i]=this.alunos[i];
            }
            this.alunos=elementosNovos;


        }
    }

    public void remove(int posicao)throws Exception{
        if(posicao>=0 && posicao<tamanho){
            for(int i=posicao;i<this.tamanho-1;i++){

                this.alunos[i]=this.alunos[i+1];
            }
            this.tamanho--;
        }
        else {
            throw new Exception("Posicao invalida");
        }


    }

    @Override
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append("[");

        for (int i=0;i<this.tamanho-1;i++){
            s.append(this.alunos[i]);
            s.append(", ");
        }
        if (this.tamanho>0){
            s.append(this.alunos[this.tamanho-1]);

        }

        s.append("]");

        return s.toString();
    }

}
