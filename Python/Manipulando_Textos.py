frase1 = 'curso em video python'
print (frase1[9:21]) #inicia do 9 até o 21(sem pegar o 21)

frase2 = 'curso em video python'
print (frase2[9:21:2]) #inicia do 9 e vai ate o 21 pulando de 2 em 2

frase3 = 'curso em video python'
print (frase3[:5]) #comeca do primeiro e vai ate o 5

frase4 = 'curso em video python'
print (frase4[15:]) #comeca do 15 e vai ate o ultimo

frase5 = 'curso em video python'
print (frase5[9::3]) #inicia do 9

frase6 = 'curso em video python'
print (frase6[9::3]) #comeca no 9 e vai ate o final pulando de 3 em 3

#Analise

len(frase1) #mostra quantos caracteres tem a frase

frase1.count('0') #conta quantas vezes aparece a letra o

frase1.count('o',0,13) #analise com fatiamento

frase1.find('deo') #em que momemto comecou o deo

frase1.find('android') #retorna valor -1, pois não existe

'curso' in frase1 #escreve true na tela

#Transformação

frase1.replace('python','android') #troca a palavra python por android

frase1.upper() #altera letras minusculas para maiuscula

frase1.lower() #altera letras maiusculas para minusculas

frase1.capitalize() #joga todos caracteres para minusculos e apenas o primeiro ficara em maiusculo

frase1.title() #analisa quantas palavras tem a string

frase1.strip() #remove os espacos inuteis

frase1.rstrip() #remove somente espacos inuteis da direita

frase1.lstrip() #remove espacos inuteis da esquerda

#divisao
frase1.split() #ocorre divisao dentro da string em uma lista

#juncao
'-'.join(frase) #juntar todos elmentos de frase e usar este separador
