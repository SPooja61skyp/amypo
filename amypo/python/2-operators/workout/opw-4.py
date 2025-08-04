binary = input().strip()
if len(binary) < 1 or len(binary) > 32:
    print("Invalid input")
elif not all(char in '01' for char in binary):
    print("Invalid input")
else:
    decimal = int(binary, 2)
    print(decimal)