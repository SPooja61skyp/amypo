a=list(map(int,input().split()))
if any(i<0 for i in a):
    print("Invalid input")
else:
    a.remove(a[0])
    print(*a)