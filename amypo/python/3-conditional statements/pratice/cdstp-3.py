def centered_pyramid(n):
    if not isinstance(n, int) or n <= 0 or n > 15:
        print("Invalid input")
        return
    for i in range(n):
        spaces = " " * (n - i - 1)
        stars = "*" * (2 * i + 1)
        print(spaces + stars)

try:
    num = int(input())
    centered_pyramid(num)
except:
    print("Invalid input")