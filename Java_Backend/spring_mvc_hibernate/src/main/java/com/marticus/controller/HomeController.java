package com.marticus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.model.User;
import com.marticus.utility.HibernateUtil;
import com.mysql.cj.QueryResult;

import antlr.collections.List;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		
		System.out.println("User Page Requested");
		
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userId", user.getId());
		model.addAttribute("userEmail",user.getUserEmail());
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();

		return "user";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@Validated User user, Model model) {
		
		System.out.println("Search Page Requested");
		return "search";
	}
	
	@RequestMapping(value = "/getSearchResults", method = RequestMethod.POST)
	public String getUser(@Validated User user, Model model) {
		
		System.out.println("getSearchResult  Page Requested");
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		System.out.println("sessionFactory inside getSearchResults "+session);
		session.beginTransaction();
		 User user = (User) session.load(User.class, new Integer(user.getId()));
		 model.addAttribute("userName", user.getUserName());
			model.addAttribute("userId", user.getId());
			model.addAttribute("userEmail",user.getUserEmail());
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.shutdown();
		 
		return "getSearchResults";
	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String user(Model model) {
		 //HQL - Hibenate Query Language
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//select * from Users -- equivalent SQL
		
		Query query = session.createNativeQuery("SELECT * FROM user;");
		query.setResultTransformer(Transformers.aliasToBean(User.class));
		ArrayList<User> entries = (ArrayList<User>) query.getResultList();
		
		System.out.println("Select Query is executed");
		System.out.println(entries.get(0));
		
//		java.util.List userList =session.createQuery("from user").list();
//		
//
//		ArrayList <User> uList = new ArrayList<User>();
//		for (Iterator iterator2 = ((java.util.List) userList).iterator(); iterator2.hasNext();){
//            User u = (User) iterator2.next(); 
//            
//            uList.add(u);
//            System.out.println("User: " + u.getUserName()); 
//         }
		model.addAttribute("uList",entries );
//		List<EmployeeVO> empList=employeeManager.getAllEmployees();
//		model.addAttribute("employees",empList );
//		<c:forEach items="${uList}" var="user">
//		<td>${user.name}</td>
//
//		
//		/c:forEach>

		
//		model.addAttribute("userName", user.getUserName());
//		model.addAttribute("userAge", user.getUserAge());
		return "userList";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id")String id, Model model) {
		
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setId(Integer.parseInt(id));
		session.delete(user);
		session.getTransaction().commit();
		session.close();

		//HibernateUtil.shutdown();
		 
		return "userList";
	}
	@RequestMapping(value = "/update{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id")String id, Model model) {
		
		Session session=com.marticus.utility.HibernateUtil.
				getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setId(Integer.parseInt(id));
		session.load(user,new Integer(user.getId()));
		   model.addAttribute("userName", user.getUserName());
			model.addAttribute("userId", user.getId());
			model.addAttribute("userEmail",user.getUserEmail());
		session.getTransaction().commit();
		session.close();

		//HibernateUtil.shutdown();
		
		
		return "userList";
	
	}
	
	
	
	
	
}
