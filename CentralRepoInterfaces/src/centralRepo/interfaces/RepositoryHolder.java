package centralRepo.interfaces;

/**
* centralRepo/interfaces/RepositoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CentralRepoInterfaces.idl
* Sunday, March 3, 2019 5:08:25 AM IST
*/

public final class RepositoryHolder implements org.omg.CORBA.portable.Streamable
{
  public centralRepo.interfaces.Repository value = null;

  public RepositoryHolder ()
  {
  }

  public RepositoryHolder (centralRepo.interfaces.Repository initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = centralRepo.interfaces.RepositoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    centralRepo.interfaces.RepositoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return centralRepo.interfaces.RepositoryHelper.type ();
  }

}