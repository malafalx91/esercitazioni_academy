package com.fincons.academy.domain;

public class Person extends GenericObject implements Comparable<Person> {

	private String firstName;
	private String lastName;
	private String mailAddress;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Person() {
		super();
	}

	public Person(Long id, String firstName, String lastName) {
		super();
		setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", mailAddress=" + mailAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			}
		}
		return (firstName.equals(other.firstName) && lastName.equals(other.lastName));
	}

	public int compareTo(Person o) {
		if (o.equals(this)) {
			return 0;
		}
		return this.getId().intValue() - o.getId().intValue();
	}

}
