package BuscaListaNomes;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa vinicius = new Pessoa("Vinícius", 41);
        Pessoa daniela = new Pessoa("Daniela", 44);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 20);
        Pessoa daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa felipe = new Pessoa("Felipe", 24);
        Pessoa patricia = new Pessoa("Patricia", 23);
        Pessoa rafael = new Pessoa("Rafael", 20);
        Pessoa pedro = new Pessoa("Pedro", 22);
        Pessoa marcela = new Pessoa("Marcela", 24);
        Pessoa amanda = new Pessoa("Amanda", 100);
        Pessoa[] listaPessoas = { vinicius, daniela,
        ana, carla,
        daniel, felipe,
        pedro, patricia,
        rafael, marcela, amanda};
        ListaPessoas lista = new ListaPessoas(listaPessoas);
        System.out.println("digite abaixo segundo as alternativas que deseja: \n(1) Procurar idade \n (2) idade superior á:\n (3) Alterar idade");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite uma idade a ser escaniada: ");
                int acharIdade = scanner.nextInt();
                    lista.idade(acharIdade);
                    break;
            case 2:
                System.out.println("Digite uma idade minima: ");
                int idadeMinima = scanner.nextInt();
                    lista.idadeAcima(idadeMinima);
                break;
            case 3:
                System.out.println("para qual Idade desaja alterar: ");
                int alterarIdade = scanner.nextInt();
                    lista.alterarIdade(alterarIdade);
                break;
        
            default:
            System.out.println("Algo deu errado tente novamente");
                break;
        }
            scanner.close();
    }
}
