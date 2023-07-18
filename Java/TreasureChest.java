/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 35 "model.ump"
// line 61 "model.ump"
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

  // line 39 "model.ump"
   public String getFixtureDescription(){
    return getOpen() ? "A large and heavy treasure chest. It contains the room key!" : "A large and heavy treasure chest. It's lid is closed.";
  }


  public String toString()
  {
    return super.toString() + "["+
            "open" + ":" + getOpen()+ "]";
  }
}