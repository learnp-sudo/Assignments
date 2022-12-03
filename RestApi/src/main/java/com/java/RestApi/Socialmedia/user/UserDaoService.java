package com.java.RestApi.Socialmedia.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
private static List<User> users= new ArrayList<>();
private static int usersCount=0;
static {
	users.add(new User(++usersCount,"sreeja",LocalDate.now().minusYears(21)));
	users.add(new User(++usersCount,"sreeya",LocalDate.now().minusYears(20)));
	users.add(new User(++usersCount,"rahul",LocalDate.now().minusYears(18)));
}
public List<User> findAll()
{
	return users;
}
public User save(User user)
{
	user.setId(++usersCount);
	users.add(user);
	return user;
	}

public User findOne(int id)
{
	Predicate<? super User> predicate = user -> user.getId().equals(id);
   return users.stream().filter(predicate).findFirst().orElse(null);
}
public void deleteById(int id) {
	Predicate<? super User> predicate = user -> user.getId().equals(id);
	users.removeIf(predicate);
}
}
