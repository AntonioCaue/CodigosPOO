/*
 * Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4
= espadas). O programa deve imprimir o nome da carta por extenso.
 */
import java.util.Scanner;

public class Exercicio_9_2{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valordacarta, naipe;

        System.out.println("Informe o valor da carta: ");
        valordacarta = input.nextInt();
        System.out.println("Informe o naipe da carta: ");
        naipe = input.nextInt();

        switch(valordacarta){
            case 1:
                switch(naipe){
                    case 1:
                        System.out.println("As de Paus!");
                    break;

                    case 2:
                        System.out.println("As de Ouros!");
                    break;

                    case 3:
                        System.out.println("As de Copas!");
                    break;

                    case 4:
                        System.out.println("As de Espadas!");
                    break;

                    default:
                        System.out.println("Naipe Invalido!");
                    break;
                    
                }
            break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                switch(naipe){
                    case 1:
                        System.out.println(valordacarta + " de Paus!");
                    break;

                    case 2:
                        System.out.println(valordacarta + " de Ouros!");
                    break;

                    case 3:
                        System.out.println(valordacarta + " de Copas!");
                    break;

                    case 4:
                        System.out.println(valordacarta + " de Espadas!");
                    break;

                    default:
                        System.out.println("Naipe Invalido!");
                    break;
                }
            break; 

            case 11:
                switch(naipe){
                    case 1:
                        System.out.println("Valete de Paus!");
                    break;

                    case 2:
                        System.out.println("Valete de Ouros!");
                    break;

                    case 3:
                        System.out.println("Valete de Copas!");
                    break;

                    case 4:
                        System.out.println("Valete de Espadas!");
                    break;

                    default:
                        System.out.println("Naipe Invalido!");
                    break;
                }
            break;

            case 12:
                switch(naipe){
                    case 1:
                        System.out.println("Rainha de Paus!");
                    break;

                    case 2:
                        System.out.println("Rainha de Ouros!");
                    break;

                    case 3:
                        System.out.println("Rainha de Copas!");
                    break;

                    case 4:
                        System.out.println("Rainha de Espadas!");
                    break;

                    default:
                        System.out.println("Naipe Invalido!");
                    break;
                }
            break;

            case 13:
                switch(naipe){
                    case 1:
                        System.out.println("Rei de Paus!");
                    break;

                    case 2:
                        System.out.println("Rei de Ouros!");
                    break;

                    case 3:
                        System.out.println("Rei de Copas!");
                    break;

                    case 4:
                        System.out.println("Rei de Espadas!");
                    break;

                    default:
                        System.out.println("Naipe Invalido!");
                    break;
                }
            break;

            default:
                System.out.println("Valor da carta Invalida");
            break;
        }


        input.close();
    }
}