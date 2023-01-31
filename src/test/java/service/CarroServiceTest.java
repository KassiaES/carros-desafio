package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceTest {

    @Test
    public void deveAcelerarCorretamente() {

        // Dado
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        carroService.ligar(carro);

        // When
        carroService.acelerar(carro,10);

        // Then
        Assert.assertEquals(10,carro.getVelocidadeAtual());
    }

    @Test
    public void naoDevePassarDaVelocidadeMaxima() {

        // Dado
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 100);
        carroService.ligar(carro);

        // When
        carroService.acelerar(carro,100);
        carroService.acelerar(carro,100);

        // Then
        Assert.assertEquals(100,carro.getVelocidadeAtual());
    }

    @Test
    public void umCarroDeveIniciarDesligao() {

        // Dado
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 100);


        // Then
        Assert.assertFalse(carro.isLigado());
    }


}
