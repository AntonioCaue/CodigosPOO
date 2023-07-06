/*
 * Escreva um programa que receba um número n e calcule e exiba o
fatorial de cada número de zero a n
 */
import java.util.Scanner;

public class Fatoriais {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, fat, i, j;

        System.out.println("Informe um numero: ");
        num = input.nextInt();

        for(i=0; i<=num; i++){
            fat=1;
            for(j=i; j>0; j--){
                fat *= j;
            }
            System.out.println("Fatorial de " + i + " = " + fat);
        }

        input.close();
    }
}
