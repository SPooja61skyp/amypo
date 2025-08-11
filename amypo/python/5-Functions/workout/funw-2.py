def swap(num1,num2):
    temp=num1
    num1=num2
    num2=temp
    return num1,num2
try:
    num1,num2=int(input()),int(input())
    if num1<0 or num2<0:
        print("Invalid input")
    else:
        print(f"Before swapping: num1 = {num1} and num2 = {num2}")
        print(f"After swapping: num1 = {num2} and num2 = {num1}")
except:
    print("Invalid input")