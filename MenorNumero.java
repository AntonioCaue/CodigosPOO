/*
 * Escreva um programa que lê três números e determina qual número é o menor.
 * Bonus: Encontra o maior tambem.
 */
import java.util.Scanner;

public class MenorNumero {
    public static void main (String[] args){
        int n1, n2, n3, menor, maior;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 numeros: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        menor = n1;//Sao incializadas com o 1° valor
        maior = n1;
        //Maior numero
        if(n2 > maior){
            maior = n2;
        }
        if(n3 > maior){
            maior = n3;
        }
        //Menor numero
        if(n2 < menor){
            menor = n2;
        }
        if(n3 < menor){
            menor = n3;
         }

        System.out.println("O maior numero eh: " + maior);
        System.out.println("O menor numero eh: " + menor);

        input.close();
    }
}
