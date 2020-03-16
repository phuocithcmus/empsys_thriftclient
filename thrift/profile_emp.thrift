namespace java com.vng.zing.emp.thrift.dto

struct ProfileEmp {
    1:required i32 id,
    2:required string emp_code,
    3: string emp_name,
    4: i32 actualWorkingDay,
    5: double actualWorkingDayHour,
    6: double actualHourOff,
}

