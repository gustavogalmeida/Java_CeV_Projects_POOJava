package aula04;

public class Caneta {
    // atributos 
    private String modelo; // atributo privado
    private float ponta; // atributo privado
    private boolean tampada;
    private String cor;
    
    // Metodo construtor
    public Caneta(float cPonta, String cCor, String cModelo){ // o metodo tem que ter o nome da classe
        this.ponta = cPonta;
        this.modelo = cModelo;
        this.cor = cCor;
        this.tampar();
        this.cor = "Azul";
    }
    
    // getters e setters para atributos
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public float setPonta(float p){
        return this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public String setCor(String c){
        return this.cor = c;
    }
    
    // metodos
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    // status
    public void status (){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta tampada: " + this.tampada);
    }
}
