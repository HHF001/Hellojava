class Person081705 {
  public String firstname;
  public String lastname;
  public Person081705 (String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public boolean equals(Person081705 p) {
	    return (p.firstname == firstname && p.lastname == lastname);
	  }
  public static void main(String[] args) {
    Person081705 person1 = new Person081705("Jennifer", "Smith");
    Person081705 person2 = new Person081705("Jennifer", "Smith");
    // compare with `==`
    System.out.println(person1 == person2); 
    // compare with `.equals()`
    System.out.println(person1.equals(person2)); 
  }
}