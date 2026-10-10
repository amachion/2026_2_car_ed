public class Lista {
    private No primeiro;
    //por clareza
    public  Lista () {
        primeiro = null;
    }
    //get e set, nem pensar
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!listaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString() {
        if (listaVazia()) {
            return "lista vazia";
        }
        String s = "";
        No temp = primeiro;
        while (temp != null) {//vai até o fim da lista
            s = s + temp;
            temp = temp.getProximo();
        }
        return  s + "//";
    }
    public void insereFim (int i) {
        No novo = new No(i);
        if (listaVazia()) {
            primeiro = novo;
        }
        else {
            No temp = primeiro;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }
    }
    public int removeInicio () {
        if (listaVazia()) {
            return -1;
        }
        else {
            int aux = primeiro.getInfo();
            primeiro = primeiro.getProximo();
            return aux;
        }
    }
    public int removeFim () {
        if (listaVazia()) 
            return -1;
        if (primeiro.getProximo() == null){//tem 1 só
            int aux = primeiro.getInfo();
            primeiro = null; //esvaziou a lista
            return aux;
        }
        No temp = primeiro;
        while (temp.getProximo().getProximo() != null) {
            temp = temp.getProximo();
        }
        int aux = temp.getProximo().getInfo();
        temp.setProximo(null);
        return aux;
    }
}
