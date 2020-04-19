# Exercicio AEP 2

1. Explicar o conceito de encapsulamento (métodos e atributos), destacando seu propósito.
2. Explicar como o uso do encapsulamento em conjunto com métodos modificadores (como os setters) podem promover o reuso de código.

3. Elaborar uma classe de sua autoria, que não tenha sido usada nos exemplos deste bimestre, que realize uma validação no momento de modificar o valor de algum atributo encapsulado e que lance uma exceção caso a validação falhe.

4. Elaborar uma classe App com o método main que use a classe do item 3 e trate a exceção em um bloco try/catch, imprimindo no console a mensagem recuperada a partir da exceção com o prefixo "Mensagem da exceção: ".

## Exercício 1

**Encapsulamento** vem de encapsular, que em POO significa dividir em partes. A ideia é tornar o sistema mais flexível, fácil de modificar e de criar novas implementações. O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe sendo uma forma eficiente de proteger os dados da classe, além de limitar a manipulação desta classe. O encapsulamento que é dividido em dois níveis:

- Nível de classe: Quando determinamos o acesso de uma classe inteira que pode ser public ou Package-Private (padrão);
- Nível de membro: Quando determinamos o acesso de atributos ou métodos de uma classe que podem ser public, private, protected ou Package-Private (padrão).

Exemplo:

```java
public class Conta {
	private String username;
	private int senha;
	private boolean active;

	public String getUsename(){
		return this.username;
	}

	private boolean getActive(){
		return this.active;
	}
}
```

## Exercício 2

O propósito do encapsulamento é o de organizar os dados que sejam relacionados, agrupando-os em Classes, reduzindo as duplicidade de nomes de variáveis e, da mesma forma, reunindo métodos relacionados. Este padrão ajuda a manter um programa mais legível. Quando unido com métodos (setter e getters) pode-se acessar classes e reutiliza-los, assim, o código fica mais limpo com menores quantidades de linhas.

Assim como no exemplo a seguir:

```java
public class AppConta {
	public static void main(String[] username, int  Senha) {
		Conta novaConta = new Conta("leo",123);

		novaConta.ativarConta();
		novaConta.login("leo", 123);
}
```

## Exercício 3

[Classe com validações, encapsulamento,exceções](https://github.com/leoyoshii/3sadsis2020/tree/master/src/main/java/segundaaep/Conta)

## Exercício 4

[Classe app utilizando a classe do item 3](https://github.com/leoyoshii/3sadsis2020/tree/master/src/main/java/segundaaep/AppConta)

![tamojunto](https://github.com/leoyoshii/3sadsis2020/blob/master/public/tamojunto.jpeg?raw=true)
