/*
 * 19.	Modifique a função do fatorial para exibir o valor da fatorial calculado a cada chamada 
 * recursiva e o parâmetro de chamada recursiva. Para cada chamada recursiva, exiba as saídas em 
 * uma linha separada e adicione um nível de recuo (tabulação). Faça o melhor que você puder para 
 * tornar a saída limpa, interessante e significativa. Seu objetivo aqui é projetar e implementar um 
 * formato de saída que facilite o entendimento da recursão.
●	Por exemplo, para uma entrada n = 5, o programa deve exibir:
0! = 1
	1! = 1
		2! = 2
			3! = 6
				4! = 24
					5! = 120

 */
import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        N = input.nextInt();
        
        for(int i=0; i<=N; i++){
            System.out.println(i + "! = " + fatorial(i));
        }

        input.close();
    }

    public static int fatorial(int num){
        System.out.print("    ");
        if(num==0){
            return 1;
        }else{
            return num*fatorial(num-1);
        }
    }

}
