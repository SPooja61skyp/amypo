try:
    n=int(input())
    if(n<0 or n>10):
        print("Invalid input")
    else:
        sum=0
        for i in range(0,n+1):
            sum+=i
        print(sum)
except:
            print("Invalid input")