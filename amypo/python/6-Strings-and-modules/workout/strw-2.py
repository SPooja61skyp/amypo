a = input()

#
if not any(char.isalpha() for char in a):
    print("Invalid input")
else:
    words = a.split()
    reversed_words = words[::-1]
    result = ' '.join(reversed_words)
    print(result)