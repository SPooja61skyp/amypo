def speed(n):
    if n<0:
        print("Invalid input")
    elif n<60:
        print("Normal")
    elif n>=60 and n<80:
        print("Warning")
    elif n>=80 and n<=200:
        print("Over Speed")
n=int(input())
speed(n)