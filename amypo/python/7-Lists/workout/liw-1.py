
a=list(map(int,input().split()))
sum=0
for i in a:
    if i<0 or i>10000:
        print("Invalid input")
        exit()
    else:
        if i%2!=0:
            sum+=i
print(sum)