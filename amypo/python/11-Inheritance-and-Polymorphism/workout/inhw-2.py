class Course:
    def calculate_fee(self, value):
        raise NotImplementedError("Subclasses should implement this method.")

class BasicCourse(Course):
    def calculate_fee(self, value):
        if value < 0:
            return "Invalid input"
        return 100

class PremiumCourse(Course):
    def calculate_fee(self, value):
        if value < 0:
            return "Invalid input"
        return value * 150

# Main logic
course_type = input().strip()
try:
    value = int(input().strip())
except:
    print("Invalid input")
    exit()

if course_type == "Basic":
    course = BasicCourse()
elif course_type == "Premium":
    course = PremiumCourse()
else:
    print("Invalid input")
    exit()

result = course.calculate_fee(value)
print(result)