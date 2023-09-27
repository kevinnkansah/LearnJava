firstName = "Andre" #Only change the value to your first name
surName = "Henney" #Only change the value to your last name
myAge = 10 #Ony change to your age (or any desired age)
momAge = 40 #Only change to your mom's age (or any desired age)
print("Welcome user. This program calculates the age at which you are exactly one-third \
your mom's age.")
print("My first name is " + str(firstName))
print("My surname is " + str(surName))
print("\nMy current age is " + str(myAge))
print("My mom's current age is " + str(momAge))
y = (momAge - 3 * myAge) / 2 #Don’t change
myAge_new = myAge + y #Don’t change
momAge_new = momAge + y #Don’t change
print("It will take the following number of years for my age to be \
exactly one third my mom's age: " + str(y))
print("At that time, my age will be " + str(myAge_new) + " years old")
print("and my mom will be " + str(momAge_new) + " years old.")
print("Thanks")
