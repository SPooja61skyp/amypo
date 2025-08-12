import json
key = input().strip()
dictionary_str = input().strip()
dictionary = json.loads(dictionary_str)
if key in dictionary:
    print(dictionary[key])
else:
    print("Key not found")