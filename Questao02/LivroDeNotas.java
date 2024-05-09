import java.util.Scanner;

public class LivroDeNotas {
    private int numeroAlunos;

    public void calcularMediaDeCadaAluno() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de alunos:");
        numeroAlunos = leitor.nextInt();

        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.println("Digite as notas do aluno " + i + ":");
            System.out.print("Nota A1: ");
            double a1 = leitor.nextDouble();
            System.out.print("Nota A2: ");
            double a2 = leitor.nextDouble();
            System.out.print("Nota A3: ");
            double a3 = leitor.nextDouble();

            double media = calcularMedia(a1, a2, a3);
            System.out.println("Media do aluno " + i + ": " + media);
        }
        leitor.close();
    }

    public void calcularMediaDaTurma() {

    }

    private double calcularMedia(double a1, double a2, double a3) {
        return (a1 + a2 + a3) / 3.0;
    }
}
