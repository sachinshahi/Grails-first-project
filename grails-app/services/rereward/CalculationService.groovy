package rereward

import grails.gorm.transactions.Transactional

@Transactional
class CalculationService {

    def welcome(params) {
	    def firstName = params.first
		def totalPoints =  params.point.toInteger()
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
		
    }
}
