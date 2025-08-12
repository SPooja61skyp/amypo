text=input()
frequency={}
for i in text:
    if i in frequency:
        frequency[i]+=1
    else:
        frequency[i]=1
for i,j in frequency.items():
    if i==' ':
        print("' ':",j)
    else:
        print(f"'{i}': {j}")