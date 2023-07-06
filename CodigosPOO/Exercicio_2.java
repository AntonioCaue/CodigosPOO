/*
 * Escreva um programa que calcule a soma e a média aritmética de 3
números. Os 3 valores reais serão informados pelo usuário.
 */
import java.util.Scanner;

public class Exercicio_2 {
    
    public static void main(String[] args){
        double n1, n2, n3, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 numeros para obter a media: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        media = (n1 + n2 + n3) / 3;
        System.out.println("A media foi de: " + media);

        input.close();
    }
}
