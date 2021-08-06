#include<iostream>

using namespace std;

int main(){
	int vidas = 0;
	char letra = 'b';
	double decimal1 = 2.49;
	float decimal2 = 5.2;
	bool vivo = true;
	string nome = "bruno";
	
	cout << vidas << endl;
	cout << letra << endl;
	cout << decimal1 << endl;
	cout << decimal2 << endl;
	cout << vivo << endl;
	cout << nome << endl;
	
	cout << "digite o numero de vidas";
	cin >> vidas;
	cout << "digite uma letra";
	cin >> letra;
	cout << "dinheiro";
	cin >> decimal1;
	cout << "digite seu nome";
	cin >> nome;					
	
	return 0;
}
