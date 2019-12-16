# Automação de teste

Automação de testes é o uso de software para controlar a execução de testes de software através da aplicação de estratégias e ferramentas, comparando os resultados esperados com os resultados reais. Seus objetivos são a redução do envolvimento humano em atividades manuais, de tempo demandado.
A importância da automação de testes está diretamente relacionada à qualidade do produto final. Assim, ao pensar em automatizar, é preciso estudar a sua viabilidade: com a automação conseguiremos obter ganho de tempo? Conseguimos reduzir os custos e manter a qualidade?
Se a resposta for sim, outros fatores precisam ser analisados: a maturidade do time de processo do teste; grau de reutilização dos testes automatizados; conhecimento sobre o comportamento que é esperado do sistema a ser testado; e, ainda, o tempo disponível para a automação.


# Cucumber

O Cucumber é uma ferramenta usada para executar testes de aceitação automatizados que foram criados em um formato BDD. Um de seus recursos mais destacados é a capacidade de realizar descrições funcionais de texto simples 

# Gherkin

O Gherkin, é a linguagem que o tanto o cucumber quanto o usuário entendem, linguagem esta que consiste em definir os cenários de teste através de steps (passos), e cada um desses steps devem ser definidos principalmente com palavras chaves “Dado”, “Quando” e “Então”. Assim como apresentado no exemplo abaixo:

###### Dado que eu tenha X
###### Quando eu faço Y
###### Então eu recebo Z

**Dado(Given)**
 O propósito do “Dado” é colocar o sistema em um estado conhecido antes que o usuário comece a interagir com o sistema. Pensando nos cenários tradicionais de teste, cada step que possui “Dado” seria uma pré-condição do caso de teste.

**Quando(When)**
 O Propósito do “Quando” é descrever uma ação chave que o usuário executa, resumidamente seria qualquer ação de interação do usuário com o sistema. Comparando novamente a casos de testes tradicionais, cada “Quando” seria um step do que fazer no caso de teste.

**Então(Then)**
 O “Então” visa mostrar as saidas, os resultados das ações executadas, seriam basicamente os resultados esperados em casos de testes tradicionais.

# Selenium

Os testes de aplicações web, em sua maioria, envolvem o uso de um navegador web. O Selenium permite simular o comportamento do usuário utilizando um navegador web. Quando utilizamos o Selenium para fazer testes automatizados usamos também a ferramenta que ele disponibiliza o selenium webDriver.
O Selenium WebDriver faz chamadas diretamente ao navegador utilizando o suporte à automação nativo de cada navegador. Assim os testes escritos com o WebDriver são bastante realistas, pois, em vez de usar um engine JavaScript próprio, ele chama diretamente o navegador.
O Selenium suporta praticamente todos os navegadores web: Google Chrome, Firefox, Internet Explorer, Safari, Opera etc.



