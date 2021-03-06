/*
 * 
 */

package br.ufop.web.academico.model;

import java.io.Serializable;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 * 
 */

public class Aluno implements Serializable, InterfaceModel {
    
    private int id = 0;
    private String nome = "";
    private Cidade cidade = new Cidade();

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTable() {
        return "alunos";
    }

}
