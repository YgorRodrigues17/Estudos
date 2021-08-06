#include<iostream>

using namespace std;

void texto();
void soma(int n1, int n2);
int soma2(int n1, int n2);
void tr(string tra[4]);

int main(){
	int res;
	string transp[4] = ("carro","moto","barco","aviao");
	
	texto();
	
	soma(15, 3);
	
	res = soma2(175, 25);
	
	cout << "valor de res:" << res << endl;
	
	tr(transp);
	
	return 0;
}

void texto(){
	cout << "canal fessor bruno" << endl;
}
void soma(int n1, int n2){ 
	cout << "soma dos valores:" << n1 + n2 << endl;
}

int soma2(int n1, int n2){
	return n1 + n2; //toda variavel que nao for void se utiliza o return
}

void tr(string tra[4]){
	for(int i = 0; i < 4; i++)
	cout << tra[1] << endl;
	}
