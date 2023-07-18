/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 34 "model.ump"
// line 86 "model.ump"
public class GameFixture
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GameFixture Attributes
  private String fixtureDescription;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GameFixture(String aFixtureDescription)
  {
    fixtureDescription = aFixtureDescription;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setFixtureDescription(String aFixtureDescription)
  {
    boolean wasSet = false;
    fixtureDescription = aFixtureDescription;
    wasSet = true;
    return wasSet;
  }

  public String getFixtureDescription()
  {
    return fixtureDescription;
  }

  public void delete()
  {}

  // line 40 "model.ump"
   public String getFullFixtureDescription(){
    return getFixtureDescription() + getExtraFixtureDescription();
  }

  // line 44 "model.ump"
   public String getExtraFixtureDescription(){
    return "";
  }


  public String toString()
  {
    return super.toString() + "["+
            "fixtureDescription" + ":" + getFixtureDescription()+ "]";
  }
}