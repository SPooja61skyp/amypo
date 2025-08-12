stu_marks=tuple(map(int,input().split()))
score=int(input())
if any(i<0  for i in stu_marks) or score<0:
    print("Invalid input")
else:
    count=stu_marks.count(score)
    print(count)