package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;

public class UserRoleFactory {

    //TODO: implement method body ONLY!
    public static UserRole buildUserRole(String orgCode, String userEmail, String roleId) {

        new UserRole (orgCode, userEmail, roleId);
        buildUserRole(orgCode, userEmail, roleId);
        return new UserRole(orgCode, userEmail, roleId);
    }
}
