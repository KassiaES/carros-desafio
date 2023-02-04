package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroServiceTest {

    CarroService carroService;
    @Before
    public void setup() {
        CarroService carroService = new CarroServiceImpl();
    }

    // O carro inicia desligado
    @Test
    public void umCarroDeveIniciarDesligado() {
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 100);
        // Then
        Assert.assertFalse(carro.isLigado());
    }

    //  Enquanto o carro estiver desligado deve ser capaz de: - Ligar
    @Test
    public void carroDesligadoDeveLigarCorretamente() {
        CarroService carroService = new CarroServiceImpl();
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.ligar(carro);
        // Then
        Assert.assertTrue(carro.isLigado());
    }

    //  Enquanto o carro estiver desligado deve ser capaz de: - Mostrar estado atual
    @Test
    public void carroDesligadoDeveMostrarEstadoAtual() {
        CarroService carroService = new CarroServiceImpl();
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.desligar(carro);
        // Then
        Assert.assertFalse(carro.isLigado());
        Assert.assertEquals(0,carro.getVelocidadeAtual());
        carroService.estadoAtual(carro);
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
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        carroService.ligar(carro);
        // When
        carroService.acelerar(carro,10);
        // Then
        Assert.assertEquals(10,carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamenteEAcelerarCorretamente() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro celtinha = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);
        // When
        carroService.ligar(celtinha);
        carroService.acelerar(celtinha, 10);
        // Then
        Assert.assertTrue(celtinha.isLigado());
        Assert.assertEquals(10, celtinha.getVelocidadeAtual());
    }

    // O carro não pode passar de sua velocidade máxima
    @Test
    public void naoDevePassarDaVelocidadeMaxima() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 100);
        carroService.ligar(carro);
        // When
        carroService.acelerar(carro,100);
        carroService.acelerar(carro,100);
        // Then
        Assert.assertEquals(100,carro.getVelocidadeAtual());
    }

    // Não existe velocidade negativa
    @Test
    public void velocidadeNaoDeveSerMenorQueZero() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro celtinha = new Carro("Prata", "Chevrolet", "Celta", 2001, 50);
        carroService.ligar(celtinha); // velocidade zero
        // When
        carroService.frear(celtinha, 10);
        // Then
        Assert.assertTrue(celtinha.isLigado());
        Assert.assertEquals(0, celtinha.getVelocidadeAtual());
    }

    // Só podemos realizar a ação de acelerar com o carro ligado
    @Test
    public void naoDeveAcelerarDesligado() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.acelerar(carro,10);
        // Then
        Assert.assertEquals(0,carro.getVelocidadeAtual());
    }

    // Enquanto o carro estiver ligado deve ser capaz de: - Frear
    @Test
    public void carroLigadoDeveFrearCorretamente() {
        // Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carro.setLigado(true);
        carro.setVelocidadeAtual(80);
        carroService.frear(carro,10);
        // Then
        Assert.assertTrue(carro.isLigado());
        Assert.assertEquals(70,carro.getVelocidadeAtual());
    }

    // Enquanto o carro estiver ligado deve ser capaz de: - Mostrar o Estado Atual
    @Test
    public void carroLigadoDeveMostrarEstadoAtual() {
        CarroService carroService = new CarroServiceImpl();
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.ligar(carro);
        // Then
        Assert.assertTrue(carro.isLigado());
        carroService.estadoAtual(carro);
    }

    // Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
    @Test
    public void carroNaoPodeDesligarSeVelocidadeAcimaDeZero() {
        CarroService carroService = new CarroServiceImpl();
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.ligar(carro);
        carro.setVelocidadeAtual(50);
        carroService.desligar(carro);
        // Then
        Assert.assertTrue(carro.isLigado());
    }

    @Test
    public void carroSoPodeDesligarSeVelocidadeIgualAZero() {
        CarroService carroService = new CarroServiceImpl();
        // Given
        Carro carro = new Carro("azul","fiat","uno", 2020, 150);
        // When
        carroService.ligar(carro);
        carro.setVelocidadeAtual(20);
        carroService.frear(carro,20);
        carroService.desligar(carro);
        // Then
        Assert.assertFalse(carro.isLigado());
    }

}
