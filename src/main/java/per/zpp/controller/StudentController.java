package per.zpp.controller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.zpp.Utils.DataGridViewResult;
import per.zpp.domain.PageInfo;
import per.zpp.domain.Student;
import per.zpp.domain.StudentVo;
import per.zpp.service.StudentService;

import java.util.List;


@RequestMapping("/stu")
@Controller
public class StudentController {
    /**
     * 演示layui table的测试类
     *
     * @param studentVo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findStudentJSON")
    public DataGridViewResult findStudentJSON(StudentVo studentVo) {
        PageHelper.startPage(studentVo.getPage(), studentVo.getLimit());
        List<Student> studentList = studentService.findStudentJSON(studentVo);
        com.github.pagehelper.PageInfo<Student> pageInfo = new com.github.pagehelper.PageInfo<>(studentList);
        return new DataGridViewResult(pageInfo.getTotal(), pageInfo.getList());
    }

    @Autowired
    private StudentService studentService;

    /**
     * 分页查询
     * pageIndex 当前页码
     * pageSize  显示条数
     */
    @RequestMapping(value = "/findStudent")
    public String findStudent(String s_name, Integer s_studentid, Integer s_classid, String s_classname,
                                     Integer pageIndex, Integer pageSize, Model model) {
        //s_name=zhang&s_studentid=213&s_classid=141&s_classname=&pageIndex=1&pageSize=10
//        System.out.println("==================================pageSIze"+s_classid);
        PageInfo<Student> pi = studentService.findPageInfo(s_name, s_studentid, s_classid,
                s_classname, pageIndex, pageSize);
        model.addAttribute("pi", pi);
        model.addAttribute("s_name", s_name);
        return "/stu/student_list";
    }

//    @RequestMapping("/findStudent")
//    public String findStudent() {
//        return "/stu/student_list";
//    }

}
