package per.zpp.service.Impl;

import org.springframework.stereotype.Service;
import per.zpp.domain.PageInfo;
import per.zpp.domain.Student;
import per.zpp.domain.StudentVo;
import per.zpp.mapper.StudentMapper;
import per.zpp.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAllStudent() {
        return studentMapper.selectAllStudent();
    }

    //分页查询
    //分页查询
    @Override
    public PageInfo<Student> findPageInfo(String sName, Integer sStudentid,Integer sClassid,
                                          String sClassname, Integer pageIndex, Integer pageSize) {

        PageInfo<Student> pi = new PageInfo<Student>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = studentMapper.totalCount(sName,sStudentid,sClassid,sClassname);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示学生信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Student> studentList =	studentMapper.getStudentList(sName,sStudentid,sClassid,sClassname,
                    (pi.getPageIndex()-1)*pi.getPageSize(),pi.getPageSize());
            pi.setList(studentList);
        }
        return pi;
    }

    @Override
    public List<Student> findStudentJSON(StudentVo studentVo) {
        return studentMapper.selectAllStudentJSON(studentVo);
    }

}
