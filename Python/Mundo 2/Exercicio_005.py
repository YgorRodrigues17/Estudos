n1 = float(input('Digite sua primeira nota'))
n2 = float(input('Digite sua segunda nota'))
n3 = float(input('Digite sua terceira nota'))

media = (n1 + n2 + n3) / 3

if media < 5.0:
    print('Reprovado')
elif media >= 5.0 and media <= 6.9:
    print('Recuperacao')
else:
    print('Aprovado')        

