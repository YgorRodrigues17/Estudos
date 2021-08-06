from datetime import date #serve para pegar ano da maquina atual
ano = int(input('Em que ano estamos?, coloque 0 para analisar o ano atual'))
if ano == 0:
    ano = date.today().year #pega o ano atual da maquina
    print('O ano {} nao e bissexto'.format(ano))
if (ano % 4) == 0 and ano % 100 != 0 or ano % 400 ==0:
    print('O ano e bissexto')
else:
    print('O ano nao e bissexto')    