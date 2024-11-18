import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramtroDois = scan.nextInt();

        try {
            contar(parametroUm, paramtroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        scan.close();
    }

    static void contar(int a, int b) throws ParametrosInvalidosException {
        if (a > b)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = b - a;
        for(int i = 1; i <= contagem; i++)
            System.out.println("Imprimindo o número " + i);
    }
}