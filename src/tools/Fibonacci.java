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
public class Fibonacci {
    /**
     * 
     * @param jumlah
     * @return 
     */
    public String bilFibonacci(int jumlah) {
        String hasil = " ";
        long fibonasi[] = new long[jumlah];
        
        fibonasi[0] = 0;
        fibonasi[1] = 1;
        
        for(int i=2; i<jumlah; i++) {
            fibonasi[i] = fibonasi[i-1] + fibonasi[i-2]; //
        }
        for (int i=0; i<jumlah; i++) {
            if (fibonasi[i]<=jumlah){ //jika proses telah mencapai batas jumlah maka proses berhenti
            hasil += (fibonasi[i]+" ");
            } else {
            break;
            }
        }
    return hasil;
    }
}