a = input()
try:
    nums = tuple(map(int, a.split(",")))
    if any(i < 0 for i in nums):
        print("Invalid input")
    else:
        duplicates_removed = tuple(sorted(set(nums), key=nums.index))
        print(duplicates_removed)
except:
    print("Invalid input")