from math import ceil

products = []

def splitComand ():
    comand = input().split("&")
    if comand[0] == "1":
        comand1(comand)
    elif comand[0] == "2":
        comand2(comand)

def comand1 (comand):
    products.append(comand[1])
    products.append(int(comand[2]))
    products.append(int(comand[3]))
    splitComand()
    
def comand2 (comand):
    values = products[2::3]
    quantities = products[1::3]
    total = 0

    for i in range(len(values)):
        total += values[i] * quantities[i]

    if total > 700000:
        discount = total * 0.2
    elif total > 300000:
        discount = total * 0.15
    elif total > 150000:
        discount = total * 0.1
    else:
        discount = 0

    print("Centro Comercial Unaleño\nCompra más y Gasta Menos\nNIT: 899.999.063")
    print(f"Cliente: {comand[1]}")
    print("Art Cant Precio")

    for i in range(len(products) // 3):
        print(f"{products[i*3]} X{quantities[i]} ${values[i] * quantities[i]}")

    print(f"Total: ${ceil(total-discount)}")
    print(f"En esta compra tu descuento fue ${int(discount)}")
    print("Gracias por tu compra\n---")
    
    products.clear()

    splitComand()

splitComand()
