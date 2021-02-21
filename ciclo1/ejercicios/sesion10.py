n = int(input("Digite n:"))
m = int(input("Digite m:"))

print("Los múltiplos son:")

for i in range(n // m + 1):
    print(m * i)