# classes - part of OOP 
# 4 principles:
# - polymorphism: different ways of implementing methods (functions)
# - encapsualtion: code security/privacy. 
# - abstraction: implemnt but not see the code. 
# - inheritance: inhetit from parent to child. 

# class - a blueprint.
# object - an instance of the class.
# method - functions
# We can  make multiple objects of a class. 


#class Example:
  #  name = "chris"

 #   def speak(self):
 #       print("hello")

#person = Example()
#person1 = Example()

#person1.name = "john"

#print(person.name)
#print(person1.name)

#class Student:
#    pass

#student1 = Student()

#student1.name = "chris"
#student1.age = 20

#class Students:
   # def __init__(self, first, last, age): # init is a dunder method.
   #     self.first = first  # initialising out pbject with these params.
  #      self.last = last        # self refers to the object itself.
 #       self.age = age      # We map the class data tp the obkect itself. 


#student1 = Students("john", "smith", 10)
#student2 = Students("lisa", "smith", 12)

#print(student1.age, student2.first)


#class Students:
  #  def __init__(self, first, last, age): # init is a dunder method.
  #      self.first = first  # initialising out pbject with these params.
 #       self.last = last        # self refers to the object itself.
 #       self.age = age      # We map the class data tp the obkect itself. 
 #       self.full = first + " " + last


#student1 = Students("john", "smith", 10)
#student2 = Students("lisa", "smith", 12)

#print(student2.full)

#class Students:
   # def __init__(self, first, last, age): # init is a dunder method.
  #      self.first = first  # initialising out pbject with these params.
  #      self.last = last        # self refers to the object itself.
  #      self.age = age      # We map the class data tp the obkect itself. 
        #self.full = first + " " + last

 #   def fullName(self):
 #       return self.first + " " + self.last


#student1 = Students("john", "smith", 10)
#student2 = Students("lisa", "smith", 12)

#print(student1.fullName())
#print(Students.fullName(student2))


#class Students:

    #age_increase_amount = 25

   # def __init__(self, first, last, age): # init is a dunder method.
   #     self.first = first  # initialising out pbject with these params.
   #     self.last = last        # self refers to the object itself.
   #     self.age = age      # We map the class data tp the obkect itself. 
        #self.full = first + " " + last

  #  def fullName(self):
  #      return self.first + " " + self.last

 #   def changeAge(self):
 #       self.age = self.age + self.age_increase_amount


#student1 = Students("john", "smith", 10)
#student2 = Students("lisa", "smith", 12)

#student1.changeAge()

#student2.age_increase_amount = 10
#student2.changeAge()
#print(student1.age, student2.age)

#print(student1.__dict__)
#print(student2.__dict__)
#print(Students.__dict__)

# non-self class variables

#class Students:

    #age_increase_amount = 25
    #__num_of_students = 0 # name mangling -- python changes the name

    #def __init__(self, first, last, age): # init is a dunder method.
       # self.first = first  # initialising out pbject with these params.
      #  self.last = last        # self refers to the object itself.
      #  self.age = age      # We map the class data tp the obkect itself. 
        #self.full = first + " " + last

     #   Students.__num_of_students += 1

    #def fullName(self):
    #    return self.first + " " + self.last

   # def changeAge(self):
   #     self.age = self.age + self.age_increase_amount

  #  @classmethod
 #   def getNumberOfStudents(cls):
 #       return cls.__num_of_students

#student1 = Students("john", "smith", 10)
#student2 = Students("lisa", "smith", 12)
#print(Students.getNumberOfStudents())
#print(Students._Students__num_of_students)


#class Animal:
   # def __init__(self, name, species):
   #     self.name = name
   #     self.species = species

  #  def eat(self):
  #      print(f"{self.name} is eating")

 #   def __str__(self):
 #       return f"{self.name} - {self.species} - {self.__class__.__name__}"

#class Cat(Animal):
    #def __init__(self, name, species, breed):
   #     super().__init__(name, species)
   #     self.breed = breed

  #  def meow(self):
  #      print("meow")

 #   def __str__(self):
 #       return super().__str__() + f" {self.breed}"



#my_cat = Cat("w", "y", "x")

#my_cat.meow()
#my_cat.eat()

#print(my_cat)


#Make a class. 

#Logic that checks a password and returns a rating (very weak - weak - medium - strong - very strong). 
#length, alphanumic, special chars.... 
#check against a list of common password - if matches should be very weak. 
#object to call a method that checks (object will pass through the password)

class PasswordChecker:
    def __init__(self, password):
        self.password = password

    def get_password_rating(self):
        has_upper = False
        has_lower = False
        has_number = False
        has_special = False
        for char in self.password:
            if char.isupper():
                has_upper = True
            elif char.islower():
                has_lower = True
            elif char.isnumeric():
                has_number = True
            elif not char.isalnum():
                has_special = True

        common_passwords = [
            "password", "Password1", "123456", "qwerty", 
            "abc123", "password1", 
            "12345678", "admin", "Password1!"
        ]
        if self.password in common_passwords:
            return "Very weak"

        
        if len(self.password) < 8:
            return "Weak"
        elif len(self.password) < 12 and (not has_upper or not has_lower or not has_number):
            return "Moderate"
        elif len(self.password) < 12 and has_upper and has_lower and has_number:
            return "Strong"
        elif len(self.password) < 16 and has_upper and has_lower and has_number and has_special:
            return "Strong"
        elif len(self.password) >= 16:
            return "Very strong"
        else:
            return "Moderate"

