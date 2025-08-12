n = int(input())
for _ in range(n):
    color_code = input().strip()
    if not color_code or not color_code.isalpha():
        print("Invalid input")
    else:
        count = {}
        for char in color_code:
            count[char] = count.get(char, 0) + 1
        print(count)