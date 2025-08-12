name = input().strip()
age_input = input().strip()
if len(name) < 1 or len(name) > 100:
    print("Invalid input")
else:
    try:
        age = int(age_input)
        if 10 <= age <= 150:
            print(name)
            print(age)
        else:
            print("Invalid input")
    except:
        print("Invalid input")