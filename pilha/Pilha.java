public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;
    public Pilha () {
        this(10);
        // dados = new int[10];
        // topo = 0;
    }
    public Pilha (int capacidade){
        this.dados = new int[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
    }
    public int tamanho () {
        return topo;
    }
    public boolean estaVazia () {
        return topo == 0;
    }
    public boolean estaCheia () {
        return topo == capacidade;
    }
    public void empilha (int e) {
        dados[topo++] = e;
    } 
    public int desempilha () {
        return dados[--topo];
    }
    @Override
    public String toString () {
        /*String s = "capacidade: " + capacidade + "\ntamanho atual: " + topo + "\ndados: ";
        for (int i=topo-1; i >= 0; i--) {
            s = s + dados[i] + " ";
        }*/
        if (estaVazia()) return "pilha vazia";
        String s = "--------\n";
        for (int i=topo-1; i>=0; i--)
            s += dados[i] + " ";
        return s + "\n";
    }
}