date_str = input()

def is_valid_date_format(s):
    if len(s) != 10 or s[4] != '-' or s[7] != '-':
        return False
    year, month, day = s[:4], s[5:7], s[8:]
    if not (year.isdigit() and month.isdigit() and day.isdigit()):
        return False
    if not (1 <= int(month) <= 12):
        return False
    if not (1 <= int(day) <= 31):
        return False
    return True

if is_valid_date_format(date_str):
    print(date_str)
else:
    print("Invalid date format")