cod_aluno = int(input('Digite o codigo do aluno'))
nom_aluno = input('Digite seu nome')
n1 = float(input('Digite sua nota 1'))
n2 = float(input('Digite sua nota 2'))
n3 = float(input('Digite sua nota 3'))
media_exercicio = float(input('Digite sua media de exercicios'))

ma = (((n1) + (n2 * 2) + (n3 * 3)) + media_exercicio) / 7

if ma >= 9.0:
    print('A')

elif ma < 9.0 and ma >= 7:
    print('B')

elif ma < 7.5 and ma >= 6.0:
    print('C')

elif ma < 6.0 and ma >= 4.0:
    print('D')

elif ma < 4.0:
     print('E') 

print('Nome do auno : {}'.format(nom_aluno))
print('A media de aproveitamento do aluno : {}'.format(ma))     
