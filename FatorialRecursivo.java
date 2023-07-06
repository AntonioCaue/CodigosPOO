/*
 * Implemente uma função recursiva para calcular o fatorial de um número n
Teste a função criada
 */
import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        N = input.nextInt();
        
        
        System.out.print(N + "! = " + fatorial(N));
        
        input.close();
    }

    public static int fatorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*fatorial(num-1);
        }
    }

}
