# Interview Challenge - Java

### Solve the problem presented below
**Problema da escrita do celular**

Uma das formas pelas quais se pode escrever letras utilizando teclas numéricas de um celular, é pressiona-las repetidas vezes até que a letra correspondente seja exibida.
Os fabricantes geralmente usam a seguinte associação tecla numérica/letras:

|Tecla|Letras associadas|
|-----|-----------------|
|2    |a,b,c            |
|3    |d,e,f            |
|4    |g,h,i            |
|5    |j,k,l            |
|6    |m,n,o            |
|7    |p,q,r,s          |
|8    |t,u,v            |
|9    |w,x,y,z          |
  
Por exemplo, para se obter a letra 'b' deve-se pressionar duas vezes a tecla 2, para a letra 'm' uma vez a tecla 6 e assim por diante.
Faça um programa que, recebendo uma palavra P (máximo de 50 caracteres), seja capaz de informar quantas vezes e quais teclas terão que ser
pressionadas para obtenção da palavra.
As teclas devem ser informadas na ordem para a formação correta da palavra.
Conforme o exemplo abaixo, cada tecla deve ser precedida por um cerquilha (#).
A quantidade de vezes deve vir logo em seguida à tecla separada por um igual (=) conforme exemplo.

#### Exemplo
Entrada:
```
internet
```
Saída:
```  
#4=3  
#6=2  
#8=1  
#3=2  
#7=3  
#6=2  
#3=2  
#8=1
```  

### Acceptance criteria

Source Code available:
- We should be able to access the code with your solution
- We should be able to compile and run your code

Running your code:
- Should pass in all automated tests that we run
- Should use the exact pattern proposed for input and output

### Notes
1. Use Java 8 or above to develop your solution
2. Create a branch with your name and push your code in this branch as described below

## Push your changes to your own branch
Create branch from master:  
*git checkout -b challenges/\<firstname.lastname\>*

Push changes after commit:  
*git push origin challenges/\<firstname.lastname\>*

**Please request access to push your changes and you will be accepted as a contributor**

