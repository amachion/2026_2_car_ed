public class TesteNossoVetor {
    public static void main(String[] args) {
        int a = 5;
        NossoVetor vetor1 = new NossoVetor(a);
        vetor1.setOcupacao(50);
        System.out.println("capacidade do vetor 1: " + vetor1.getCapacidade());
        System.out.println("ocupacao do vetor 1: " + vetor1.getOcupacao());

        NossoVetor vetor2 = new NossoVetor();
        System.out.println("capacidade do vetor 2: " + vetor2.getCapacidade());
        System.out.println("ocupacao do vetor 2: " + vetor2.getOcupacao());
    }
}
