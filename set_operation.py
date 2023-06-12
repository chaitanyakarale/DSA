'''To create ADT that implement the &quot;set&quot; concept.
a. Add (new Element) -Place a value into the set , b. Remove (element) Remove the value
c. Contains (element) Return true if element is in collection, d. Size () Return number of
values in collection Iterator () Return an iterator used to loop over collection, e.
Intersection of two sets , f. Union of two sets, g. Difference between two sets, h. Subset'''

A = set()
B = set()

while 1>0:
    print("1. Add elements")
    print("2. Remove elemets")
    print("3. Size of set ")
    print("4. Intersection ")
    print("5. Union")
    print("6. Difference ")
    print("7. Subset")
    ch = int(input("Enter choice - "))

    if ch == 1:
        n1 = int(input("Enter no of elements in set A - "))
        for i in range(n1):
            A.add(input("Enter element - "))

        n2 = int(input("Enter no of elements in set B - "))
        for i in range(n2):
            B.add(input("Enter element - "))

        print("A = ",A)
        print("B = ",B)

    elif ch == 2:
        user_input = int(input("Enter a number to remove - "))
        A.remove(user_input)
        print("A = ",A)
    elif ch == 3:
        print("Size of set A - ",len(A))
        print("Size of set B - ",len(B))
    elif ch == 4:
        print("A ^ B = ",A & B)
    elif ch == 5:
        print("A U B = ",A .union(B))
    elif ch == 6:
        print(" A - B = ",A-B)
    elif ch == 7:
        if B.issubset(A):
            print("B is subset of A")
        else:
            print("B is not subset of A")
