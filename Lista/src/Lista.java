public class Lista {
    int [] elementos;
    int qtdeElementos;
    int capacidade;

    public Lista(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade]; // inicialização do vetor
        this.qtdeElementos = 0; // valor inicial
    }

    public void inserirF(int elemento) {
        if (qtdeElementos==capacidade) {
            System.err.println("Lista Cheia");
        }
        elementos[qtdeElementos] = elemento;
        qtdeElementos++;
    }

    public void inserirI (int elemento) {
        if (qtdeElementos==capacidade) {
            System.err.println("Lista Cheia");
        }
        for (int i = qtdeElementos; i<0; i --) {
            elementos[i-1] = elementos[i];
        }
        elementos[0] = elemento;
        qtdeElementos++;
    }

    public void removerF () {
        if (qtdeElementos == 0) {
            System.err.println("Lista Vazia");
        }
        qtdeElementos--;
    }

    public void removerI () {
        if (qtdeElementos == 0) {
            System.err.println("Lista Vazia");
        }
        int aux = 0;
        for (int i = 0; i<qtdeElementos; i++) {
            aux = elementos[i+1];
            elementos[i+1] = elementos[i];
            elementos[i] = aux;
        }
        qtdeElementos--;
    }

    public void imprimir () {
        for (int i = 0; i<qtdeElementos; i++) {
            System.out.println(elementos[i]);
        }
    }

    public void limpar () {
        qtdeElementos = 0;
    }
}
