a = list(map(int, input().split()))
b = list(map(int, input().split()))

if any(i < 0 for i in a) or any(j < 0 for j in b):
    print("Invalid input")
else:
    merged = a + b
    print(' '.join(map(str, merged)))