public class Main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.addNumero(5);
        numeros.addNumero(7);
        numeros.addNumero(1);
        numeros.addNumero(8);

        numeros.encontrarMenorNumero();

        numeros.exibirTodosOsNumeros();

    }
}