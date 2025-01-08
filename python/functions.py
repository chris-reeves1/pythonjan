# return a value or perform a task
# repeatability. 

#def greet(name): # parmaeters that allow args to be passed to the function. 
#    print(f"hello {name}")

#greet("Chris")

#def greet1(first_name, last_name, age): #defaults go at the end. 
#    print(f"{first_name} {last_name} is {age}")

#greet1("xchris", "reeves", 20)

# return

#def greeter(name):
#    return f"hello {name}"

#x = greeter("chris")
#print(x)

#print(greeter("chris"))

# *args 
# if we dont know how many agrs will be passed through.
# tuple of args is received. 

#def make_pizza(size, *toppings):
 #   print(f"order for {size}-inch pizza with the following toppings: ")
 #   for topping in toppings:
 #       print(topping)
    
#make_pizza(10, "mushrooms", "peppers")

# keyword args
# order doesnt matter when calling with keyword args. 
# sends args as key:value pairs

#def fruit_list(fruit1, fruit2, fruit3):
  #  print(f"fav is {fruit1}") 
 #   print(f"2nd fav is {fruit2}") 
 #   print(f"3rd fav is {fruit3}") 

#fruit_list(fruit3="apple", fruit2="pear", fruit1="kiwi")

# **kwargs

#def fav_food(**food):
#    print("fav food is", food["desert"], "not", food["dairy"])

#fav_food(dairy="milk", fruit="apple", desert="ice-cream")

# combined

#def combine(*args, **kwargs):
#    print("args:", args)
#    print("kwargs:", kwargs)

#combine(2, c=3, a=5, b=10)

# / intoduced 3.8
# before the / must be positional args. 
# after can be keywords but not enforced. 
# * would enforce kewords after the star. 

#def example(a, b, /, *, c, d):
 #   print(f"a = {a}, b = {b}, c = {c}, d = {d}")

#example("a", "b", c="c", d="d")


#def maths_function(a, b, /, operation="add", *, decimal_place=4):
#    if operation == "add":
#        result = a + b
#    elif operation == "subtract":
#        result = a - b
#    else:
#        raise ValueError("invlaid operation")
#    return round(result, decimal_place)

#print(maths_function(10, 15))
#print(maths_function(10, 15, operation="subtract"))
#print(maths_function(10.2375433, 15.2358237, operation="subtract", decimal_place=6))

# recurrsion

#def factorial(n):
   # if n == 1:
  #      return 1
 #   else:
 #       return n * factorial(n - 1)

#print(factorial(5))

# lambda functions
# short, unnamed fucntions, calculate a sinlge expression. 

#lambda argument: expression (iterable)

#add_lambda = lambda x, y: x + y
#print(add_lambda(2, 4))

#numbers = [1, 2, 3, 4]

#squared = map(lambda x: x**2, numbers)

#print(squared)

# high order functions
# either takes in a function as an arg or returns a func. 

#def square(x):
 #   return x * x

#def apply_function(func, value):
#    return func(value)

#print(apply_function(square, 5))











