/*
 * Escreva um programa que determine quais são todos os números de 3 algarismos 
cuja soma dos cubos de seus algarismos sejam iguais ao próprio número. 
Exemplo: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27.
 */
import java.util.Scanner;

public class Exercicio_16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N, i, verifica=0;
        int resto1=0, resto2=0, resto3=0;

        System.out.print("Informe um numero: ");
        N = input.nextInt();
        input.close();
        for(i=100; i<=999; i++){
            resto1 = i / 100;
            resto2 = (i / 10) % 10;
            resto3 = (i % 100) % 10;
            /*
            System.out.println(resto1);
            System.out.println(resto2);
            System.out.println(resto3);
            */

            if(N == Math.pow(resto1,3) + Math.pow(resto2,3) + Math.pow(resto3,3)){//Mudando a ordens das Centena, Dezena E Unidade, chega-se ao mesmo resultado
                System.out.println(resto1 + " + " + resto2 + " + " + resto3 + " = " + Math.pow(resto1,3) + " + " + Math.pow(resto2,3) + " + " + Math.pow(resto3,3) + " = " + N);
                verifica = 0;
                break;
            }else{
                verifica = 1;
            }
        }
        
        //System.out.println(i);
        if(i <= 1000 && verifica == 1){//Cansei de tentar fazer mais elegante e fiz isso kkkkk
            System.out.println("O numero nao eh Soma dos cubos de 3 algarismos!");
        }

        
    }   
    
}