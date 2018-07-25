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
public class Coba {
    public void cobaAja(){
        System.out.println("Coba Aja");
    }
    
    public String cobaLagi() {
        return "Saya";
    }
    
    public double perkalian (int angka1, int angka2){
        return (1.0);
    }
    /**
     * 
     * @param tinggi
     * @param tinggi integer
     * @return 
     */
   
    public String bintangSegitiga(int tinggi) {
        String hasil = " ";
        for (int i = 0; i<tinggi; i++){
            for (int j=0; j<i; j++) {
                hasil += "* ";
            }
            hasil += "\n";
        }
        return hasil;
    }
    
    /**
     * 
     * @param nominal
     * @return 
     */
    public String pecahanAngka(int nominal) {
        int angka[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int hsl[] = new int[10];
        String hasil=" ";
            for (int i = 0; i<10; i++) {
                hsl[i] = nominal / angka[i];
                nominal = nominal - (hsl[i] * angka[i]);
            }
            for (int i=9; i>0; i--){
                System.out.println("Rp " + angka[i] + " = " + hsl[i]);               
            }
        return hasil;
    }
}