try:
    a = int(input())
    b = int(input())


    if b == 0:
        print("Cannot divide by zero")
    else:
        result = a / b
        print(result)
except ZeroDvisionError:
    print("Cannot divide by zero")