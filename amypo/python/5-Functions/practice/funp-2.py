def valid(a):
    product = 1
    for i in a:
        if i>20:
            print("Invalid input")
            exit()
        else:
            product*= i
    return product

a = list(map(int, input().split()))
print(valid(a))