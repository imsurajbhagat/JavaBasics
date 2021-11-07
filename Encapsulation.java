class Employee{
    public int emp_id; //Data variable hiding!!
    public void setEmpID(int e_id){ //Creating setter and getter methods to viewing, accessing and modifying data.
        emp_id=e_id;
    }
    public int getEmpID(){
        return emp_id;
    }
}
class Company{
    public static void main(String[] args) {
    Employee e=new Employee();
    e.setEmpID(101);
    System.out.println(e.getEmpID());
        
     }
        
}


