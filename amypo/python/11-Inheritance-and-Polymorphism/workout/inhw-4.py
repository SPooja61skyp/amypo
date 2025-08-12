class Employee:
    def __init__(self, base_salary):
        self.base_salary = base_salary

    def calculate_salary(self):
        return self.base_salary

class Manager(Employee):
    def calculate_salary(self):
        # 20% bonus for managers
        return self.base_salary * 1.2

class Developer(Employee):
    def calculate_salary(self):
        # 10% overtime for developers
        return self.base_salary * 1.1

try:
    emp_type = int(input().strip())
    base_salary = int(input().strip())
except:
    print("Invalid input")
    exit()

# Validation
if base_salary < 0 or emp_type not in [1, 2]:
    print("Invalid input")
    exit()

if emp_type == 1:
    emp = Manager(base_salary)
elif emp_type == 2:
    emp = Developer(base_salary)
else:
    print("Invalid input")
    exit()

print("{:.2f}".format(emp.calculate_salary()))