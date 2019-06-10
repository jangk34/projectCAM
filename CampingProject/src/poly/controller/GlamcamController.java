package poly.controller;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.dto.GlamcamDTO;
import poly.service.IGlamcamService;
import poly.util.CSVReadFromFile;

/*
 * Controller 선언해야만 Spring 프레임워크에서 Controller인지 인식 가능
 * 자바 서블릿 역할 수행
 * */
@Controller
@RequestMapping(value="/glamcam") // 최상위경로
public class GlamcamController {
	private Logger log = Logger.getLogger(this.getClass()); // 로그찍을떄 사용 외워놓기
	
	@Resource(name="GlamcamService")
	private IGlamcamService glamcamService;
	
	@RequestMapping (value="/list") // 표시되는 이동경로
	public String glamcamList() throws Exception {
		
		List<GlamcamDTO> gList = new ArrayList<>();  // 리스트 배열화 선언
		gList = glamcamService.getGlamcamList(); // 리스트 = 서비스.리스트()
		
		
		
		return "/glamcam/glamcamList"; // 반환하는 jsp값
	}
	
	@RequestMapping(value="searchFromCSV", method=RequestMethod.GET)
	   public String searchFromCSV(HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws Exception {
	    List<List<String>> ret = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = Files.newBufferedReader(Paths.get("C:\\pro\\CampingProject\\WebContent\\resource\\csv\\grate.csv"));
			Charset.forName("UTF-8");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	     
	      return "/search";
	   }

	
}
