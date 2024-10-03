import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a entrada da string
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        
        // Inicializa o contador
        int contador = 0;
        
        // Percorre cada caractere da string
        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            
            // Verifica se o caractere é 'a' ou 'A'
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        
        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        
        scanner.close();
    }
}
