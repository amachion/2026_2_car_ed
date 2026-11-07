public class TesteFila {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(2020, "Ana");
        Fila fila = new Fila();
        fila.enfileira(p);
        System.out.println(fila);
        p = new Pessoa(2021, "Bia");
        fila.enfileira(p);
        System.out.println(fila);
        fila.enfileira(new Pessoa(2022, "Caio"));
        System.out.println(fila);

        p = fila.desenfileira();
        System.out.println(p.getNome() + " foi atendido");
        System.out.println(fila);
    }
}
