public class JunctionTrafficController {
      /*
Design a Traffic Controller System for a Junction
Cars can
1, see the traffic light
2, wait
3, go straight
4, turn right
5, turn left

                N
              |   |
              |   |
              |   |
  ------------  |  -----------
W             - O -           E
  ------------  |  -----------
              |   |
              |   |
              |   | //RoadName: WO (W-->O); EO (E-->O); NO(N-->O); SO(S-->O)
                S   //TrafficLightName: verticalLight; horizontalLight


------------------------------------------------
Enum:Color
Value: Green, Red

------------------------------------------------
Class:TrafficLight
data: LightDirection, color, timer
Behaviour:
    isGreen() {
        if (color equals(green)) {
            return true;
         } else {
            return false;
         }
    }

}

----------------------------------------------------------------

Class: Car
data: CarId, DriverName, DriveDirection, stillInTraffic
Behaviour:

drive() {
    stillInTraffic = false;
}



-----------------------------------------------------------------------
Class: Road
data: Direction, Queue<Car> cars
Behaviour:

    releaseAll (){
        while (cars.size() != 0) {
            Car car = cars.remove();
            car.drive();
        }
    }


 releaseRightTurnCars() {
    while (cars.size() != 0) {
            Car car = cars.peek();
            if (car.DriveDirection != Right) {
                break;
            }
            cars.remove();
            car.drive();
     }
 }




---------------------------------------------------------------------
Class: TrafficControllerSystem
data: RoadWO, RoadEO, RoadNO, RoadSO, VerticalTrafficLight, HorizontalTrafficLight

Behaviour:

           changeLightColor() {
                if (VerticalTrafficLight.isGreen()) {
                    VerticalTrafficLight.color = Red;
                    HorizontalTrafficLight.color = Green;
                } else {
                    VerticalTrafficLight.color = Green;
                    HorizontalTrafficLight.color = Red;
                }
           }


           release() {
                if (VerticalTrafficLight.isGreen()) {
                    RoadNO.releaseAll();
                    RoadSO.releaseAll();
                    RoadWO.releaseRightTurnCars();
                    RoadEO.releaseRightTurnCars();
                } else {
                    RoadWO.releaseAll();
                    RoadEO.releaseAll();
                    RoadSO.releaseRightTurnCars();
                    RoadNO.releaseRightTurnCars();
                }
           }


    */
}
