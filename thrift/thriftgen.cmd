#!/bin/sh

xrpcgen-0.9.0 --gen java emp.thrift
xrpcgen-0.9.0 --gen java emp_join.thrift
xrpcgen-0.9.0 --gen java emp_service.thrift
xrpcgen-0.9.0 --gen java working_day_infor.thrift
xrpcgen-0.9.0 --gen java working_service.thrift
xrpcgen-0.9.0 --gen java department.thrift
xrpcgen-0.9.0 --gen java title.thrift
xrpcgen-0.9.0 --gen java working_time.thrift
xrpcgen-0.9.0 --gen java profile_emp.thrift

cp gen-java/* ../src/ -rf
rm gen-java -rf

