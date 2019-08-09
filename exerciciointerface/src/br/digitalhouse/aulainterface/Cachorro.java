package br.digitalhouse.aulainterface;

public class Cachorro extends Animal implements Saudavel{

    public Cachorro(String novaRaca){
        super(novaRaca);

    }



    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico != null && diagnostico != "") {
            System.out.println("O animal está com o seguinte diagnostico:  " + diagnostico);
            return true;
        }else{
            System.out.println("O animal não tem diagnostico");
            return false;
        }

    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {

    }
}
