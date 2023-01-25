package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);

        System.out.println("Dime el primer valor: ");
        int operando1 = cubrir.nextInt();
        System.out.println("Dimer el segundo valor: ");
        int operando2 = cubrir.nextInt();
        Parametros cuentas = new Parametros();
        int salir = 1;
        do {
            System.out.println("¿Que operacion quieres realizar? \n1 Suma \n2 Resta \n3 Multiplicacion \n4 Division \n5 Modulo \n6 Potencia \n7 Raiz \n8 Salir");
            int operacion = cubrir.nextInt();
            cuentas.operaciones(operacion, operando1, operando2);
            switch (operacion) {
                case 1:
                    cuentas.getSuma();
                    break;
                case 2:
                    cuentas.getResta();
                    break;
                case 3:
                    cuentas.getMultiplicacion();
                    break;
                case 4:
                    cuentas.getDivision();
                    break;
                case 5:
                    cuentas.getModulo();
                    break;
                case 6:
                    cuentas.getPotencia();
                    break;
                case 7:
                    cuentas.getRaiz();
                    break;
                case 8:
                    salir = 0;
                    break;
            }
        } while (salir != 0);
        System.out.println("Aloha");

    }
}
