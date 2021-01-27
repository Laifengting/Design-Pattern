package com.lft.filter.criteria;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> personList);
}
