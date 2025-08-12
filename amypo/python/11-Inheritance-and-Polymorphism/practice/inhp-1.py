class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def printInfo(self):
        print(f"{self.name} {self.age}")

class Student(Person):
    def __init__(self, name, age, dob):
        super().__init__(name, age)
        self.dob = dob

    def printStudentInfo(self):
        print(f"{self.name} {self.age} {self.dob}")


name = input().strip()
age = int(input().strip())
dob = input().strip()
p = Person(name, age)
p.printInfo()
s = Student(name, age, dob)
s.printStudentInfo()