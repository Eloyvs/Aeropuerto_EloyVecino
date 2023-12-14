/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

/**
 *
 * @author eloyv
 */
public class AemetRequest {
    private String token;
    private String codMunicipio;

    public AemetRequest(String token, String codMunicipio) {
        this.token = token;
        this.codMunicipio = codMunicipio;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }
    
    
}
