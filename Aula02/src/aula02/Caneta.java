package aula02;
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar (){
        if (this.tampada == true){
            System.out.println("Nao e possuivel rabiscar, caneta tamapada.");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar(){
        this.tampada=true;
    }
    
    void destampar(){
        this.tampada=false;
    }
    
    void status(){
        System.out.println("Uma caneta "+ this.cor+".");
        System.out.println("Esta tampada? "+this.tampada+".");
        System.out.println("A ponta e: "+ this.ponta+".");
        System.out.println("O modelo e: "+ this.modelo+".");
        System.out.println("A carga atual e: "+ this.carga+".");
    }          
}
