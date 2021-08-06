#include<stdio.h>
#include<stdlib.h>
#include<inttypes.h>

long long simpleCheckSum(char *s, int size)
{
    uint16_t payload[150];

    for(int i = 0; i < 150; i++){
        payload[i] = rand();
    }
    uint16_t checksum = 0;
 
    uint16_t soma = 0;
    if(soma == 0xffff){
        printf("Deu certo");
    }
}

int main(void){
    
    printf("CheckSum de 'ABC': %lld\n", simpleCheckSum("ABC", 3));
    printf("CheckSum de 'AbC': %lld\n", simpleCheckSum("AbC", 3));
    printf("CheckSum de 'BCA': %lld\n", simpleCheckSum("BCA", 3));




    return 0;
}