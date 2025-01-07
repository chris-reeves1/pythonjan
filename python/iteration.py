# loops
# while + for

# while 

# need a condition to start the loop.
# need a condition to stop the loop.
# continuosuly execute a block of code. 

#x = 0
#while x < 101:
 #   print(x)
 #   x += 1

# break + continue

#i = 0
#while i < 6:
#    if i == 3:
#        break
#    print(i)
#    i += 1

#j = 0 

#while j < 6:
#    j += 1
#    if j == 3:
#        continue # skips to next iteration. 
#    print(j)

# for loops
# used for looping through an iterable. 

#my_fruits = ["apple", "pear", "orange", "kiwi"]

    # item    # iterable
#for fruit in my_fruits:
#    print(fruit)


#l = 0
#while l < len(my_fruits):
#    print(my_fruits[l])
#    l += 1 

# range

#for a in range(5):
 #   print(a)

#for a in range(1,5):
 #   print(a)

#for a in range(1, 10, 2): # steps
#    print(a)

# strings

#for letter in "hello":
    #print(letter)

# list comprehension - used for making lists
     # expression # item # iterable
#result = [x**2 for x in  range(5)]
#print(result)

#results = []

#for x in range(5):
 #   results.append(x**2)

#print(results)

#numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
                        # expression #item #iterable #condtion
#even_squared_numbers = [number**2 for number in numbers if number % 2 == 0]
#even_squared_numbers = [x**2 for x in [int(number) for number in numbers]]

#print(even_squared_numbers)

# dictories

for i in {"Still":"water"}:
    print(i)

for i in {"Still":"water"}.values():
    print(i)

for i, j in {"Still":"water"}.items():
    print(i, j)

# exercise
# write a loop that takes in 5 name as input and print name + "is cool"
# while loop
# for loop
# list comp
# optional - 1 line list comp!! 