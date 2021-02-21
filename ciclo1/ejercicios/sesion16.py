def buyTravel():
    m = int(input())
    products = {}

    for i in range(m):
        item = input().split(" ")
        products[item[0]] = float(item[1])

    p = int(input())

    total = 0

    for i in range(p):
        item = input().split(" ")
        total += products[item[0]] * int(item[1])

    return "${:.2f}".format(total)

n = int(input())

buyList = []

for i in range(n):
    buyList.append(buyTravel())

for i in range(n):
    print(buyList[i])