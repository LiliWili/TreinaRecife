import java.util.Scanner;
public class Questão06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        final double PI= 3.14;
        double area = 2*PI*(raio*raio);
        System.out.println("A area do circulo é: "+area);
        sc.close();
    }
}