/*
 * Escreva um programa que receba um ângulo em graus e o converta para
sua representação em radianos. Divulgue também seno, cosseno,
tangente, cossecante, secante e cotangente do ângulo.
 */
import java.util.Scanner;
public class Exercicio_3 {
    
    public static void main(String[] args){
        double graus, radianos;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um grau para saber suas razoes trigonometricas: ");
        graus = input.nextDouble();
        radianos = Math.toRadians(graus);

        System.out.println("Sua representacao em radianos: " + radianos);
        System.out.println("O seu seno é de: " + Math.sin(radianos));
        System.out.println("O seu cosseno é de: " + Math.cos(radianos));
        System.out.println("A sua tangente é de: " + Math.tan(radianos));
        System.out.println("O seu cossecante é de: " + 1/Math.sin(radianos));
        System.out.println("O seu secante é de: " + 1/Math.cos(radianos));
        System.out.println("O seu cotangente é de: " + 1/Math.tan(radianos));

        input.close();
    }
}
