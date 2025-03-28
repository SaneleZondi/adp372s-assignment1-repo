/*
 * Sibulele Gift Nohamba (220374686)
 * Date: 25/03/2025
 * */
package za.ac.cput.factory;

import za.ac.cput.domain.Maintenance;
import java.util.Date;

public class MaintenanceFactory {

        public static Maintenance createMaintenance(int maintenanceID, int carID, Date serviceDate, String description, double cost, String status, String mechanic) {
            if (maintenanceID < 0 || maintenanceID > 100000) {
                return null;
            }
            if (carID < 0 || carID> 100000) {
                return null;
            }
            if(serviceDate==null||serviceDate==null){
            return null;
            }
            if (description==null||description.isEmpty()){
            return null;
            }
            if (cost < 0) {
            return null;
            }
            if (status==null||status.isEmpty()){
            return null;
            }
            if (mechanic==null||mechanic.isEmpty()){
            return null;
            }
            return new Maintenance.Builder()
                    .setMaintenanceID(maintenanceID)
                    .setCarID(carID)
                    .setServiceDate(serviceDate)
                    .setDescription(description)
                    .setCost(cost)
                    .setStatus(status)
                    .setMechanic(mechanic)
                    .build();
        }
}