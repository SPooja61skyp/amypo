a=input().strip()
if any(word.isdigit() for word in a):
    print("Invalid input")
else:
    a=a.replace(",","@")
    a=a.replace(".",",")
    a=a.replace("@",".")
    print(a)