n = int(input())
try:
    assert n > 0
    print(n)
except AssertionError:
    print("AssertionError")