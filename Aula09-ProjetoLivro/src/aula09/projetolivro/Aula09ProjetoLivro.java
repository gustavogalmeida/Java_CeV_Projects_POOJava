package aula09.projetolivro;

public class Aula09ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] arrayPessoa = new Pessoa[2];
        Livro[] arrayLivro = new Livro[3];
        
        arrayPessoa[0] = new Pessoa("Gustavo", 21, "Masculino");
        arrayPessoa[1] = new Pessoa("Ana Julia", 22, "Feminino");
        
        arrayLivro[0] = new Livro("A culpa eh das estrelas", "alguem", 300, arrayPessoa[1]);
        arrayLivro[1] = new Livro("Java para iniciantes", "alguem2", 700, arrayPessoa[0]);
        arrayLivro[2] = new Livro("Python", "algeum3", 800, arrayPessoa[0]);
        
        arrayLivro[1].abrir();
        arrayLivro[1].folhear(900);
        System.out.println(arrayLivro[1].detalhesToString());
        
        arrayLivro[0].abrir();
        arrayLivro[0].folhear(100);
        arrayLivro[0].avancarPag();
        System.out.println(arrayLivro[0].detalhesToString());
    }
}
