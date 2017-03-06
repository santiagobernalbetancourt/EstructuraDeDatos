/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package estructuradedatos.Array.matriz;

/**
 *
 * @author santiagobernalbetancourt
 */
public class matriz {
    public int[][] crearMatriz( int filas, int columnas ) { //declarando filas y columnas de la matriz
        return new int[filas][columnas]; //retornando las filas y columnas de la matriz
    }
      
    public int[][] LlenarMatriz( int filas, int columnas ) { //creando las filas y columnas
        int mat[][] = crearMatriz( filas, columnas );//declarando una matriz con filas y columnas
        Scanner sc = new Scanner( System.in ); //escaneandolas
        System.out.println( "pocisiones de la matriz de sus [filas][columnas]: " ); //llenando la matriz en sus pocisiones de filas y columnas
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.printf("[%d][%d]: ", i, j); //imprimiendo las filas y columnas de la matriz
                mat[i][j] = sc.nextDouble( ); //escaneandolas en sus r

}
   

