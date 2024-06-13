package javaseamana4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aulas Heredia
 */
public class vehiculo {
    public String color ;
    public String modelo ;
    public int anioCreacion ;                                                                                                       
    
    public void calc(int  anioActual) {
        int resultado = 0 ;
        resultado = anioActual - anioCreacion ;
        System.out.println("antiguedad del vehiculo" + resultado) ;
        
    }
    public int calcresult (int anioActual) {
        return 0;
    }
}
