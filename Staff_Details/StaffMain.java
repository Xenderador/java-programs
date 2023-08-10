/*
  Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend
  this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract (period).
  Write a Java program to read and display at least 3 staff objects of all three categories.
 */

package Staff_Details;

class Staff {
    protected int StaffId;
    protected String Name;
    protected String phone;
    protected int salary;
    
    Staff(int sid, String n, String ph, int sal) {
        StaffId = sid;
        Name = n;
        phone = ph;
        salary = sal;
    }
    
    void printStaff() {
        System.out.println("Staff ID:" + StaffId);
        System.out.println("Name:" + Name);
        System.out.println("Phone:" + phone);
        System.out.println("Salary:" + salary);
    }
}

class Teaching extends Staff {
    private String Domain;
    private int Publication;
    
    Teaching(int sid, String n, String ph, int sal, String dom, int pub) {
        super(sid, n, ph, sal);
        Domain = dom;
        Publication = pub;
    }
    
    void printTeaching() {
        printStaff();
        System.out.println("Domain:" + Domain);
        System.out.println("Publication:" + Publication);
    }
}

class Technical extends Staff {
    private String Skills;
    
    Technical(int sid, String n, String ph, int sal, String skl) {
        super(sid, n, ph, sal);
        Skills = skl;
    }
    
    void printTechnical() {
        printStaff();
        System.out.println("Skills:" + Skills);
    }
}

class Contract extends Staff {
    private int Period;
    
    Contract(int sid, String n, String ph, int sal, int prd) {
        super(sid, n, ph, sal);
        Period = prd;
    }
    
    void printContract() {
        printStaff();
        System.out.println("Period:" + Period);
    }
}

public class StaffMain {
    public static void main(String[] args) {
        Teaching th = new Teaching(3158, "Sour", "7204613547", 999999, "CS", 3);
        System.out.println("Teaching Staff Details");
        th.printTeaching();
        
        Technical tcl = new Technical(3159, "Shan", "7989898494", 99999, "None");
        System.out.println("Technical Staff Details");
        tcl.printTechnical();
        
        Contract ct = new Contract(3160, "Jason", "7743847348", 99999, 1);
        System.out.println("Contract Staff Details");
        ct.printContract();
    }
}
