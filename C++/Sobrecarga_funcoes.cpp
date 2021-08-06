#include<iostream>

using namespace std;

void soma(int n1,int n2);
void soma();

int main(){
	
	soma();
	soma(20,30);
	
	return 0;
}

void soma(int n1,int n2){
int res;
res = n1 + n2;
cout << res << endl;
}

void soma(){
	int n1, n2, res;
	cout << "digite um numero" << endl;
	cin >> n1;
	cout << "digite outro numero" << endl;
	cin >> n2;
	res = n1 + n2;
	cout << res << endl;
}


