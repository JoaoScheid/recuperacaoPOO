package org.example;

public class Pet {

    private static int geradorCodigo =1;
    private int codigo;
    private String nome;
    private boolean vivo;
    private boolean acordado;
    private int sede;
    private int fome;
    private int energia;
    private int diversao;
    private int higiene;
    private int vontadeBanheiro;

    public Pet(String nome) {
        this.codigo = geradorCodigo++;
        this.nome = nome;
        this.vivo = true;
        this.acordado = true;
        this.sede = 100;
        this.vontadeBanheiro=100;
        this.fome=100;
        this.energia = 100;
        this.diversao = 100;
        this.higiene =100;
    }

    public void beberAgua(){
        if (this.vivo){
        this.sede +=50;
        this.vontadeBanheiro -=25;
        limitador();
        if (this.vontadeBanheiro == 0){
            this.higiene=0;
        }
        }
        System.out.println("Pet esta morto");
    }

    public int getCodigo() {
        return codigo;
    }

    public void comer(Alimento alimento){
        if (this.vivo){
        if (alimento.getNutricao() >= 0 && alimento.getNutricao()<=50){
            this.fome += 30;
            limitador();
        } else if (alimento.getNutricao()>50 && alimento.getNutricao()<=100) {
            this.fome+=50;
            limitador();
        }
        int metadeNutricao = alimento.getNutricao()/2;
        this.vontadeBanheiro -= metadeNutricao;
            limitador();
        if (this.vontadeBanheiro == 0){
            this.higiene=0;
            this.vontadeBanheiro = 100;
        }
        }
        System.out.println("Pet esta morto");
    }

    public void dormir(){
        if (this.vivo) {
            this.acordado = false;
            this.energia += 25;
            limitador();
        }

    }

    public void acordar(){
        if (this.vivo) {
            this.acordado = true;
            this.energia += 25;
            limitador();
        }
    }

    public void brincar(Brincadeira brincadeira){
            this.diversao += brincadeira.getDivertimento();
            this.energia -= brincadeira.getCansaco();
            this.fome -= brincadeira.getFome();
            this.sede -= brincadeira.getSede();
            this.higiene -= brincadeira.getSujeira();
             limitador();
            morrer();
    }

    public void limpar(){
        if (this.vivo){
            this.higiene +=50;
            limitador();
        }
        System.out.println("O pet esta morto");
    }

    public void fazerNecessidades(){
        if (this.vivo){
        this.vontadeBanheiro+=100;
        this.higiene -=25;
        limitador();
        }
        System.out.println("O pet esta morto");
    }

    public void morrer(){
        if (this.sede ==0 || this.fome ==0 || this.energia ==0){
            this.vivo = false ;
            System.out.println("O pet morreu");
        }
    }


    public void limitador(){
        if (this.sede>100){
            this.sede=100;
        } else if (this.sede <0) {
            this.sede=0;
        }

        if (this.fome>100){
            this.fome=100;
        } else if (this.fome <0) {
            this.fome=0;
        }

        if (this.energia>100){
            this.energia=100;
        } else if (this.energia <0) {
            this.sede=0;
        }

        if (this.diversao>100){
            this.diversao= 100;
        } else if (this.diversao <0) {
            this.diversao=0;
        }

        if (this.higiene>100){
            this.higiene=100;
        } else if (this.higiene <0) {
            this.higiene=0;
        }

        if (this.vontadeBanheiro>100){
            this.energia=100;
        } else if (this.energia <0) {
            this.vontadeBanheiro=0;
        }
    }

    public String vivoSim(){
        if (this.vivo){
            return "Sim";
        }else{
            return"Não";
        }
    }

    public String acordadoSim(){
        if (this.acordado){
            return "Sim";
        }else{
            return"Não";
        }
    }
    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nVivo: " + vivoSim() +
                "\nAcordado: " + acordadoSim() +
                "\nSede: " + sede +
                "\nFome: " + fome +
                "\nEnergia: " + energia +
                "\nDiversão: " + diversao +
                "\nHigiene: " + higiene +
                "\nVontade de ir ao banheiro: " + vontadeBanheiro +"\n";
    }
}
