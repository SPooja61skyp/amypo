a=int(input())
b=int(input())
c=int(input())
d=a+b+c
if(d<0 or d>180):
    print("Invalid triangle")
elif a==b and b==c and c==a:
    print("equilateral")
elif a==b or b==c or c==a:
    print("isosceles")
else:
    print("scalene")