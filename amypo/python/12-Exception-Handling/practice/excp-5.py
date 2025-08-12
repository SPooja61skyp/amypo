N = float(input())
power = float(input())
if N<0 and power<0:
    print("Unsupported operation")
else:
    result = N ** power
    if result == int(result):
        print(int(result))
    else:
        print(result)