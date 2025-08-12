class Vehicle:
    def __init__(self, horsepower):
        self.horsepower = horsepower

    def max_speed(self):
        pass 

class Car(Vehicle):
    def max_speed(self):
        return self.horsepower * 2

class Bike(Vehicle):
    def max_speed(self):
        return self.horsepower * 1.5

def main():
    vehicle_type = input().strip()
    horsepower_input = input().strip()
    try:
        horsepower = int(horsepower_input)
        if horsepower < 0:
            print("Invalid input")
            return
    except:
        print("Invalid input")
        return

    if vehicle_type == "Car":
        v = Car(horsepower)
    elif vehicle_type == "Bike":
        v = Bike(horsepower)
    else:
        print("Invalid input")
        return

    print(int(v.max_speed()))

main()