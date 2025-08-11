import math 
def cubes(m,n):
    if m>n or m<0 or n<0 :
        return "Invalid input"
        exit()
    else:
        sum=0
        for i in range(m,n+1):
            cubes =pow(i,3)
            sum+=cubes
        return sum
m=int(input())
n=int(input())
result=cubes(m,n)
print(result)