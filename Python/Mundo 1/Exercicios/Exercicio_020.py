import random
n1 = str(input('Primeiro aluno'))
n2 = str(input('Segundo aluno'))
n3 = str(input('Terceiro aluno'))
n4 = str(input('quarto aluno'))
lista = [n1, n2, n3, n4]
random.shuffle(lista)
print('A ordem de apresentcao sera:')
print(lista)