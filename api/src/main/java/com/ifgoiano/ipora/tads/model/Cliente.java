package com.ifgoiano.ipora.tads.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by 2898807 on 22/11/2016.
 */
@Document
public class Cliente {


    @Id
    private String id;
    private String  codigo;
    private String nome;
    private String apelido;
    private String codUniIdent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCodUniIdent() {
        return codUniIdent;
    }

    public void setCodUniIdent(String codUniIdent) {
        this.codUniIdent = codUniIdent;
    }
}
