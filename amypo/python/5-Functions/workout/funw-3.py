def batteries(n):
    total = 0
    for num in n:
        if num < 0:
            return "Invalid input"
        total += num ** 2
    return total

try:
    n = list(map(int, input().split()))
    print(batteries(n))
except:
    print("Invalid input")