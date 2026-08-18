public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor();
        System.out.println(vetor);
        vetor.add(10);
        vetor.add(20);
        vetor.add(30);
        System.out.println(vetor);
        int removido = vetor.remove();
        if (removido == 0) 
            System.out.println("vetor vazio, nao ha o que remover");
        else {
            System.out.println(removido + " foi removido");
            System.out.println(vetor);
        }
        
    }
}
