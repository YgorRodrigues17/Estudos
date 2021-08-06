from random import randint #importa biblioteca que permite sortear coisas
from time import sleep #faz com que computador durma por alguns segundos
sorteio = randint(0, 5) #coloca intervalo do que sera sorteado
print('Vou pensar em um numero entre 0 e 5, tente advinhar...')
jogador = int(input('Qual numero eu pensei?'))
print('Peocessando...')
sleep(5) #coloca o tempo que computador ira dormir
if jogador == sorteio:
    print('Parabens, voce venceu')
else:
    print('Voce perdeu')       

