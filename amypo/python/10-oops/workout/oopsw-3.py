class Rectangle:
    def __init__(self,length,width):
        self.length=length
        self.width=width
    def area(self):
        print (self.length*self.width)
    def perimeter(self):
    print(2*(self.length+self.width))
l=float(input())
b=float(input())
shape=Rectangle(l,b)
if l<=0 or b<=0:
    print("Invalid input")
else:
    shape.area()
    shape.perimeter()