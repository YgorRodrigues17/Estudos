#include<iostream>

using namespace std;

void imp(string txt = "ygor");
int main(){
	
	imp();
	
	return 0;
}

void imp(string txt){
	cout << txt << endl;
}
