package com.mycompany.pp1;

import java.util.Scanner;

public class ClassPP1 {
 
    //public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        Produto produto = new Produto(nomeProduto, precoProduto);
        System.out.println("Produto criado: " + produto.getNome() + " - R$" + produto.getPreco());

        System.out.println("Digite o nome do estudante:");
        scanner.nextLine(); 
        String nomeEstudante = scanner.nextLine();
        System.out.println("Digite a matrícula do estudante:");
        int matriculaEstudante = scanner.nextInt();

        Estudante estudante = new Estudante(nomeEstudante, matriculaEstudante);
        System.out.println("Estudante criado: " + estudante.getNome() + " - Matrícula: " + estudante.getMatricula());

        System.out.println("Digite o titulo do livro:");
        scanner.nextLine(); 
        String tituloLivro = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autorLivro = scanner.nextLine();

        Livro livro = new Livro(tituloLivro, autorLivro);
        
    scanner.close();
}
//    }
}