largura=float(input('qual a largura da parede?'))
altura=float(input('qual a altura da parede?'))
area=largura*altura
tinta=area/2
print('sera necessario {} litros de tina para pintar a parede'.format(tinta))


preco=float(input('qual o preco do produto?'))
desconto=preco-(preco*0.05)
print('o novo preco com 5% de desconto e {}'.format(desconto))

salario=float(input('informe o salario do funcionario'))
aumento=salario+(salario*0.15)
print('o novo salario do funcionario sera de {} reais'.format(aumento))

dias=int(input('quantos dias foi alugado?'))
km=float(input('quantos km foram rodados'))
diaria=60*dias
kmr=0.15*km
total=diaria+kmr
print('o preco total a pagar sera de {}'.format(total))
