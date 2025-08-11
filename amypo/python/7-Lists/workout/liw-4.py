try:
    a = list(map(int, input().split()))

    if len(a) < 1 or any(i < 0 for i in a):
        print("Invalid input")
    else:
        even = [str(num) for num in a if num % 2 == 0]
        odd = [str(num) for num in a if num % 2 != 0]

        print(" ".join(even))
        print(" ".join(odd))
except:
    print("Invalid input")