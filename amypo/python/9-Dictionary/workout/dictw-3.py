n = int(input())
target_elements = ['a', 'e', 'i', 'o', 'u']

for _ in range(n):
    sentence = input().strip().lower()
    dict = {v: 0 for v in target_elements}  # initialize all vowels to 0
    
    if not sentence or not sentence.replace(" ", "").isalpha():
        print("Invalid input")
    else:
        for i in sentence:
            if i in target_elements:
                dict[i] += 1
        print(dict)