/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doacao;

import java.io.File;

/**
 *
 * @author aluno
 */
public class reacao {

    /**
     * @return the cod_usuario
     */
    public int getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the cod_postagem
     */
    public File getCod_postagem() {
        return cod_postagem;
    }

    /**
     * @param cod_postagem the cod_postagem to set
     */
    public void setCod_postagem(File cod_postagem) {
        this.cod_postagem = cod_postagem;
    }

    /**
     * @return the concordo
     */
    public String getConcordo() {
        return concordo;
    }

    /**
     * @param concordo the concordo to set
     */
    public void setConcordo(String concordo) {
        this.concordo = concordo;
    }
    private int cod_usuario;
    private File cod_postagem;
    private String concordo;
    
}
