a=tuple(map(int,input().split()))
b=tuple(map(int,input().split()))
if any (i<0 for i in a) or any(j<0 for j in b):
    print("Invalid input")
else:
    print(a+b)