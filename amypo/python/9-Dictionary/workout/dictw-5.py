n = int(input())
statuses = []
counts = []
allowed = ["Accepted", "Declined", "Maybe"]

invalid = False

for _ in range(n):
    line = input().strip()
    if ':' not in line:
        invalid = True
        break
    parts = line.split(':')
    if len(parts) != 2:
        invalid = True
        break
    rsvp_status = parts[1].strip()
    if rsvp_status not in allowed:
        invalid = True
        break
    if rsvp_status not in statuses:
        statuses.append(rsvp_status)
        counts.append(1)
    else:
        idx = statuses.index(rsvp_status)
        counts[idx] += 1

if invalid or n == 0:
    print("Invalid input")
else:
    for i in range(len(statuses)):
        print(f"{statuses[i]}: {counts[i]}")