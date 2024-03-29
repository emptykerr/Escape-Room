/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 49 "model.ump"
// line 91 "model.ump"
public class TreasureChest extends GameFixture
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TreasureChest Attributes
  private boolean open;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TreasureChest(String aFixtureDescription)
  {
    super(aFixtureDescription);
    open = false;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setOpen(boolean aOpen)
  {
    boolean wasSet = false;
    open = aOpen;
    wasSet = true;
    return wasSet;
  }

  public boolean getOpen()
  {
    return open;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isOpen()
  {
    return open;
  }

  public void delete()
  {
    super.delete();
  }

  // line 55 "model.ump"
   public String getExtraFixtureDescription(){
    return getOpen() ? "It contains the room key!" : "It's lid is closed.";
  }


  public String toString()
  {
    return super.toString() + "["+
            "open" + ":" + getOpen()+ "]";
  }
}