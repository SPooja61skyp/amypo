a=tuple(map(int,input().split()))
if not(i.isalpha for i in a) or any(i<0 for i in a):
    print("Invalid input")
else:
    print(len(a))