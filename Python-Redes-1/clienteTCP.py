import socket

def main():
    socketTCP = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    socketTCP.connect(('localhost', 8080))
    print('Conexao estabelecida')

    socketTCP.send(bytes('Ola mundo dos sockets\n','UTF-8'))
    linha = ''
    while True:
        data = socketTCP.recv(1) ##2000 bytwa na 1º retorna 1024, na 2º retorna os 976 dos dados.
        linha += data.decode('UTF-8')
        if data == b'\n':
           print(linha)
           break

    
    socketTCP.close

main()    