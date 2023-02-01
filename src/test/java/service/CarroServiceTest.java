package service;

import model.Carro;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroServiceTest {

    // O carro inicia desligado
    @Test
    public void umCarroDeveIniciarDesligado() {

        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 100);

        // Then
        Assert.assertFalse(carro.isLigado());
    }

    //  Enquanto o carro estiver desligado deve ser capaz de: - Ligar
    @Test
    public void carroDesligadoDeveLigar() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.ligar(carro);
        // Then
        Assert.assertTrue(carro.isLigado());
    }

    //  Enquanto o carro estiver desligado deve ser capaz de: - Mostrar estado atual
    @Test
    public void carroDesligadoDeveMostrarEstadoAtual() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.desligar(carro);
        // Then
        Assert.assertEquals(0,carro.getVelocidadeAtual());
    }

    //Enquanto o carro estiver ligado deve ser capaz de: - Desligar
    @Test
    public void carroLigadoDeveDesligar() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        carroService.ligar(carro);
        // When
        carroService.desligar(carro);
        // Then
        Assert.assertFalse(carro.isLigado());
    }

    //Enquanto o carro estiver ligado deve ser capaz de: - Acelerar
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

    // O carro não pode passar de sua velocidade máxima
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

    // Só podemos realizar a ação de acelerar com o carro ligado
    @Test
    public void naoDeveAcelerarDesligado() {

        // Dado
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);

        // When
        carroService.acelerar(carro,10);

        // Then
        Assert.assertEquals(0,carro.getVelocidadeAtual());
    }

    // Enquanto o carro estiver ligado deve ser capaz de: - Frear
    // Enquanto o carro estiver ligado deve ser capaz de: - Mostrar o Estado Atual
    // Só podemos realizar a ação de acelerar com o carro ligado
    // Não existe velocidade negativa
    // Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)





}
