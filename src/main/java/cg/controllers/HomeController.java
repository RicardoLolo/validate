package cg.controllers;

import cg.model.clazz;
import cg.model.student;
import cg.service.IClazzService;
import cg.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
@RequestMapping("/Student")
public class HomeController {

    @Autowired
    private IStudentService iStudentService;

    @Autowired
    private IClazzService iClazzService;

    @ModelAttribute(name = "clazz")
    public Iterable<clazz> showClazz(){
        return iClazzService.findAll();
    }

    @GetMapping
    public ModelAndView showStudent (){
        ModelAndView modelAndView = new ModelAndView("list");
        Iterable<student> students = iStudentService.findAll();
        modelAndView.addObject("students",students);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteStudent (@PathVariable("id")long id){
        ModelAndView modelAndView = new ModelAndView("list");
        iStudentService.delete(id);
        Iterable<student> students = iStudentService.findAll();
        modelAndView.addObject("student",students);
        return modelAndView;
    }
    @GetMapping("/create")
    public  ModelAndView createStudent(){
        ModelAndView modelAndView =new ModelAndView("create");
        modelAndView.addObject("student",new student());
        return modelAndView;
    }
    @PostMapping
    public ModelAndView createStudents(@ModelAttribute student student){
        ModelAndView modelAndView = new ModelAndView("create");
        iStudentService.save(student);
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView editStudent(@PathVariable("id")long id){
        ModelAndView modelAndView = new ModelAndView("edit");
        Optional<student> students = iStudentService.findById(id);
        modelAndView.addObject("student",students);
        return modelAndView;
    }
    @PostMapping("/edit/{id}")
    public ModelAndView editStudent(@ModelAttribute student student,@PathVariable("id")long id){
        ModelAndView modelAndView = new ModelAndView("edit");
        student.setId(id);
        iStudentService.save(student);
        modelAndView.addObject("message","fuck off");
        return modelAndView;
    }
}
