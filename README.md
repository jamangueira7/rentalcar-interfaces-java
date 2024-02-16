<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-rodar">Como rodar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-rotas">Rotas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-contribuir">Como contribuir</a>&nbsp;&nbsp;&nbsp;
</p>
<br>

## Formatador de dados de um arquvo

Desenvolvido com o video [java curso completo](https://pt.stackoverflow.com/questions/27013/como-ler-arquivos-csv-em-java) do professor @acenelio .

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

  - [JAVA](https://www.java.com/pt-BR/) 21.0.2 2024-01-16 LTS

## 💻 Projeto

Um sistema que ler arquivos csv e gravar outro com os dados formatados.

Para testar use o caminho `C:\programacao\java\read-file-txt-write-csv\dirTest\input.csv.txt`
Caso vá testar no Linux é preciso mudar o codigo nas linhas:
- 22 ---> ```boolean success = new File(sourceFolderStr + "\\out").mkdir();```
- 22 ---> ```boolean success = new File(sourceFolderStr + "/out").mkdir();```
- 24 ---> ```String targetFileStr = sourceFolderStr + "\\out\\summary.csv";```
- 24 ---> ```String targetFileStr = sourceFolderStr + "/out/summary.csv";```

#### Teste
![img.png](.github%2Fimg.png)

#### Estrutura de pasta

![img_1.png](.github%2Fimg_1.png)

#### Arquivo de entrada

![img_2.png](.github%2Fimg_2.png)

#### Arquivo de saída

![img_3.png](.github%2Fimg_3.png)

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
