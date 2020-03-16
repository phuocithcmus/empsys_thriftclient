namespace java com.vng.zing.workingday.thrift

include "emp.thrift"
include "working_day_infor.thrift"
include "working_time.thrift"


service WorkingService {
    emp.Employee login(1:required string username, 2:required string password);
    void clockIn(1:required i32 id);
    void clockOut(1:required i32 id);
    working_day_infor.WorkingDayInfo getWorkingDayInfo(1:required i32 id, 2:required string date );
    list<working_day_infor.WorkingDayInfo> getWorkingInfo(1:required i32 id);
    i32 getHourOffOrtherMonth(1:required i32 id, 2:required string date_month);
    list<i32> isChecked(1:required i32 id);
    list<string> timeChecked(1:required i32 id);
    list<working_time.WorkingTime> getWorkingTime(1:required i32 id);
}
