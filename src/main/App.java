package main;

import main.utils.Celular;

public class App {
  
    public static void main(String[] args) {
      Celular aparelho = new Celular();
      aparelho.marca = "Samsung";
      System.out.println(aparelho.marca);
    }
}
