velocidade = float(input('Qual a sua velocidade?'))
totalMulta = (velocidade - 80) * 7.0
if velocidade > 80:
    print('Voce foi multado')
    print('Voce ira pagar {} reais'.format(totalMulta))
