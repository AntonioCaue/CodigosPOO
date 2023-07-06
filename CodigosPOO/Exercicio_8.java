/*
 * Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:
A) No setor de Eletros, que possui código 222, todas as peças que custam mais de R$ 500 vão ter 10% de
desconto.
B) No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40%
de desconto, peças que custam entre R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50
vão ter 10% de desconto.
C) Escreva um programa que recebe do usuário o código do setor da loja e o valor original de um produto e
imprime na tela o nome do setor e o valor do produto com desconto. Caso o usuário forneça um código
diferente de 111 ou 222, exiba a mensagem Setor Invalido.
 */
import java.util.Scanner;

public class Exercicio_8{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int setor;
        double preco;

        System.out.println("informe o Setor da Loja: ");
        setor = input.nextInt();
        System.out.println("informe o Preco do Produto: ");
        preco = input.nextDouble();

        switch(setor){
            case 222:
                if(preco > 500){
                    System.out.println("Setor Eletros!");
                    preco = preco - (preco * 0.10);
                    System.out.println("O preco do produto teve desconto, teve preco de: " + preco);
                }else{
                    System.out.println("Setor Eletros!");
                    System.out.println("O preco do produto nao teve desconto, teve preco de: " + preco);
                }
            break;

            case 111:
            if(preco > 100){
                System.out.println("Setor Cama, mesa e banho!");
                preco = preco - (preco * 0.40);
                System.out.println("O preco do produto teve desconto, teve preco de: " + preco);
            }else if(preco >= 50 && preco <= 100){
                System.out.println("Setor Cama, mesa e banho!");
                preco = preco - (preco * 0.20);
                System.out.println("O preco do produto teve desconto, teve preco de: " + preco);
            }else if(preco < 50){
                System.out.println("Setor Cama, mesa e banho!");
                preco = preco - (preco * 0.10);
                System.out.println("O preco do produto teve desconto, teve preco de: " + preco);
            }
            break;
            
            default:
                System.out.println("Setor invalido");
            break;

        }

        input.close();
    }
}
