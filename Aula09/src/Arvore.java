public class Arvore {
    No root=null;//nó pai ou raiz

    public void insert(int info,No place){  //algoritimo para inserir uma informação
        if(place==null){                    //Se o local está vazio, então a árvore está vazia
            root=new No(info);              //e o root vai receber o novo nó
            System.out.print(" "+info);     //Imprime a informação inserida
        }else if(info<place.info){          //Senão, se a informação é menor do que a do local
            if(place.left==null){           //Se o filho da esquerda está vazio
                place.left=new No(info);    //Então insere à esquerda o novo nó
                System.out.print(" "+info); //Imprime a informção inserida
            } else {                        //São,se não for vazio
                insert(info,place.left);    //Pula para o filho à esquerda usando a recursividade
            }
        } else if (info> place.info) {//Senão, se a informação é maior que a do local
            if(place.right==null){//Se o filho à direita está vazio
                place.right=new No(info);//Insere a informação em um novo nó à direita
                System.out.print(" "+info);//e imprime a informação
            } else {//Senão, se o nó à direita não está vazio
                insert(info,place.right);//Pula para o filho à direita usando recursividade
            }
        }
    }

    public void preOrder(No place){//Algoritimo de navegação em pré ordem
        System.out.print(" "+place.info);
        if(place.left!=null)//Se o filho à esquerda não está vazio
            preOrder(place.left);//Pula para o filho à esquerda pela recursividade

        if(place.right!=null)//Se o filho à direita não está vazio
            preOrder(place.right);//Pula para o filho à direita pela recursividade
    }

    public void inOrder(No place){//Algoritimo de navegação em ordem
        if(place.left!=null)//Se o filho à esquerda não está vazio
            inOrder(place.left);//Pula para o filho à esquerda pela recursividade

        System.out.print(" "+place.info);

        if (place.right!=null)//Se o filho à direção não está vazio
            inOrder(place.right);//Pula o filho à direita pela recursividade
    }

    public void postOrder(No place){//Algoritimo de navegação em pós ordem
        if(place.left!=null)//Se o filho à esquerda não esá vazio
            postOrder(place.left);//pula para o filho à esquerda pela recursividade

        if(place.right!=null)//Se o filho à direita não está vazio
            postOrder(place.right);//Pula para o filho à direita pela recursividade

        System.out.print(" "+place.info);
    }

}
