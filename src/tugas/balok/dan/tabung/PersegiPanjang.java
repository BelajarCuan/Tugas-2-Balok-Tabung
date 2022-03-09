/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.balok.dan.tabung;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends Variabel implements MenghitungBidang  {
    public PersegiPanjang (double panjang , double lebar , double tinggi, double jari){
    super (panjang , lebar , tinggi , jari) ;
    
    }

    @Override
    public void L() {
        double luaspersegipanjang ;
        luaspersegipanjang =  panjang*lebar ;
        System.out.println("Luas Persegi Panjang = "+ luaspersegipanjang);
        
    }

    @Override
    public void K() {
       double kelilingpersegipanjang;
       kelilingpersegipanjang = 2*(panjang*lebar);
        System.out.println("Keliling Persegi Panjang = "+ kelilingpersegipanjang);
    }
    
}
