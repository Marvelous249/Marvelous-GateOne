const prompt = require("prompt-sync")()

	let counter = 0;

	let total = 0;
	
	let userBuy = null;
	
	let howMany = 0;
	
	let unit = 0;

	let itemsList = []

	let pieciesList = []

	let perUnitList = []

	let totalList = []

	console.log("what is the customer's name");

	let customerName = prompt(); 
	let moreItems = " ";
	const date = new Date();

	do{

	   console.log("what did the user buy\n");

	    userBuy = prompt();

	   console.log("how many piecies ? \n");

	     howMany = prompt();

	   console.log("how much per unit?\n");

	     unit  = prompt();

	   console.log("add more items\n");

	    moreItems = scanner.next();
		
		 total = howMany * unit;

		 itemsList.add(userBuy);

		 pieciesList.add(howMany);

		 perUnitList.add(unit);
	 	
		totalList.add(total);
      
	    if(moreItems.equalsIgnoreCase("NO")){

		break ; }

      } while(moreItems.equalsIgnoreCase("YES")); 
	
	console.log("what is  your name: (cashierName)\n");

	let cashierName = prompt();

	console.log("how much discount will he get\n");

	let discount = prompt();

	console.log("how much did the customer give to you\n");
	let amountPaid = prompt();
	

	let chi  = `
		SEMICOLON STORE

		MAIN BRANCH

		LOCATION: 312 HERBERT MARCULAY WAY SABO YABA, LAGOS.

		TEL: 03293828343

		`;

	console.log(chi);

	console.log("Date\n" + date);

	console.log("CashierName: \n" + cashierName);

	console.log("CustomnerName: \n" + customerName);
	
	let marvellous = `
	===============================================
		ITEMS	QTY	PRICE	TOTAL(NGN)
	-----------------------------------------------
	 `;
	console.log(obaturn);
	int sum = 0;
	for(counter = 0; counter < itemsList.size (); counter ++){
	console.log("\t" + itemsList.get(counter) + "\t" + pieciesList.get(counter)+
	 "\t" + perUnitList.get(counter) + "\t" + totalList.get(counter) );  
	sum +=totalList.get(counter)\n; 
	}
   	
	double discountPercentage = (sum * (discount)) / 100;
 
	let vat = (sum * 17.50 /100);

	let billTotal =(sum - discountPercentage ) + vat;
	
	let balance =(billTotal - amountPaid);



 	System.out.println("-----------------------------------------------------------------------\n");
	
	console.log("the total sum is \n" + sum);
	
	 console.log("the discountPercentage is \n" + discountPercentage);

	console.log(` vat @ 17.50 $%.2f%n `,vat);

	
	
	System.out.print("=======================================================================\n");

   	console.log("\t\t billTotal\t%.2f%n",billTotal);

	console.log("the  amountPaid is \n" + amountPaid);
	console.log("the total balance is \n" + balance);
	
	System.out.print("========================================================================\n");
	}
}
