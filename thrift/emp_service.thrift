namespace java com.vng.zing.emp.thrift

include "emp.thrift"
include "emp_join.thrift"
include "department.thrift"
include "title.thrift"
include "profile_emp.thrift"


service EmployeeService {
    list<emp_join.EmployeeWithString> getListEmp();
    emp_join.EmployeeWithString getEmp(1:required i32 id);
    bool deactiveEmp(1:required i32 id);
    bool activeEmp(1:required i32 id);
    string createEmp(1:required emp.Employee emp);
    list<department.Department> getAllDepartment();
    list<title.Title> getAllTitle();
    list<emp.Employee> getEmployeeByDept(1:required i32 id);
    list<profile_emp.ProfileEmp> getProfileEmp(1:required i32 id);
}
