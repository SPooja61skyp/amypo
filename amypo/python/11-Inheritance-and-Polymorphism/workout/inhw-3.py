class Account:
    def __init__(self, balance):
        self.balance = balance

    def balance0(self):
        pass

class SavingsAccount(Account):
    def balance0(self):
        # Savings accounts get 5% interest
        return self.balance * 1.05

class CurrentAccount(Account):
    def balance0(self):
        # No interest for current accounts
        return self.balance

# Read inputs
acc_type = input().strip().lower()
try:
    balance = float(input().strip())
except:
    print("Invalid input")
    exit()

if acc_type not in ['savings', 'current'] or balance < 1 or balance > 100000:
    print("Invalid input")
    exit()

if acc_type == 'savings':
    acc = SavingsAccount(balance)
else:
    acc = CurrentAccount(balance)

print(f"{acc.balance0():.2f}")