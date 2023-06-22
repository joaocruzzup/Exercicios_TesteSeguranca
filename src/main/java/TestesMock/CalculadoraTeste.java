package TestesMock;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculadoraTeste {
    @Test
    public void multiplicarDoiNumerosJUNIT(){
        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicar(10, 5);
        Assert.assertEquals(50, multiplicacao);
    }
    @Test
    public void multiplicarDoisNumeros(){
        Calculadora calculadoraMock = Mockito.mock(Calculadora.class);
        Mockito.when(calculadoraMock.multiplicar(5, 2)).thenReturn(10);
        int multiplicacao = calculadoraMock.multiplicar(5, 2);
        Assert.assertEquals(10, multiplicacao);

    }

}
