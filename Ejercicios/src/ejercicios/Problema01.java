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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        int ind1 = 0;
        int ind2 = 0;
        factorial(datos, ind1, ind2);
    }

    public static double factorial(double[][] arreglo, int fil, int col) {
        double[][] resultado = new double[4][2];
        double num;
        double facto;
        if (fil < arreglo.length) {
            if (col < arreglo[0].length) {
                num = arreglo[fil][col];
                resultado[fil][col] = obtnerFacto(num);
                System.out.printf("Facorial de %.1f en la psocion del arreglo "
                        + "resultado[%d][%d] es :%.1f\n",
                        num, fil, col, resultado[fil][col]);
                return factorial(arreglo, fil, col + 1);
            } else {
                col = 0;
                return factorial(arreglo, fil + 1, col);
            }
        }
        return 0;

    }

    public static double obtnerFacto(double numero) {
        if (numero <= 1) { // aquí se evalua el caso base
            return 1;
        } else {
            return numero * obtnerFacto(numero - 1);
        }
    }
}
