package per.zpp.mapper;

import org.apache.ibatis.annotations.Param;
import per.zpp.domain.Student;
import per.zpp.domain.StudentVo;


import java.util.List;

/**
 * 管理员DAO层接口
 */
public interface StudentMapper {
    /**
     * 进行分页查询
     */

    //获取总条数
    public Integer totalCount(@Param("s_name") String s_name, @Param("s_studentid")Integer s_studentid,
                              @Param("s_classid")Integer s_classid,@Param("s_classname")String s_classname);
    //获取用户列表
    public List<Student> getStudentList(@Param("s_name") String s_name, @Param("s_studentid")Integer s_studentid, @Param("s_classid")Integer s_classid,
                                        @Param("s_classname")String s_classname, @Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize);

    List<Student> selectAllStudentJSON(StudentVo studentVo);
    List<Student> selectAllStudent();

//    public int deleteStudent(Integer s_id);   //删除学生信息
//    public int addStudent(Student student);   //添加学生信息
//    public int updateStudent(Student student); //修改学生信息
//    public Student findStudentById(Integer s_id);
//    public List<Student> getAll();
}
