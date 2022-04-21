package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // instanciando um objeto
        c1.cor="Azul"; // mudando atributo do objeto c1
        c1.ponta = 0.5f; // mudando atributo do objeto c1
        c1.tampada=true; // mudando atributo do objeto c1
        c1.status(); // chamando um metodo
        c1.destampar();
        c1.rabiscar();
    }
    
}
