balance = int(input())
withdrawal = int(input())

if withdrawal <= balance:
    print("Withdrawal successful")
else:
    print("Insufficient funds")