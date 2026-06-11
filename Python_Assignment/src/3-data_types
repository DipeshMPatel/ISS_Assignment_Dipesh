# 1. Integers 
age = 21 
print("1. Integers")
print("Age:",age, type(age))
print()


# 2. Strings (f-strings)
first_name = "Dipesh"
last_name = "Patel"
full_name = first_name + " " + last_name      # String Concatenation
greeting = f"Hello, my full name is {full_name}"
print("2. Strings (f-strings)")
print(greeting, type (greeting))
print()


# 3. Boolean
is_logged_in = True
is_admin = False
print("3. Boolean")
print(f"Login Status: {is_logged_in} {type(is_logged_in)}, Admin: {is_admin} {type(is_admin)}")
print()


# 4. Lists (Mutable)
fruits = ["Mango", "Banana", "Apple", 2]
print("4. Lists")
print(f"Fruits List: {fruits} {type(fruits)}")             # Prints ["Mango", "Banana", "Apple", 2]
fruits.append("Orange")                     # ["Mango", "Banana", "Apple", 2, "Orange"]
fruits.append(7)                            # ["Mango", "Banana", "Apple", 2, "Orange", 7]
fruits.insert(1, "watermelon")              # ["Mango", "watermelon", "Banana", "Apple", 2, "Orange", 7]

even_squares = [x**2 for x in range(10) if x%2 == 0]        # List Comprehension

print(f"Fruits List Final: {fruits} {type(fruits)}")
print(f"Even_Squares: {even_squares} {type(even_squares)}")
print()


# 5. Tuples (Immutable)
mixed = (1, "Hello", 3.14, False)
print("5. Tuples")
print(f"Mixed Tuple Example: {mixed} {type(mixed)}")
print(f"First element of the tuple is {mixed[0]} {type(mixed[0])}")
print(f"Second element of the tuple is {mixed[1]} {type(mixed[1])}")            # We can do same with lists
print()


# 6. Sets {Unique Elements}
nums = [1,2,3,1,2,3]
unique_nums = set(nums)                         # Converting list to set (Removes duplicates)
num_set = {1,2,3,4,5,6,7,8}                     # Directly initializing

print("6. Sets")
print(f"List of Numbers: {nums} {type(nums)} ")
print(f"Unique NUmbers: {unique_nums} {type(unique_nums)}")
print()


# 7. Dictionaries
student_dict = {"name": "Dipesh", "age": "20", "city": "Mumbai"}

print("7. Dictionaries")
print(f"Student Dictionary {student_dict} {type(student_dict)}")

student_dict["age"] = 21                                                 # Making updates
student_dict["grade"] = "A"                                              # Adding new key-value pair

print(f"Student Age: {student_dict["age"]}")
print(student_dict.get("address"))
print(student_dict.get("address", "Not Available"))
print()
