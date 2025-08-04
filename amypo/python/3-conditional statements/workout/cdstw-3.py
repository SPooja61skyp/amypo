n=int(input())
if n<0:
    print("Invalid input")
elif n%4==0  or n%400==0:
    print("Leap Year")
else:
    print("Not a Leap Year")