	#include<iostream>
	#include<stdio.h>
	
	using namespace std;
	
	struct NoFila {
		int *Info;
		int Inicio;
		int Fim;
		struct NoFila *Prox;
	};
	
	void Create_queue(struct NoFila *pt, int c){
		pt -> Info;
		pt -> Inicio = 0;
		pt -> Fim = -1;
	}
	
	void Insert_queue(struct NoFila *pt, int x) {
		Insert_queue(pt)
					if(Inicio == NULL){
						Inicio = pt;
					}
					else{
						Fim -> Prox = pt;
					}
					pt -> Prox = NULL;
					Fim = pt;
					pt -> Info = x;
	}
	
	char Remove_queue(struct NoFila *pt) { 
	if(Inicio != NULL){
		pt = Inicio;
		Inicio = Inicio -> Prox
		if(Inicio = NULL){
			Fim = NULL;
			pt -> Prox = NULL;
		}
	else{
		cout << "Not exists elements" << endl;
	}	
	}
	}
	
	int main() {
	
		int opc;
		float value;
		struct NoFila pt;
	
		// apresenta menu
		while(opc != 2){
	
			cout << "1 - Insert " << endl;  
			cout << "2 - Remove" << endl; 
			cout << "Select one option" << endl;
			cin >> opc;
	
	
				if(opc == 1){ // insere elemento
					cout << "Value for insert " << endl;
					cin >> value;
                    value = Insert_queue(&pt);
					cout << "Value insert with success" << endl;
					}
	
				else(opc == 2){ // remove elemento
					cout << "Value for remove" << endl;
					cin >> valor;
					value = Remove_queue(&pt);
					cout << "Value remove with success" << endl; 
                    }
    
	
	
	
	
	

