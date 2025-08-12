title = input().strip()
author = input().strip()
try:
    pages = int(input().strip())
    if pages > 0:
        print(title)
        print(author)
        print(pages)
    else:
        print("Invalid input")
except:
    print("Invalid input")