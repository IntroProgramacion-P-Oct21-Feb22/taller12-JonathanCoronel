/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author JonathanCoronel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ind1 = 0;
        int ind2 = 0;
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        obtenerSuma(datos1, datos2, ind1, ind2);
    }

    public static double obtenerSuma(double[][] arreglo1, double[][] arreglo2, int fil, int col) {
        double[][] datos3 = new double[4][3];
        double num;
        if (fil < arreglo1.length) {
            if (col < arreglo1[0].length) {
                num = arreglo1[fil][col] + arreglo2[fil][col];
                datos3[fil][col] = num;
                System.out.printf("Valores en datos3[%d][%d] =%.1f\n",
                        fil, col, datos3[fil][col]);
                return obtenerSuma(arreglo1, arreglo2, fil, col + 1);
            } else {
                col = 0;
                return obtenerSuma(arreglo1, arreglo2, fil + 1, col);
            }
        }
        return 0;

    }

}
