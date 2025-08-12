initial_balance = int(input())
deposit_amount = int(input())
withdraw_amount = int(input())

if initial_balance < 0 or deposit_amount < 0 or withdraw_amount < 0:
    print("Invalid input")
else:
    final_balance = initial_balance + deposit_amount - withdraw_amount
    print(final_balance)