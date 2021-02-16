#include<iostream>

using namespace std;

int main(){
	int num,num2,num3,num4;
	
	/* 1 2 3 4 5 6 7 8 9 10
	>4 e <7
	*/
	
	cout << "digite um valor";
	cin >>  num;
	
	
	if(num>4 && num<7)
	{
		cout << "valor aceito" << endl;
	}
	else
	{
	cout << "valor nao aceito" << endl;	
	}
	
	/* 1 2 3 4 5 6 7 8 9 10
	<3 ou >8
	*/
	
	cout << "digite um valor" << endl;
	cin >> num2;
	
	if(num2<3 || num2>8)
	{
		cout << "valor aceito" << endl;
	}
	else 
	{
		cout << "valor nao aceito" << endl;
	}
	
	cout << "digite um valor" << endl;
	cin >> num3;
	
	if(num>3 && num<=6) || (num3>9 && num3<15) || (num3>15 && num<20)
	{
		cout << "valor aceito" << endl;
	}
	else 
	{
		cout << "valor nao aceito" << endl;
	}
	
	// operador not
	
	cout << "digite um valor" << endl;
	cin >> num4;
	
	if(!num4)
	{
		cout << "vou ao cinema" << endl;
	}
	else 
	{
		cout << "vou ao clube" << endl;
	}
	
	
	
	
	
	
	
	return 0;
}


