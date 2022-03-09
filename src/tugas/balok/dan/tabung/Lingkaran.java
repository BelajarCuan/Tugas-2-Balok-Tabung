/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.balok.dan.tabung;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends Variabel implements MenghitungBidang{
    public Lingkaran (double panjang , double lebar , double tinggi, double jari){
    super (panjang , lebar , tinggi , jari) ;
    
    }

    @Override
    public void L() {
        double luaslingkaran ;
        luaslingkaran = 3.14*jari*jari;
        System.out.println("Luas Lingkaran = " + luaslingkaran );
        
             
       
    }

    @Override
    public void K() {
        double kelilinglingkaran;
        kelilinglingkaran = 2*3.14*jari;
        System.out.println("Keliling Lingkaran = "+ kelilinglingkaran);
        
    }
}
