package ebook_java;

public class Exercicio_01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Volkswagen Gol");
        Carro carro3 = new Carro("Chevrolet Onix", 2022);

        carro1.testarCarro();
        carro2.testarCarro();
        carro3.testarCarro();

    }
}