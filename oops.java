import java.util.*;
import java.util.ArrayList;
class Menu{
    public void Mmenu(){
        System.out.println("----------Employee Managaemnet System---------");
        System.out.println("-------------------------------------------------");
        System.out.println("\n1. Add Employee Details."+"\n2. View Single Employee Details."+"\n3. View All Employee Details."+
        "\n4. Update Employee Details."+"\n5. Delete Employee Details."+"\n6. Exit");
    }
}
class data{
        ArrayList <Integer> eid=new ArrayList <Integer>();
        ArrayList <String> ename=new ArrayList <String>();
        ArrayList <Double> esal=new ArrayList <Double>();
        ArrayList<Long> emobilenum=new ArrayList <Long>();
        ArrayList<String> email=new ArrayList <String>();
        ArrayList<String> egender=new ArrayList <String>();
        ArrayList <String> eaddress=new ArrayList <String>();
        ArrayList<String> edob=new ArrayList <String>();
        ArrayList<String> edoj=new ArrayList<String>();
        ArrayList<Integer> eexp=new ArrayList <Integer>();
        Scanner sc=new Scanner(System.in);
        //Adding Employee Details
        public void adempdetails(){
            System.out.println("Enter Employee Id No: ");
            eid.add(sc.nextInt());
            System.out.println("Enter Employee Name: ");
            ename.add(sc.next());
            System.out.println("Enter Employee Salary: ");
            esal.add(sc.nextDouble());
            System.out.println("Enter Employee Moblie Number: ");
            emobilenum.add(sc.nextLong());
            System.out.println("Enter Employee Email: ");
            email.add(sc.next());
            System.out.println("Enter Employee Gender: ");
            egender.add(sc.next());
            System.out.println("Enter Employee Address: ");
            eaddress.add(sc.next());
            System.out.println("Enter Employee DOB: ");
            edob.add(sc.next());
            System.out.println("Enter Employee DOJ: ");
            edoj.add(sc.next());
            System.out.println("Enter Employee Experience: ");
            eexp.add(sc.nextInt());
        }
        //Viewing Single Employee Details
        public void viewsingle(){
            System.out.println("Enter Employee Id to view details");
            int x=-1;
            int n=sc.nextInt();
            for(int i=0;i<eid.size();i++){
                if(n==eid.get(i)){
                x=i;
                break;
            }
        }
        if(eid.size()>0 && x>=0){
        System.out.println(n+" "+"Name is "+ename.get(x));
        System.out.println(n+" "+"Salary is "+esal.get(x));
        System.out.println(n+" "+"Mobile number is "+emobilenum.get(x));
        System.out.println(n+" "+"Email id is "+email.get(x));
        System.out.println(n+" "+"Gender is "+egender.get(x));
        System.out.println(n+" "+"Address is "+eaddress.get(x));
        System.out.println(n+" "+"Date of birth: "+edob.get(x));
        System.out.println(n+" "+"Date of join: "+edoj.get(x));
        System.out.println(n+" "+"has experience of "+eexp.get(x)+" years");
        System.out.println("-------------------------------------------");
    }
    else{
        System.out.println("No data found");
        }
    }
    //Viewing All Employee Details
    public void viewall(){
        int c=0;
        while(c<eid.size()){
            int n=eid.get(c);
        System.out.println("Id: "+n);
        System.out.println(n+" "+"Name is "+ename.get(c));
        System.out.println(n+" "+"Salary is "+esal.get(c));
        System.out.println(n+" "+"Mobile number is "+emobilenum.get(c));
        System.out.println(n+" "+"Email id is "+email.get(c));
        System.out.println(n+" "+"Gender is "+egender.get(c));
        System.out.println(n+" "+"Address is "+eaddress.get(c));
        System.out.println(n+" "+"Date of birth: "+edob.get(c));
        System.out.println(n+" "+"Date of join: "+edoj.get(c));
        System.out.println(n+" "+"has experience of "+eexp.get(c)+" years");
        System.out.println("-------------------------------------------");
        c=c+1;
        }
    }
    //Updating Employee Details
    public void update(){
    System.out.println("Enter the Employee Id you want to update");
    int i=sc.nextInt();
    System.out.println("id, name, sal, mnum, mail, gender, adrs, dob, doj, exp");
    System.out.println("Enter the details that you want to update: ");
    String u=sc.next();
    switch(u){
        case "id": 
            eid.set(i,sc.nextInt());
            System.out.println(" Id updated successfully");
            break;
        case "name": 
            ename.set(i,sc.next());
            System.out.println(" Name updated successfully");
            break;
        case "sal":   
            esal.set(i,sc.nextDouble());
            System.out.println(" Salary updated successfully");
            break;
        case "mnum": 
            emobilenum.set(i,sc.nextLong());
            System.out.println(" Mobile number updated successfully");
            break;
        case "mail": 
            email.set(i,sc.next());
            System.out.println(" Mail updated successfully");
            break;
        case "gender": 
            egender.set(i,sc.next());
            System.out.println(" Gender updated successfully");
            break;
        case "adrs": 
            eaddress.set(i,sc.next());
            System.out.println(" Address updated successfully");
            break;
        case "dob": 
            edob.set(i,sc.next());
            System.out.println(" Date of birth updated successfully");
            break;
        case "doj": 
            edoj.set(i,sc.next());
            System.out.println(" Date of join updated successfully");
            break;
        case "exp":
            eexp.set(i,sc.nextInt());
            System.out.println(" Experience updated successfully");
            break;
        default:
            System.out.println("Enter valid deatils and item to be updated");
            break;
        }
}
//Delete Employee Details
        public void delete(){
            System.out.println("Enter Employee Id to be deleted");
            int x=sc.nextInt();
            int y=0;
            for(int i=0;i<eid.size();i++){
                if(x==eid.get(i)){
                    y=i;
                }
            }
            eid.remove(y);
            ename.remove(y);
            esal.remove(y);
            emobilenum.remove(y);
            email.remove(y);
            egender.remove(y);
            eaddress.remove(y);
            edob.remove(y);
            edoj.remove(y);
            eexp.remove(y);
            System.out.println("Employee details deleted successfully");
        }
}
    public class EmplData{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int choice=0;
     Menu e1=new Menu();
     e1.Mmenu();
     data ob=new data();
     System.out.println("Please enter your choice:");
     choice=sc.nextInt();
     while(choice<6){
     if(choice==1){
         ob.adempdetails();
         System.out.println("Employee details added successfully.");
     }
     else if(choice==2){
         ob.viewsingle();    
     }
     else if(choice==3){
         ob.viewall();
     }
     else if(choice==4){
         ob.update();
     }
     else{
         ob.delete();
     }
     System.out.println("Enter your choice: ");
     choice=sc.nextInt();
     }
 }
} 