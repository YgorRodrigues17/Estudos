from datetime import date
anoNasc = int(input('Qual o ano que voce nasceu?'))
anoAtual = date.today().year

idade = anoAtual - anoNasc

if idade < 18:
    saldo = (anoNasc + 18) - anoAtual
    print('Faltam {} anos para o seu alistamento'.format(saldo))
    anoAlist = anoNasc + 18
    print('Voce ira se alistar no ano {}'.format(anoAlist))
elif idade == 18:
    print('Esta na hora de voce se alistar')
else:
    saldo2 = anoAtual - (anoNasc + 18)
    print('Voce deveria ter se alistado a {} anos'.format(saldo2))
    anoAlist2 = anoAtual - saldo2 
    print('Voce deveria ter se alistado no ano {}'.format(anoAlist2))        

