/*
Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número). Exemplos: 6=1+2+3, 28=1+2+4+7+14.
*/
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num, perf=0;
       
       System.out.print("Informe um numero: ");
       num = input.nextInt();
       
       for(int i = 1; i<=(num/2)+1; i++){//Verifica ate a metade +1, pois pode ser impar
           if(num % i == 0){
               perf += i;
               System.out.print(i+" + ");
           }
       }
       System.out.println();
       if(perf == num){
           System.out.print("O numero " + num + " EH um numero perfeito");
       }else{
            System.out.print("O numero " + num + " NAO eh um numero perfeito");
       }
       
       
       input.close();
    }
}