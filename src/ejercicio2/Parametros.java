package ejercicio2;

public class Parametros {
    private float suma, resta, multiplicacion, division, modulo, potencia;
    private double raiz;


    public float getSuma() {
        return suma;
    }

    public float getResta() {
        return resta;
    }

    public float getMultiplicacion() {
        return multiplicacion;
    }

    public float getDivision() {
        return division;
    }

    public float getModulo() {
        return modulo;
    }

    public float getPotencia() {
        return potencia;
    }

    public double getRaiz() {
        return raiz;
    }

    public void operaciones(int operacion, int operando1, int operando2) {
        if (operacion == 1) {
            suma = operando1 + operando2;
            System.out.println("El resultado de la suma es: " + suma);
        }
        if (operacion == 2) {
            resta = operando1 - operando2;
            System.out.println("El resultado de la resta es: " + resta);
        }
        if (operacion == 3) {
            multiplicacion = operando1 * operando2;
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        }
        if (operacion == 4) {
            division = operando1 / operando2;
            System.out.println("El resultado de la division es: " + division);
        }
        if (operacion == 5) {
            modulo = operando1 % operando2;
            System.out.println("El resultado del modulo es: " + modulo);
        }
        if (operacion == 6) {
            potencia = operando1 * operando1;
            System.out.println("El resultado de la potencia es: " + potencia);
        }
        if (operacion == 7) {
            raiz = Math.sqrt(operando2);//Math.sqrt(operando2) con esto se realiza la raiz cuadrada de un numero
            System.out.println("El resultado de la raiz cuadrada es: " + raiz);
        }

    }
}
