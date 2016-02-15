package Util;

import org.joda.time.DateTime;

/**
 *
 * @author Dane
 */
public class DataFormato {
     public static String formatarDataParaExibicao(DateTime data){
        StringBuilder dataFormatada = new StringBuilder();
        dataFormatada.append(String.valueOf(dateToDateTime(data).getDayOfMonth()));
        dataFormatada.append("/");
        dataFormatada.append(String.valueOf(dateToDateTime(data).getMonthOfYear()));
        dataFormatada.append("/");
        dataFormatada.append(String.valueOf(dateToDateTime(data).getYear()));
        dataFormatada.append(" - ");
        dataFormatada.append(String.valueOf(dateToDateTime(data).getHourOfDay()));
        dataFormatada.append(":");
        dataFormatada.append(String.valueOf(dateToDateTime(data).getMinuteOfHour()));
        
        return dataFormatada.toString();
    }
    
    public static String getDateFormatyyyyMMddHHmm(DateTime data) {
        if(data == null)
            return "";
        DateTime dateTime = new DateTime(data);
        return ""+dateTime.getYear() + "-"
                +zeroNaFrenteQuandoMenor10(dateTime.getMonthOfYear()) 
                + "-" + zeroNaFrenteQuandoMenor10(dateTime.getDayOfMonth())
                +" "+zeroNaFrenteQuandoMenor10(dateTime.getHourOfDay())
                +":"+zeroNaFrenteQuandoMenor10(dateTime.getMinuteOfHour())
                +":"+zeroNaFrenteQuandoMenor10(dateTime.getSecondOfMinute());
    }
    
    private static DateTime dateToDateTime(DateTime date){
        return new DateTime(date);
    }
    
    public static String zeroNaFrenteQuandoMenor10(Integer num) {
        String numero = num.toString();
        if(num<10) {
            numero = "0" + num;
        }
        return numero;
    }
}
