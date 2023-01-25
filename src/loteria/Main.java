package loteria;

import loteria.Loteria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loteria azar = new Loteria();
        Scanner rellenar = new Scanner(System.in);
        System.out.println("La generacion del boleto sera \n1 Azar \n2 Manual");
        int manualAleatorio = rellenar.nextInt();
        azar.crearBoletoAleatorio(manualAleatorio);
        azar.crearBoletoManual(manualAleatorio);
        azar.boletoPremiado();
        System.out.println("Quieres comprobar si tu boleto esta premiado? \n1 Si \n2 No");
        int comprobar = rellenar.nextInt();
        azar.comprobarBoleto(comprobar);
    }
}
