import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Pp_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("\nShri G.S. Institute of Technology and Science");
                    System.out.print("\nKindly enter your id : ");
                    String e_id = sc.next();
                    int mainFlag = 0;
                    try {
                    String a = "Database\\Manage.txt";
                    String b = "Database\\Test.txt";
                    FileReader fr = new FileReader(a);
                    BufferedReader br = new BufferedReader(fr);
                    String line = null,newline = null;
                    
                    while ((line = br.readLine()) != null) {
                        if (line.compareTo(e_id)==0) {
                            mainFlag = 1;
                            line = br.readLine();
                            System.out.print("Enter password : ");
                                String e_pass = sc.next();
                                if (line.compareTo(e_pass)!=0) {
                                    System.out.println("Password is not correct\n");
                                    return;
                                }

                                System.out.println("\nAuthentication Completed");

                                Student stu = new Student(e_id, e_pass, line=br.readLine(), line=br.readLine(), line=br.readLine(), line=br.readLine(), 
                                line=br.readLine(), line=br.readLine(), line=br.readLine(), line=br.readLine(), line=br.readLine(), (line=br.readLine()),
                                (line=br.readLine()), (line=br.readLine()), line=br.readLine(), (line=br.readLine()));
                                
                                boolean flag = true;
                                while(flag == true) {
                                System.out.println("\nPlease specify the action you want to perform");
                                System.out.println("1 : View your information");
                                System.out.println("2 : Mark Today's Attendance");
                                System.out.println("3 : View present month's attendance");
                                System.out.println("4 : Apply for leaves");
                                System.out.println("5 : View result of previous year");
                                System.out.println("6 : View present year subjects");
                                System.out.println("7 : Update your information");
                                System.out.println("8 : Change password");
                                System.out.println("0 : Exit\n");
                    
                                int work = sc.nextInt();
                                switch (work) {
                                    case 1 :
                                        System.out.println();
                                        stu.showDetails();
                                        break;
                                    case 2 : 
                                        System.out.println();
                                        stu.markAttendance();
                                        break;
                                    case 3 : 
                                        System.out.println();
                                        stu.showAttendance();
                                        break;
                                    case 4 : 
                                        System.out.println();
                                        stu.getLeaves();
                                        break;
                                    case 5 : 
                                        System.out.println();
                                        stu.showResult();
                                        break;
                                    case 6 : 
                                        System.out.println();
                                        stu.showSubjects();
                                        break;
                                    case 7 : 
                                        System.out.println();
                                        stu.updateDetails();
                                        break;
                                    case 8 : 
                                        System.out.println();
                                        stu.changePassword();
                                        break;
                                    case 0 : 
                                        System.out.println();
                                        flag = false;
                                        break;
                                    default: 
                                        System.out.println("Please choose a valid option\n");
                                        break;
                                }
                            }
                        

                        // String b = "D:\\2nd_Year_project\\Test.txt";
                        FileReader fr2 = new FileReader(a);
                        BufferedReader br2 = new BufferedReader(fr2);
                    FileWriter fw = new FileWriter(b);
                    while ((newline = br2.readLine())!=null) {
                        if (newline.compareTo(e_id)==0) {
                            fw.write(newline+"\n");
                            fw.write(stu.password+"\n");
                            fw.write(stu.name+"\n");
                            fw.write(stu.department+"\n");
                            fw.write(stu.dob+"\n");
                            fw.write(stu.doj+"\n");
                            fw.write(stu.address+"\n");
                            fw.write(stu.phone+"\n");
                            fw.write(stu.email+"\n");
                            fw.write(stu.account+"\n");
                            fw.write(stu.aadhaar+"\n");
                            fw.write(stu.attendance+"\n");
                            fw.write(stu.presentAttendance+"\n");
                            fw.write(stu.presentleaves+"\n");
                            fw.write(stu.subjects+"\n");
                            fw.write(stu.result+"\n");
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                            newline = br2.readLine();
                        }

                        fw.write(newline+"\n");
                    }
                    br.close();
                    fw.close();
                    br2.close();

                    a = "Database\\Manage.txt";
                    b = "Database\\Test.txt";
                    FileReader fr3 = new FileReader(b);
                    BufferedReader br3 = new BufferedReader(fr3);
                    FileWriter fw3 = new FileWriter(a);
                    String output = null;
                    while ((output=br3.readLine()) != null) {
                        fw3.write(output+"\n");
                    }
                    br3.close();
                    fw3.close();
                }
                    }
                    
                }

                catch(Exception e) {
                    
                }
                if (mainFlag == 0) {
                    System.out.println("\nEntered Id does not exist\n");
                }
    }
}


