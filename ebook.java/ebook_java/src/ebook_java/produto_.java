package ebook_java;

public class produto_ {
//Atributos
    String nome;
    String marca;
    Float valor;

    //Construtores
    produto_(){
    }

    produto_(String nome) {
        this.nome=nome;
    }

    produto_(String nome,String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    produto_(String nome,String marca,Float valor) {
        this.nome=nome;
        this.marca=marca;
        this.valor=valor;
    }


}
