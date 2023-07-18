/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 61 "model.ump"
// line 96 "model.ump"
public class Wardrobe extends GameFixture
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Wardrobe Attributes
  private boolean locked;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Wardrobe(String aFixtureDescription)
  {
    super(aFixtureDescription);
    locked = true;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLocked(boolean aLocked)
  {
    boolean wasSet = false;
    locked = aLocked;
    wasSet = true;
    return wasSet;
  }

  public boolean getLocked()
  {
    return locked;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isLocked()
  {
    return locked;
  }

  public void delete()
  {
    super.delete();
  }

  // line 67 "model.ump"
   public String getExtraFixtureDescription(){
    return "It is " + doorDescription();
  }

  // line 71 "model.ump"
   private String doorDescription(){
    return getLocked() ? "locked" : "unlocked";
  }


  public String toString()
  {
    return super.toString() + "["+
            "locked" + ":" + getLocked()+ "]";
  }
}