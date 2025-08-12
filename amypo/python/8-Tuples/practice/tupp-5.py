a=tuple(map(int,input().split()))
if any(i<0 for i in a):
    print("Invalid input")
else:
    print(f"Assignment Score: {a[0]}")
    print(f"Exam Score: {a[1]}")
    print(f"Project Score: {a[2]}")