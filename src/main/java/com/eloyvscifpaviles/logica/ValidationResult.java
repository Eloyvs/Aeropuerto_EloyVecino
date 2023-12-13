/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

/**
 *
 * @author eloyv
 */
public class ValidationResult {
    private boolean valid = false;
    private String validationErrorMessage = "";
    
    public ValidationResult(boolean valid, String validationErrorMessage){
        this.valid = valid;
        this.validationErrorMessage = validationErrorMessage;
    }
    
    public boolean isValid(){
        return valid;
    }
}
