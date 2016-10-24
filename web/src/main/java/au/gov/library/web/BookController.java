package au.gov.library.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import au.gov.library.service.SearchService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	SearchService searchService;

	@RequestMapping("all")
	public String findAll(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("bookList", searchService.findAllBook());
		return "book";
	}

}
