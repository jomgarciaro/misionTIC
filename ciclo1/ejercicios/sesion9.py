countryA = int(input())
countryB = int(input())

count = 1

while countryA > countryB:
    count += 1
    countryA *= 1.02
    countryB *= 1.03

print(count)