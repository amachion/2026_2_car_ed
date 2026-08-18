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
        String s = "capacidade: " + capacidade + "\nocupacao: " + ocupacao;
        if (estaVazio())
            s += "\nvetor vazio";
        else {
            s += "\nelementos: ";
            for (int i=0; i<ocupacao; i++) {
                s = s + v[i] + " ";
            }
        }
        return s + "\n";
    }
}