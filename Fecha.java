
/**
 *  Modela una fecha
 *  
 *  @author - Andrés Guallar Chamorro
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int año;

    /**
     * constructor  
     */
    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }   

    /**
     * accesor para  el día   
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * accesor para  el mes 
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * accesor para  el año  
     */
    public int getAño()
    {
        return año;
    }

    /**
     * mutador para el dia
     */
    public void setDia(int dia)
    {
        this.dia = dia;
    }

    /**
     * mutador para el mes
     */
    public void setMes(int mes)
    {
        this.mes = mes;
    }

    /**
     * mutador para el año
     */
    public void setAño(int año)
    {
        this.año = año;
    }


    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Fecha obtenerCopia() {
         Fecha copia = new Fecha(this.dia, this.mes, this.año);
         return copia;

    }

    /**
     * 
     */
    public String toString() {
        return this.dia + "/"  + this.mes+ "/" + this.año;

    }

    

}
