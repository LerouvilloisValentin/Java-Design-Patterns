package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;


/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {
	
	private ReservationService reservationService = new ReservationService();
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante

		return  reservationService.creerReservation(params);
		// 2) Conversion de la date de réservation en LocalDateTime

		// 3) Extraction de la base de données des informations client
		
		// 4) Extraction de la base de données des infos concernant le type de la réservation
		
		// 5) Création de la réservation

		
		// 6) Ajout de la réservation au client

		// 7) Calcul du montant total de la réservation qui dépend:
		//    - du nombre de places
		//    - de la réduction qui s'applique si le client est premium ou non


	/** Transforme une date au format String en {@link LocalDateTime}
	 * @param dateStr date au format String
	 * @return LocalDateTime
	 */
}
}
