num1=float(input())
num2=float(input())
num3=float(input())
if num1<0 or num2<0 or num3<0:
    print("Invalid input")
else:
    print(max(num1,num2,num3))