/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.balok.dan.tabung;

/**
 *
 * @author ASUS
 */
public class Balok extends Variabel implements MenghitungRuang {
    
    public Balok (double panjang , double lebar , double tinggi, double jari){
    super (panjang , lebar , tinggi , jari) ;
}
    @Override
    public void v() {
        double volume ;
        volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok = " + volume);
       
    }

    @Override
    public void LP() {
        double luas_permukaan ;
        luas_permukaan = 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
        System.out.println("Luas Permukaan Balok = " + luas_permukaan);
        
    }
}
    
    

