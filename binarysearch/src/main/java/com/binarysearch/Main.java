package com.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] arrayDeNumeros = new int[32];

		for(int i = 0; i < 32; i++) {
			arrayDeNumeros[i] = i;
		}
        
        int numeroProcurado = 80;
        
		if(BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, numeroProcurado) == 1) {
			int retorno = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, numeroProcurado);
			System.out.println("O numero procurado foi encontrado dentro do array!");
			System.out.println(retorno);
		}
		else if(BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, numeroProcurado) == 0) {
			int retorno = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, numeroProcurado);
			System.out.println(retorno);
			System.out.println("O numero nao foi encontrado dentro do array :(");
		} else{
		    int retorno = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, numeroProcurado);
			System.out.println(retorno);
		}
    }
}