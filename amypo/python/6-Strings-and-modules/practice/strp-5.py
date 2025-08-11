import math
a=float(input())
if a<0:
    print("Invalid input")
else:
    area = (math.pi) * pow(a,2) 
    print(f"{area : .2f}")