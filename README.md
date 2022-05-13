# springboot-transaction-flightbookservice

# To test the App
go to postman and hit post method with url: http://localhost:8080/bookFlightTicket
and json:{
	"passengerInfo":{
		"name":"saitej",
		"email":"saitheja.g@gmail.com",
		"source":"Hyderabad",
		"destination":"New York",
		"travelDate":"05-12-2022",
		"pickupTime":"2.0 AM",
		"arrivalTime":"6.0 PM",
		"fare":5000.0
	},
	"paymentInfo":{
		"accountNumber":"acc-2",
		"cardType":"Debit"
	}
}

# Summary

@Transactional is used either all statements are executed or non of the statements are executed
without  @Transactional only the  statements are executed and inserted in database berfore the exception.After the exception statements will not be executed. 
