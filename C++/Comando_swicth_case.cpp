#include<iostream>

using namespace std;

int main(){
	
/*	switch(expressao){
		
		case const1:
			comandos;
			break;
		case const2:
			comandos;
			break;
		default:
			comandos;
		
		*/
		int valor,valor2;
		cout << "selecione uma cor" << endl;
		cout << "{1}=verde, {2}=azul, {3}=vermelho" << endl;
		cin >> valor;
		
		switch(valor){
			case 1:
				cout << "cor selecionada: verde" << endl;
				break;
			case 2:
				cout << "cor selecionada: azul" << endl;
				break;
			case 3:
				cout << "cor selecionada vermelho" << endl;
				break;
			default:
				cout << "valor selecionado invalido" << endl;
		cout << "selecione um veiculo" << endl;
		cout << "{4}=carro, {5}=moto, {6}=aviao, {7}=helicoptero" << endl;
		cin >> valor2;
		
		switch(valor2){
			case 4:
			case 5:
				cout << "veiculo terrestre selecionado" << endl;
			switch(valor2){
				case 4:
					cout << "carro selecionado" << endl;
				case 5:
					cout << "moto selecionado" << endl;
					break;
				}
				break;
				case 6:
				case 7:
				     cout << "veiculo aereo selecionado" << endl;
		switch(valor2){
			case 6:
			     cout << "aviao selecionado" << endl;
			case 7:
			     cout << "helicoptero selecionado" << endl;	   
				 break;  	
		    }		
			break;
			default:
				cout << "transporte invalido" << endl;
		}
		
	}
	return 0;
}
