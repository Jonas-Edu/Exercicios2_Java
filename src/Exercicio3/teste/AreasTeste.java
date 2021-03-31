package Exercicio3.teste;

import Exercicio3.classe.ValoresInt;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreasTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ValoresInt valores =  new ValoresInt();
        System.out.println("Total da area do retangulo: "+valores.calculadoraArea());

        ValoresInt valores2 = new ValoresInt();
        System.out.println("Total da area do circulo: " +valores2.calculadoraCirculo());

        ValoresInt valores3 = new ValoresInt();
        System.out.println("Total da area do Triangulo: "+valores3.calculadoraTriangulo());

        ValoresInt valores4 = new ValoresInt();
        System.out.println("Total da area de um Quadrado: "+valores4.calculadoraQuadrado());

        ValoresInt valores5 = new ValoresInt();
        System.out.println("Total do Volume do Cubo: "+valores5.calculadoraCubo());

        ValoresInt valores6 = new ValoresInt();
        System.out.println("Total do Volume do Paralelepipedo: "+valores6.calculadoraParalepepido());

        ValoresInt valores7 = new ValoresInt();
        System.out.println("Total do Volume Esferico: "+valores7.calculadoraParalepepido());

        ValoresInt valores8 = new ValoresInt();
        System.out.println("Total do Volume do Cilindro: "+valores8.calculadoraCilindro());







    }

}
