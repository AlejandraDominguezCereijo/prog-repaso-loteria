package ejercicio3;

import java.util.Scanner;

public class Arrays {
    Scanner cubrir = new Scanner(System.in);
    int nPlazas = cubrir.nextInt();
    int[] valores = new int[nPlazas];



    public void introducirDatos() {
        for (int i = 0; i < nPlazas; i++) {
            System.out.println(i + " Escribe un numero: ");
            valores[i] = cubrir.nextInt();
            for (int j = 0; j < valores.length; j++){
                if (valores[i]==valores[j]&&(i!=j)){
                    System.out.println("Ese numero ya lo has introducido, elige otro");
                    valores[i]= cubrir.nextInt();
                }
            }
        }
    }

    public void elimminarDatos() {
        int eliminar = cubrir.nextInt();
        if (eliminar == 1) {
            System.out.println("¿Que posicion quieres eliminar?");
            int eliminarIndice = cubrir.nextInt();
            for (int i = eliminarIndice; i < (nPlazas - 1); i++) {
                valores[i] = valores[i + 1];
            }
            System.out.println("Asi queda ahora tu array:");
            for (int i = 0; i < (nPlazas - 1); i++) {
                System.out.println(valores[i]);
            }
        }
        if (eliminar == 2) {
            System.out.println("¿Que dato quieres eliminar?");
            int eliminarDato = cubrir.nextInt();
            for (int i = eliminarDato; i < (nPlazas - 1); i++) {
                valores[i] = valores[i + 1];
            }
            System.out.println("Asi queda ahora tu array");
            for (int i = 0; i < (nPlazas - 1); i++) {
                System.out.println(valores[i]);
            }
        }
    }

    public void listarDatos() {
        System.out.println("La lista de datos es: ");
        for (int i = 0; i < nPlazas; i++) {
            System.out.println("En Posicion " + i + " numero " + valores[i] + "");
        }
    }

    public void mostrarDato() {
        System.out.println("¿Cual es la posicion del dato que quieres consultar?");
        int consultarIndice = cubrir.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if (valores[consultarIndice] == valores[i]) {
                System.out.println("En la posicion " + consultarIndice + " esta el dato " + valores[consultarIndice]);
            }
        }
    }

    public void mostrarIndice() {
        System.out.println("¿Cual es el del dato que quieres consultar para saber su posicion?");
        int consultarDato = cubrir.nextInt();
        for (int i = 0; i < valores.length; i++) {
            if (consultarDato == valores[i]) {
                System.out.println("El numero " + consultarDato + " esta en la posicion " + i);
            }
        }
    }
}
