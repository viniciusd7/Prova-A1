import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Lucro lucro = new Lucro();
        lucro.calcularMediaGastoPorCliente(leitor);
        lucro.calcularMediaGeral(leitor);
        leitor.close();
    }
}
