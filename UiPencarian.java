/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uipencarian;

import java.io.*;
/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;*/
import java.util.Scanner;
/**
 *
 * @author hayarasikhah, fajar
 */
public class UiPencarian {
   
    //perbaikan
    // 1. masukan file secara langsung
    // 2. menggunakan args
    // 3. mencari kata perbaris. jadi kata tersebut ditemukan pada baris keberapa
    
    public static void main(String[] args) {
        String files[]={
           "/home/fajar/Documents/1.txt", "/home/fajar/Documents/2.txt", "/home/fajar/Documents/3.txt"
        };
        
        System.out.println("==================================================================================");
        System.out.println("\t \t \t # PROGRAM PENCARI KATA #");
        System.out.println("==================================================================================");
                Scanner in = new Scanner(System.in);
                System.out.println("Masukkan kata yang ingin dicari: ");
                String textSearch = in.nextLine();
                
        for(int i=0; i<files.length; i++){
            String file = files[i];
            

        try {
            int textCont = 0;
            FileReader a = new FileReader(file);
            BufferedReader b = new BufferedReader(a);

            String text;

            while ((text = b.readLine()) != null) {
                textCont++;
                System.out.println("----------------------------------------------------------------------------------");
                
                int posfound = text.indexOf(textSearch);
                
                if (text.contains(textSearch)) {
                    System.out.println("kata "+textSearch+ " ditemukan pada file"+file+ " pada baris " +textCont );
                    break;
                } else {
                    System.out.println("kata "+textSearch+ " tidak ditemukan pada file manapun");
                    break;
                }
            } 
            System.out.println("---------------------------------------------------------------------------------- \n");
        
        }catch (FileNotFoundException e) {
            e.getMessage();
        
        }catch (IOException f) {
            f.getMessage();
        }
    }
    };
}
