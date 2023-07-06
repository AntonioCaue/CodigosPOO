/*
 * Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
 */
import java.util.Scanner;

public class Exercicio_11 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.println("Informe o Primeiro par ordenado: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Informe o Segundo par ordenado: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        if(x2 == x1 && y2 > y1){//Seguindo sentido horario apartir do Plano Cartesiano
            System.out.println("O Segundo esta Acima do primeiro.");
        }else if(x2 > x1 && y2 > y1){
            System.out.println("O Segundo esta Acima e ah Direita do primeiro.");
        }else if(x2 > x1 && y2 == y1){
            System.out.println("O Segundo esta ah Direita do primeiro.");
        }else if(x2 > x1 && y2 < y1){
            System.out.println("O Segundo esta Abaixo e ah Direita do primeiro.");
        }else if(x2 == x1 && y2 > y1){
            System.out.println("O Segundo esta Abaixo do primeiro.");
        }else if(x2 < x1 && y2 < y1){
            System.out.println("O Segundo esta Abaixo e ah Esquerda do primeiro.");
        }else if(x2 < x1 && y2 == y1){
            System.out.println("O Segundo esta ah Esquerda do primeiro.");
        }else if(x2 < x1 && y2 > y1){
            System.out.println("O Segundo esta Acima e ah Esquerda do primeiro.");
        }

        input.close();
    }
}
