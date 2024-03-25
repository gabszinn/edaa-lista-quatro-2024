package BuscaIterativa;

public class Metodos {
    public void buscaIterativa(int[] arr, int key){
        boolean verificador = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
            System.out.println(i + " ");
            verificador = true;
        }
        }
        if (!verificador){
            System.out.println("O número não foi encontrado");
        }
    }
}
