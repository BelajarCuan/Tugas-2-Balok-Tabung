/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.balok.dan.tabung;

/**
 *
 * @author ASUS
 */
public class Tabung extends Variabel implements MenghitungRuang{
    public Tabung (double panjang , double lebar , double tinggi, double jari){
    super (panjang , lebar , tinggi , jari) ;
    }

    @Override
    public void v() {
        double volumetabung;
        volumetabung = 3.14*jari*jari*tinggi ;
        System.out.println("Volume Tabung = "+ volumetabung);
    }

    @Override
    public void LP() {
        double luaspermukaaantabung;
        luaspermukaaantabung = 2*3.14*jari*(jari+tinggi);
        System.out.println("Luas Permukaan Tabung = "+ luaspermukaaantabung);
    
    }

    
}
