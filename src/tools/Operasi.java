/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author misbah alkhafadh
 */
public class Operasi {

    /**
     * Operasi untuk menentukan deretan angka fibonacci dengan batas angka
     * @param jumlah untuk menentukan jumlah angka batas deret fibonasi
     * @return
     */
    public String bilFibonacci(int jumlah) {
        String hasil = " ";
        int fibonasi[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            if (i == 0 || i == 1) {
                fibonasi[i] = i;
            } else {
                fibonasi[i] = fibonasi[i - 1] + fibonasi[i - 2];
            }
        }
        for (int i = 0; i < jumlah; i++) {
            if (fibonasi[i] <= jumlah) { 
                hasil += (fibonasi[i] + " ");
            }
        }
        return hasil;
    }

    /**
     * Operasi untuk menentukan bilangan prima atau bukan
     * @param angka untuk menentukan angka yang akan ditentukan bilangannya 
     * @return
     */
    public String bilPrima(int angka) {
        String hasil = "Bukan Bilangan Prima";
        boolean prima = false;
        for (int i = 2; i < angka; i++) {
            if ((angka % i) != 0) {
                prima = true;
            }
        }
        if (prima) {
            hasil = "Bilangan Prima";
        }
        return hasil;
    }
}