a= input().split()
if any(not word.isalpha() for word in a):
    print("Invalid input")
else:
    for word in a:
        if(len(word)%2==0):
            print(word)