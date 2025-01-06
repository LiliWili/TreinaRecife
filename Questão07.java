import java.util.Scanner;
public class Questão07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do quadrado: ");
        double comprimento = sc.nextDouble();
        double area = comprimento*comprimento;
        System.out.println("A area do quadrado é: "+area);
        sc.close();
    }
}