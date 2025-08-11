def calc(n):
    sum=0
    product=1
    for i in n:
        sum+=i
        product*=i
    return sum,product
try:
    n=list(map(int,input().split()))
    s,p=calc(n)
    print(f"Sum of elements: {s}")
    print(f"Product of elements: {p}")
except:
    print("Invalid input")