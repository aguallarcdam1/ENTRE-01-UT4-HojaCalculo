
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author - Andrés Guallar Chamorro
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila1 = null;
        this.fila1 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        int numeroFilas = 0;
        if (fila1 != null && fila2 != null && fila3 != null){
            numeroFilas = 3;
        }
        else if ((fila1 != null && fila2 != null) || (fila1 != null && fila3 != null) || (fila2 != null && fila3 != null)) {
            numeroFilas = 2;
        }
        else if (fila1 != null || fila2 != null || fila3 != null){
            numeroFilas = 1;
        }
        return numeroFilas;

    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if (getNumeroFilas() == 3){
            return true;
        }
        return false;

    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if (hojaCompleta()){
            System.out.println(fila.getId() + " no se puede añadir en " + this.nombre);
        }

        if (fila1 == null){
            this.fila1 = fila;
        }
        else if (fila2 == null){
            this.fila2 = fila;
        }
        else if (fila3 == null){
            this.fila3 = fila;
        }

    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        if (fila1 == null) {
            this.fila1 = new Fila(id, fecha, ingresos, gastos);
        }
        else if (fila2 == null){
            this.fila2 = new Fila(id, fecha, ingresos, gastos);
        }
        else if (fila3 == null){
            this.fila3 = new Fila(id, fecha, ingresos, gastos);
        }

        else {
            System.out.println("FilaX no se puede añadir en " + this.nombre);
        }

    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double totalIngresos = 0;
        if(fila2 == null){
            return totalIngresos = fila1.getIngresos();
        }
        else if (fila3 == null){
            return totalIngresos = fila1.getIngresos() + fila2.getIngresos();
        }
        else {
            return totalIngresos = fila1.getIngresos() + fila2.getIngresos() + fila3.getIngresos();
        }

    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double totalGastos = 0;
        if(fila2 == null){
            return totalGastos = fila1.getGastos();
        }
        else if (fila3 == null){
            return totalGastos = fila1.getGastos() + fila2.getGastos();
        }
        else {
            return totalGastos = fila1.getGastos() + fila2.getGastos() + fila3.getGastos();
        }

    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double totalBeneficio = 0;
        if(fila2 == null){
            return totalBeneficio = fila1.getBeneficio();
        }
        else if (fila3 == null){
            return totalBeneficio = fila1.getBeneficio() + fila2.getBeneficio();
        }
        else {
            return totalBeneficio = fila1.getBeneficio() + fila2.getBeneficio() + fila3.getBeneficio();
        }

    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        //Declaro variables locales para poder utilizar el String.format
        String FECHA = "";
        String INGRESOS = "";
        String GASTOS = "";
        String BENEFICIO = "";
        double ingresoT = getTotalIngresos();
        double gastoT = getTotalGastos();
        double beneficio = getBeneficio();
        
        String repreHoja = "";
        repreHoja = this.nombre + "\n";
        repreHoja += String.format("%18sFECHA %15sINGRESOS %15sGASTOS %15sBENEFICIO", FECHA, INGRESOS, GASTOS, BENEFICIO, "\n");
        if(fila2 == null){
            repreHoja += fila1.toString() + "\n";
        }
        else if(fila3 == null){
            repreHoja += fila1.toString() + fila2.toString() + "\n";
        }
        else{
            repreHoja += fila1.toString() + fila2.toString() + fila3.toString() + "\n";
        }
        repreHoja += "-----------------------------------------------------------------------\n";
        repreHoja += String.format("%18.2f€ %15.2f€ %15.2f€", ingresoT, gastoT, beneficio);

        return repreHoja;

    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {

        return null;
    }

}
