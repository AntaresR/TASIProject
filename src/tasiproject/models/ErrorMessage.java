/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.models;

/**
 * @author paolo
 */
public class ErrorMessage {
    private boolean validity;
    private String message;
    
    public ErrorMessage(){
    }

    public ErrorMessage(boolean validity, String message) {
        this.validity = validity;
        this.message = message;
    }

    /**
     * @return the validity
     */
    public boolean isValidity() {
        return validity;
    }

    /**
     * @param validity the validity to set
     */
    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}