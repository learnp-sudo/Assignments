package com.java.RestApi.Socialmedia.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.java.RestApi.repository.PostRepository;
import com.java.RestApi.repository.UserRepository;

@RestController
public class UserJpaResource {
	private UserRepository repository;
	private PostRepository PostRepo;
	public UserJpaResource( UserRepository repository, PostRepository PostRepo)
	{
		this.repository=repository;
		this.PostRepo=PostRepo;
	}

	//retrieve details of users
	@GetMapping("/jpa/users")
	public List<User> retrieveAllUsers()
	{
		return repository.findAll();

	}
@GetMapping("/jpa/users/{id}")
	public User retrieveUser(@PathVariable Integer id )
	{
	Optional<User> user =repository.findById(id);
		if(user.isEmpty())
			throw new UserNotFoundException("id:"+id);
			return user.get();
	}
@PostMapping("/jpa/users")
public ResponseEntity<Object> createUser(@RequestBody User user)
{
	User savedUser =repository.save(user);
	URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
	return ResponseEntity.created(location).build();
}
@DeleteMapping("/jpa/users/{id}")
public void deleteUser(@PathVariable int id) {
	repository.deleteById(id);
}
@GetMapping("/jpa/users/{id}/posts")
public List<Post> retrievePostsForUser(@PathVariable int id) {
	Optional<User> user =repository.findById(id);
	if(user.isEmpty())
		throw new UserNotFoundException("id:"+id);
	return user.get().getPosts();
}
@PostMapping("/jpa/users/{id}/posts")
public ResponseEntity<Object> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post) {
	Optional<User> user =repository.findById(id);
	if(user.isEmpty())
		throw new UserNotFoundException("id:"+id);
	 post.setUser(user.get());
	 Post savedPost=PostRepo.save(post);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedPost.getId())
				.toUri();
		return ResponseEntity.created(location).build();

}

}
