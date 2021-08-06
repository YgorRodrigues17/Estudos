#include<iostream>
#include<stdio.h>

using namespace std;

struct NoFila{
    int x;
    int y;
}x;


int main(){
    x.y = 10;
    x.x = 20;

    cout << x.x << endl;
    cout << x.y << endl;





    return 0;
}