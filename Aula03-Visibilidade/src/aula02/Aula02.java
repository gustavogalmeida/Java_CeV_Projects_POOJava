package aula02;

public class Aula02 {
    public static void main(String[] args) {
        // por padrão os atributos e metodos são publicos para pacote        
        Caneta c1 = new Caneta(); // instanciando um objeto
        c1.modelo = "bic cristal";
        // c1.ponta = 0.5f; ponta é privado
        c1.status(); // chamando um metodo 
        
    }    
}
