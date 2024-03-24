import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunoMaisAlto = 0, alunoMaisBaixo = 0;
        int alturaMaisAlta = 0, alturaMaisBaixa = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + i + " em centímetros: ");
            int alturaAluno = scanner.nextInt();

            if (alturaAluno > alturaMaisAlta) {
                alunoMaisAlto = numeroAluno;
                alturaMaisAlta = alturaAluno;
            }

            if (alturaAluno < alturaMaisBaixa) {
                alunoMaisBaixo = numeroAluno;
                alturaMaisBaixa = alturaAluno;
            }
        }

        System.out.println("\nAluno mais alto:");
        System.out.println("Número do aluno: " + alunoMaisAlto);
        System.out.println("Altura: " + alturaMaisAlta + " cm");

        System.out.println("\nAluno mais baixo:");
        System.out.println("Número do aluno: " + alunoMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixa + " cm");

        scanner.close();
    }
}
