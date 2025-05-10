package day10;

// package day10;
// 3. Implement a class `Employee` that has private fields `id`, `name`, and `salary`. Provide getter and
// setter methods for each and display the employee details
public class employee{
    public static void main(String[] args) {
        details obj=new details();
        obj.setData(134599,"Anurag Mishra",50000);
        obj.getData();

    }
}

  class details {
    private int id;
    private String name;
    private int salary;
    
    void setData(int Id,String Name,int Salary){
        id=Id;
        name=Name;
        salary=Salary;
    }
    void getData(){
        System.out.println("your employ id number is "+ id);
        System.out.println("your employee name is "+name);
        System.out.println("your employee salary is "+salary);
    }
    

    
}
