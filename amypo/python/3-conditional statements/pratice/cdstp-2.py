try:
    n=int(input())
    if n<0:
        print("Invalid input")
    else:
        for i in range(1,11):
            print(f"{n} x {i} = {n*i}")
except:
    print("Invalid input")