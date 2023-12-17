n = int(input("Enter the number of elements: "))
StartingNumberOfBracket = 1 + (n-1)*n/2
sum = n/2*(2*StartingNumberOfBracket + (n-1)*1)
print(int(sum))

# suppose user enter 3 bracket as input
# so third bracket will be (1) +(2,3) +(4,5,6) so third bracket is 4+5+6 = 15
# (50)Th bracket 62525
