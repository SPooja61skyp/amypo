try:
    s = input().strip()         
    num_raw = input().strip()   
    try:
        if '.' in num_raw:
            num = float(num_raw)
        else:
            num = int(num_raw)
    except ValueError:
        raise TypeError
    result = s + str(num)
    print(result)
except TypeError:
    print("TypeError")