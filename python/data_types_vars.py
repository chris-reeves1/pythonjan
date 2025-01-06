# vars - a reference (a name), refere3nces a selection of memory (mem location)
# protected location. 

#x = 20
#person_one_age = 20
#personAge = 20 

# consistancy is key!
# pep-8 style guide. 

# naming convention: should be decriptive, dont start with a number, not capitalised, no keywords!

# 1age = not allowed!
# Age = 10 reserved for class names
# AGE = constants - just a convention. 
# class_ = 10 avoid keywords

#PascalCase - class names/file names
#camelCase vars/functions/methods
#snake_case vars/functions/methods

#a = 1000
#b = 1000


#print(a is b) # interning 

#def t1():
#    c = int(str(260))
#    return c
#def t2():
#    d = int(str(260))
#    return d

#print(t1() is t2())

# scope

#global_variable = "accessible everywhere"
#x = 20

#def my_function():
    #global x 
    #x = 10 # shadowing 
  #  local_variable = "accessible only inside this function"
 #   print(local_variable)
 #   print(global_variable)

#my_function()

#print(x)

# data types

#int = 20
#string = ""
#float = 12.23
#bool = True/False, 1/0, something/nothing

# in built functions
# print()
# input()

#import sys

#with open("output.txt", "w") as file:
    #sys.stdout = file
    #print("go to the file instead pls!!")

#sys.stdout = sys.__stdout__

#print("hello")

# escape chars

# \ take the next symbol as its literal meaning
# \t tab, \n newline, \u unicode, \U extended unicde, \\ backslash

# print("Person1: \tHey how are you?\nPerson2\\: \tim good thanks \U0001f604")

# string concatenation 

#name = input("enter your name: ") # defaults to a string
#age = int(input("enter your age: "))

#message = "your name is {}, your age is {}".format(name, age)
#print(message)

#print("your name is " + name) # limited to same data type
#print("your name is", name, "your age is", age)

#print(f"your name is {name}, your age is {age}")

# BODMAS 

#floor division // - 10//3 = 3
#% 10%3 = 1 # give the remainder. 

# string methods

#print("hello world".upper())
#print("HELLO WORLD".lower())

#print("hello world".count("o", 3, -3))

#print("hello world world world".replace("world", "class", 2))

#print("h#el#lo#wor#l#d".split("#"))







