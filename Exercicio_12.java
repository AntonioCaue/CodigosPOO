/*
 * O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que
dado o número de um dia do mês de fevereiro (um valor entre 1 e 28) imprime o dia
da semana correspondente.
A) Exemplo de entrada: 10
B) Exemplo de saída: O dia 10 será uma terça-feira
 */
import java.util.Scanner;

public class Exercicio_12 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia;

        System.out.println("Informe um Dia de Fevereiro de 2015: ");
        dia = input.nextInt();

        if(dia > 28){
            System.out.println("Dia invalido!");
        }else if(dia % 7 == 1){
            System.out.println(" O dia " + dia + " será Domingo!");
        }else if(dia % 7 == 2){
            System.out.println(" O dia " + dia + " será Segunda-Feira!");
        }else if(dia % 7 == 3){
            System.out.println(" O dia " + dia + " será Terca-Feira!");
        }else if(dia % 7 == 4){
            System.out.println(" O dia " + dia + " será Quarta-Feira!");
        }else if(dia % 7 == 5){
            System.out.println(" O dia " + dia + " será Quinta-Feira!");
        }else if(dia % 7 == 6){
            System.out.println(" O dia " + dia + " será Sexta-Feira!");
        }else if(dia % 7 == 0){
            System.out.println(" O dia " + dia + " será Sabado!");
        }

        input.close();
    }
}
