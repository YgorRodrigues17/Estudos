import socket

socketUDP = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
print('socket UDP criado')

socketUDP.bind(('', 3546))

mensagem, enderecoDoRemetente = socketUDP.recvfrom(5000)
print(f'Mensagem '+mensagem+ 'recebida do '+enderecoDoRemetente)