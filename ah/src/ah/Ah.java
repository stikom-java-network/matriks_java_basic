/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mhs
 */
public class Ah {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan ukurang matriks (m x n)");
        System.out.print("Ukuran m : ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Ukuran n : ");
        int n = Integer.parseInt(br.readLine());
        
        int[][] matriks = new int[m][n];
        System.out.println("=======================");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("masukkan baris ke "+i+" kolom "+j+" : ");
                matriks[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("========================");
        for (int i = 0; i < matriks.length; i++) {
            int ttl = 0;
            for (int j = 0; j < matriks[i].length; j++) {
                ttl += matriks[i][j];
                System.out.print(matriks[i][j]+" ");
                
            }
            System.out.print(ttl);
            System.out.println("");
        }
    }
    
}
