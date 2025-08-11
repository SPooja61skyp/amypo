a = list(map(int, input().split()))
if any(x < 0 for x in a):
    print("Invalid input")
else:
    even = sum(1 for x in a if x % 2 == 0)
    odd = sum(1 for x in a if x % 2 != 0)
    print(even)
    print(odd)  