/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2u4.u5;

/**
 *
 * @author Usuario
 */
public class Practica2U4U5 {
public static void Suma(int a, int b) {
        int suma = a+b;
        System.out.println("El resultado de la suma de los numeros es de: " + suma);
    }
    public static void Multiplicacion(int a, int b){
        int multiplicacion = a*b;
        System.out.println("El resultado de la multiplicacion de los numeros es de: " + multiplicacion);
    }
    public static void Resta(int a, int b){
        int resta = a-b;
        System.out.println("El resultado de la resta de los numeros es de: " + resta);
    }
    public static void Division(int a, int b){
        int division = a/b;
        System.out.println("El resultado de la division de los numeros es de: " + division);
    }
    public static void main (String []args){
        int a = 50;
        int b = 30;
        
        Practica2U4U5.Suma(a, b);
        Practica2U4U5.Multiplicacion(a, b);
        Practica2U4U5.Resta(a, b);
        Practica2U4U5.Division(a, b);
    }

}
