import java.util.Random;

public class NossoVetor {
    private int[] v;
    private int ocupacao;
    private int capacidade;
    public NossoVetor (int capacidade) {
        this.v = new int[capacidade];
        this.ocupacao = 0; //por clareza
        this.capacidade = capacidade;
    }
    public NossoVetor () {
        // this.v = new int[10];
        // this.ocupacao = 0;
        // this.capacidade = 10;
        this(10); //faz a chamada do construtor anterior
    }
    public int getOcupacao () {
        return ocupacao;
    }
    public int getCapacidade () {
        return capacidade;
    }
    public void setOcupacao (int ocupacao) {
        if (ocupacao <= this.capacidade) {
            this.ocupacao = ocupacao;
        }
    }
    public boolean estaVazio () {
        return ocupacao == 0;
    }
    public boolean estaCheio () {
        return ocupacao == capacidade;
    }
    // public boolean add (int elemento) {
    //     if (estaCheio()) return false;
    //     v[ocupacao++] = elemento;
    //     return true;
    // }
    public void add (int elemento) {
        if (estaCheio())
            redimensiona(capacidade*2);
        v[ocupacao++] = elemento;
    }
    // private void dobra () {
    //     int[] temp = new int[capacidade*2];
    //     for (int i=0; i<ocupacao; i++)
    //         temp[i] = v[i];
    //     capacidade = capacidade * 2;
    //     v = temp;
    // }
    // private void reduzMetade () {
    //     int[] temp = new int[capacidade / 2];
    //     for (int i=0; i<ocupacao; i++)
    //         temp[i] = v[i];
    //     capacidade = capacidade / 2;
    //     v = temp;
    // }
    private void redimensiona (int novaCapacidade) {
        int[] temp = new int[novaCapacidade];
        for (int i=0; i<ocupacao; i++) 
            temp[i] = v[i];
        capacidade = novaCapacidade;
        v = temp;
    }
    public int remove () {
        int queSai = 0;
        if (!estaVazio()) {
            queSai = v[--ocupacao];
            if (capacidade >= 10 && ocupacao <= capacidade/4) 
                redimensiona(capacidade/2);
        }
        return queSai;
    }
    @Override
    public String toString () {
        //String s = "capacidade: " + capacidade + "\nocupacao: " + ocupacao;
        String s = "";
        if (estaVazio())
            s += "\nvetor vazio";
        else {
            //s += "\nelementos: ";
            for (int i=0; i<ocupacao; i++) {
                s = s + v[i] + " ";
            }
        }
        return s + "\n";
    }
    public void preencheVetor () {
        Random random = new Random();
        for (int i=0; i<capacidade; i++)
            v[i] = random.nextInt(10*capacidade);
        ocupacao = capacidade;
    }
    public void bubble () {
        for (int i=1; i < capacidade; i++) {
            for (int j=0; j < capacidade-i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    int partition (int p, int r) { 
	    int x = v[r];    
	    int i = p-1;
        int aux;
        for(int j = p; j < r; j++) {
            if (v[j] <= x) {
                i = i + 1;
                aux = v[i];
                v[i] = v[j]; 
                v[j] = aux;
            }
        }
        i = i + 1;
        aux = v[r]; 
        v[r] = v[i]; 
        v[i] = aux;
        return i;
    }
    public void quicksort(int p, int r) {
        //System.out.printf ("\np = %d, r = %d", p, r);
	    if (p < r ) {
            int q = partition(p, r);
            //System.out.printf(", q = %d", q);
            quicksort(p, q-1);
            quicksort(q+1, r);
        }
    }
    public void insertion () {
        for (int i=1; i<ocupacao; i++) {
            int x = v[i];
            int j;
            for (j=i-1; j>=0 && v[j] > x; j--)
                v[j+1] = v[j];
            v[j+1] = x;
        }
    }
    public boolean contains (int x) {
        for (int i=0; i<ocupacao; i++) {
            if (x == v[i]) return true;
        }
        return false;
        //return indexOf(x) > 0 ? true : false;
    }
    public int indexOf (int x) {
        for (int i=0; i<ocupacao; i++) {
            if (x == v[i]) return i;
        }
        return -1;
    }
    public int contadorIteracoes (int x) {
        int cont=0;
        for (int i=0; i<ocupacao; i++) {
            cont++;
            if (x == v[i]) return cont;
        }
        return cont;
    }
    public int buscaBinaria (int x) {
        int ini = 0, fim = ocupacao-1;
        int cont = 0;
        while (ini <= fim) {
            cont++;
            int meio = (ini + fim) / 2;
            if (x == v[meio]) return cont;
            if (x > v[meio]) ini = meio + 1;
            else fim = meio -1;
        }
        return cont;
    }
}