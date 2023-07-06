/*
 * Escreva um programa que calcule a área de um quadrado. O valor do
lado de um quadrado deverá ser informado pelo usuário.
 */ 
import java.util.Scanner;

public class Exercicio_1{
    
    public static void main (String[] args){
        double lado;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamando do lado do quadrado: ");
        lado = input.nextDouble();

        lado = Math.pow(lado, 2);
        System.out.println("O area do quadrado eh: " + lado);

        input.close();
    }
}
