a=input()
try:
    val=int(a)
    if -128<=val<=127:
        print("Fits in byte")
    else:
        print("Does not fit")
except ValueError:
    print("Invalid input")