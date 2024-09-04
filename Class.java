public class Class
{
  String className;
  String requirementFulfillment;
  int numCredits;
  boolean completionStatus;
  String description;

  public Class(String className, String requirementFulfillment, int numCredits, boolean completionStatus)
  {
    this.className = className;
    this.requirementFulfillment = requirementFulfillment;
    this.numCredits = numCredits;
    this.completionStatus = completionStatus;
  }

  public String getClassName()
  {
    return this.className;
  }

  public String getRequirementFulfillment()
  {
    return this.requirementFulfillment;
  }

  public int getNumCredits()
  {
    return this.numCredits;
  }

  public boolean getCompletionStatus()
  {
    return this.completionStatus;
  }

  public String getDescription()
  {
    return this.description;
  }

  public void setClassName(String className)
  {
    this.className = className;
  }

  public void setRequirementFulfillment(String requirementFulfillment)
  {
    this.requirementFulfillment = requirementFulfillment;
  }

  public void setNumCredits(int numCredits)
  {
    this.numCredits = numCredits;
  }

  public void setCompletionStatus(boolean completionStatus)
  {
    this.completionStatus = completionStatus;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }


  public String toString()
  {
    return "Class Name: " + className + "Requirement Fulfillment: " + requirementFulfillment +
        "Credits: " + numCredits;
  }

}
