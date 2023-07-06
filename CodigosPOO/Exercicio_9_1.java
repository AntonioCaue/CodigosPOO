/*
 * Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4
= espadas). O programa deve imprimir o nome da carta por extenso.
 */
import java.util.Scanner;

public class Exercicio_9_1{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valordacarta, naipe;

        System.out.println("Informe o valor da carta: ");
        valordacarta = input.nextInt();
        System.out.println("Informe o naipe da carta: ");
        naipe = input.nextInt();

        switch(naipe){
            case 1://Naipe de Paus
                switch(valordacarta){
                    case 1:
                        System.out.println("As de Paus!");
                    break;

                    case 11:
                        System.out.println("Valete de Paus!");
                    break;

                    case 12:
                        System.out.println("Dama de Paus!");
                    break;

                    case 13:
                        System.out.println("Rei de Paus!");
                    break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(valordacarta + " de Paus!");
                    break;

                    default:
                    System.out.println("Valor da Carta Invalido!");
                    break;
                }
            break;
            
            case 2://Naipe de Ouros
                switch(valordacarta){
                    case 1:
                        System.out.println("As de Ouros!");
                    break;

                    case 11:
                        System.out.println("Valete de Ouros!");
                    break;

                    case 12:
                        System.out.println("Dama de Ouros!");
                    break;

                    case 13:
                        System.out.println("Rei de Ouros!");
                    break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(valordacarta + " de Ouros!");
                    break;

                    default:
                    System.out.println("Valor da Carta Invalido!");
                    break;
                }
            break;
            
            case 3://Naipe de Copas
                switch(valordacarta){
                    case 1:
                        System.out.println("As de Copas!");
                    break;

                    case 11:
                        System.out.println("Valete de Copas!");
                    break;
                    
                    case 12:
                        System.out.println("Dama de Copas!");
                    break;

                    case 13:
                        System.out.println("Rei de Copas!");
                    break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(valordacarta + " de Copas!");
                    break;

                    default:
                    System.out.println("Valor da Carta Invalido!");
                    break;
                }
            break;

            case 4://Naipe de Espadas
                switch(valordacarta){
                    case 1:
                        System.out.println("As de Espadas!");
                    break;

                    case 11:
                        System.out.println("Valete de Espadas!");
                    break;

                    case 12:
                        System.out.println("Dama de Espadas!");
                    break;

                    case 13:
                        System.out.println("Rei de Espadas!");
                    break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        System.out.println(valordacarta + " de Espadas!");
                    break;

                    default:
                    System.out.println("Valor da Carta Invalido!");
                    break;
                }
            break;

            default://Naipe de Invalido
                System.out.println("Naipe Invalido!");
            break;
        }


        input.close();
    }
}