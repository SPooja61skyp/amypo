url = input().strip()

if url.startswith("http://") or url.startswith("https://"):
    print(url)
else:
    print("Invalid URL format")