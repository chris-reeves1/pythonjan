#Task 1

x = 1

while x <= 100:
    square = x**2
    if square > 2000:
        break
    print(x, "=", square)
    x += 1 

# Task 2

num = int(input("enter a number: "))

factorial = 1
while num > 1:
    factorial *= num 
    num -= 1
print("factorial: ", factorial)

# Task 3

initial_investment = float(input("intial investment: £"))
target_value = float(input("target value: £"))
interest_rate = float(input("interest rate: %")) /100

years = 0

while initial_investment < target_value:
    initial_investment *= (1 + interest_rate)
    years += 1

print(f"it will take {years} years to grow to £{target_value}")

# Task 4

min_value = 1
max_value = 100
attempts = 0

while attempts < 3:
    value = int(input(f"enter an integer between {min_value} and {max_value}: "))

    if min_value <= value <= max_value:
        print(f"valid integer entered: {value}")
        break
    else:
        print("invalid integer - try again!")
    attempts += 1
if attempts == 3:
    print("None")
    
# Task 5

word = input("enter a word: ")

counter = 0
vowel_counter = 0

while counter < len(word):
    x = word[counter]
    if x in "aeiou":
        vowel_counter +=1 
    counter += 1

print(f"number of vowels in {word} is {vowel_counter}")

# Task 6

maths_mark = 999 
english_mark = 999
ict_mark = 999

while (maths_mark < 0 or maths_mark > 100):
    maths_mark = int(input("Enter maths mark(0-100): "))
while (english_mark < 0 or english_mark > 100):
    english_mark = int(input("Enter english mark(0-100): "))
while (ict_mark < 0 or ict_mark > 100):
    ict_mark = int(input("Enter ict mark(0-100): "))

average_mark = (maths_mark + english_mark + ict_mark) / 3

if average_mark >= 65:
    result = "pass"
else:
    result = "fail"

print(f"average mark: {average_mark}: {result}")

# Part 2
# Task 1

for x in range(1,101):
    square = x**2
    if square > 2000:
        break
    print(x, "=", square)

# task 2

num = int(input("enter number: "))

factorial = 1

for i in range(1, num+1):
    factorial *= i
print("factorial: ", factorial)