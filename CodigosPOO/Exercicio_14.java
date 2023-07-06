/*
Escreva um programa que apresente a série de Fibonacci 
até o n-ézimo termo. Assuma que n>0.
*/
import java.util.Scanner;

class Exercicio_14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num, ant=0, prox=1, fib;
       
       System.out.print("Informe quantos termos da sequencia de fibonacci serao mostrados: ");
       num = input.nextInt();
       
       for(int i = 1; i<num; i++){//Do 1 a num-1, ou seja o numero que desejar
           fib = ant + prox;
           ant = prox;
           prox = fib;
           System.out.print(fib + ", ");
       }
       
       input.close();
    }
}