public class Person {
  private String name;
  private int age;
  private String email;
  private String SSN;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  public String getMaskedSSN() {
    return "*****" + SSN.substring(SSN.length() - 4);
  }

  public Person (String name, int age, String email, String SSN) {
    this.setName(name);
    this.setAge(age);
    this.setEmail(email);
    this.setSSN(SSN);
  }

  public void setName(String newName) {
    if (newName == null || newName.trim().isEmpty()) {
      throw new IllegalArgumentException("Name field cannot be empty");
    }
      this.name = newName;
  }

  public void setAge(int newAge) {
    if (newAge < 0 || newAge > 150) {
      throw new IllegalArgumentException("Your age must be between 0 - 150");
    }
    this.age = newAge;
  }

  public void setEmail(String newEmail) {
      if (newEmail == null || newEmail.trim().isEmpty()) {
          throw new IllegalArgumentException("Email cannot be empty");
      }
      String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!newEmail.matches(emailPattern)) {
          throw new IllegalArgumentException("Invalid email format");
      }
      this.email = newEmail;
  }

  public void setSSN(String newSSN) {
    if (newSSN == null || newSSN.length()!= 9 || !newSSN.matches("\\d+")) {
      throw new IllegalArgumentException("SSN must be 9 digits");
    }
    this.SSN = newSSN;
  }
}
