package elaprendiz;

import elaprendiz.bdmodel.GenericModel;
import java.sql.ResultSet;
import java.util.List;
import prykualiatl.bd_manager;

/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public abstract class AbstractController<mdl extends GenericModel> {
    public bd_manager dbManager;
    public ResultSet rs;
    public String sql;
    
     public bd_manager getDbManager() {
        return dbManager;
    }

    public void setDbManager(bd_manager dbManager) {
        this.dbManager = dbManager;
    }
    
     public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
    public abstract boolean getDatos()throws Exception;
    public abstract List getRegistros()throws Exception;
    public abstract void guardarRegistro(mdl model)throws Exception;
    public abstract void actualizarRegistro(mdl model)throws Exception;
    public abstract void eliminarRegistro(mdl model)throws Exception;
    //public abstract mdl getRegistro(Integer code)throws Exception;
    
}
