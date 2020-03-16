namespace java com.vng.zing.emp.thrift.dto

struct EmployeeWithString {
    1:required i32 id,
    2:required string emp_code,
    3: string emp_name,
    4: string gender,
    5: string dob,
    6: string address,
    7: string phone_number,
    8: string identification_card,
    9:required string date_join,
    10: string date_left,
    11: string note,
    12: string emp_mng,
    13: string emp_department,
    14: string emp_title,
    15: i32 role
}

