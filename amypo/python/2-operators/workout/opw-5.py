try:
    a, b = int(input()) , int(input())
    c=a&b
    if a<=-10**3 or b>=10**6 or a>=10**3 or b<=-10**6:
        print("Invalid input")
    else:
        print(c)
        
except:
    print("Invalid input")