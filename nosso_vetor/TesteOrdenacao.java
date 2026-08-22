import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor vetor;
        int capacidade;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print ("digite a capacidade do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
            if (capacidade > 0) {
                vetor = new NossoVetor(capacidade);
                vetor.preencheVetor();
                //System.out.println("Vetor original:\n" + vetor);
                long inicio = new Date().getTime();
                vetor.bubble();
                long fim = new Date().getTime();
                //System.out.println("\nVetor ordenado:\n" + vetor);
                System.out.println("Bubble demorou " + (fim - inicio) + " ms");
            }
        } while (capacidade > 0);
        scanner.close();
    }
}

//implementar na classe NossoVetor o Insertionsort, de acordo com 
//https://www.ime.usp.br/~pf/algoritmos/aulas/ordena.html#insertion

//realizar testes para tamanhos 10m, 20m, 40m, 80m e 160m e comparar os resultados
//cuidado, pelo menos 3 testes para cada tamanho para cada método



