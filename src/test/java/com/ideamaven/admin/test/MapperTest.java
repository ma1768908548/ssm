package com.ideamaven.admin.test;

import com.ideamaven.admin.service.EmployeeService;
import com.ideamaven.commons.mapper.DepartmentMapper;
import com.ideamaven.commons.mapper.EmployeeMapper;
import com.ideamaven.commons.model.Department;
import com.ideamaven.commons.model.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 测试dao层的工作
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
public class MapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {

        /**
         * 新增测试
         */

        //1.插入新部门
        //departmentMapper.insertSelective(new Department(null,"剪辑部"));

        //2.插入新员工
        //employeeMapper.insertSelective(new Employee(1049,"小马","女","990720@qq.com",1));

        //3.批量插入员工
//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        for (int i = 0; i < 10; i++) {
//            String uid = UUID.randomUUID().toString().substring(0, 5) + i;
//            mapper.insertSelective(new Employee(null, uid, "女", uid + "@1234", 2));
//        }
//        System.out.println("批量完成");

        /**
         * 删除测试
         */

        //1.根据部门id删除部门
        //departmentMapper.deleteByPrimaryKey(3);

        //2.根据员工id删除员工
        //employeeMapper.deleteByPrimaryKey(1059);

        //3.批量删除员工
//        List<Integer> list =new ArrayList<>();
//        list.add(1002);
//        list.add(1003);
//        list.add(1004);
//        list.add(1005);
//        list.add(1006);
//        employeeService.deleteBatch(list);

        /**
         * 更新测试
         */

        //更新员工信息
        //employeeMapper.updateByPrimaryKeySelective(new Employee(1049,"大马","男","123456@qq.com",2));

        /**
         * 查询测试
         */

        //1.根据id查询员工
        //System.out.println(employeeMapper.selectByPrimaryKey(1049));
        //2.查询全部员工
        //System.out.println(employeeService.getAllEmployeeList());

    }

}
