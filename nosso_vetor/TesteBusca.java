import java.util.Random;

public class TesteBusca {
    public static void main(String[] args) {
        NossoVetor nossoVetor = new NossoVetor(1000000);
        nossoVetor.preencheVetor();
        // System.out.println(nossoVetor);
        // if (nossoVetor.contains(50))
        //     System.out.println("50 esta no vetor");
        // else
        //     System.out.println("50 nao esta no vetor");
        // int posicao = nossoVetor.indexOf(30);
        // if (posicao == -1)
        //     System.out.println("30 nao esta no vetor");
        // else 
        //     System.out.println("30 esta na posicao " + posicao);
        // nossoVetor.quicksort(0, 9);
        // System.out.println(nossoVetor);
        // int posicaoBinaria = nossoVetor.buscaBinaria(70);
        // if (posicaoBinaria == -1) 
        //     System.out.println("70 nao esta no vetor");
        // else 
        //     System.out.println("70 esta na posicao " + posicaoBinaria);
        Random random = new Random();
        int x = random.nextInt(10000000);

        int contSimples = nossoVetor.contadorIteracoes(x);
        nossoVetor.quicksort(0, 999999);
        int contBinaria = nossoVetor.buscaBinaria(x);

        System.out.println("iteracoes da busca simples: " + contSimples);
        System.out.println("iteracoes da busca binaria: " + contBinaria);

    }
}
