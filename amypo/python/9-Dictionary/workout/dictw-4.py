n = int(input())
for _ in range(n):
    ts = input().strip()
    if not ts or not ts.isdigit():
        print("Invalid input")
    else:
        digit_sum = sum(int(ch) for ch in ts)
        print(digit_sum)