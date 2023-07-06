/*
 * Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123
deve ser reescrito como 312.
 */
//Pode melhorar, funciana apenas com 3 digitos
import java.util.Scanner;

public class Exercicio_5 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int CDU, UDC, aux, aux2, aux3;;

        System.out.println("Informe um numero com Centena, Dezena e Unidade: ");
        CDU = input.nextInt();

        //1 forma
        /*aux = CDU / 10;//Pega as Cemtenas e Dezenas
        //aux2 = ((CDU % 100) % 10) * 100;//Pega a Unidade
        aux2 = (aux2 % 10) * 100;
        UDC = aux + aux2;//Apartir da soma dos aux conseque a troca
        */
        //2 forma
        aux = CDU / 100 * 10;//Centena para Dezena
        aux2 = CDU % 100 / 10;//Dezena para Unidade
        aux3 = CDU % 100 % 10 * 100;//Unidade para Centena
        UDC = aux + aux2 + aux3;//Apartir da soma dos aux conseque a troca

        System.out.println("aux: " + aux);
        System.out.println("aux2: " + aux2);
        System.out.println("aux2: " + aux3);
        System.out.println("O numero agora esta em Unidade, Centena e Dezena: " + UDC);

        input.close();
    }
}