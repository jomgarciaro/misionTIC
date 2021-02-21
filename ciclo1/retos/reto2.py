from math import ceil

amount = int(input())
products = []

for i in range(amount*2):
    products.append(input())

values = products[1::2]

total = 0

for i in values:
    total += int(i)

if total > 700000:
    discount = total * 0.2
elif total > 300000:
    discount = total * 0.15
elif total > 150000:
    discount = total * 0.1
else:
    discount = 0

print('''Centro Comercial Unaleño
Compra más y Gasta Menos
NIT: 899.999.063''')

for i in range(amount):
    print(f"{products[i*2]} ${values[i]}")

print(f"Total: ${ceil(total-discount)}")
print(f"En esta compra tu descuento fue ${int(discount)}")
print("Gracias por tu compra")