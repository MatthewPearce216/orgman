package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;

import java.util.Date;

public class UserDemographyFactory {

    //TODO: implement method body ONLY!
    public static UserDemography buildUserDemography(String userEmail, String userTitle, String genderId, String raceId, Date dateOfBirth) {

        new UserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);
        buildUserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);

                return new UserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);
    }
}
