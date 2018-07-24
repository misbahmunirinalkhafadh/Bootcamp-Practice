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
public class Prima {
    /**
     * 
     * @param angka
     * @return 
     */
    public String bilPrima (int angka ){
    String hasil = "";
    boolean prima = true;
        for (int i=2; i<angka; i++) {
            if ((angka % i) == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            hasil += "Bilangan Prima";
        } else {
            hasil += "Bukan Bilangan Prima";
        }
        return hasil;
    }
}