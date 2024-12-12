package org.example;

public class Main {
    public static void main(String[] args) {


        Pet pet = new Pet("Cachorrinho");
        Brincadeira brincadeira = new Brincadeira("Pega-pega", 120, 100, 50, 25, 50);
        Alimento alimento = new Alimento("Ração", 50);
        Pessoa pessoa = new Pessoa(1234141, "Joao", "123");

        pet.beberAgua();
        System.out.println(pet.toString());

        System.out.println(pessoa.toString());
    }
}