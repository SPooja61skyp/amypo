a=input()
if (len(a)>1):
    print("Invalid input")
elif (a.isalpha() and len(a)==1):
    print("Letter")
elif(a.isdigit()):
    print("Digit")
else:
    print("Special Character")