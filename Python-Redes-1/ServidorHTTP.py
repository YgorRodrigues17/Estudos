import socket
from threading import Thread

def novaConexao(novoSocket):
    inf = ''
    while True:
        data = novoSocket.recv(1)
        inf += data.decode('UTF-8')
        if data == b'\n':
            print(inf)
            novoSocket.send(bytes('Result : '+inf,'UTF-8'))
            break
    novoSocket.close()    

def main():
    ConexaoTCP = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    print('Create socket...')

    ConexaoTCP.bind(('',8080))
    print('add in port 8080...') 

    ConexaoTCP.listen()
    print('Listenning news conecctions...')

    while True:
       print('Waiting conecctions')
       novoSocket, cliente = ConexaoTCP.accept()
       print('New client connection',cliente)

       Thread.start(novaConexao, tuple([novoSocket]))
       #threading.start_new_thread(novaConexao, tuple([novoSocket]))

main()



    



