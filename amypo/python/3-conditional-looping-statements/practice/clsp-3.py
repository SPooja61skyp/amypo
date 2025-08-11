try:
    y=int(input())
    if(y<0 or y>10000):
        print("Invalid input")
    elif y%4==0 and y%100!=0 or y%400==0:
        print("leap year")
    else:
        print("Not a leap year")
except:
    print("Invalid input")