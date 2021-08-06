import socket

socketUDP = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
print('socket UDP criado')

socketUDP.sendto(b'Dados que vou enviar',('192.168.0.10', 3546))
print('Mensagem UDP enviada')

mensagem, remetente = socketUDP.recvfrom(5000)
print(mensagem)