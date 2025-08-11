stock = list(map(int, input().split()))

remove = list(map(int, input().split()))


if any(x < 0 for x in stock) or any(x < 0 for x in remove):
    print("Invalid input")
else:

    remaining = [item for item in stock if item not in remove]
    print(*remaining)