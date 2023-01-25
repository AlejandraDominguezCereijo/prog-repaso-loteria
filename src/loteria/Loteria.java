package loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    String numero, reintegro, boletoGanador, boletoManual, boletoAleatorio, comprobacion,
            numeroManual, reintegroManual, numeroAleatorio, reintegroAleatorio;
    //private loteria.Loteria[] sorteo;
    Scanner cubrir = new Scanner(System.in);

    public String getBoletoGanador() {
        return boletoGanador;
    }

    public void setBoletoGanador(String boletoGanador) {
        this.boletoGanador = boletoGanador;
    }

    public String getBoletoManual() {
        return boletoManual;
    }

    public void setBoletoManual(String boletoManual) {
        this.boletoManual = boletoManual;
    }

    public String getBoletoAleatorio() {
        return boletoAleatorio;
    }

    public void setBoletoAleatorio(String boletoAleatorio) {
        this.boletoAleatorio = boletoAleatorio;
    }

    public String crearBoletoAleatorio(int manualAleatorio) {
        if (manualAleatorio == 1) {
            Random al = new Random();
            int numeroAleatorio = al.nextInt(59) + 0;
            Random ale = new Random();
            int reintegroAleatorio = ale.nextInt(9) + 0;
            boletoAleatorio = "Tu numero es el " + numeroAleatorio + ",con reintegro " + reintegroAleatorio;
            System.out.println("Tu numero es el " + numeroAleatorio + ",con reintegro " + reintegroAleatorio);
        }
        return boletoAleatorio;
    }

    public String crearBoletoManual(int manualAleatorio) {
        if (manualAleatorio == 2) {
            Scanner cubrir = new Scanner(System.in);
            System.out.println("Mi numero es: ");
            String numeroManual = cubrir.nextLine();
            System.out.println("Mi reintegro es: ");
            String reintegroManual = cubrir.nextLine();
            boletoManual = "Tu numero es el " + numeroManual + ",con reintegro " + reintegroManual;
            System.out.println("Tu numero es el " + numeroManual + ",con reintegro " + reintegroManual);
        }
        return boletoManual;
    }


    /*public String toString(){
    return "El numero ganador es el"+numero+",con reintegro"+reintegro;
    }*/
    public String boletoPremiado() {
        Random al = new Random();
        int numero = al.nextInt(59) + 0;
        Random ale = new Random();
        int reintegro = ale.nextInt(9) + 0;
        boletoGanador = "Tu numero es el " + numero + ",con reintegro " + reintegro;
        return boletoGanador;
    }

    public String comprobarBoleto(int comprobar) {
        if (comprobar == 1) {
            if (numero==numeroManual) {
                System.out.println("Enhorabuena, " + boletoGanador + ",has ganado");
            }else {
                System.out.println("No has ganado "+boletoGanador);
            }

            /*if (boletoGanador == boletoManual) {
                System.out.println("Enhorabuena el boleto premiado era el, " + boletoGanador + ",has ganado");
            }*/
        } else {
            System.out.println("De acuerdo");
        }
        return comprobacion;
    }
}

