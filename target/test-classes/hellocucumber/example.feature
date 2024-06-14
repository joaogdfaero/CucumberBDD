#language:pt
Funcionalidade: Faz login na pagina do ecommerce
  Cenario: Faz login na pagina do ecommerce
    Dado que esteja na pagina: "https://www.saucedemo.com/v1/index.html"
    Quando digito o nome "standard_user" no campo usuario
    E digito a senha "secret_sauce" no campo senha
    E aperto o botão para entrar
    Então consigo fazer o login

