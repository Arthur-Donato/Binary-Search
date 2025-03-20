import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.binarysearch.BinarySearch;

public class BinarySearchTest{
    
    @Test
    public void testeArrayExisteElementoEncontrado(){
        int[] arrayDeNumeros = {1,2,3,4,5};
        int resultado = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, 1);
        assertEquals(1,resultado);
    }

    @Test
    public void testeArrayExisteElementoNaoEncontrado(){
        int[] arrayDeNumeros = {1,2,3,4,5,6,7,8,9};
        int resultado = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, 10);
        assertEquals(0,resultado);
    }

    @Test
    public void testeArrayNaoExiste(){
        int resultado = BinarySearch.binarySearch(null, 0, 0, 1);
        assertEquals(-1,resultado);
    }

    @Test
    public void testeArrayVazia(){
        int[] arrayDeNumeros = {};
        int resultado = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length - 1, 10);
        assertEquals(-1,resultado);
    }

    @Test
    public void testeArrayExisteElementosNegativos(){
        int[] arrayDeNumeros = {-3,-2,-1,0,1,2,3};
        int resultado = BinarySearch.binarySearch(arrayDeNumeros, 0, arrayDeNumeros.length, -2);
        assertEquals(1,resultado);
    }
}