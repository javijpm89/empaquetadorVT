/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import es.telecor.virtualtraining.plataformadenegocio.model.ResultadoQuery;
import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;

/**
 *
 * @author javi
 */
public class ComprobadorFicheroSQL {

    private final String gestor;
    private EDbVendor motor;
    private final TGSqlParser sqlparser;

    public ComprobadorFicheroSQL(String _gestor) {
        
        this.gestor = _gestor;

        if (this.gestor.equals("mysql")) {
            motor = EDbVendor.dbvmysql;
        }

        if (this.gestor.equals("oracle")) {
            motor = EDbVendor.dbvoracle;
        }

        if (this.gestor.equals("sqlserver")) {
            motor = EDbVendor.dbvmssql;
        }

        sqlparser = new TGSqlParser(motor);
    }

    public ResultadoQuery validateQuery(String queryToValidate) {
        ResultadoQuery resultado = new ResultadoQuery();
        sqlparser.setSqltext(queryToValidate);
        
        resultado.setResultadoParser(sqlparser.parse());
        resultado.setErrorCount(sqlparser.getErrorCount());
        resultado.setErrorMessage(sqlparser.getErrormessage());
        
        return resultado;
    }

}
