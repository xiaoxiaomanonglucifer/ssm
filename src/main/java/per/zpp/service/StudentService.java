package per.zpp.service;

import per.zpp.domain.PageInfo;
import per.zpp.domain.Student;
import per.zpp.domain.StudentVo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> queryAllStudent();



    //分页查询
    public PageInfo<Student> findPageInfo(String s_name,Integer s_studentid,Integer s_classid,
                                          String s_classname, Integer pageIndex, Integer pageSize);

    List<Student> findStudentJSON(StudentVo studentVo);
}
