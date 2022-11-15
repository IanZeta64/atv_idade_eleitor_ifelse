import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade;
       try {
            do {
                System.out.println("Digite a idade do eleitor: ");
                idade = sc.nextInt();
                if (idade < 0) {
                    System.out.println("valor da idade invalido!");
                }
            } while (idade < 0);

            if (idade >= 18 && idade <= 70) {
                System.out.println("Voto obrigatório.");
            } else if ((idade >= 16 && idade < 18) || idade > 70) {
                System.out.println("Voto facultativo.");
            } else {
                System.out.println("Sem direito a votar.");
            }
        }catch(InputMismatchException e) {
           System.out.println("Erro de entrada de dados. Reinicie o programa.");

       }
    }
}
