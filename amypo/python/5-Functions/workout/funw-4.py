def square(n):
    peri=4*n
    return peri
try:
    n=int(input())
    if n<0 or n>50:
        print("Invalid input")
    else:
        print(square(n))
except:
    print("Invalid input")