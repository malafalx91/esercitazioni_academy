package com.fincons.academy.domain;

import java.time.LocalDateTime;

public class Task extends GenericObject implements Comparable<Task> {

	private String title;
	private String description;
	private Person assignment;
	private Boolean completed = false;
	private LocalDateTime createDate = LocalDateTime.now();
	private LocalDateTime completeOn;

	public Task(long id, String title, String description) {
		super();

		setId(id);
		this.title = title;
		this.description = description;
	}

	public Task() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Person getAssignment() {
		return assignment;
	}

	public void setAssignment(Person assignment) {
		this.assignment = assignment;
	}

	public Boolean isCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getCompleteOn() {
		return completeOn;
	}

	public void setCompleteOn(LocalDateTime completeOn) {
		this.completeOn = completeOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Task other = (Task) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Task o) {
		if (o.equals(this)) {
			return 0;
		}
		return this.getId().intValue() - o.getId().intValue();
	}

}
