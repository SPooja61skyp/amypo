try:
    n=int(input())
    if(n<0 ):
        print("Invalid input")
    else:
        for i in range(1,n+1):
            if i%3==0:
                print(i)
except:
    print("Invalid input")