package com.mycompany.pp1;

class Livro {

    private final String tituloLivro;
    private final String autorLivro;
    
    Livro(String tituloLivro, String autorLivro) {
        
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
       
    }
    
    public String getNome() {
        return tituloLivro;
        }

    public String getAutor() {
        return autorLivro;
    }

    }

    
   
