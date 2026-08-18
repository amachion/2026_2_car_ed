public class MaisUmTeste {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor();
        for (int i=1; i <= 100; i++) {
            vetor.add(i);
            System.out.println(vetor);
        }
        while (!vetor.estaVazio()) {
            System.out.println(vetor.remove() + " foi removido");
            System.out.println(vetor);
        }
    }
}
