/*
 * 17.	Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. 
 * A cidade A tem um crescimento populacional de 3,5% ao ano, enquanto a população da 
 * cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade de 
 * anos necessária para que a população da cidade A seja maior ou igual a população da cidade B.
 */

public class Exercicio_17{

    public static void main(String[] args){
        double A=7000, B=20000;
        int i;

        for(i = 0; A<=B; i++){
            A = A + (A * 0.035);
            B = B + (B * 0.01);
        }
        System.out.print("Anos para A passar B: " + i);

    }
}