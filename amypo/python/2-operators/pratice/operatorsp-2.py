try:
    a=int(input())
    b=int(input())
    if a>0 and b>0:
        c=(a*1000)/3600
        d=int(round(c*b))
        print(d)
        
    else:
        print("Invalid input")
except:
    print("Invalid input")