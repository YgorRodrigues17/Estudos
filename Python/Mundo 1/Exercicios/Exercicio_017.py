import math
c1 = float(input('Qual o valor do 1 cateto?'))
c2 = float(input('Qual o valor do 2 cateto?'))
h = math.hypot(c1, c2)
print('A hipotenusa ira medir {}'.format(h))