package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;

public interface FacilityService extends Service{

    void displayListMaintenance();
//    Villa getVilla();
//    House getHouse();
//    Room getRoom();

    Facility getFacility(int choose);

}
