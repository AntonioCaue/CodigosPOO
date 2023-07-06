/*
 * Escreva um algoritmo que, tendo como dados de entrada dois pontos
quaisquer no plano, (x1,y1) e (x2,y2), escreva a distância entre eles.
 */
import java.util.Scanner;

public class DistanciaEntrePontos {
    
    public static void main(String[] args){
        double x1, y1, x2, y2, distancia;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os pontos x1 e y1:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Informe os pontos x2 e y2:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distancia dos pontos (" + x1 + "," + y1 + ")" + "e(" + x2 + "," + y2 + ") eh de : " + distancia);

        input.close();

    }
}
