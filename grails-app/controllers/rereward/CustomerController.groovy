package rereward

class CustomerController {
    static scaffold = Customer
	
	def calculationService
	
	def lookup() {
		//def customerInstance = Customer.findAllByLastNameLike("B%")
		//like is case sensitive whereas Ilike is case insensitive
	//def customerInstance = Customer.findAllByLastNameIlike("b%")
	//def customerInstance = Customer.findAllByTotalPointsGreaterThan(3)
	//def customerInstance = Customer.findAllByTotalPointsGreaterThanEquals(3)
	//def customerInstance = Customer.findAllByTotalPointsGreaterThanEquals(3, [sort: "totalPoints", order: "desc"])
	//def customerInstance = Customer.findAllByTotalPointsBetween(2,4, [sort: "totalPoints", order: "desc"])
	//def customerInstance = Customer.findAllByFirstNameAndTotalPoints("Bo", 3)
	def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
		[customerInstanceList: customerInstance]
	}
	
	def index() {
		params.max = 10
		[customerList: Customer.list(params), customerCount: Customer.count()]
	}
	
	def create() {
		[customer: new Customer()]
	}
	
	def save(Customer customer) {
		customer.save()
		redirect(action: "show", id: customer.id)
	}
	
	def show(Long id) {
		def customer  = Customer.get(id)
		customer = calculationService.getTotalPoints(customer)
		[customer: customer]
	}

	
	def edit(Long id) {
		def customer  = Customer.get(id)
		[customer: customer]
	}
	
	def update(Customer customer) {
		customer.save()
		redirect(action: "show", id: customer.id)

	}
	
	def delete(Long id) {
		def customer = Customer.get(id)
		customer.delete()
		redirect(action: "index")
	}
	
	def checkin(){
	}

	def customerLookup(Customer lookupInstance) {
	
		def (customerInstance, welcomeMessage)= calculationService.processCheckin(lookupInstance)
		render(view: "checkin", model: [customerInstance: customerInstance, welcomeMessage: welcomeMessage])
		// since checkin action doesnot do anything so instead of redirecting like below we use render to directy call view
		//redirect(action: "checkin")
		
		
		// Query customer by phone +
		// If no result
		// Ceate a new Customer
		// Create welcome message
		// Add award record
		// Send welcome to kiosk
		
		
		//If customer found
		// Calculate total points
		// Create welcome message
		// Add award record
		// Send welcome to kiosk
		
	}
}
