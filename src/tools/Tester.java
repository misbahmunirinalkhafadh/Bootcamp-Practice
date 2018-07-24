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
public class Tester {
    public static void main(String[] args) {
        Coba coba = new Coba();
    //    Coba.cobaAja();
    //    Coba.cobaLagi();
    //    System.out.println(coba.bintangSegitiga(6));
        Pecahan pecahan = new Pecahan();
    //    pecahan.pecahanAngka(9999900);
        Fibonacci fibonacci = new Fibonacci();
    //    System.out.println(fibonacci.bilFibonacci(100));
        Prima prima = new Prima();
    //    System.out.print(prima.bilPrima(10));
        Operasi operasi = new Operasi();
        System.out.println(operasi.perkalianAngka(3, 4));
    }
}
