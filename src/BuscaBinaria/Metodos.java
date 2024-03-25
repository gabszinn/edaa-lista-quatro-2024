package BuscaBinaria;

public class Metodos {
    public int buscaBinariaRecursiva(int[] arr, int key, int left, int right){
        if (left <= right){
            int mid = left + (right - left) /2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid]< key)
            return buscaBinariaRecursiva(arr, key, mid + 1, right);
            if (arr[mid]> key)
            return buscaBinariaRecursiva(arr, key, left, mid -1);
        }
        return -1;
    }
    public int buscaBinariaRecursiva(int[] arr, int key){
        return buscaBinariaRecursiva(arr, key, 0, arr.length-1);
    }
}
