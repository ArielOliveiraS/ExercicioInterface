package br.digitalhouse.aulainterface;

import javax.tools.Diagnostic;

public class Principal {

    public static void main(String[] args) {
        Cachorro novoCachorro = new Cachorro("Golden");
        novoCachorro.animalSaudavel("deu bom");


        novoCachorro.setIdade(10);
        int idadeAnimal = novoCachorro.calculoIdadeAnimal(90);
        System.out.println("A idade do cachorro é " + idadeAnimal);
    }

}
