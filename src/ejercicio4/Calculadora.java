package ejercicio4;

import java.util.Scanner;

public class Calculadora {
    String comprobarOperacion;
    Scanner cubrir = new Scanner(System.in);




    public String sumar(int dato1,int dato2) {
        int suma = dato1 + dato2;
        System.out.println("El resultado de la suma es: " + suma);
        return comprobarOperacion;
    }

    public String restar(int dato1,int dato2) {
        int resta = dato1 - dato2;
        System.out.println("El resultado de la resta es: " + resta);
        return comprobarOperacion;
    }

    public String multiplicar(int dato1,int dato2) {
        int multiplicacion = dato1 * dato2;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        return comprobarOperacion;
    }

    public String dividir(int dato1,int dato2) {
        float division = dato1 / dato2;
        System.out.println("El resultado de la division es: " + division);
        return comprobarOperacion;
    }

    public void comprobarUltimaOperacion(int operacion) {
if (operacion==1){
    System.out.println(comprobarOperacion);
}
        //System.out.println("La ultima operacion que se realizo fue "++",con resultado "+);
    }
}
