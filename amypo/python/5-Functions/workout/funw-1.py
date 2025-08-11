def i_d(n):
    total=0
    while(n>0):
        digit=n%10
        total+=digit
        n//=10
    return total
try:
    n=int(input())
    if n<0:
        print("Invalid Input")
    else:
        print(i_d(n))
except:
    print("Invalid Input")