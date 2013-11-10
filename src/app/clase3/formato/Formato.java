/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author alumno
 */
public class Formato {

    public static void main(String[] args) {
        Formato.numberFormat();
        Formato.monedaformat();
        Formato.gregoriancalendar();
        Formato.dateFormat();
        Formato.simpleDateFormat();
        Formato.compararFechas();
    }

    public static void compararFechas() {
        Calendar c1 = new GregorianCalendar(2011, 9, 1);
        Date fecha1 = c1.getTime();
        
        Calendar c2 = new GregorianCalendar(2011, 9, 3);
        Date fecha2 = c2.getTime();
        
        if (fecha1.after(fecha2)) {
            System.out.println("fecha1 es después que fecha2");
        }
        if (fecha1.before(fecha2)) {
            System.out.println("fecha1 es antes que fecha2");
        }
        //con el equals compara si las fechas son iguales
    }

    public static void simpleDateFormat() {
        DateFormat df = new SimpleDateFormat("E d MMMM");
        Date now = new Date();
        System.out.println(df.format(now));
    }

    public static void dateFormat() {
        Date now = new Date();
        System.out.println(now.getTime());
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        //   SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");

        // DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);

        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));
        System.out.println(df6.format(now));
        //System.out.println("(Default) Hoy es " + s);     

    }

    public static void gregoriancalendar() {
        // Crear una fecha
        //GregorianCalendar ahora = new GregorianCalendar(); toma de 0 a 11
        // permite acceder a los detalles de una fecha
        GregorianCalendar ahora = new GregorianCalendar(2013, 11, 9);

//Calendar ahora = new GregorianCalendar(2007,2,2); el medio es el mes
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
//
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
//
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
    }

    public static void monedaformat() {
        NumberFormat formatoAleman = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatoAleman.setGroupingUsed(false);

        NumberFormat formatoAmericano = NumberFormat.getCurrencyInstance(Locale.US);
        formatoAmericano.setGroupingUsed(false);
//PEru no esta definido, por lo q hay definirlo manualmente
        Locale localeperu = new Locale("es", "PE");
        NumberFormat formatoperu = NumberFormat.getCurrencyInstance(localeperu);
        formatoperu.setGroupingUsed(false);

        System.out.println("Moneda Euro :" + formatoAleman.format(150));
        System.out.println("Moneda Dolar :" + formatoAmericano.format(150));
        System.out.println("Moneda Soles :" + formatoperu.format(150));


    }

    public static void numberFormat() {
// Agrupado  true
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
//sin agrupar false
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));

        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));

        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));

        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));

        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));

    }
}
