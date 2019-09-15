public class ParkingLotSystem {
/*
Design a Parking lot
Cars can
1. park in the parkingLot
2. leave the parkingLot
------------------------------------------------
Class:Car
data: carId, driverName, parked
Behaviour:
    park() {
        parked = true;
    }

    leave() {
        parked = false;
    }

}
----------------------------------------------------------------
Class: ParkingSpace
data:  position
Behaviour:

isAvailable() {
    if (position.isEmpty()) {
        return true;
    } else {
        return false;
    }

}

----------------------------------------------------------------

Class: ParkingLot
data:  ParkingSpace[][] parkingLot, positionNumbers,carsNumbers
Behaviour:

int positionNumbers = parkingLot.length * parkingLot[0].length;

addCar(Car car, ParkingSpace parking) {
        if(carsNumbers < positionNumbers) {
            car.park();
            parking.position.empty = false;
            positionNumbers--;
            carsNumber++;
        }
}

release (Car car, ParkingSpace parking){
        car.leave();
        parking.position.empty = true;
        positionNumbers ++;
        carsNumber--;
}



---------------------------------------------------------------------

 */
}
