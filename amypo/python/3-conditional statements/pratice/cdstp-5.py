def fibbo(n):
    f,s=0,1
    if n<0:
        print("Invalid input")
    else:
        for i in range(n):
            print(f,end=" ")
            t=f+s
            f=s
            s=t
    return f
try:
    n=int(input())
    fibbo(n)
except:
    print("Invalid input")