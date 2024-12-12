package org.example;

public class Pessoa {

    private long cpf;
    private String nome;
    private String senha;
    private Pet pet;

    public Pessoa(long cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void botaPetParaDormir(){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.dormir();
    }

    public void acordarPet(){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.acordar();
    }

    public void adotarPet(Pet pet){
        this.pet = pet;
    }

    public void darAguaParaPet(){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.beberAgua();
    }

    public void brincarComPet(Brincadeira brincadeira){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.brincar(brincadeira);
    }

    public void alimentarPet(Alimento alimento){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.comer(alimento);
    }

    public void levarPetParaFazerNecessidades(){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.fazerNecessidades();
    }

    public void limparPet(){
        if (avaliarPet().equals("Sem pet")){
            System.out.println("Não pode realizar a acao");
        }
        pet.limpar();
    }

    public String avaliarPet(){
        if(this.pet==null){
            return "Sem pet";
        }
        return "Pet associado a " + getNome() ;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf +
                "\nNome: " + nome +
                "\nPet: " + pet ;
    }
}
