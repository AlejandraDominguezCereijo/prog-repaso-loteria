package ejercicio1;

public class Main {
    public static void main(String[] args) {
ej1 pruebas=new ej1();
pruebas.mostrar1();

pruebas.mostrar2();
        pruebas.setDatos1(pruebas.getDatos1()+25);//aqui modificamos el valor de datos1, primero ponemos el set que es con el cual modificamos,
        // dentro de los parentesis llamamos al get (que es el que guarda el valor) y añadimos el nuevo valor que queremos darle,
        // en este caso sumamos 25 al valor de get
        System.out.println(pruebas.getDatos1());
        System.out.println(pruebas.getDatos2());

    }
}
