/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;
import java.util.*;
/**
 *
 * @author GAMES
 */
public class Laptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // TODO code application logic here
           





     Scanner input = new Scanner (System.in);
        
        int diskon, pilihan,bayar, jumlah, total;
        
        //deklarasi 
         String[] laptop = {"DELL","ASUS","ACER","MacBook"};
        int[] harga = {4000, 2000, 1000, 5000}; 
        
        System.out.println("SELAMAT DATANG DI TOKO LAPTOP SAYA ");
        System.out.println("Silahkan Belanja");
        for (int a=0; a<harga.length; a++){
            System.out.println(a+". "+laptop[a]+ "    harganya  : "+harga[a]);
           } //pengumuman 
       
        System.out.println("PENGUMUMAN : akan ada diskon 20% dengan minimum pembelian lebih dari Rp.5000 ");
           //input pilihan      
        System.out.print("silahkan masukan pilihan :");
        pilihan = input.nextInt();
        System.out.println("Masukan Pilihan anda : "+laptop[pilihan]);
        System.out.println("Tentukan jumlah yang akan anda beli ");
        jumlah = input.nextInt();
        total = harga[pilihan]*jumlah;
        System.out.println("Masukan Pilihan anda : "+laptop[pilihan]);
        
        //percabangan diskon
        diskon = total-(total*20/100);    
        
        
        if (total <= 5000){
            System.out.println("Total yang harus anda bayar adalah Rp:"+total);
             
            System.out.print("Masukan uang anda RP.");
            bayar=input.nextInt();
        if (bayar > total){
            System.out.println("Kembalian anda Rp:"+(bayar-total));
            System.out.println("Terima kasih sudah berbelanja di toko kami");
        }else if (bayar == total){
            System.out.println("Terima kasih sudah berbelanja di toko kami");
            
            
        }else{
            System.out.println("Maaf uang anda kurang Rp:"+(total-bayar)); 
        }
        }else if (total > 5000){
            System.out.println("Selamat anda mendapat diskon sebesar 20%!!");
            System.out.println("Total yang harus anda bayar adalah Rp:"+diskon);
            System.out.print("Masukan uang anda RP. ");
            bayar=input.nextInt();
        if (bayar > diskon){
            System.out.println("Kembalian anda Rp: "+(bayar-diskon));
            System.out.println("Terima kasih sudah berbelanja di toko kami");
        }else if (bayar == total){
            System.out.println("Terima kasih sudah berbelanja di toko kami");
        }else{
            System.out.println("Maaf uang anda kurang Rp:"+(diskon-bayar));
        }
        }
        //input uang untuk membayar 
        
            
            
        }
         
    }


    
//algoritma 
//1.Start
//2.deklarasi variabel
//3.Muncul kalimat "SELAMAT DATANG DI TOKO SAYA" dan "selamat berbelanja" sebelum memilih 
//4.looping laptop dan harga 
//5.muncul pengumuman diskon 20% dengan minimal pembelian Rp.5000
//6.user input pilihan laptop
//7.user input jumlah laptop yang akan dibeli
//8.jika total harga kurang dari Rp.5000 user tidak mendapat diskon 
//9.Jika total harga lebih dari Rp.5000 maka user akan mendapat diskon sebesar 20%
//10.User membayar
//11.jika user membayar kurang dari total harga maka akan muncul "maaf uang anda kurang"
//12.jika user membayar lebih dari total harga maka akan muncl kemblian 
//13.jika user membayar uang pas maka user tidak mendapatkan kembalian 
//14. muncul kalimat "Terima kasih sudah berbelanja di toko kami" setelah membayar
//15. Stop
