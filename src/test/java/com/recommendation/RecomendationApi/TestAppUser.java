package com.recommendation.RecomendationApi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
//import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.recommendation.RecomendationApi.model.AppUser;
import com.recommendation.RecomendationApi.repository.AppUserRepository;
import com.recommendation.RecomendationApi.service.AppUserServiceImpl;
import com.recommendation.RecomendationApi.exception.AppUserNotFoundException;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAppUser {
	@InjectMocks
	private AppUserServiceImpl serviceobj;
	@Mock
	private AppUserRepository appUserRepository;
	
	//	1. signUpUser() Service Layer Check
//	@Test
//	public void signUpUserTest()
//	{
//		AppUser user=new AppUser();
//		user.setUserName("Sai");
//		user.setPassword("Sai");
//		user.setRole("USER");
//		Mockito.when(appUserRepository.save(user)).thenReturn(user);
//		assertEquals(user,serviceobj.signUpUser(user));
//	}
	
	//	2. signIn() Service Layer Check for Invalid UserName
//	@Test
//	public void signInUserTest() throws AppUserNotFoundException {
//		AppUser user=new AppUser();
//		user.setUserName("Raj");
////		user.setPassword("Raj");
//		
//		Executable ex=()->{
//			serviceobj.signInUser("Raj");
//		};
//		
//		Assertions.assertThrows(AppUserNotFoundException.class, ex);
//	}
//}
//	
//	//	3. signIn() Service Layer Check for Wrong Password
//	@Test
//	public void testNegativesignIn1() throws UserNotFoundException {
//		UserTable user=new UserTable();
//		user.setUserName("Project_HIMS");
//		user.setPassword("Capgemini");
//		
//		String testReturn="Password didnt match";
//		
//		Mockito.when(user_repo.existsById("Project_HIMS")).thenReturn(true);
//		Mockito.when(user_repo.findById("Project_HIMS")).thenReturn(Optional.of(user));
//
//		
//		Assertions.assertEquals(testReturn, serviceobj.signIn("Project_HIMS","Capg"));
//	}
//	
//	//	4. signIn() Service Layer Check for Correct Credentials
//	@Test
//	public void testPositivesignIn() throws UserNotFoundException {
//		UserTable user=new UserTable();
//		user.setUserName("Project_HIMS");
//		user.setPassword("Capgemini");
//		
//		String testReturn= "Logged In SuccessFully";
//		
//		Mockito.when(user_repo.existsById("Project_HIMS")).thenReturn(true);
//		Mockito.when(user_repo.findById("Project_HIMS")).thenReturn(Optional.of(user));
//
//		
//		Assertions.assertEquals(testReturn, serviceobj.signIn("Project_HIMS","Capgemini"));
//	}
}


