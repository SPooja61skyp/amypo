try:
    a = list(map(int, input().split()))
    if any(i < 0 for i in a):
        print("Invalid input")
    else:
        result = [sum(int(digit) for digit in str(num)) for num in a]
        print(' '.join(map(str, result)))
except:
    print("Invalid input")