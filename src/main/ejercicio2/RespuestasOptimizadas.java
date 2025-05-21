package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(N)"; // Ej: "O(n)"
    // Paso de complejidad O(n^2)
    // A complejidad O(n)
    public static boolean tieneDuplicadosOpt(int[] arr) { // Compejidad O(n)
        HashSet<Integer> vistos = new HashSet<>(); //El Hashset no permite duplicados 
        for (int num : arr) {
            if (vistos.contains(num)) {
                return true; // Duplicado 
            }
            vistos.add(num);
        }
        return false; 
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(N)"; // Ej: "O(n)"
    // La version anterior tiene una complejidad O(n^2)
    // La version actual tiene una complejidad O(n)
    public static int contarMayoresOpt(int[] arr, int x) {
            int count = 0;
            int maxHastaAhora = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > x && arr[i] >= maxHastaAhora) {
                    count++;
                }
                if (arr[i] > maxHastaAhora) {
                    maxHastaAhora = arr[i];
                    }
                }
            return count;
        }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = "O(N)"; // Ej: "O(n)"
    // La version anterior tiene una complejidad O(n^2)
    // La version actual tiene una complejidad O(n)
    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
            max = arr[i];
            }
        }
        return max;
    } 
}
