string1 = input()
string2 = input()

stringList = list(string2)

stringList.reverse()

string2 = "".join(stringList)

if string1 == string2:
    print("SI")
else:
    print("NO")