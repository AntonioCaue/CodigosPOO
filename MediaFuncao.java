/*
 * Escreva um programa que leia 3 números double e informe sua média
O cálculo da média deve ser feito através de uma função
 */
import java.util.Scanner;

class MediaFuncao {
    
    public static void main(String[] args) {
        double v1, v2, v3, m;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Valor 1:");
        v1 = input.nextDouble();
        System.out.print("Valor 2:");
        v2 = input.nextDouble();
        System.out.print("Valor 3:");
        v3 = input.nextDouble();
        
        m = media(v1, v2, v3);
        
        System.out.print("A media foi: " + m);
        
        input.close();
    }
    
    //Deve-se estar dentro de class
    public static double media(double n1, double n2, double n3){
        double med = (n1+n2+n3)/3;
        return med;
    }
}