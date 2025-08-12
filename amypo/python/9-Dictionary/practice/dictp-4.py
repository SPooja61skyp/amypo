n = int(input())
for _ in range(n):
    sequence = input().strip()
    
    if not sequence or not sequence.isdigit():
        print("Invalid input")
    else:
        freq = {}
        for digit in sequence:
            freq[digit] = freq.get(digit, 0) + 1
        print(freq)