class Add:
    def addition(self):
        a = input()
        b = input()
        try:
            a_int = int(a)
            b_int = int(b)
            print(a_int + b_int)
        except ValueError:
            print('Invalid input')
adder = Add()
adder.addition()