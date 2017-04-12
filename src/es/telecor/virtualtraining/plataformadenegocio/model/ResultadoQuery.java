/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.model;

/**
 *
 * @author javi
 */
public class ResultadoQuery {
    
    private int resultadoParser;
    private String errorMessage;
    private int errorCount;
    
    public ResultadoQuery(){}

    /**
     * @return the resultadoParser
     */
    public int getResultadoParser() {
        return resultadoParser;
    }

    /**
     * @param resultadoParser the resultadoParser to set
     */
    public void setResultadoParser(int resultadoParser) {
        this.resultadoParser = resultadoParser;
    }

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return the errorCount
     */
    public int getErrorCount() {
        return errorCount;
    }

    /**
     * @param errorCount the errorCount to set
     */
    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    
    
    
}
