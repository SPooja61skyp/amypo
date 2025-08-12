class TreeAnalyzer:
    def init(self):
        pass

    def find_tallest(self, sequences):
        for line in sequences:
            try:
                if not line.strip():
                    raise ValueError
                heights = list(map(int, line.strip().split()))
                print(max(heights))
            except:
                print("Invalid input")

try:
    n = int(input())
    sequences = [input() for _ in range(n)]
    analyzer = TreeAnalyzer()
    analyzer.find_tallest(sequences)
except:
    print("Invalid input")