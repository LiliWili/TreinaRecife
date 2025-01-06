import java.util.Scanner;
public class Questão04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double numero2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double numero3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double numero4 = sc.nextDouble();
        double media = (numero1+numero2+numero3+numero4)/4;
        System.out.printf("A sua média é: %.2f%n", media);
        sc.close();
    } 
}