class Person:
    def __init__(self,name):
        self.name=name
name_user=input()
person=Person(name_user)
print(f"The person's name is: {person.name}")