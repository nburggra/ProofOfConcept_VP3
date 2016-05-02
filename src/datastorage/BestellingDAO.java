/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Bestelling;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NickB
 */
public class GerechtDAO {
    
    public ArrayList<Bestelling> findReservations(Member member)
    {
        ArrayList<Bestelling> reservations = new ArrayList<>();
        
        if(member != null)
        {
            // First open a database connnection
            DatabaseConnection connection = new DatabaseConnection();
            if(connection.openConnection())
            {
                // If a connection was successfully setup, execute the SELECT statement.
                int membershipNumber = member.getMembershipNumber();
                ResultSet resultset = connection.executeSQLSelectStatement(
                    "SELECT * FROM reservation WHERE MembershipNumber = " + membershipNumber + ";");

                if(resultset != null)
                {
                    try
                    {
                        while(resultset.next())
                        {
                            // The value for the BookISBN in the row is ignored
                            // for this POC: no Book objects are loaded. Having the
                            // Reservation objects without the Book objects will do fine
                            // to determine whether the owning Member can be removed.
                            Date reservationDate = resultset.getDate("ReservationDate");

                            Bestelling newReservation = new Bestelling(reservationDate, member, null);
                            reservations.add(newReservation);
                       }
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e);
                        reservations.clear();
                    }
                }
                // else an error occurred leave array list empty.

                // We had a database connection opened. Since we're finished,
                // we need to close it.
                connection.closeConnection();
            }
        }
        
        return reservations;
    }
}
    
    

