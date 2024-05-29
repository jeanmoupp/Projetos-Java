package com.mycompany.pp1;

class Estudante {

    private final String nomeEstudante;
    private final int matriculaEstudante;

    Estudante(String nomeEstudante, int matriculaEstudante) {
        
        this.nomeEstudante = nomeEstudante;
        this.matriculaEstudante = matriculaEstudante;
          
    }

    public String getNome() {
        return nomeEstudante;
    }

    public double getMatricula() {
        return matriculaEstudante;
    }

    }

    

