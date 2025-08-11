try:
    a = list(map(int, input().split()))
    unique_scores = list(set(a))  #

    if len(unique_scores) < 2:
        print("Invalid input")
    else:
        unique_scores.sort(reverse=True)  
        print(unique_scores[1])  
except:
    print("Invalid input")