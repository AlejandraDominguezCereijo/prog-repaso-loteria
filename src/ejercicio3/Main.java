package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);


        System.out.println("¿De que tamaño va a ser el array?");

        Arrays mandatos = new Arrays();
        int salir = 1;
        do {
            System.out.println("¿Que tarea quieres realizar? \n1 Insertar datos \n2 Eliminar datos \n3 Listar datos \n4 Mostrar dato \n5 Mostrar indice \n6 Salir");
            int tarea = cubrir.nextInt();

            switch (tarea) {
                case 1:
                    mandatos.introducirDatos();
                    break;
                case 2:
                    System.out.println("¿Como quieres eliminar los datos? \n1 Eliminar dato por posicion \n2 Eliminar dato por valor");
                    mandatos.elimminarDatos();

                    break;
                case 3:
                    mandatos.listarDatos();
                    break;
                case 4:
                    mandatos.mostrarDato();
                    break;
                case 5:
                    mandatos.mostrarIndice();
                    break;
                case 6:
                    salir = 0;
                    System.out.println("Aloha");
                    break;
            }
        } while (salir != 0);

    }
}
