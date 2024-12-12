package org.example;

import java.util.ArrayList;

public class Banco {

    private static ArrayList<Alimento> alimentos = new ArrayList<>();
    private static ArrayList<Brincadeira> brincadeiras = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Banco(Alimento alimento, Brincadeira brincadeira) {
        brincadeiras.add(brincadeira);
        alimentos.add(alimento);
    }

    public static void cadastrarPet(Pet pet){
        pets.add(pet);
    }

    public static void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public static void removerPet(Pet pet){
        pets.remove(pet);
    }

    public static void removerPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public static Alimento procurarAlimento(int codigo){
        for (Alimento alimento : alimentos){
            if (alimento.getCodigo() == codigo){
                return alimento;
            }
        }
        return null;
    }

    public static Brincadeira procurarBrincadeira(int codigo){
        for (Brincadeira brincadeira : brincadeiras){
            if (brincadeira.getCodigo() == codigo){
                return brincadeira;
            }
        }
        return null;
    }

    public static Pet procurarPet(int codigo){
        for (Pet pet : pets){
           if (pet.getCodigo()==codigo){
               return pet;
           }
       }
        return null;
    }

    public static Pessoa procurarPessoa(long cpf){
        for (Pessoa pessoa : pessoas){
            if (pessoa.getCpf() == cpf){
                return pessoa;
            }
        }
        return null;
    }

    public static ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public static ArrayList<Brincadeira> getBrincadeiras() {
        return brincadeiras;
    }

    public static ArrayList<Pet> getPets() {
        return pets;
    }

    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public static Pessoa login(long cpf, String senha){
        for (Pessoa pessoa : pessoas){
            if (pessoa.getSenha().equals(senha) && pessoa.getCpf()==cpf){
                return pessoa;
            }
        }
        return null;
    }
}
