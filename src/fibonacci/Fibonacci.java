/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Prima");
        System.out.println(Prima(100));
        System.out.println("");
        System.out.println("Bilangan Fibonaci");
        System.out.println(Fibonaci(10));
    }

    /**
     * 
     * @param akhir untuk menginput banyaknya data
     * @return number untuk mencetak bilangan prima yang disimpen di dalam array
     */
    static ArrayList Prima(int akhir) {
        ArrayList number = new ArrayList();

        for (int i = 2; i < akhir; i++) { //perulangan jika i = 2, i kurang dari yang di inputkan, maka i bertambah
            int a = 0; // inisialisasi a
            for (int j = 2; j < i; j++) { //perualangan jika j = 2, j kurang dari i, maka j bertambah
                if (i % j == 0) { // jika i mod j hasil nya nol, dia tidak mencetak
                    a = 1;
                    break;
                }
            }
            if (a == 0) { //jika i mod j hasilnya tidak nol, maka i di cetak dan di tampung di dalam arrayList
                number.add(i);
            }

        }
        return number;

    }

    /**
     * 
     * @param c untuk mengintputkan nilai terakhir/hasil yang akan dicetak
     * @return angka untuk mencetak bilangan fibonacci yang disimpan dalam array yang bernama angka.
     */
    static ArrayList Fibonaci(int c) {
        ArrayList angka = new ArrayList();
        int a = 0;  //inisialisasi
        int b = 1;
        int hasil = 0;       

        for (int i = 1; i <= c; i++) {            //perulangannya
            a = b;    //a kan 0 b nya 1 , jadi pertama munculin  0 sama 1
            b = hasil; //nah  si b di tampung, jadi hasil di inisialisasi dari b
            hasil = a + b; // hasil kan b. nilainya 1, ditambah sama angka sebelumnya
            if (hasil <= c) { //kondisi jika hasilnya kurang dari sama dengan c yang di inputkan dicetak
                angka.add(hasil);
            }

        }

        return angka;
    }
}
