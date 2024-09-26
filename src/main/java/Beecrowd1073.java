
import java.util.Scanner;

public class Beecrowd1073 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variável
        int N;

        //ler variável
        N = scanner.nextInt();

        //verificar números pares e imprimir os resultados
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %.0f%n", i, (Math.pow(i, 2)));
            }
        }
    }
}
