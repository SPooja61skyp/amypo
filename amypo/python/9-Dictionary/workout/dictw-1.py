dict1 = eval(input())
dict2 = eval(input())

merged = dict1.copy()

for key, value in dict2.items():
    if key in merged:
        merged[key] = max(merged[key], value)
    else:
        merged[key] = value

print(merged)