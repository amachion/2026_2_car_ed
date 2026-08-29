import java.util.Random;
public class TestePilha {
    public static void main(String[] args) {
        /*Pilha p1 = new Pilha(5);
        p1.empilha(5);
        p1.empilha(10);
        System.out.println(p1);
        Pilha p2 = new Pilha();
        p2.empilha(30);
        System.out.println(p2);*/
        Pilha p = new Pilha();
        Random random = new Random();
        do {
            if (random.nextInt(2) == 1) { //empilha, se puder
                if (!p.estaCheia())
                    p.empilha(random.nextInt(10));
            }
            else { //desempilha, se puder
                if (!p.estaVazia())
                    System.out.println(p.desempilha() + " saiu");
            }
            System.out.println(p);
        } while (!p.estaVazia());
    }
}
