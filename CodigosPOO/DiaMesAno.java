/*
 * Escreva um programa que leia uma data com dia, mês e ano como
números inteiros e retorne a data no formato a seguir:
  “[dia] de [mês] de [ano]”
  “9 de agosto de 2021”
  Utilize a estrutura if…else
  Informe também quantos dias tem o mês da data informada
  Para simplificar, considere que fevereiro sempre tem 28 dias
  Utilize a estrutura switch
 */

import java.util.Scanner;

public class DiaMesAno{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;

        System.out.println("Informe um Dia, Mes e Ano em inteiros: ");
        dia = input.nextInt();
        mes = input.nextInt();
        ano = input.nextInt();
        System.out.println("\n\n");//Pula algumas linhas

        if(mes == 1){
            System.out.println(dia + " de Janeiro de " + ano);
        }else if(mes == 2){
            System.out.println(dia + " de Fevereiro de " + ano);
        }else if(mes == 3){ 
            System.out.println(dia + " de Marco de " + ano);
        }else if(mes == 4){
            System.out.println(dia + " de Abril de " + ano);
        }else if(mes == 5){
            System.out.println(dia + " de Maio de " + ano);
        }else if(mes == 6){
            System.out.println(dia + " de Junho de " + ano);
        }else if(mes == 7){
            System.out.println(dia + " de Julho de " + ano);
        }else if(mes == 8){
            System.out.println(dia + " de Agosto de " + ano);
        }else if(mes == 9){
            System.out.println(dia + " de Setembro de " + ano);
        }else if(mes == 10){
            System.out.println(dia + " de Outubro de " + ano);
        }else if(mes == 11){
            System.out.println(dia + " de Novembro de " + ano);
        }else if(mes == 12){
            System.out.println(dia + " de Dezembro de " + ano);
        }else if(mes > 12){
            System.out.println("Mes invalido");
        }

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("Este Mes tem 31 dias!");
            break;
            case 2:
            System.out.println("Este Mes tem 28 dias!");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este Mes tem 30 dias!");
            break;
        }

        input.close();
    }
}
