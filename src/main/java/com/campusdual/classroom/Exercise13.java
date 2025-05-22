package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad");
        // linea inaccesible, el atributo ahora es privado y se usa getActualFuel()
        //ft.actualFuel = -8;
        ft.showDetails();
    }
}