public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.inserirF(1);
        lista.inserirF(2);
        lista.inserirF(3);
        //lista.removerI();
        //lista.removerPosicao(1);
        lista.inserirPosicao(5,1);
        lista.imprimir();
    }
}
