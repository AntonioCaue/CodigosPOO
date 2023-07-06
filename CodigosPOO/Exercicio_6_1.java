/*
 * Escreva um programa que recebe um valor inteiro representando um intervalo em
minutos e imprime o equivalente a esse período expresso em valores inteiros para
dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
 */
import java.util.Scanner;

public class Exercicio_6_1 {
    
    public static void main(String[] args){
        int inteiro, dias, horas, minutos, resto;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor inteiro/minutos: ");
        inteiro = input.nextInt();

        //9257
        dias = inteiro / 1440;//Divide o inteiro "por minutos em 1 dia"
        resto = inteiro % 1440;//Recebe oque sobra da divisao = "617"
        horas = resto / 60;//Pega o resto e divide "por minutos em 1 hora"
        minutos = resto % 60;//Recebe o Resto="617" e ve oque sobre dividindo por 60, = "17"

        System.out.println(inteiro + " minutos = " + dias + " dias, " + horas + " horas" + " e " + minutos + " minutos ");

        input.close();
    }
}
