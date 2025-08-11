a=input()
if not a.replace(" ","").isalpha():
    print("Invalid input")
else:
    print(a.title())