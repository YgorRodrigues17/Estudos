from datetime import date
ano = int(input('Qual o ano que voce nasceu?'))

anoAtual = date.today().year

if anoAtual - ano <= 9:
    print('Mirim')
elif anoAtual - ano > 10 and anoAtual - ano <= 14:
    print('Infantil')
elif anoAtual - ano > 14 and anoAtual - ano <= 19:
    print('Junior')
elif anoAtual - ano > 19 and anoAtual - ano <= 20:
    print('Senior')
else:
    print('Master')                