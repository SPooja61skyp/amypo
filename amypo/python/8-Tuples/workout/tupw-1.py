a=tuple(map(int,input().split()))
if any(i < 0 for i in a):
    print("Invalid input")
else:
    print(*a)