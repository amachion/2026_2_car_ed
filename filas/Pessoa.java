public class Pessoa {
    private int anoNascimento;
    private String nome;
    public Pessoa(int anoNascimento, String nome) {
        this.anoNascimento = anoNascimento;
        this.nome = nome;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "nome=" + nome + ", ano de nascimento= " + anoNascimento;
    }
    
}
