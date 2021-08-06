import socket
import sys

def conecta(c, a):
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('www.liverpoofc.com', 8080))


    c.recv(1)


    s.send(bytes('GET / HTTP/1.1\r\n\r\n'+'UTF-8'))
    s.send(bytes('POST / HTTP/1.1\r\n\r\n'+'UTF-8'))
    s.send(bytes('DELETE / HTTP/1.1\r\n\r\n'+'UTF-8')) 

    s.send(bytes('CONNECT host:port HTTP/1.1\r\n\r\n'+'UTF-8')) 

def main():
    
    argument = sys.argv
    url = argument[1]
    method = argument[2]
    hostName = ''
    hostName = url.replace('http://', '')

    for letter in hostName:
        if letter == '\n':
            break
        hostName += letter

    
    if method == 'POST':
        address = hostName.replace(hostName, '')
        payload = argument[3]
        header = 'POST ' +address+ ' HTTP/1.1\r\nContent-Type: text/plain\r\n'
        contentLength = 'Content-Length: ' +str(len(payload))+ '\n\n'

        
        ConexaoTCP = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        ConexaoTCP.connect((hostName, 8080))
        print('Connected with success')

        request = header + contentLength + payload
        print('\nRequest: \n' + request + '\n')
        ConexaoTCP.send(request.encode())
        
        
    else:
        ConexaoTCP = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        ConexaoTCP.connect((hostName, 8080))
        print('Connected with success')

        
        request = method+ ' / HTTP/1.1\r\nHost:' +hostName+ '\r\n\r\n' 
        ConexaoTCP.send(request.encode())
        print('\nRequest: \n' +request+ '\n')
        
    result = ConexaoTCP.recv(1).decode('UTF-8')
    print('Result:\n')
    print(result)    
       

    ConexaoTCP.close()

    
main()    
    

    
