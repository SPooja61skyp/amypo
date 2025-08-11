a = input().strip()
if any(char.isdigit() for char in a):
    print("Invalid input")
else:
    result = ''
    seen = set()
    for char in a:
        if char not in seen:
            result += char
            seen.add(char)
    print(result)