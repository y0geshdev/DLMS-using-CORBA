package server.interfaces;


/**
* server/interfaces/OperationsEnumHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerInterfaces.idl
* Friday, March 8, 2019 1:13:06 PM IST
*/

abstract public class OperationsEnumHelper
{
  private static String  _id = "IDL:server/interfaces/OperationsEnum:1.0";

  public static void insert (org.omg.CORBA.Any a, server.interfaces.OperationsEnum that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static server.interfaces.OperationsEnum extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (server.interfaces.OperationsEnumHelper.id (), "OperationsEnum", new String[] { "BORROW_ITEM", "FIND_ITEM", "RETURN_ITEM", "ADD_TO_WAITING_LIST", "BOOK_BORROWED", "BOOK_AVAILABLE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static server.interfaces.OperationsEnum read (org.omg.CORBA.portable.InputStream istream)
  {
    return server.interfaces.OperationsEnum.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, server.interfaces.OperationsEnum value)
  {
    ostream.write_long (value.value ());
  }

}