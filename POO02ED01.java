import java.util.Scanner;
public class POO02ED01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = sc.nextInt(); 
        if (numero1 > numero2) {
            System.out.println("O primeiro numero é o maior, numero: "+numero1);} 
        else{
            System.out.println("O segundo numero é o maior, numero: "+numero2);
        }            
        sc.close();
    }
}
