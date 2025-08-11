playlist1 = input().split()
playlist2 = input().split()

set2 = set(playlist2)

printed = set()
for song in playlist1:
    if song in set2 and song not in printed:
        print(song)
        printed.add(song)