package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir=new Scanner(System.in);
        System.out.println("El primer valor es: ");
        int dato1 = cubrir.nextInt();
        System.out.println("El segundo valor es: ");
        int dato2 = cubrir.nextInt();
        Calculadora cuentas=new Calculadora();
        int salir=1;

        do {
            System.out.println("¿Que operacion quieres realizar? \n1 Suma \n2 Resta \n3 Multiplicacion \n4 Division \n5 Comprobar ultima operacion \n6 Salir");
            int operacion= cubrir.nextInt();
            switch (operacion){
                case 1:
                    cuentas.sumar(dato1,dato2);
                    break;
                case 2:
                    cuentas.restar(dato1,dato2);
                    break;
                case 3:
                    cuentas.multiplicar(dato1,dato2);
                    break;
                case 4:
                    cuentas.dividir(dato1,dato2);
                    break;
                case 5:
                    cuentas.comprobarUltimaOperacion(operacion);
                    break;
                case 6:
                    salir=0;
                    break;

            }
        }while (salir!=0);

    }
}
