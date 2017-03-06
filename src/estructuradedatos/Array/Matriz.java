/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos.Array;

import java.util.Scanner;

/**
 *
 * @author santiagobernalbetancourt
 */
import java.util.Scanner; //libreria de escaneo

//creando la clase de operaciones de matricez
public class operaciones_matricez_wha {
    public double[][] crearMatriz( int filas, int columnas ) { //declarando filas y columnas de la matriz
        return new double[filas][columnas]; //retornando las filas y columnas de la matriz
    }

    //creamos y rellenamos la matriz con sus filas y columnas :D
    public double[][] crearYLlenarMatriz( int filas, int columnas ) { //creando las filas y columnas
        double mat[][] = crearMatriz( filas, columnas );//declarando una matriz con filas y columnas
        Scanner sc = new Scanner( System.in ); //escaneandolas
        System.out.println( "pocisiones de la matriz de sus [filas][columnas]: " ); //llenando la matriz en sus pocisiones de filas y columnas
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.printf("[%d][%d]: ", i, j); //imprimiendo las filas y columnas de la matriz
                mat[i][j] = sc.nextDouble( ); //escaneandolas en sus repectivas posiciones n_n
            }
        }
        return mat; //retornando la matriz declarada
    }


//impirmiendo la matriz completa ^^
    public void imprimirMatriz( double mat[][] ) { //declarando la matriz a impirmir
         System.out.println("\n"); //dando espacio para imprimir
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                System.out.print( mat[i][j] + "\t"); //impirmiendo la matriz
            }
            System.out.println( );
        }
    }
}