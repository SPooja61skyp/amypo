try:
    num1,num2=int(input()),int(input())
    if num1<0 or num2<0:
        print("Invalid input")
    elif num2==0:
        print("Cannot divide by zero")
    else:
        print(int(round(num1/num2)))
except:
    print("Invalid input")