def triangle(a,b):
    c=(a*b)/2
    return c
    
a,b=map(int,input().split())
if a<0 or  b<0:
    print("Invalid input")
else:
    print(float(triangle(a,b)))