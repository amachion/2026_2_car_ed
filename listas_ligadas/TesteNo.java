public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        no1.setProximo(no2);
        //no2.setProximo(no1);
        System.out.println("no1: " + no1);

        no1.getProximo().setInfo(50);
        System.out.println("no2 modificado: " + no2);
    }
}
