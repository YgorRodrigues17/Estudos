valorProduto = float(input('Valor do produto:'))
print('Escolha o metodo de pagamento...')
pagamento = int(input('1 - DINHEIRO/CHEQUE   2 - CARTAO A VISTA   3 - 2X NO CARTAO   4 - 3X NO CARTAO'))
if pagamento == 1: 
    valorProduto = valorProduto - (valorProduto * 0.10)
    print('Valor total :{}'.format(valorProduto))
elif pagamento == 2:
     valorProduto = valorProduto - (valorProduto * 0.05)
     print('Valor total : {}'.format(valorProduto))
elif pagamento == 3:
     print('Valor total: {}'.format(valorProduto))
elif pagamento == 4:
    valorProduto = valorProduto + (valorProduto * 0.20)
    print('Valor total : {}'.format(valorProduto))            


