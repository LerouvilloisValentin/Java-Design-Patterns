package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;

public class ReservationService {
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeReservationDao = new TypeReservationDao();
    
    public Reservation creerReservation(Params params) {
        String identifiantClient = params.getIdentifiantClient();
        String dateReservationStr = params.getDateReservation();
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();
        
        LocalDateTime dateReservation = toDate(dateReservationStr);
        Client client = clientDao.extraireClient(identifiantClient);
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);
        
        Reservation reservation = new Reservation(dateReservation, type, nbPlaces, client);
        client.ajouterReservation(reservation);
        
        return reservation;
    }
    
    private LocalDateTime toDate(String dateStr) {
        return LocalDateTime.parse(dateStr, formatter);
    }
}

