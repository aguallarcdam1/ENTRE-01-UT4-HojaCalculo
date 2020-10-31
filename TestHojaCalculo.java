
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Andrés Guallar Chamorro
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
        Fecha fecha1 = new Fecha(4, 10, 2020);
        Fecha fecha2 = new Fecha(5, 10, 2020);

        Fila filaVacia = new Fila("Fila3");
        Fila fila4 = new Fila("Fila4");

        HojaCalculo Hoja1 = new HojaCalculo("HOJA1");
        Hoja1.addFila("Fila1", fecha1, 25.50, 132);
        Hoja1.addFila("Fila2", fecha2, 300, 350);
        Hoja1.addFila(filaVacia);
        Hoja1.addFila(fila4);

        System.out.println();
        System.out.println(Hoja1);
        System.out.println();
        System.out.println(Hoja1.duplicarHoja());

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        Fecha fecha1 = new Fecha(7, 10, 2020);
        Fecha fecha2 = new Fecha(8, 10, 2020);

        HojaCalculo Hoja2 = new HojaCalculo("HOJA2");

        Hoja2.addFila("Fila1", fecha1, 260, 125);
        Hoja2.addFila("Fila2", fecha2, 125, 245);

        System.out.println();
        System.out.println(Hoja2);
        System.out.println();
        System.out.println(Hoja2.duplicarHoja());

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        Fecha fecha1 = new Fecha(8, 10, 2020);
        
        HojaCalculo Hoja3 = new HojaCalculo("HOJA3");
        
        Hoja3.addFila("Fila1", fecha1, 670, 234);
        
        System.out.println();
        System.out.println(Hoja3);
        System.out.println();
        System.out.println(Hoja3.duplicarHoja());

    }

}
