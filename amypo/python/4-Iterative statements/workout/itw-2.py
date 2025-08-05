try:
    num = int(input())
    if num < 0 :
        print("Invalid input")
    elif num == 0 or num == 1:
        print("False")
    else:
        for i in range(2, num):
            if num % i == 0:
                print("False")
                break
        else:
            print("True")
except:
    print("Invalid input")