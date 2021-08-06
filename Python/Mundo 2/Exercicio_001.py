casa = float(input('Qaul o valor da casa?'))
salario = float(input('Qual o seu salario?'))
anos = int(input('Quantos anos voce quer financiar?'))

prestacao = casa / (anos / 12)

if prestacao > salario * 0.30:
    print('Não aprovado')
else:
    print('Aprovado')    