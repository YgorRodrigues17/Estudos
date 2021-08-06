distancia = float(input('Qual a distancia da viagem?'))
if distancia <= 200:
    preco = distancia * 0.50
    print('Voce ira pagar um total de {:.2f} reais'.format(preco))
else:
    preco = distancia * 0.45
    print('Voce ira pagar um total de {:.2f} reais'.format(preco))