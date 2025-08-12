try:
    n = int(input())
    if n < 1 or n > 20:
        print("Invalid input")
    else:
        word_count = {}
        valid = True
        
        for _ in range(n):
            sentence = input().strip()
            if not sentence:
                valid = False
                break
            words = sentence.split()
            for word in words:
                if not word.isalpha():
                    valid = False
                    break
                word_lower = word.lower()
                word_count[word_lower] = word_count.get(word_lower, 0) + 1
            if not valid:
                break
        
        if valid:
            for word, count in word_count.items():
                print(f"{word} : {count}")
        else:
            print("Invalid input")
except:
    print("Invalid input")