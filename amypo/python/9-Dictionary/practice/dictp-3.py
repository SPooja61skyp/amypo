n = int(input())
vowels = set('aeiou')

for _ in range(n):
    sentence = input().strip().lower()
    
    if not sentence or not all(c.isalpha() or c.isspace() for c in sentence):
        print("Invalid input")
    else:
        consonant_count = {}
        for char in sentence:
            if char.isalpha() and char not in vowels:
                consonant_count[char] = consonant_count.get(char, 0) + 1
        print(consonant_count)