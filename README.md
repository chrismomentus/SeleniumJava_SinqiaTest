# Selenium Java Authomation Test

- MainURL: https://blogdoagi.com.br/

## Environment

- Java JDK V21
- Eclipse IDE
- Selenium java 4.12
- Chromedriver v117 win32

### Libraries
	1. JUnit 5
 	2. Selenium 4.12
  	3. Testng 6.7

## Objectives

- To test the search component from the MainURL.  
- Create 2 Test Cases to be tested.  

# Test Cases

1- CT01: Realizar uma pesquisa com texto correto, preparado e definido e verifique o resultado está correto.  
2- CT02: Realizar uma pesquisa com textos invalidos (eg "@#$%&") e verifique o comportamento correto.  

## CT01 Scenario: Realizar uma pesquisa com texto correto, preparado e definido e verifique o resultado está correto.  

### Test Steps.  
	1. Acessar o MainURL do blog  
	2. Clicar no componente de pesquesa  
	3. Inserir o texto valido de pesquisar  
	4. Clicar no butão de pesquisa  
	5. Verificar o resultado da pesquesa  
	
## 2- CT02 Scenario: Realizar uma pesquisa com textos invalidos (eg "@#$%&") e verifique o comportamento correto.  

### Test Steps.  
	1. Acessar o MainURL do blog  
	2. Clicar no componente de pesquesa  
	3. Inserir o texto invalido de pesquisar (eg. @#$%¨&)  
	4. Clicar no butão de pesquisa  
	5. Verificar o resultado da pesquesa  
