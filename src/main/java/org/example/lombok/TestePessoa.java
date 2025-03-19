package org.example.lombok;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaJulia = new Pessoa();
        pessoaJulia.setId(1L);
        pessoaJulia.setName("Julia");
        pessoaJulia.setIdade(27);

        System.out.println(pessoaJulia.getIdade());
        System.out.println(pessoaJulia.getName());
    }
}
