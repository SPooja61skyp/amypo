def print_diamond(n):
    if not isinstance(n,int) or n % 2 == 0 or n <0 or n > 15:
        print("Invalid input")
        return

    mid = n // 2
    for i in range(mid + 1):
        spaces = ' ' * (mid - i)
        stars = '*' * (2 * i + 1)
        print(spaces + stars)
    for i in range(mid - 1, -1, -1):
        spaces = ' ' * (mid - i)
        stars = '*' * (2 * i + 1)
        print(spaces + stars)
try:
    n = int(input())
    print_diamond(n)
except:
    print("Invalid input")