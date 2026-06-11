# 1. Parameters and arguments
print("1. Parameters and arguments")
def greeting(name):                                     # name is parameter
    print(f"Hello {name}!, Welcome to the team.")

greeting("Dipesh")                                      # "Dipesh" is an argument
print()

def greeting(name= "Guest"):                            # Default parameter
    print(f"Hello {name}!, Welcome to the team.")

greeting()                                              # No arguments passed in the function
print()


# 2. Return
print("2. Return")

def sum(a, b):
    return a + b

result = sum(3, 5)
print(f"Result is {result}")
print()


# 3. Args and Kwargs  
'''
*args ======> Variable length arguments
**kwargs ======> Keyword arguments
'''

print("3. Args and Kwargs")

def display_nums(*nums):
    print("List of numbers:")
    for num in nums:
        print(num)

display_nums(1,2,3,4,5,6,7,8.0,"Dipesh", True)
print()

def display_details(**details):
    print("Details:")
    for key, value in details.items():
        print(f"{key}: {value}")

display_details(name= "Dipesh", age= 21, city= "Mumbai")
print()

def num_list_details(*nums, **details):                         # Order (first *args and then **kwargs) is important
    print("Both Args and Kwargs in single function")
    for num in nums:
        print(num)
    
    for key, value in details.items():
        print(f"{key}: {value}")

num_list_details(1,2,3,4,5,6,7,8.0,"Dipesh", True, name= "Dipesh", age= 21, city= "Mumbai")
print()









