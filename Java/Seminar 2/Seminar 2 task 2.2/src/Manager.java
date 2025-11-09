import java.util.ArrayList;

public class Manager extends FullTimeEmployee {
  private ArrayList<Employee> teamMembers;

  public Manager(double salary) {
    super(salary);
    teamMembers = new ArrayList<>();
  }

  public void addMember(Employee member) {
    if (teamMembers.contains(member)) {
      throw new IllegalArgumentException ("The employee you are trying to add is already part of this team");
    }
    teamMembers.add(member);
  }

  public void removeMember(Employee member) {
    if (!teamMembers.contains(member)) {
      throw new IllegalArgumentException ("The employee you are trying to remove is not on the team");
    }
    teamMembers.remove(member);
  }

  public int getTeamSize() {
    return teamMembers.size();
  }

  @Override
  public String toString() {
      return "Manager: " + name + ", ID: " + employeeId + ", Dept: " + department + ", Salary: " + calculatePay() + ", Team Size: " + teamMembers.size();
  }
}
