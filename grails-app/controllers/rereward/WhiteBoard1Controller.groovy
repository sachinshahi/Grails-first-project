package rereward

class WhiteBoard1Controller {

    def calculationService
	
    def index() {
		render("1")
	}
	
	def variables() {
		def myTotal = 10
		render("Total: " + myTotal)
		render("</br>" + myTotal.class)
		myTotal = myTotal + 1;
		render("</br> New Total " + myTotal + "</br>")
		
		def firstName = "Mike"	
		render("<br> Name:" + firstName)
		render("</br>" + firstName.class)
		firstName = firstName + 1;
		render("</br> New firstName " + firstName + "</br>")
		
		
		def today = new Date("2/1/2014")
		render("</br> Today is:" + today)
		render("</br>" + today.class)
		render("</br> New Date " + firstName + "</br>")
		
	}
	
	def strings() {
		//render "Welcome"
		def first = "Mike"
		def last = "Kelly"
		def points = 4
		render first + " " + last
		render "Welcome back" + " " + first + " " + "You have " + points + " " + "points"
	    render "Hey ther $first You alread have $points points"
		
	}
	
	def calculateString() {
		render "Today is ${new Date()}."
		def fullName = 'Mike Kelly'
		render "You string, $fullName , has ${fullName.length()}, characters in length"
		def input = "SHOUTING"
		render "Please stop ${input.toLowerCase()}"
		
		def state ="vl"
		render "You live in ${state.toUpperCase()}"
	}
	
	def conditions() {
		def firstName = "Mike"
		def totalPoints =  1
		def welcomeMessage = ""
		if (totalPoints >= 5) {
			 welcomeMessage = "Welcome back $firstName, this drink is on us."
	   	}else if(totalPoints == 4){
			welcomeMessage = "Welcome back $firstName, your next drinkis free"
		}else {
		 welcomeMessage = "Welcome back $firstName, you now have $totalPoints points."
		}
		render welcomeMessage
	}
	
	def switchs() {
	
		def firstName = "Mike"
		def totalPoints =  3
		def welcomeMessage = ""
		switch(totalPoints){
		case 5:
			 welcomeMessage = "Welcome back $firstName, this drink is on us."
			 break; 	
		case 4: 
			welcomeMessage = "Welcome back $firstName, your next drinkis free"
			break;
		case 2..3:
		     welcomeMessage = "Welcome back $firstName, you now have $totalPoints points"
             break;		
		default:
		 welcomeMessage = "Welcome back $firstName, you now have $totalPoints points."
		
		}
		
		render welcomeMessage
	}
	
	// http://localhost:8091/whiteBoard1/params?first=sachin&point=3
	def params() {
	
		def welcomeMessage = calculationService.welcome(params)
		render welcomeMessage
	}
}
