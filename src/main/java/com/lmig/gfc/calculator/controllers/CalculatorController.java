package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.lmig.gfc.calculator.models.Calculator;
import com.lmig.gfc.calculator.models.CalculatorHistory;
import com.lmig.gfc.calculator.models.CustomFormula;
import com.lmig.gfc.calculator.models.Memory;

@Controller
public class CalculatorController {

	//Declare the two objects that shall live on throughout the lifetime of the application.
	private CalculatorHistory ch;
	private Memory mem;

	
	//Construct the default instance of controller, and initiaite the new instances of our objects.
	public CalculatorController() {
		mem = new Memory();
		ch = new CalculatorHistory();
	}

	
	//Capture all traffic @ localhost:8080 to present a default experience
	@RequestMapping("/")
	public ModelAndView showApp() {
		ModelAndView mv = new ModelAndView();
		//new objects are needed of each type to allow to logic-less html templating.
		CustomFormula custForm = new CustomFormula();
		Calculator calc = new Calculator();
		mv.setViewName("main");
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);
		mv.addObject("hist", ch);
		return mv;
	}

	//When equation is run, we accept parameters and out source thejob o thecalcuator class.  
	@RequestMapping("/doTheMath")
	public ModelAndView showApp(Double numberOne, Double numberTwo, String operator) {

		//declare both of the temporary casses
		Calculator calc;
		CustomFormula custForm;

		//if we have no calculation, created default versions of each.  This is to avoid writing 0 + 0 = 0 to history
		if (numberOne == 0 && numberTwo == 0) {

			calc = new Calculator();
			custForm = new CustomFormula();
		} else {
			//otherwise, create an actual instance of type calculator and store that value in the arrayList.
			calc = new Calculator(numberOne, numberTwo, operator);
			custForm = new CustomFormula();
			ch.addCalc(calc);

		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);
		mv.addObject("hist", ch);

		return mv;

	}

	//If passed, clear the memory array.  Create all default objects to support HTML templating.
	@RequestMapping("/cleartheMemory")
	public ModelAndView clearTheMemory() {

		Calculator calc = new Calculator();
		CustomFormula custForm = new CustomFormula();
		mem.clear();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);
		mv.addObject("hist", ch);

		return mv;

	}

	//Add answer to array. ensurevalue is not null.  Again, create default instances of required objects.
	@RequestMapping("/addToMemory")
	public ModelAndView addToMemory(Integer answerIndex) {

		Calculator calc = new Calculator();
		CustomFormula custForm = new CustomFormula();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		if (ch.calcLength() > 0) {
			mem.add(ch.getAns(answerIndex - 1));
		}
		mv.addObject("hist", ch);
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);

		return mv;

	}

	//Subtract the most recent entry to the memory.
	@RequestMapping("/subTheMemory")
	public ModelAndView subFromMemory(int answerIndex) {

		Calculator calc = new Calculator();
		CustomFormula custForm = new CustomFormula();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		mem.sub();
		mv.addObject("hist", ch);
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);

		return mv;

	}

	//Navaigate to thememory page, as long as there is something stored.
	@RequestMapping("/printTheMemory")
	public ModelAndView printMemory() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("mem", mem);
		if (mem.getSize() > 0) {
			mv.setViewName("printMemory");
		} else {
			mv.setViewName("main");
			Calculator calc = new Calculator();
			CustomFormula custForm = new CustomFormula();
			mv.addObject("hist", ch);
			mv.addObject("final", calc);
			mv.addObject("custForm", custForm);
		}
		return mv;

	}
	//If hit, pass in the custom formula.   
	@RequestMapping("/typeRandom")
	public ModelAndView addToMemory(String customFormula) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		CustomFormula custForm = new CustomFormula(customFormula);
		Calculator calc = new Calculator();
		mv.addObject("hist", ch);
		mv.addObject("final", calc);
		mv.addObject("custForm", custForm);

		return mv;

	}

}
