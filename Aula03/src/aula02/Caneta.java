package aula02;
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void rabiscar (){
        if (this.tampada == true){
            System.out.println("Nao e possuivel rabiscar, caneta tamapada.");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    private void tampar(){
        this.tampada=true;
    }
    
    protected void destampar(){
        this.tampada=false;
    }
    
    public void status(){
        System.out.println("Uma caneta "+ this.cor+".");
        System.out.println("Esta tampada? "+this.tampada+".");
        System.out.println("A ponta e: "+ this.ponta+".");
        System.out.println("O modelo e: "+ this.modelo+".");
        System.out.println("A carga atual e: "+ this.carga+".");
    }          
}
