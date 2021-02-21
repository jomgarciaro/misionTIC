import json, requests
from math import ceil

response = requests.get(input())
buyDict = json.loads(response.text)

for i in buyDict:
    products = []
    units = []
    prices = []
    
    for j in i['productos']:
        products.append(j['nombre'])
        units.append(j['cantidad'])
        prices.append(j['precio unitario'])

    total = 0

    for j in range(len(products)):
        total += prices[j] * units[j]

    if total > 700000:
        discount = total * 0.2
    elif total > 300000:
        discount = total * 0.15
    elif total > 150000:
        discount = total * 0.1
    else:
        discount = 0

    print("Centro Comercial Unaleño\nCompra más y Gasta Menos\nNIT: 899.999.063")
    print(f"Cliente: {i['cliente']}")
    print("Art Cant Precio")

    for j in range(len(products)):
        print(f"{products[j]} X{units[j]} ${prices[j] * units[j]}")

    print(f"Total: ${ceil(total-discount)}")
    print(f"En esta compra tu descuento fue ${int(discount)}")
    print("Gracias por tu compra\n---")

