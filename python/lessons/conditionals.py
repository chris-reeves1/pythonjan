# if's elifs, elses
# allows for different pathways for our code to take. 


#is_Admin = True
#is_verified = False
#on_holiday = False

#if (is_Admin or is_verified) and not on_holiday:
#    print("ACESSS GRANTED")
#else:
#    print("DENIED!!")


#temp = 28

#if temp >= 30:
#    print("very hot")
#elif temp >= 20:
#    print("its warm")
#elif temp >= 10:
#    print("its ok")
#elif temp == 0:
#    print("its freezing")
#else:
#    print("generally bad")

# Excercise
# user to input a mark/grade
# mark over 80 print distinction
# mark over 60 print pass
# else fail.

#grade = int(input('Enter Grade: '))

#if grade > 80:
#    print("Distinction")
#elif grade > 60:
#    print("Pass")
#else:
#    print("Fail")

# multiple comparators

#deposit = 999
#password = "password1"

#if 0 < deposit < 100 and password == "password":
 #   print(f"thankyou for deposit of {deposit}")
#else:
#    print("failed to deposit")

# not

#if not 0 < deposit < 100 and password != "password":
#    print("failed to depsit")
#else:
#    print("thanks")

# in and not in

#name = "root123"

#if name in ("root", "admin","user"):
 #   print("invalid username")
#else:
#    print("accepted")

#if name not in ("root", "admin","user"):
#    print("accepted")
#else:
#    print("invalid username")

# exercise:
#weight converter app
#user to input weight
#input for kgs or lbs
#if statements to check the unit
#convert the value
#print out result

#optional - error handling for upper/lower case + incorrrect unit input.

#optional x2- error handling for numeric input (weight). 

# 1st solution

#weight = float(input("Enter weight: "))
#unit = input("enter K(Kgs) or L(Lbs): ")


#if unit.upper() == "K":
  #  converted = weight / 0.45
 #   print(f"converted weight is {converted}")
#elif unit.upper() == "L":
  #  converted = weight * 0.45
 #   print(f"converted weight is {converted}")
#else:
   # print("invalid choice")

# 2nd solution

#try:
 #   result = 10 / 0
#except ZeroDivisionError:
    #print("Division by 0 not allowed")
#except:
 #   print("an error has occured")
#except Exception as e:
 #   print(f"{e}")
#finally:
    #print("clean up actions go here")

#import sys

#while True:
    #try:
     #   weight = float(input("Enter weight: "))
    #    break
   # except ValueError:
  #      print("invalid input pls enter numeric value")
 #       sys.exit()

#while True:
    #unit = input("enter K(Kgs) or L(Lbs): ")
    #if unit.upper() == "K":
       # converted = weight / 0.45
      #  print(f"converted weight is {converted}")
     #   break
    #elif unit.upper() == "L":
       # converted = weight * 0.45
      #  print(f"converted weight is {converted}")
     #   break
    #else:
   #     print("invalid choice")


# highest number

num = 30
num1 = 20

if num > num1:
    print(num)
else:
    print(num1)


# rewrite without using an if staement or any in built functions. (max)

result = num - ((num - num1) & ((num - num1) >> (num + num1 + 1)))
print(result)

results = (num > num1) * num + (num <= num1) * num1
print(results)

num = 30
num1 = 20

print((num, num1)[num < num1])
