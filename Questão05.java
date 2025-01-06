import java.util.Scanner;
public class Questão05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros: ");
        double metros = sc.nextDouble();
        double centimetros = metros*100;
        System.out.println("A quantidade de centimetros do metro digitado é: "+centimetros+"cm");
    }    
}
