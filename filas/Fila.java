public class Fila {
    private No primeiro;
    private No ultimo;
    //construtor padrão: primeiro e ultimo são nulos
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void enfileira (Pessoa pessoa) {
        No novo = new No(pessoa);
        if (estaVazia())
            primeiro = novo;
        else
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public Pessoa desenfileira () {
        if (estaVazia()) return null;
        Pessoa p = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) //esvaziou a fila
            ultimo = null;
        return p;
    }
    @Override 
    public String toString() {
        if (estaVazia()) return "fila vazia";
        String s = "";
        No temp = primeiro;
        while (temp != null) {
            s += temp + "-> ";
            temp = temp.getProximo();
        }
        return s + "//";
    }
}

