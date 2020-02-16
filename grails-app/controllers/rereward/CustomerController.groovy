package rereward

class CustomerController {
    static scaffold = Customer
	
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
		[customer: customer]
	}

}
