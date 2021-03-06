/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vng.zing.workingday.thrift.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkingDayInfo implements org.apache.thrift.TBase<WorkingDayInfo, WorkingDayInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WorkingDayInfo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EMP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("emp_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_IN_FIELD_DESC = new org.apache.thrift.protocol.TField("time_in", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_OUT_FIELD_DESC = new org.apache.thrift.protocol.TField("time_out", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WorkingDayInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WorkingDayInfoTupleSchemeFactory());
  }

  public int id; // required
  public String emp_name; // required
  public String time_in; // required
  public String time_out; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    EMP_NAME((short)2, "emp_name"),
    TIME_IN((short)3, "time_in"),
    TIME_OUT((short)4, "time_out");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // EMP_NAME
          return EMP_NAME;
        case 3: // TIME_IN
          return TIME_IN;
        case 4: // TIME_OUT
          return TIME_OUT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EMP_NAME, new org.apache.thrift.meta_data.FieldMetaData("emp_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_IN, new org.apache.thrift.meta_data.FieldMetaData("time_in", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_OUT, new org.apache.thrift.meta_data.FieldMetaData("time_out", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WorkingDayInfo.class, metaDataMap);
  }

  public WorkingDayInfo() {
  }

  public WorkingDayInfo(
    int id,
    String emp_name,
    String time_in,
    String time_out)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.emp_name = emp_name;
    this.time_in = time_in;
    this.time_out = time_out;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkingDayInfo(WorkingDayInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetEmp_name()) {
      this.emp_name = other.emp_name;
    }
    if (other.isSetTime_in()) {
      this.time_in = other.time_in;
    }
    if (other.isSetTime_out()) {
      this.time_out = other.time_out;
    }
  }

  public WorkingDayInfo deepCopy() {
    return new WorkingDayInfo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.emp_name = null;
    this.time_in = null;
    this.time_out = null;
  }

  public int getId() {
    return this.id;
  }

  public WorkingDayInfo setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getEmp_name() {
    return this.emp_name;
  }

  public WorkingDayInfo setEmp_name(String emp_name) {
    this.emp_name = emp_name;
    return this;
  }

  public void unsetEmp_name() {
    this.emp_name = null;
  }

  /** Returns true if field emp_name is set (has been assigned a value) and false otherwise */
  public boolean isSetEmp_name() {
    return this.emp_name != null;
  }

  public void setEmp_nameIsSet(boolean value) {
    if (!value) {
      this.emp_name = null;
    }
  }

  public String getTime_in() {
    return this.time_in;
  }

  public WorkingDayInfo setTime_in(String time_in) {
    this.time_in = time_in;
    return this;
  }

  public void unsetTime_in() {
    this.time_in = null;
  }

  /** Returns true if field time_in is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_in() {
    return this.time_in != null;
  }

  public void setTime_inIsSet(boolean value) {
    if (!value) {
      this.time_in = null;
    }
  }

  public String getTime_out() {
    return this.time_out;
  }

  public WorkingDayInfo setTime_out(String time_out) {
    this.time_out = time_out;
    return this;
  }

  public void unsetTime_out() {
    this.time_out = null;
  }

  /** Returns true if field time_out is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_out() {
    return this.time_out != null;
  }

  public void setTime_outIsSet(boolean value) {
    if (!value) {
      this.time_out = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case EMP_NAME:
      if (value == null) {
        unsetEmp_name();
      } else {
        setEmp_name((String)value);
      }
      break;

    case TIME_IN:
      if (value == null) {
        unsetTime_in();
      } else {
        setTime_in((String)value);
      }
      break;

    case TIME_OUT:
      if (value == null) {
        unsetTime_out();
      } else {
        setTime_out((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case EMP_NAME:
      return getEmp_name();

    case TIME_IN:
      return getTime_in();

    case TIME_OUT:
      return getTime_out();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case EMP_NAME:
      return isSetEmp_name();
    case TIME_IN:
      return isSetTime_in();
    case TIME_OUT:
      return isSetTime_out();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkingDayInfo)
      return this.equals((WorkingDayInfo)that);
    return false;
  }

  public boolean equals(WorkingDayInfo that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_emp_name = true && this.isSetEmp_name();
    boolean that_present_emp_name = true && that.isSetEmp_name();
    if (this_present_emp_name || that_present_emp_name) {
      if (!(this_present_emp_name && that_present_emp_name))
        return false;
      if (!this.emp_name.equals(that.emp_name))
        return false;
    }

    boolean this_present_time_in = true && this.isSetTime_in();
    boolean that_present_time_in = true && that.isSetTime_in();
    if (this_present_time_in || that_present_time_in) {
      if (!(this_present_time_in && that_present_time_in))
        return false;
      if (!this.time_in.equals(that.time_in))
        return false;
    }

    boolean this_present_time_out = true && this.isSetTime_out();
    boolean that_present_time_out = true && that.isSetTime_out();
    if (this_present_time_out || that_present_time_out) {
      if (!(this_present_time_out && that_present_time_out))
        return false;
      if (!this.time_out.equals(that.time_out))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(WorkingDayInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    WorkingDayInfo typedOther = (WorkingDayInfo)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmp_name()).compareTo(typedOther.isSetEmp_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmp_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emp_name, typedOther.emp_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime_in()).compareTo(typedOther.isSetTime_in());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_in()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_in, typedOther.time_in);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime_out()).compareTo(typedOther.isSetTime_out());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_out()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_out, typedOther.time_out);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WorkingDayInfo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("emp_name:");
    if (this.emp_name == null) {
      sb.append("null");
    } else {
      sb.append(this.emp_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_in:");
    if (this.time_in == null) {
      sb.append("null");
    } else {
      sb.append(this.time_in);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time_out:");
    if (this.time_out == null) {
      sb.append("null");
    } else {
      sb.append(this.time_out);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (time_in == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_in' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WorkingDayInfoStandardSchemeFactory implements SchemeFactory {
    public WorkingDayInfoStandardScheme getScheme() {
      return new WorkingDayInfoStandardScheme();
    }
  }

  private static class WorkingDayInfoStandardScheme extends StandardScheme<WorkingDayInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WorkingDayInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EMP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.emp_name = iprot.readString();
              struct.setEmp_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_IN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.time_in = iprot.readString();
              struct.setTime_inIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME_OUT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.time_out = iprot.readString();
              struct.setTime_outIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WorkingDayInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.emp_name != null) {
        oprot.writeFieldBegin(EMP_NAME_FIELD_DESC);
        oprot.writeString(struct.emp_name);
        oprot.writeFieldEnd();
      }
      if (struct.time_in != null) {
        oprot.writeFieldBegin(TIME_IN_FIELD_DESC);
        oprot.writeString(struct.time_in);
        oprot.writeFieldEnd();
      }
      if (struct.time_out != null) {
        oprot.writeFieldBegin(TIME_OUT_FIELD_DESC);
        oprot.writeString(struct.time_out);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WorkingDayInfoTupleSchemeFactory implements SchemeFactory {
    public WorkingDayInfoTupleScheme getScheme() {
      return new WorkingDayInfoTupleScheme();
    }
  }

  private static class WorkingDayInfoTupleScheme extends TupleScheme<WorkingDayInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WorkingDayInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      oprot.writeString(struct.time_in);
      BitSet optionals = new BitSet();
      if (struct.isSetEmp_name()) {
        optionals.set(0);
      }
      if (struct.isSetTime_out()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetEmp_name()) {
        oprot.writeString(struct.emp_name);
      }
      if (struct.isSetTime_out()) {
        oprot.writeString(struct.time_out);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WorkingDayInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      struct.time_in = iprot.readString();
      struct.setTime_inIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.emp_name = iprot.readString();
        struct.setEmp_nameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.time_out = iprot.readString();
        struct.setTime_outIsSet(true);
      }
    }
  }

}

