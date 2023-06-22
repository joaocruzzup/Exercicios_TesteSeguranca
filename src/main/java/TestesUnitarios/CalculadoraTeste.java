package TestesUnitarios;

public class CalculadoraTeste {

    private Calculadora nossaCalculadora;

    public void testarCalculadoraMultiplica(){

        nossaCalculadora = new Calculadora();
        int resultadoEsperado = 21;

        int resultado = nossaCalculadora.multiplicar(3, 7);

        if (resultado == resultadoEsperado) {
            System.out.println("Tudo certo por aqui! Teste okay.");
        } else {
            System.out.println("Ops... O teste falhou!");
        }

    }

}
