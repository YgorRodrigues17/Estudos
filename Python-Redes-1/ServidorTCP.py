import socket
import _thread as thread

#abrir uma nova thread
#thread.start_new_thread(funcao, argumentos)


def processar_nova_conexao(novoSocketDaConexao):
    linha = ''
    while True:
        data = novoSocketDaConexao.recv(1) ##2000 bytwa na 1º retorna 1024, na 2º retorna os 976 dos dados.
        linha += data.decode('UTF-8')
        if data == b'\n':
           print(linha)
           novoSocketDaConexao.send(bytes(linha,'UTF-8'))
           break
    novoSocketDaConexao.close()



def main():
    socketTCP = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    print('Criou o socket')

    socketTCP.bind(('',8080))
    print('Vinculou a porta 8080')

    socketTCP.listen()
    print('Escutando novas conexoes')

    while True:
       print('Aguardando conexao')
       novoSocketDaConexao, cliente = socketTCP.accept()
       print('Nova conexao do cliente',cliente)

       thread.start_new_thread(processar_nova_conexao, tuple([novoSocketDaConexao]))

main()
    
        