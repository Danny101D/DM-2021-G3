paquete  pe.edu.upeu ;

importar  junit.framework.Test ;
import  junit.framework.TestCase ;
import  junit.framework.TestSuite ;

/ **
 * Prueba unitaria para una aplicación simple.
 * /
público  de clase  AppTest 
    extiende  TestCase
{
    / **
     * Crea el caso de prueba
     *
     * @param testName nombre del caso de prueba
     * /
    pública  AppTest ( Cadena  testName )
    {
        super (nombre de prueba);
    }

    / **
     * @return el conjunto de pruebas que se están probando
     * /
     Conjunto de pruebas estáticas  públicas () 
    {
        return  new  TestSuite ( clase AppTest . );
    }

    / **
     * Prueba rigurosa :-)
     * /
     testApp público vacío  ()
    {
        asertTrue ( verdadero );
    }
}