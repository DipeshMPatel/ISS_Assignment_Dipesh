'''

try:
    # risky code

    # raise Exception("Something went wrong")
    # manually generate an exception

except:
    # handle error

else:
    # runs if no exception

finally:
    # always runs

'''

# 1. try-except
# 2. else-finally
print("1. try-except")
print("2. else-finally")

try:
    num = int(input("Enter a number: "))
    result = 1 / num
except ZeroDivisionError:
    print("Can't divide by Zero")
except Exception as ex:                     # Handles exceptions which are not explicitly handled by the programmer
    print("Exception:", ex)

else:
    print("Result is ", result)
finally:
    print ("This will execute always")

print()


# 3. Raise
print("3. Raise")

def check_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative")          # When an exception is raised, it directly exits the function (and try block) and moves to the except block(s)
    
    print("Age entered:", age)                              # Only executes when a valid (positive) age is entered

try:
    age = int(input("Enter the age:"))
    check_age(age)
except ValueError as ex1:
    print("Exception Raised:", ex1)
except Exception as ex:
    print("Exception:", ex)


