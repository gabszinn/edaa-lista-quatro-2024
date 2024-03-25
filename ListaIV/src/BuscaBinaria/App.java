package BuscaBinaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodos = new Metodos();
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
            75, 76, 77, 78, 79, 80, 81,
            82, 83, 84, 85, 86, 87, 88, 89,
            90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
        
            System.out.println("Digite um numero para encontrar todos os indices: ");
            int numero = scanner.nextInt();
            int indice = metodos.buscaBinariaRecursiva(listaNumeros, numero);
            if(indice == -1){
                System.out.println("O número procurado não esta no array!");
            }else {
                System.out.println("O número digitado esta no indice: " + indice);
            }
        scanner.close();
        
    }
    
}
