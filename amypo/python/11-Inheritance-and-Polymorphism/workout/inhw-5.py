import math

class Shape:
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, r):
        self.r = r

    def area(self):
        if self.r <= 0:
            return "Invalid input"
        return round(math.pi * self.r ** 2, 2)

class Rectangle(Shape):
    def __init__(self, l, w):
        self.l = l
        self.w = w

    def area(self):
        if self.l <= 0 or self.w <= 0:
            return "Invalid input"
        return round(self.l * self.w, 2)

results = []

try:
    n = int(input())
    if n < 1 or n > 10:
        raise ValueError
except:
    print("Invalid input")
    exit()

for _ in range(n):
    params = list(map(int, input().strip().split()))
    if len(params) == 1:
        shape = Circle(params[0])
        res = shape.area()
    elif len(params) == 2:
        shape = Rectangle(params[0], params[1])
        res = shape.area()
    else:
        res = "Invalid input"
    results.append(res)

for res in results:
    print(res)