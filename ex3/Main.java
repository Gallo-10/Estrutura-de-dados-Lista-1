public class Main {
    public static void main(String[] args) {

      Carro carro1 = new Carro("Subaru","Impreza - Wrx - Aut.", 2005, 4);
      Carro carro2 = new Carro("BMW","320i - Tjet - Man.", 2010, 4);
      Carro carro3 = new Carro("Mazda","RX-7 - Coupe - Man.", 1993, 2);

      System.out.println("\n\n\n Dados dos carros na garagem: \n");

      System.out.println(carro1.dadosCarro());
      System.out.println(carro2.dadosCarro());
      System.out.println(carro3.dadosCarro());
    }
}


