import java.util.Scanner;

public class FibonacciChecker {

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true; // 0 e 1 pertencem à sequência
        }

        int prev = 0;
        int current = 1;

        while (current < number) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current == number; // Verifica se o número pertence à sequência
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número a ser verificado
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
