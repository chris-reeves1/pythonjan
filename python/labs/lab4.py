# task 1 

ages = [12,18,33,84,45,67,12,82,95,16,10,23,43,29,40,34,30,16,44,69,70,74,38,65,36,83,50,11,79,64,78,37,3,8,68,22,4,60,33,82,45,23,5,18,28,99,17,81,14,88,50,19,59,7,44,93,35,72,25,63,11,69,11,76,10,60,30,14,21,82,47,6,21,88,46,78,92,48,36,28,51]

# length of ages

length = len(ages)
print(length)

# print each age

for age in ages:
    print(age)

# add one to each age

for i in range(len(ages)):
    ages[i] +=1 

print(ages)

# remove ages

for age in ages:
    if age < 16 or age > 65:
        ages.remove(age)
    
print(ages)

# Better way:
new_ages = [age for age in ages if 16 <= age <=65]
print(new_ages)

# count 16 - 25

count = 0

for age in ages:
    if age >=16 and age <=25:
        count += 1

print(count)

ages.sort()
for age in ages:
    print(age)

# proportion

count = 0
for age in ages:
    if age >= 16 and age <= 25:
        count += 1
proportion = count / len(ages)
print(proportion)


# vowels

word = input("enter a word: ")
vowels = "aeiou"
count = 0

for letter in word:
    if letter.lower() in vowels:
        count += 1

print(count)