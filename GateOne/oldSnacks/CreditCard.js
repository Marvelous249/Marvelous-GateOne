const prompt = require("prompt-sync")()

	let doubledSecondDigit = 0;
	let firstDigit = 0;
	let secondDigit =0;
	let result = 0;
	let sumofSingleDigits = 0;
	let sum = 0;
	let sumofdoubledSecondDigit = 0;
	let sumTotal = 0;


	console.log("Hello, Enter card details to verify: "); 
	let cardNumber = prompt();
	//console.log(typeof(cardNumber))

	let collectingNumber = [];	

	if (cardNumber.length >= 13 && cardNumber.length <= 16) {

	for(let i = 0; i < cardNumber.length; i += 2){	

	collectingNumber[i] = cardNumber.charAt(i) - '0';
	
	doubledSecondDigit = collectingNumber[i] * 2;
	
	sumofdoubledSecondDigit += doubledSecondDigit;
	
	if(doubledSecondDigit >= 10) {
	while(doubledSecondDigit != 0) {
	result = doubledSecondDigit % 10;
	sum = sum + result;
	doubledSecondDigit /= 10;
	}
		} 
	}
	sumTotal = sumofdoubledSecondDigit + sum;

	let cardNumberFirstDigit = cardNumber.charAt(0);
	let cardNumberSecondDigit = cardNumber.charAt(1);

		

	if (cardNumberFirstDigit == '4') console.log("Credit card type: Visacard\n");
	
	else if(cardNumberFirstDigit == '5') console.log("Credit card type: Master card\n");
 	
	else if(cardNumberFirstDigit == '6') console.log("Credit card type: Discover card\n");
	
	else if(cardNumberFirstDigit == '3' && cardNumberSecondDigit == '7') console.log("Credit card type: American express card\n");
	
	console.log("Credit card Number: " + cardNumber + "\n");

	console.log("Credit card Digit length: " + cardNumber.length + "\n");

	if (sumTotal % 10 == 0) console.log("Credit card validity status: Valid");
	else  console.log("Credit card validity status: Invalid"); 
}
	else console.log("Put correct number jare\nWerey wan scam me\n");
		

			
	
	
	
 