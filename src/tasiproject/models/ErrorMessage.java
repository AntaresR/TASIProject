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
    private boolean valid;
    private String message;
    
    public ErrorMessage(){
    }

    public ErrorMessage(boolean validity, String message) {
        this.valid = validity;
        this.message = message;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param validity the valid to set
     */
    public void setValid(boolean validity) {
        this.valid = validity;
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