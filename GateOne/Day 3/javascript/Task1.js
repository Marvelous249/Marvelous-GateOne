Math.random()
const prompt = require("prompt-sync")()

	for (let attempt = 10; attempt > 0; attempt--) {
	const number1 = Math.floor(Math.random() * 100);
	const number2 = Math.floor(Math.random() * 100);
	const answer = number1 + number2;
	console.log("What is " + number1 + " + " + number2 + "?");
	
	for (let counter = 0; counter < 10; counter++) {
        const userAnswer = prompt();

	if (userAnswer == answer) {
          console.log("Correct!");
	 break;
          } else{ 
	console.log("Incorrect. Try again.");

	
	
      
   }
 }
	
}	
