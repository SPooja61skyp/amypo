class Animal:
    def make_sound(self):
        pass

class Dog(Animal):
    def make_sound(self):
        print("Woof!")

class Cat(Animal):
    def make_sound(self):
        print("Meow!")

def main():
    animal_type = input().strip()

    if animal_type == "Dog":
        animal = Dog()
        animal.make_sound()
    elif animal_type == "Cat":
        animal = Cat()
        animal.make_sound()
    else:
        print("Invalid input")


main()