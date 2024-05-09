import java.util.Scanner;

public class Lucro {
    private int numeroClientes;

    public void calcularMediaGastoPorCliente(Scanner leitor) {
        System.out.print("Digite o numero de clientes: ");
        numeroClientes = leitor.nextInt();

        double totalGastos = 0;

        int clienteAtual = 1;
        while (clienteAtual <= numeroClientes) {
            System.out.print("Digite o valor gasto em bebidas pelo cliente " + clienteAtual + ": ");
            double gastoBebidas = leitor.nextDouble();

            System.out.print("Digite o valor gasto em comidas pelo cliente " + clienteAtual + ": ");
            double gastoComidas = leitor.nextDouble();

            double gastoTotalCliente = gastoBebidas + gastoComidas;
            totalGastos += gastoTotalCliente;

            clienteAtual++;
        }

        double mediaGastoPorCliente = totalGastos / numeroClientes;
        System.out.println("A media de gasto por cliente e: " + mediaGastoPorCliente);
    }

    public void calcularMediaGeral(Scanner leitor) {
        double totalGastos = 0;

        int clienteAtual = 1;
        do {
            System.out.print("Digite o valor gasto em bebidas pelo cliente " + clienteAtual + ": ");
            double gastoBebidas = leitor.nextDouble();

            System.out.print("Digite o valor gasto em comidas pelo cliente " + clienteAtual + ": ");
            double gastoComidas = leitor.nextDouble();

            double gastoTotalCliente = gastoBebidas + gastoComidas;
            totalGastos += gastoTotalCliente;

            clienteAtual++;
        } while (clienteAtual <= numeroClientes);

        double mediaGeral = totalGastos / (numeroClientes * 2);
        System.out.println("A media geral de gastos e: " + mediaGeral);
    }
}
