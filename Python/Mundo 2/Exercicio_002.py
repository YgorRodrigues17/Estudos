n1 = int(input('Digite um numero'))
print('1 - Binario  2 - Octal  3 - Hexadecimal')
opc = int(input('Selecione uma opcao'))

if opc == 1:
    print('{} em binario e igual a {}'.format(n1, bin(n1)[2:]))
elif opc == 2:
    print('{} em octal e igual a {}'.format(n1, oct(n1)[2:]))
elif opc == 3:
    print('{} em hexadecimal e igual a {}'.format(n1, hex(n1)[2:]))
else:
    print('Opcao invalida')