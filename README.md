<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-rodar">Como rodar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-rotas">Rotas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-contribuir">Como contribuir</a>&nbsp;&nbsp;&nbsp;
</p>
<br>

# Locação de veículo


## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

  - [JAVA](https://www.java.com/pt-BR/) 21.0.2 2024-01-16 LTS

## 💻 Projeto

O sistema serve para calcular o valor de um aluguel de carro.

O usuario deve entrar com o valor do modelo do carro, data de retirada, retorno, preço por hora e preço por dia do veiculo.

Caso a quantidade de horas seja menor igual a 12h o valor da locação deve ser calculada por hora;

Caso seja maior que 12 o valor deve ser calculado por dia.

Impostos por estado:

- SP: 20% menores que R$ 200.00 e 15% para valores maiores.
- RJ: 30% menores que R$ 200.00 e 25% para valores maiores.
- MG: 15% menores que R$ 200.00 e 10% para valores maiores.
- BA: 10% menores que R$ 200.00 e 5% para valores maiores.
- 
#### Teste imposto SP

![img.png](.github%2Fimg.png)

![img_4.png](.github%2Fimg_4.png)

#### Teste imposto RJ

![img_1.png](.github%2Fimg_1.png)

![img_5.png](.github%2Fimg_5.png)

#### Teste imposto MG

![img_2.png](.github%2Fimg_2.png)

![img_6.png](.github%2Fimg_6.png)

#### Teste imposto BA

![img_3.png](.github%2Fimg_3.png)

![img_7.png](.github%2Fimg_7.png)

## 🚀 Como Rodar

  - Clone o projeto.
  - Entre no repositório na pasta `src`.
  - Rode `javac Main.java` para compilar.
  - Rode `java Main.java` para executar no terminal.

## 🤔 Como contribuir

  - Faça um fork desse repositório;
  - Cria uma branch com a sua feature: `git checkout -b minha-feature`;
  - Faça commit das suas alterações: `git commit -m 'feat: Minha nova feature'`;
  - Faça push para a sua branch: `git push origin minha-feature`.

Depois que o merge da sua pull request for feito, você pode deletar a sua branch.
