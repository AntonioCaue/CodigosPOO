/*
 *Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna baseexpoente.
Por exemplo, potencia(3,4) deve ser implementado como 3 * 3 * 3 * 3. (A saída é apenas 81 nesse exemplo)
Assuma que expoente é um inteiro maior ou igual a 1.  
 */
import java.util.Scanner;

public class Exercicio_18 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base, expoente;

        System.out.print("Informe a Base: ");
        base = input.nextInt();
        System.out.print("Informe o Expoente: ");
        expoente = input.nextInt();

        System.out.print(base + "^" + expoente + " = " + potencia(base, expoente));

        input.close();
    }

    public static int potencia(int base, int expo){

        if(expo==0){
            return 1;
        }else{
            return base*potencia(base, expo-1);
        }
    }

}
