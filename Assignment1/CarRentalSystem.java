public class CarRentalSystem {
    /*
    Design a Car Rental System

People can
1. Login
2. search Cars based on parameters(location, budget,Car Model)
3. book cars
4. cancel booking
4. Return cars
------------------------------------------------------------------------------------------
Class: People
Data: peopleId, name, phoneNumber, creditCard
Behaviour:
loginRentalApp() {
     // login
}

searchCars(Car carModel, Date date) {
      List<Cars> cars = RentalCenterService.search(carModel, date);
      // display cars to user
}

bookCars(){
       BookingDetails =  CarsService.bookCars(carId,bookingDate,returnDate, this)
}

 cancelCar(carCenter, car){
        CarsService.cancelBooking(carCenter, car, this)
}

returnCar(carCenter, car){
        CarsService.returnCar(carCenter, car, this)
}
-----------------------------------------------------------------------------------------------
Class: Car
Data: carId, model，color, brand, rentalPrice, availableDates
Behaviour:

checkBrandModel(carBrand, carModel) {
   // check availability of specific brand, model price
        if(carBrand equals(car.brand) && carModel equals(car.model)) {
            return true;
        } else {
            return false;
        }
}

checkRentalPrice (lowPrice, highPrice) {
    if (lowPrice <= car.RentalPrice && highPrice >= car.rentalPrice) {
        return true;
    } else {
        return false;
    }
}

checkDaysAvailability(rentDates) {
   // check availability of number of cars on specific date
    if(rentDates <= car.availableDates && rentNumbers <= car.numbers) {
        return true;
    } else {
        return false;
    }
}

------------------------------------------------------------------------------------------------

Class: CreditCard
Data: name, cardNumber, cardType, expiryDate
Behaviour:
isCardExpired() {
    Date today = new Date();
    if (today.lessThan(expiryDate)) {
        return true;
     } else {
    return false;
}

-------------------------------------------------------------------------------------------------
Class: CarsRentalService
Data: List<Cars> cars;
Behaviour: search(carBrand, carModel, lowPrice, highPrice, rentdates ) {
            // search all cars and carsCenter in List<Cars> cars
                List<Cars> availableCars;
                for ( Cars c : cars) {
                    //check if cars is available

                    if (c.checkBrandModel(carBrand, carModel))
                         && c.checkRentalPrice(lowPrice, highPrice)
                         && c.checkDaysAvailability(rentdates)) {
                        availableCars.add(c);
                    }

                }
                return availableCars;
            }


Behaviour:  bookCar(carId,bookDate,returnDate, person){
           Cars car = cars.get(carId);
           //calculate number of days
           int rentdates = returnDate - bookDate;

           //check creditCard
           if(!creditCard.isCardExpired()){
               //calculate price on the basis of price of cars, number of days
               int price = car.price * rentdates;
               PaymentService.makePayment(person, price )

               generate bookingId;
               return bookingDetails;
           }
           else throw new Exception("Card is Expired");
       }

Behaviour: cancelBooking(CarCenter carCenter, Car car, People people){
         carCenter.cars.add(car);
         PaymentService.initiateRefund(people, price)
        }

Behaviour: returnCar(CarCenter carCenter, Car car, People people){
            carCenter.cars.add(car);
            PaymentService.returnDeposit(people, price)
}

--------------------------------------------------------------------------------------------
Class: PaymentService
Behaviour: initiateRefund(person, price)() {
        //return rental to person's creditCard
}

Behaviour: returnDeposit(person, price)() {
        //return Deposit to person's creditCard
}
Behaviour: makePayment(person, price)() {
        //make payment with person's creditCard
}

    */
}

