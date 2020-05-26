package com.controller;

import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		model.addAttribute("message", "Mathematical Expression Home");
		System.out.println("In Welcome method");
		return "hello";
	}

	@RequestMapping(value = "/solution_retry", method = RequestMethod.POST)
	public String calculate(ModelMap model, @RequestParam("expression") String expression) {
		model.addAttribute("message", "Mathematical Expression Solution ");
		model.addAttribute("solution", "abc");
		System.out.println("In calculate method");
		System.out.println("Expression: " + expression);
		try {
			String answer = calculateUsingNashorn(expression);
			System.out.println("Answer: " + answer);
			model.addAttribute("solution", answer);
			return "solution_retry";
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return "exception_go_back";
		}
	}

	public String calculateUsingNashorn(String exp) throws Exception {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
		// JavaScript code from String
		Object ob = scriptEngine.eval(exp);
		return ob.toString();
	}
}