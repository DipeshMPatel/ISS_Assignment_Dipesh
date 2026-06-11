# 1. If-else (and elif)
print("1. If-else")
age = 15

if age < 13:
    print("You are a child")
elif age < 18:
    print("You are a teenager")
else:
    print("You are an adult")

print()


# 2. For loop
print("2. For loop")
print("Printing numbers:")
for i in range(1, 10):
    print(i)

print()

# 3. While loop
print("3. While Loop")
count = 0
while count < 5:
    print(count)
    count += 1

print()


# 4. Break and Continue
print("4. Break and Continue")

for num in range(1,10):
    if num % 3 == 0 and num % 2 == 0:
        print(f"Let's take a break at {num}")
        break                           # Comes out of the loop
    if num % 2 == 0:
        print(f"Forget {num}, let's continue")
        continue                        # Moves to next iteration immediately
    
    print(f"Number: {num}")

print()


# 5. Pass
print("5. Pass")

for i in range(1,10):
    pass                    # Used as a placeholder, Logic is added here later 

print("Nothing printed (add logic in the place of 'pass')")
print()


# 6. Loop-else
'''
    When Loop runs all iterations, else block runs
    when break (only break, continue does not prevent else block from executing) is encountered, else block does not run
'''
print("6. Loop-else")

for i in range(1,6):
    print (i)
else:
    print("All iterations completed, no break encountered")

num = 12
for i in range(2, num):
    if num % i == 0:
        print("Not Prime")                      
        break                           # here break is encountered hence else block does not run 
else:
    print("Prime")

print()


