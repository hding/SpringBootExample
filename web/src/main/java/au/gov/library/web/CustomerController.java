package au.gov.library.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import au.gov.library.entity.Book;
import au.gov.library.service.SearchService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	SearchService searchService;

	@RequestMapping("all")
	public String findAll(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("userList", searchService.findAllCustomer());
		return "customer";
	}

	@RequestMapping(value = "lentbooks/{id}")
	@ResponseBody
	public Iterable<Book> getLentBooks(@PathVariable int id) {
		return searchService.findLentBook(new Long(id));
	}

}
