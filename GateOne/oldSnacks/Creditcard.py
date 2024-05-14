def get_card_type(card_number):
    first_digit = card_number[0]
    second_digit = card_number[1]

    if first_digit == '4':
        return "Visacard"
    elif first_digit == '5':
        return "Mastercard"
    elif first_digit == '6':
        return "Discover card"
    elif first_digit == '3' and second_digit == '7':
        return "American Express card"
    else:
        return "Unknown"

def validate_card_number(card_number):
    collecting_number = len(card_number)
    if 13 <= collecting_number or collecting_number <= 16:
        sum_of_doubled_second_digit = 0
        sum_total = 0
        for i in range(0, collecting_number, 2):
            doubled_second_digit = int(card_number[i]) * 2
            sum_of_doubled_second_digit += doubled_second_digit
            if doubled_second_digit >= 10:
                while doubled_second_digit != 0:
                    result = doubled_second_digit % 10
                    sum_total += result
                    doubled_second_digit //= 10

        return sum_of_doubled_second_digit + sum_total

    return "invalid card number"

def cardMain():
    card_number = input("Enter a credit card number: ")
    sum_total = validate_card_number(card_number)
    if sum_total != "invalid card number":
    	print(f"Credit card type: {get_card_type(card_number)}")
    	print(f"Credit card number: {card_number}")
    	print(f"Credit card digit length: {len(card_number)}")
    	if sum_total % 10 == 0:
    	    print("Credit card validity status: Valid")
    	else:
    	    print("Credit card validity status: Invalid")
    else:
        print("Invalid credit card number. Please check your input.")
if __name__== '__main__':
    cardMain()