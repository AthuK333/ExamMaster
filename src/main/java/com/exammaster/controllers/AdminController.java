package com.exammaster.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import org.hibernate.sql.results.jdbc.internal.JdbcValuesSourceProcessingStateStandardImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.exammaster.OptionRepo;
import com.exammaster.QuestionRepo;
import com.exammaster.TestRepo;
import com.exammaster.entities.Option;
import com.exammaster.entities.Question;
import com.exammaster.entities.Test;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;

@Controller
public class AdminController {
	
	@Autowired
	private TestRepo rept;
	
	@Autowired
	private QuestionRepo repq;
	
	@Autowired
	private OptionRepo repo;
	
	@GetMapping(path = "/ad")
	public String getAdminDash() {
		return "admindash";
	}

	@GetMapping(path = "/addt")
	public String getTest() {
		return "addtest";
	}
	
	@GetMapping(path = "/addq")
	public String getQuestion() {
		return "addquestion";
	}
	
	@PostMapping(path = "/test")
	public String addTest(HttpServletRequest req,Model model) {
		
		HttpSession session = req.getSession();
		
		String testTitle = req.getParameter("title");
		String testDesc = req.getParameter("description");
		Integer testDuration = Integer.parseInt(req.getParameter("duration")) ;
		
		
		
		Test t = new Test(testTitle, testDuration, testDesc, null, null);
		
		rept.save(t);
		
		
		
		Long id= rept.getId(testTitle);
//		
//		List<Question> qq =  repq.li(id);
//		
//		t.setQuestions(qq);
		
		session.setAttribute("tid", id);
		return "addquestion";
		
	}
	
	@Transactional
	@PostMapping(path = "/question")
	public String addQuestion(HttpServletRequest req, Model model) {
		
		HttpSession session = req.getSession();
		
		String qText = req.getParameter("question") ;
		
		Long id=(Long) session.getAttribute("tid");
		
		
		Test t = rept.findById(id).get();
		
		String o1 = req.getParameter("option1");
		String o2 = req.getParameter("option2");
		String o3 = req.getParameter("option3");
		String o4 = req.getParameter("option4");
		
//		List<Option> opt = new ArrayList<>();
//		opt.add(new );
		
		
		
		Question q = new Question(qText, t, null);
		
		List<Question> qq = t.getQuestions();
		
		qq.add(q);
		
		t.setQuestions(qq);
		
		repq.save(q);
		
		
		
		Long id1 =(repq.getId(qText)) ;
		
		session.setAttribute("qid", id1);
		
		Long qid = (Long) session.getAttribute("qid");
		
		Question ques = repq.findById(qid).get();
		
		Option opt1 = new Option(o1, ques, false);
		if(req.getParameter("correct-answer").equals("option1")) {
			opt1.setIsCorrect(true);
		}
		repo.save(opt1);
		Option opt2 = new Option(o2, ques, false);
		if(req.getParameter("correct-answer").equals("option2")) {
			opt2.setIsCorrect(true);
		}
		repo.save(opt2);
		Option opt3 = new Option(o3, ques, false);
		if(req.getParameter("correct-answer").equals("option3")) {
			opt3.setIsCorrect(true);
		}
		repo.save(opt3);
		Option opt4 = new Option(o4, ques, false);
		if(req.getParameter("correct-answer").equals("option4")) {
			opt4.setIsCorrect(true);
		}
		repo.save(opt4);
		
		
		List<Option> option = new ArrayList<>();
		
		option.add(opt1);
		option.add(opt2);
		option.add(opt3);
		option.add(opt4);
		
		q.setOptions(option);
		
		
		
		return "addquestion";
		
	}
	
	@GetMapping(path = "/ut")
	public String updateTest(Model model) {
		
		List<Test> t= rept.findAll();
		
		model.addAttribute("test",t);
		
		return "updatetest";
	}
	
	@GetMapping(path = "/updtest/{id}")
	public String udpateT(@PathVariable Long id,Model model,HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		Test t= rept.findById(id).get();
		session.setAttribute("title",t.getTitle());
		System.out.println(t.getTitle()+"---------------------------------------------------------------------------------------");
		
	
		
		return "updatet";
	}
	
	@PostMapping(path = "/edittest")
	public String editTest(HttpServletRequest req, Model model) throws IOException {
		
		
	String url = "http://localhost:8080/ut"; 
	Document doc = Jsoup.connect(url).get();
	String aContent = doc.select("a").first().text();
	
	model.addAttribute(aContent);
	
	System.out.println(aContent + "==================================================================================");
	
//	String t=req.getParameter("titles");
//	System.out.println(t);
//	Long id= rept.getId(t);
//	Test test= rept.findById(id).get();
//	model.addAttribute("t",test);
//	
//	String title= rept.showTitle(t);
//	System.out.println(title);
//	model.addAttribute("title",title);
//	//session.setAttribute("title", title);
//	
//	String desc = rept.showDesc(t);
//	System.out.println(desc);
//	model.addAttribute("desc",desc);
//	Integer duration= rept.showDuration(t);
//	model.addAttribute("duration",duration);
//	System.out.println(duration);
	

	
	return "updateq";
	
	
	
	
		
		
	}
	
	
	
	
	
	
}
