package heapSort;

public class HeapSort {
	//criando função que recebe o array e vai ordena lo
    public static void ordenar(int array[]) { 
        int tam = array.length; 
  
        for (int i = tam / 2 - 1; i >= 0; i--) {
            heapify(array, tam, i); 
        }
  
        for (int i=tam-1; i>0; i--) { 
            // coloca a raiz atual para o final
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp; 
  
            heapify(array, i, 0); 
        } 
    } 
  
    static void heapify(int arr[], int n, int i) { 
    	//variáveis se referem aos indices;
        int maior = i;//maior é igual a raiz  
        int l = 2*i + 1; // filho a esquerd 
        int r = 2*i + 2; // filho a direita 
  
        /* aqui começa a se fazer as trocas
         * se o filho a esquerda for maior que a raiz
         * atuazliza o valor de maior 
        */
        if (l < n && arr[l] > arr[maior]) 
            maior = l; 
  
        // aqui faz a mesma coisa, porém verifica para o valor a direita
        if (r < n && arr[r] > arr[maior]) 
            maior = r; 
  
        // se o maior valor não for raiz 
        //chama novamente até ordenar a heap
        if (maior != i) 
        { 
            int aux = arr[i]; 
            arr[i] = arr[maior]; 
            arr[maior] = aux; 
            heapify(arr, n, maior); 
        } 
    } 
     
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        int n = arr.length; 
  
        //HeapSort ob = new HeapSort(); 
        ordenar(arr); 
        for (int i : arr) {
        	System.out.print(i +", "); 
        }
    } 
}

