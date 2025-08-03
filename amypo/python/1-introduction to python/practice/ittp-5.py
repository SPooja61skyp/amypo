a ,b = list(map(int,input().split()))
if a < 0 or a >= 10**6 or b < 0 or b >= 10**6:
    print("Invalid input")
elif a < b:
    print("Insufficient Balance")
else:
    print(a-b)