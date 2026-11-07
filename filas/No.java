public class No {
    private Pessoa info;
    private No proximo;

    public No (Pessoa info) {
        this.info = info;
        this.proximo = null;
    }

    public Pessoa getInfo() {
        return info;
    }

    public void setInfo(Pessoa info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    @Override 
    public String toString() {
        return "[" + info + "]";
    }
}