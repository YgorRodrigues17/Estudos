#include<iostream>

using namespace std;

int main(){
	float vp1, vp2, vf, res;
	cout << "digite sua nota vp1" << endl;
	cin >> vp1;
	cout << "digite sua nota vp2" << endl;
	cin >> vp2;
	cout << "digite sua nota vf" << endl;
	cin >> vf;
	res = (vp1 * 1 + vp2 * 2 + vf * 3) / 6;
	cout << res << endl;
	
	if(res >= 5.5)
	{
		cout << "aluno aprovado" << endl;
	}
	else
	{
		cout << "aluno reprovado" << endl;
	}

	
	return 0;
}
