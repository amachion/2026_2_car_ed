public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("lista inicializada:\n" + lista);
        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        System.out.println("lista depois das insercoes de inicio:\n" + lista);
        lista.insereFim(10);
        lista.insereFim(20);
        lista.insereFim(30);
        System.out.println("lista depois das insercoes de fim:\n" + lista);
        System.out.println(lista.removeInicio() + " saiu do inicio");
        System.out.println("Lista depois da remocao de inicio:\n" + lista);
        System.out.println(lista.removeFim() + " saiu do final");
        System.out.println("Lista depois da remocao de fim:\n" + lista);
    }
}
