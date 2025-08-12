n = int(input())
for _ in range(n):
    sentence = input().strip()
    if not sentence or not all(c.isalpha() or c.isspace() for c in sentence):
        print("Invalid input")
    else:
        words = sentence.split()
        word_lengths = {word: len(word) for word in words}
        print(word_lengths)