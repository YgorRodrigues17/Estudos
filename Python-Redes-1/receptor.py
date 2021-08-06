import socket
import numpy as np  

socketUDP = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
transmissor = ('127.0.0.1', 2020)
receptor = ('127.0.0.1', 3030)
socketUDP.bind(receptor)
buff_size = 10000


def rdt_rcv():
    while True:
        message, source = socketUDP.recvfrom(buff_size)
        if source == transmissor:
            return np.frombuffer(message, dtype = np.uint16)


def udt_send(sndpkt):
    socketUDP.sendto(sndpkt.tobytes(), receptor)
    


if __name__ == '__main__':
    rcvpkt = rdt_rcv()
    print(f'Data receive with success {rcvpkt}')
    #sndpkt = udt_send()
    print(f'Data receive from UDT {sndpkt}')

    rdt_rcv(rcvpkt) & & notcorrupt (rcvpkt) & & has_seq0(rcvpkt)
    extract(rcvpkt, data)
    deliver_data(data)
    sndpkt = make_pkt(ack, 0, checksum)
    udt_send(sndpkt)
    oncethru = 1

    rdt_rcv(rcvpkt) & & (corrupt(rcvpkt) | | has_seq0(rcvpkt))
    udt_send(sndpkt)

    rdt_rcv(rcvpkt) & & notcorrupt(rcvpkt) & & has_seq1(rcvpkt)
    extract(rcvpkt, data)
    deliver_Data(data)
    sndpkt = make_pkt(ack, 1, checksum)
    udt_send(sndpkt)

    rdt_rcv(rcvpkt) & & (corrupt(rcvpkt) | | has_seq1(rcvpkt))
    if(oncethru == 1)
    udt_send(sndpkt)
