/*
 * Escreva um programa que receba uma temperatura em graus centígrados e a
apresente em graus Fahrenheit.
 */
import java.util.Scanner;

public class Exercicio_4 {
    
    public static void main(String[] args){
        double centigrados, fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Temperura em Graus Centigrados: ");
        centigrados = input.nextDouble();

        fahrenheit = centigrados * 9/5 + 32;
        //fahrenheit = 1.8 * centigrados + 32;
        System.out.println("A temperatura em Fahrenheit eh: " + fahrenheit);

        input.close();
    }
}
