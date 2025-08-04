def right_triangle(n):
    for i in range(1,n+1):
        print("* "*i)
try:
    n=int(input())
    if n<0:
        print("Invalid input")
    else:
        right_triangle(n)
except:
    print("Invalid input")