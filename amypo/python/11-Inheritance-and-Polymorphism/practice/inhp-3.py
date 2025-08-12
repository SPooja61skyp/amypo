
num_items = int(input())

valid_types = {'Fruit', 'Vegetable', 'Dairy'}
total_calories = 0

for _ in range(num_items):
    try:
        line = input().strip().split()
        if len(line) != 3:
            print("Invalid input")
            exit()
        item_type = line[0]
        quantity = int(line[1])
        calories_per_unit = int(line[2])
        if item_type not in valid_types:
            print("Invalid input")
            exit()
        if quantity < 0 or calories_per_unit < 0:
            print(-1)
            exit()

        total_calories += quantity * calories_per_unit

    except Exception:
        print("Invalid input")
        exit()

print(total_calories)