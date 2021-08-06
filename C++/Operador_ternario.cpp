#include<iostream>

using namespace std;

int main(){
	int n1, n2, nota, x, x1;
	string res;
	
	cout << "digite a primeira nota";
	cin >> n1;
	cout << "digite a segunda nota" << endl;
	cin >> n2;
	
	nota = n1 + n2;
	
	(nota >= 60) ? res = "aprovado" : res = "reprovado";
	
	cout << "situacao do aluno:" << res << endl;
	
	cout << "digite um valor " << endl;
	cin >> x1;
	
	(x1 >= 10) ? x++ : x--;
	
	cout << "novo valor de x:" << x << endl;
	
	
	
	
	
	
	return 0;
}
