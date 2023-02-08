package service;
import model.Carro;

public class CarroServiceImpl implements CarroService {

    @Override
    public void acelerar(Carro carro, int velocidadeAMais) throws Exception {
        if(velocidadeAMais <= 0) {
            throw new Exception("A velocidade deve ser maior que zero");
        }


        if(carro.isLigado()) {
            if (carro.getVelocidadeAtual() == carro.getVelocidadeMaxima()) {
                carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
            } else {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMais);
            }
        } else {
            carro.setVelocidadeAtual(0);
        }
    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) throws  Exception {
        if(velocidadeAMenos < 1) {
            throw new Exception("Impossivel frear valor menor que 1!");
        }

        if((carro.getVelocidadeAtual() - velocidadeAMenos) <= 0) {
            carro.setVelocidadeAtual(0);
        } else {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidadeAMenos);
        }
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void desligar(Carro carro) {
        if (carro.getVelocidadeAtual() == 0) {
            carro.setLigado(false);
        } else {
            carro.setLigado(true);
        }
    }

    @Override
    public String estadoAtual(Carro carro) {
        return "O carro está ligado: " +
                carro.isLigado() +
                " e a velocidade atual é: " +
                carro.getVelocidadeAtual();
    }

}
