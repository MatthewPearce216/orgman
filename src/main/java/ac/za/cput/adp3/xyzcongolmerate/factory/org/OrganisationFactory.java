package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class OrganisationFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(OrganisationFactory.class); // Expecting OF from (O)rganisation(F)actory.

    //TODO: implement method body ONLY!
    public static Organisation buildOrganisation(String organisationName, String organisationCode) {

        return new Organisation.Builder()
                .orgName(organisationName)
                .orgCode(organisationCode)
                .build();
    }
}