class Student {
    
    String name;
    String id;
    String password;
    String dob;
    String department;
    String doj;
    String address;
    String phone;
    String email;
    String account;
    String aadhaar;

    String attendance;
    String presentAttendance;
    String presentleaves;
    String result;
    String subjects;

    Student(String id, String password, String name, String department, String dob, String doj, String address, 
             String phone, String email, String account, String aadhaar, String attendance, String presentAttendance, 
             String presentleaves, String subjects, String result) {
        this.department = department;
        this.name = name;
        this.id = id;
        this.password = password;
        this.dob = dob;
        this.doj = doj;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.account = account;
        this.aadhaar = aadhaar;
        this.attendance = attendance;
        this.presentAttendance = presentAttendance;
        this.presentleaves = presentleaves;
        this.subjects = subjects;
        this.result = result;
    }

    Scanner sc = new Scanner(System.in);
    public void changePassword() {
        System.out.print("Enter your date of birth in the format dd/mm/yyyy : ");
        String test_dob = sc.next();
        if (test_dob.compareTo(dob) == 0) {
            System.out.print("Enter new password : ");
            Scanner sc = new Scanner(System.in);
            String newp = sc.next();
            password = newp;
            System.out.println("Password changed successfully\n");
        }
        else {
            System.out.println("The entered date of birth is not correct \n");
        }
    }

    public void showDetails() {
        System.out.println("The details available for the Student Id "+id+" are :");
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Date of Joining : "+doj);
        System.out.println("Address : "+address);
        System.out.println("Phone number : "+phone);
        System.out.println("Email : "+email);
        System.out.println("Aadhaar : "+aadhaar);
    }

    public void updateDetails() {
        System.out.println("Choose the information you want to update : ");
        System.out.println("Address : 1");
        System.out.println("Phone number : 2");
        System.out.println("Email Address : 3");
        System.out.println("Account Number : 4");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter the new address : ");
                address = sc.nextLine();
                System.out.println("Address updated successfully\n");
                break;
        
            case 2:
                System.out.print("Enter the new phone number : ");
                phone = sc.next();
                System.out.println("Phone number updated successfully\n");
                break;

            case 3:
                System.out.print("Enter the new email address : ");
                email = sc.next();
                System.out.println("Email updated successfully\n");
                break;

            case 4:
                System.out.print("Enter the new account number : ");
                account = sc.next();
                System.out.println("Account number updated successfully\n");
                break;

            default:
                System.out.println("Please choose a valid option\n");
                break;
        }
    }

    public void getLeaves() {
        System.out.print("How many leaves you want : ");
        int s = sc.nextInt();
        int l = Integer.parseInt(presentleaves);
        l += s;
        presentleaves = Integer.toString(l);
        System.out.println("Leaves granted\n");
    }

    public void showSubjects() {
        System.out.println("Your subjects for the present year are : "+subjects);
    }

    public void markAttendance() {
        int a = Integer.parseInt(presentAttendance);
        a++;
        presentAttendance = Integer.toString(a);
        System.out.println("Attendance marked\n");
    }

    public void showAttendance() {
        int a = Integer.parseInt(presentAttendance);
        int l = Integer.parseInt(presentleaves);
        System.out.println("Your present attendance is "+a+" out of "+(a+l)+" days\n");
    }

    public void showResult() {
        System.out.println("Your result for the previous year is : "+result);
    }
}