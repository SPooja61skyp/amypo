try:
    a=int(input())
    b=int(input())
    if a<0 and a>=100 and b<=0 and b>=100:
        print("Invalid input")
    else:
        print((a**b)*a)
except:
    print("Invalid input")