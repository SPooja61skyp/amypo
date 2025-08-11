number = {
    "zero": "0", "one": "1", "two": "2", "three": "3", "four": "4",
    "five": "5", "six": "6", "seven": "7", "eight": "8", "nine": "9"
}
words = input().strip().split()
if any(word.isdigit() for word in words):
    print("Invalid input")
else:
    output = []
    for word in words:
        if word.lower() in number:
            output.append(number[word.lower()])
        else:
            output.append(word)
    print(" ".join(output))