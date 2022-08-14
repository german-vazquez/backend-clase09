package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloFactoryTest {
    @Test
    public void triangulosRojosTest(){
        Triangulo triangulo1=TrianguloFactory.obtenerTriangulo("rojo",2);
        Triangulo triangulo2=TrianguloFactory.obtenerTriangulo("rojo",4);

        assertEquals(4,triangulo2.getTamano()); //como la clave es el color, en triangulo2 se muestra el primer triangulo con clave "rojo", por tal motivo, el tamaño será el del primer objeto.

    }

}