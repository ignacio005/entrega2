package aplicacion;

import mates.Funciones;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("1) La suma de los 10 primeros numeros naturales es: " + Funciones.suma(10));
        System.out.println("1.1) La suma de los 10 primeros numeros naturales es: " + Funciones.sumavesion2(10));
        System.out.println("2) El factorial del 5 es " + Funciones.factorial(5));
        System.out.println("3) La potencia n-esima de un número es " + Funciones.potencia(3,2));
        System.out.println("4) La suma de los elementos de la lista es " + Funciones.lista(1,2,3,4));
        System.out.println("5) La media de los elementos de la lista es " + Funciones.media(1,2,3,4));
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(1.0);
        lista.add(2.0);
        lista.add(3.0);
        lista.add(4.0);
        System.out.println("6) La desviación tipica es " + Funciones.calcularDesviacionTipica(lista));
        System.out.println("7) La suma de los primeros numeros pares hasta n asumiendo n ≥ 2 es " + Funciones.sumapares(8));
        System.out.println("8) La suma de los elementos pares de una lista de enteros " + Funciones.listaenteros(1,2,3,4));
        Funciones.obtenerlistapares(1,2,6,11);
        System.out.println("10) La lista de los primeros números pares hasta n asumiendo n ≥ 2 son: " + Funciones.listapares(9));
        ArrayList<Integer> lista1=new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer>lista2=new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        System.out.println("11) El producto escalar es " + Funciones.productoescalar(lista1,lista2));
        System.out.println("12) El elemento n-ésimo de la sucesión de Fibonacci " + Funciones.fibonachi(9));
        System.out.println("13) El cociente entre el decimo tercer y el decimo segundo elemento " + Funciones.cocientefibonachi());
        System.out.println("14) La relación entre la sucesión de Fibonacci y la razón áurea es " + Funciones.relacionfibonachi(9));
    }
}