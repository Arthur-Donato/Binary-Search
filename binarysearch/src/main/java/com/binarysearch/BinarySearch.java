package com.binarysearch;

public class BinarySearch {

    public static int binarySearch(int[] arrayDeNumeros, int menorIndice, int maiorIndice, int numeroProcurado) {
		
        try{
            int indiceMedio = (menorIndice + maiorIndice) / 2;
            int numeroMedio = arrayDeNumeros[indiceMedio];
            
            
            if(menorIndice <= maiorIndice) {
                if(numeroMedio == numeroProcurado) {
                    return 1; // Fazendo a conquista daquela parte do problema a partir do caso base e encontre o elemento dentro de um array
                } else if(numeroMedio > numeroProcurado) {
                    return binarySearch(arrayDeNumeros, menorIndice, indiceMedio - 1, numeroProcurado); // Realizando a divisao do problema (array) pela metade para tentar solucionar
                } else{
                    return binarySearch(arrayDeNumeros, indiceMedio + 1, maiorIndice, numeroProcurado); // Realizando a divisao do problema (array) pela metade para tentar solucionar
                }
            }
            return 0;
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            return -1;
        }
        
         // Fazendo a conquista do problema caso nao ache o elemento dentro do array 
		
		
	}
}
