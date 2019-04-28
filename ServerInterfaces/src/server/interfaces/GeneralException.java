package server.interfaces;


/**
* server/interfaces/GeneralException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerInterfaces.idl
* Friday, March 8, 2019 1:13:06 PM IST
*/

public final class GeneralException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GeneralException ()
  {
    super(GeneralExceptionHelper.id());
  } // ctor

  public GeneralException (String _reason)
  {
    super(GeneralExceptionHelper.id());
    reason = _reason;
  } // ctor


  public GeneralException (String $reason, String _reason)
  {
    super(GeneralExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GeneralException
