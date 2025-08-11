import math
a=int(input())
b=int(input())
if a<0 or b<0:
    print("Invalid input")
else:
    print(math.lcm(a,b))