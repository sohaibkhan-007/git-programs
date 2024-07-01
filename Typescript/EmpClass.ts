 class EmpClass{
    empId:number=1;
    empName:String="sohaib";
    empSalary:number=50000;
    Display():void {
    console.log(`Emloyee ID ${this.empId},Emloyee name ${this.empName},Employee salary ${this.empSalary}`);        
    }
}
let emp:EmpClass=new EmpClass();
emp.Display();