/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefania
 */
public class BinarySearch {
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){ //si aún no se ha llegado a la primera posicion del array... 
            int mid = first + (last - first)/2;  //La posición media del array
            if (arr[mid] == key){  
            return mid;  //lo ha encontrado
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//Buscará en el array izquierdo (menores que mid)
            }else{  
            return binarySearch(arr, mid+1, last, key);//Buscará en el array derecho (mayores que mid)  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  //array con los números deseados
        int key = 30;  //Número que se quiere encontrar en el array
        int last=arr.length-1;  //La última posición del array
        int result = binarySearch(arr,0,last,key);  //A la función se le pasa el array, un cero, la última posición del array y el numero buscado
        if (result == -1)  //si el resultado es -1 --> NO SE HA ENCONTRADO
            System.out.println("Element is not found!"); 
        else  
            System.out.println("Element is found at index: "+result);  
    }
}
