a=int(input())
if(-273<=a<=0):
    print("Solid")
elif(a>0 and a<100):
    print("Liquid")
elif(a>=100):
    print("Gas")
else:
    print("Invalid input")
