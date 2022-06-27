<h1 align="center">Let's Run Backend</h1>
<p align="center">Backend para o aplicativo Let's Run</p>
<h4 align="center"> 
    🟢  Projeto concluído  🟢
</h4>
<h2 align="center">
    <img src="https://img.shields.io/static/v1?label=Heroku&message=Working&color=#430098&style=flat&logo=heroku"/>
    </h2>

Tabela de conteúdos
=================
<!--ts-->
   * [Sobre](#sobre)
   * [Como usar](#como-usar)
      * [Pré-Requisitos](#pre-requisitos)
      * [Endpoints](#endpoints)  
   * [Tecnologias](#tecnologias)
   * [Créditos](#creditos)
<!--te-->

<h1>Sobre</h1>
<p>O backend é para o aplicativo feito por mim, o Let's Run, um aplicativo de corrida, o qual seu repositório pode ser encontrado <a href = "https://github.com/ValterGabriell/Running-App">aqui.</a> O backend está hospedado no Heroku.
  </br>
<h1>Como usar</h1>
<h2>Pré-requisitos</h2>
<img src="https://user-images.githubusercontent.com/63808405/171037587-3c6b6b8f-e9c3-4b97-b4b0-a54d6c9fb8dc.png" width = "250px"></br>
<p>Antes de começar, você deve ter instalado em sua máquina o Insomnia. Podendo ser baixado através desse <a href = "https://insomnia.rest/download">link</a>.</br>
<h2>Endpoints</h2>
<p>Após ter feito a instalação, abra o programa e você poderá criar requisições web através de @Get, @Post, @Put, @Delete, @Patch, entre outras. E para começar a usar os endpoints dessa aplicação pode-se começar criando um usuário. Crie uma nova requisição @Post, ponha o "Body" como "Json" e coloque a seguinte url:</br>

```bash
https://app-corrida-vg.herokuapp.com/runapp/postRun
``` 
O formato de json da criação de usuário deve seguir o seguinte padrão:

```bash
{"runId":0
,"userId":"idTeste"
,"username":"name-teste"
,"timRunInSeconds":"00:00:00"
,"runFeeling":"felicidade"
,"totalDistance":"0km"
,"note":"exemplo de nota"
,"turno":"manhã"
,"local":"cidade"
,"dateRun":"12/12/2012"}
``` 
Feito isso, você pode verificar se está tudo certo criando uma nova requisição @Get, ponha o "Body" como "Json" e coloque a seguinte url:</br>

```bash
https://app-corrida-vg.herokuapp.com/runapp/getAll/{userId}
``` 
<h3>Outros endpoints da aplicação</h3></br>

Endereço | Saída
:-------: | ------:
https://app-corrida-vg.herokuapp.com/runapp/ | Url Base
getLastRun/{userId}   | Recupera a última corrida do usuário
delete/all     | Deleta todas as corridas

<h1>Tecnologias</h1>
- Spring Boot</br>
- Arquitetura MVC</br>
- Heroku para deploy</br>
- Arquitetura com DTO</br>
- Buscando seguir os principios do solid</br>


<h1>Créditos</h1>

---

<a href="https://www.linkedin.com/in/valter-gabriel">
 <img style="border-radius: 50%;" src="https://user-images.githubusercontent.com/63808405/171045850-84caf881-ee10-4782-9016-ea1682c4731d.jpeg" width="100px;" alt=""/>
 <br />
 <sub><b>Valter Gabriel</b></sub></a> <a href="https://www.linkedin.com/in/valter-gabriel" title="Linkedin">🚀</a>
 
Feito por Valter Gabriel 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Gabriel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/valter-gabriel/)](https://www.linkedin.com/in/valter-gabriel/) 



