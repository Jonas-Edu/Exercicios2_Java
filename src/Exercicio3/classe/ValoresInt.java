package Exercicio3.classe;

/*
3. Crie uma classe com métodos estáticos para uso em outras classes de seus
projetos. Esta Classe deve conter métodos de cálculos para valores recebidos por
parâmetros e todos os métodos criados devem ser do tipo com retorno. Crie uma
classe para testes que execute os métodos criados. Abaixo os métodos a serem
criados:
• Áreas:
• Círculo
• Retângulo
• Triângulo
• Quadrado
• Volumes:
• Cubo
• Paralelepípedo
• Esfera
• Cilindro
 */
public class ValoresInt {

     public static int calculadoraArea(){

        int base = 8;
        int altura = 10;
        int AreaRetangulo = base * altura;

        return AreaRetangulo;
     }

     public static double calculadoraCirculo(){

        double areaCirculo;
        double raio = 6;
         areaCirculo = 2 * Math.PI * raio;

         return areaCirculo;
     }

     public static double calculadoraTriangulo(){

         double areaTriangulo;
         double base = 5, altura = 10;

         areaTriangulo = (base * altura) / 2;

         return areaTriangulo;
     }

    public static int calculadoraQuadrado(){

        int base = 10;
        int altura = 10;
        int AreaQuadrado = base * altura;

        return AreaQuadrado;
    }

    public static double calculadoraCubo(){

         double lado = 10;
         double l = lado * lado;
         double volumeCubo = 6 * l;

        return volumeCubo;
    }

    public static double  calculadoraParalepepido(){

         double comprimento, largura, altura, volumePara;
         comprimento = 25;
         largura = 15;
         altura = 10;

             volumePara = comprimento * largura * altura;

          return volumePara;
    }

    public static double calculadoraEsferica(){

         double PI = 3.14159;
         double raio = 10;

         double volumeesfera = (4/3.0) * PI * Math.pow(raio,3);

        return volumeesfera;
    }

    public static double calculadoraCilindro(){

         double PI = 3.14159;
         double raio = 8;
         double altura = 100;

         double volumeCilindro = PI * Math.pow(raio,2);

         return volumeCilindro;
    }
}
