line = input().strip().split()

if len(line) < 2:
    print("Missing argument")
else:
    a = int(line[0])
    b = int(line[1])
    print(a + b)