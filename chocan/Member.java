package chocan;
import java.util.*;

public class Member extends Data
{
    private ArrayList<String> providers; //Holds Providers of services

    /*--------------------------------
     * Calls Default Constructor
     --------------------------------*/
    public Member()
    {
        super();
        providers = null;
    }

    /*---------------------------------------
     * Constructor : Initialize Member Info
     * @param fName;
     * @param lName;
     * @param address;
     * @param city;
     * @param state;
     * @param zip;
     * @param id;
      -------------------------------------*/
    public Member(String fName, String lName, String address, String city, String state, int zip, int id)
    {
        super(fName, lName, address, city, state, zip, id);
        providers = null;
    }

    /*--------------------
     * Returns Member ID
    --------------------*/
    //May not need this
    public int getID()
    {
        return this.id;
    }

    /*---------------------------------------------------------------------------
     * Adds one service to a list of services that a member receives
     *
     * @param aService;
     * @pre-condition:   if the list of services is empty, the new service to add
     *                  should be the first item on the list, otherwise new
     *                  services are appended to the list
     * @post-condition:  One more item is appended to a list of services
     * @return true: new service successfully appended to the list of services
     * @return false: new service did not append to the list
     ----------------------------------------------------------------------------*/
    public boolean addService(Service aService, String prov_name, int id)
    {
        if (aService != null) {  //Check if aService is null
            if (services == null) { //Check if services list exists
                services = new ArrayList<>();
            }
            if (providers == null) { //Check if providers exists
                providers = new ArrayList<>();
            }
            services.add(aService); //Adding service
            providers.add(prov_name); //Adding provider name
            return true;
        }
        return false; //Error
    }



    /*-----------------------------------
     * Displays a member's information
    ----------------------------------- */
    public void displayPerson()
    {
        System.out.println(this);
    }


    /*----------------------------------------------------------------------------
     * Display's a member's information and all services provided to the member
    ----------------------------------------------------------------------------*/
    public void displayAll() {
        System.out.println(this);
        if (services != null) {
            System.out.println("Services:\n\n");
            for (int i = 0; i < services.size(); i++) {
                System.out.println("Provider: " + providers.get(i) + "\n");
                System.out.println(services.get(i));
            }
        } else {
            System.out.println("No services on record\n");
        }
    }

    //build member report
    public void report()
    {
/*        StringBuilder dataFile = new StringBuilder();
        dataFile.append("./reports/member/" + this.lastName + this.firstName + ".txt");
        StringBuilder nMember = new StringBuilder();    //string for member info
        StringBuilder nServices = new StringBuilder();  //string for info for all services

        //adds all member data to nMember
        nString.append("Member Name: " + this.firstName + ", " + this.firstName + "\n");
        nString.append("Member ID: " + this.id + "\n");
        nString.append("Member Address: " + this.address + "\n");
        nString.append("Member City: " + this.city + "\n");
        nString.append("Member State: " + this.state + "\n");
        nString.append("Member Zip: " + this.id + "\n");

        //iterates through all services, adds all data to nServices
        for (int i = 0; i < services.size(); i++){
            nServices.append("Service Date: " + services.get(i).month + " " + services.get(i).day + " " + services.get(i).year + "\n");
            nServices.append("Provider Name: " + providers.get(i) + "\n");
            nServices.append("Service Name: " + services.get(i).serviceName + "\n");
        }

        //open datafile, write all data from nMember, then nServices to file
        try {
            File outFile = new File(dataFile);
            PrintWriter pw = new PrintWriter(outFile);
            pw.write(nMember);
            pw.write(nServices);
            pw.close();
        }
        catch (FileNotFoundException e1){};
*/    }

    public String[] strArray()
    {
        String[] data = new String[9];
/*
//        String data = null;
        data[0] = this.lastName;
        data[1] = this.firstName;
        data[2] = Integer.toString(this.id);
        data[3] = this.address;
        data[4] = this.city;
        data[5] = this.state;
        data[6] = Integer.toString(this.zip);
        data[7] = Integer.toString(this.consult);
        data[8] = Integer.toString(this.totalFees);
*/        return data;
    }

}
