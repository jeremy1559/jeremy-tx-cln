package com.codingapi.tx.datasource.relational.txc.parser;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLObject;

/**
 * @author jsy.
 * 
 *  17/12/15.
 */
public class SqlUtils {

    @SuppressWarnings("unused")
	private static final String dbType = "mysql";

    public static String toSQLString(SQLObject sqlObject) {
        return SQLUtils.toSQLString(sqlObject);
    }
}
