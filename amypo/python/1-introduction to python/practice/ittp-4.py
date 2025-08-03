arr=list(map(int,input().split()))
last=arr[-1]
shift=[last]+arr[:-1]
for num in shift:
    print(num,end=" ")