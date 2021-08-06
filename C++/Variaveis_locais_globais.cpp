#include<iostream>

using namespace std;

int n1, n2; // variaveis globais,acessadas de qualquer local

int main(){
	
	// operadores matematicos: + - / * % ()
	
	int n3, n4; //variaveis locais,acessaveis apenas onde estao alocadas
	int res1, res2;
	
	n1 = 11;
	n2 = 3;
	n3 = 5;
	n4 = 2;
	
	res1 = n1 / n3;
	res2 = n1 % n2;
	
	cout << "divs:" << res1 << endl;
	cout << "resto:" << res2 << endl;
	
	return 0;
}
