package elaprendiz.bdmodel;

import elaprendiz.EncriptadorPassword;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author El APRENDIZ www.elaprendiz.net63.net
 */
public class GenericModel {
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    private Date fechaString;
    private final static String PASSNAME = "elaprendiz"; //no cambiar
    private static EncriptadorPassword ep;
    public String getFechaFormateada(Date fecha)
    {
        return formato.format((Date)fecha);
    }
    
    public Date stringToDate(String text)
    {        
        try {
            fechaString=(Date)formato.parseObject(text);
        } catch (ParseException ex) {}
        return fechaString;
    }
    
    public static String encriptarPassword(String pass)
    {
         ep = new EncriptadorPassword(PASSNAME);
         String encrypted = ep.encrypt(pass);
         return  encrypted;
    }
    
    public static String desEncriptarPassword(String pass)
    {
          ep = new EncriptadorPassword(PASSNAME);           
          String desEncrypted  = ep.decrypt(pass);
          return  desEncrypted;
    }
}
