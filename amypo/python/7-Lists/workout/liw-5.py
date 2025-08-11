a=list(map(int,input().split()))
b,c=int(input()),int(input())
if b>len(a) or c>len(a):
    print("Invalid input")
else:
    a[b],a[c]=a[c],a[b]
    print(*a)