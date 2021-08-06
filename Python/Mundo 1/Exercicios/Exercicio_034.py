salario = float(input('Qual o seu salario?'))
if salario > 1250:
    aumento = (salario * 0.10) + salario
    print('Seu novo salario e de {}'.format(aumento))
else:
    aumento = (salario * 0.15) + salario
    print('Seu novo salario e de {}'.format(aumento))    