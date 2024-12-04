import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    /**
     * Verifica si un numero es primo
     */
    public static boolean esPrimo(int valor) {
        int cantDivisores = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                cantDivisores++;
            }
        }
        return valor != 0 && cantDivisores == 2;
    }

    /**
     * Calcule la suma de los multiplos de 3 y 5 de un valor
     */
    public static int getSuma(int valor) {
        int suma = 0;
        for (int i = 1; i < valor; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    /**
     * Verifica si un arreglo esta ordenado de menor a mayor
     */
    public static boolean estaOrdenado(int[] arreglo) throws Exception {
        if (arreglo.length == 0) {
            throw new Exception("El arreglo esta vacio!");
        } else {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Devuelve la suma de las posiciones pares de un arreglo
     */
    public static int getSumaPares(int[] arreglo) throws Exception {
        if (arreglo.length == 0) {
            throw new Exception("El arreglo esta vacio!");
        } else {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (i % 2 == 0) {
                    suma += arreglo[i];
                }
            }
            return suma;
        }
    }

    /**
     * Devuelve la suma de dos matrices
     */
    public static int[][] getSumaMatrices(int[][] m1, int[][] m2) throws Exception {
        boolean mismaCantFilas = m1.length == m2.length;
        boolean mismaCantCol = Ejercicios.getCantColumnas(m1) == Ejercicios.getCantColumnas(m2);
        if (mismaCantFilas && mismaCantCol) {
            int[][] m3 = new int[m1.length][m1[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                }
            }
            return m3;
        } else {
            throw new Exception("Las matrices no tienen el mismo tamaño");
        }
    }

    /**
     * Verifica cuantas columnas tiene una matriz
     *
     * @param m
     * @return cero si no es cuadrada, sino la cantidad especifica de columnas que tiene
     */
    private static int getCantColumnas(int[][] m) {
        int cantFilas = m[0].length;
        for (int i = 1; i < m.length; i++) {
            if (m[i].length != cantFilas) {
                cantFilas = 0;
                break;
            }
        }
        return cantFilas;
    }

    /**
     * Se obtiene la frecuencia de aparicio de cada letra en la palabra
     */
    public static Map<Character, Integer> getFrecuencia(String palabra) {
        Map<Character, Integer> frecuencias = new HashMap<Character, Integer>();
        for (Character c : palabra.toCharArray()) {
            if (frecuencias.containsKey(c)) {
                frecuencias.put(c, frecuencias.get(c) + 1);
            } else {
                frecuencias.put(c, 1);
            }
        }
        return frecuencias;
    }

}
