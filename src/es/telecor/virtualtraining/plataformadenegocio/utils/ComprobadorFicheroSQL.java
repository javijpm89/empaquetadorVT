/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author javi
 */
public class ComprobadorFicheroSQL {

    private String dirOrigen;
    private String gestor;
    private EDbVendor motor;
    private TGSqlParser sqlparser;

    public ComprobadorFicheroSQL(String _dirOrigen, String _gestor) {
        this.dirOrigen = _dirOrigen;
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

    public boolean validateQuery(String queryToValidate) {
        sqlparser.setSqltext(queryToValidate);
        return true;
    }

}
