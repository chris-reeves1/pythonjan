# part 1

#age = int(input("enter age"))

#if age >= 18:
#    print("cat a")
#if age >= 16 and age <18:
#    print("cat b")
#if age < 16:
#    print("cat c")    

#if age >= 18:
#    print("cat a")
#elif age >= 16:
#    print("cat b")
#else:
#    print("cat c")

# part 2

#num1 = int(input("enter first number: "))
#num2 = int(input("enter second number: "))

#print("Calc options")
#print("1. add")
#print("2. subtract")

#choice = input("choose option 1 or 2: ")

#if choice == "1":
#    result = num1 + num2 
#    print(result)
#elif choice == "2":
#    result = num1 - num2
#    print(result)
#else:
#    print("invalid choice")

# part 3.2

#mark = int(input("enter a grade between 1 and 100: "))
#level = int(input("enter the level (1 or 2): "))

#if mark < 1 or mark > 100:
 #   print("error: mark must be between 1 and 100")
#elif level == 1:
    #if mark < 50:
     #   print("fail")
    #elif mark <= 60:
     #   print("pass")
    #elif mark <= 70:
    #    print("merit")
    #else:
       # print("distinction")
#elif level == 2:
    #if mark < 40:
     #   print("fail")
    #elif mark <= 50:
     #   print("pass")
    #elif mark <= 60:
     #   print("merit")
    #else:
        #print("distinction")
#else:
    #print("level must be 1 or 2")

# part 4 

print("Pythagoras’ Calculator \n 1. Find the length of A given B and C \n 2. Find the length of B given A and C \n 3. Find the length of C given A and B")

length = int(input("Enter 1, 2 or 3. 1 will calculate adjecent side, 2 will calculate Opposite side and 3 wil calculate Hypotenuse"))

if length == 1:
    B_length = float(input("Length of side B?"))
    C_length = float(input("Length of side C?"))
    print(f"The length of side A is {(C_length**2 - B_length**2)**0.5}")
if length == 2:
    A_length = float(input("Length of side A?"))
    C_length = float(input("Length of side C?"))
    print(f"The length of side B is {(C_length**2 - A_length**2)**0.5}")
if length == 3:
    A_length = float(input("Length of side A?"))
    B_length = float(input("Length of side B?"))
    print(f"The length of side C is {(A_length**2 + B_length**2)**0.5}")

print("Done!")