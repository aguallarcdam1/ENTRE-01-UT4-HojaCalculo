
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - Andrés Guallar Chamorro
 *  
 */
public class Fila
{
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;

    /**
     * Constructor  
     */
    public Fila(String id)    {
        this.id = id;
        ingresos = 0;
        gastos = 0;
        this.fecha = new Fecha(1,1,2020);

    }

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos)    {
        this.id = id;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.fecha = fecha;   

    }

    /**
     * accesor para el id de la fila
     */
    public String getId() {
        return this.id;

    }

    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        return this.fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return this.ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return this.gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        return this.ingresos - this.gastos;

    }

    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
      Fecha copiaFecha = this.fecha.obtenerCopia();
      Fila duplicada = new Fila(this.id, copiaFecha, this.ingresos, this.gastos);
      return duplicada;
       

    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() {
        double beneficio = getBeneficio();
        String lineaFormateada = String.format("%8s",id);
        lineaFormateada += String.format("%15s",fecha);
        lineaFormateada += String.format("%15.2f€",ingresos);
        lineaFormateada += String.format("%15.2f€",gastos);        
        if(beneficio < 0){
            return lineaFormateada += String.format("%+15.2f€",beneficio);     
        }
        lineaFormateada += String.format("%15.2f€",beneficio);
        return lineaFormateada;

    }

}
