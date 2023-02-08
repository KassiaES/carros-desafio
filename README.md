# carros-desafio
Trabalho de Testes de Unidade utilizando JUnit

_Neste caso, a classe CarroServiceImpl e a interface CarroService estão com 100% Coverage_

[Coverage Report](carros-desafio/ns-1/index.html)

_Testes não servem para garantir a ausência de bugs, mas sua presença_


## Testes de Unidade

A Unidade é a menor parte testável de um sistema, de um programa de computador.
O teste de unidade é o teste de funcões simples e de resultado constante.
Teste de unidade é toda a aplicação de teste nas assinaturas de entrada e saída de um sistema.
Consiste em validar dados válidos e inválidos via Input/Output (entrada/saída) sendo aplicado por desenvolvedores ou analistas de teste.
Os testes unitários são fundamentais na construção e implementação de funcionalidades. 
Conseguimos através dos testes unitários capturar falhas regressivas, desde o inicio da modificação.
Para garantir que o sistema funciona corretamente são necessários testes, 
manuais ou automatizados, que verificam a entrada e saída, garantindo sua previsibilidade.
Com os testes automatizados, uma bateria de testes dura segundos ou milésimos de segundos, agilizando muito o desenvolvimento.


#### Seguem o princípio F.I.R.S.T.

##### FAST
Deve ser executado muito rápido
##### INDEPENDENT
Um teste não pode depender do outro
##### REPEATABLE
Devemos poder executar diversas vezes
##### SELF_VERIFYING
O teste sabe quando a sua execução falhou
##### TIMELY
Devemos escrever os testes em momento oportuno (TDD - Test Driven Development)

# JUnit
###### _Origem: Wikipédia, a enciclopédia livre_

O JUnit é um framework open-source, que se assemelha ao raio de testes software java,
criado por Erich Gamma e Kent Beck, com suporte à criação de testes automatizados na linguagem de programação Java.
Esse framework facilita a criação e manutenção do código para a automação de testes com apresentação dos resultados.
Com ele, pode ser verificado se cada método de uma classe funciona da forma esperada, 
exibindo possíveis erros ou falhas podendo ser utilizado tanto para a execução de baterias de testes como para extensão.
Com JUnit, o programador tem a possibilidade de usar esta ferramenta para criar um modelo padrão de testes,
muitas vezes de forma automatizada.
O teste de unidade testa o menor dos componentes de um sistema de maneira isolada. 
Cada uma dessas unidades define um conjunto de estímulos (chamada de métodos), 
e de dados de entrada e saída associados a cada estímulo. 
As entradas são parâmetros e as saídas são o valor de retorno, exceções ou o estado do objeto.
O JUnit permite a realização de testes de unidades, conhecidos como "caixa branca",
facilitando assim a correção de métodos e objetos.

Algumas vantagens de se utilizar JUnit:
- Permite a criação rápida de código de teste enquanto possibilita um aumento na qualidade do sistema sendo desenvolvido e testado;
- Não é necessário escrever o próprio framework;
- Amplamente utilizado pelos desenvolvedores da comunidade código-aberto, possuindo um grande número de exemplos;
- Uma vez escritos, os testes são executados rapidamente sem que, para isso,
seja interrompido o processo de desenvolvimento;
- JUnit checa os resultados dos testes e fornece uma resposta imediata;
- Pode-se criar uma hierarquia de testes que permitirá testar apenas uma parte do sistema ou todo ele;
- Escrever testes com JUnit permite que o programador perca menos tempo depurando seu código;
- JUnit é LIVRE.



|  JUnit | Links Úteis |
| ------ | ------ |
| Site | [https://junit.org/junit5/](https://junit.org/junit5/) |
| User Guide | [https://junit.org/junit5/docs/current/user-guide/](https://junit.org/junit5/docs/current/user-guide/) |
| All Classes and Interfaces | [https://junit.org/junit5/docs/current/api/allclasses-index.html](https://junit.org/junit5/docs/current/api/allclasses-index.html) |
| Javadoc | [https://junit.org/junit5/docs/current/api/](https://junit.org/junit5/docs/current/api/) |
| Download and Install | [https://github.com/junit-team/junit4/wiki/Download-and-Install](https://github.com/junit-team/junit4/wiki/Download-and-Install) |

### Diferenças entre JUnit4 e JUnit5

```sh
Annotations
```
>
>Antes de cada caso de teste
>@Before -> Junit 4
>@BeforeEach -> Junit 5
>
>Após cada caso de teste
>@After -> Junit 4
>@AfterEach -> Junit 5
>
>Antes da classe de teste
>@BeforeClass -> Junit 4
>@BeforeAll -> Junit 5
>
>Após a classe de teste
>@AfterClass -> Junit 4
>@AfterAll -> Junit 5
>
>Pula um teste especifico
>@Ignore -> Junit 4
>@Disabled -> Junit 5
>
```sh
Assertivas
```
>Classe das assertivas
>Assert -> Junit 4
>Assertion -> Junit 5
>
```sh
Metodos
```
>fail - fail
>assertTrue - assertTrue
>
>assertFalse - assertFalse
>
>assertSame - assertSame
>
>assertNotSame - assertNotSame
>
>assertEquals - assertEquals
>
>assertNotEquals - assertNotEquals
>
>assertThrows - assertThrows
>
>assertNull - assertNull
>
>assertNotNull - assertNotNull
>
>assertArrayEquals - assertArrayEquals*
>
>assertThat - N/A no Junit 5
>
>Novas Junit 5 - assertAll 
>
>Junit 4.13+ - assertThrows
>
     



