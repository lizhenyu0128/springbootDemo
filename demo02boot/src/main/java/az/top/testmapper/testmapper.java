package az.top.testmapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Author:
 * Data:2019-04-21 19:40
 * Description:<>
 */


@Mapper
public interface  testmapper {

    @Select("select id from student where id  = 1 ")
    public Map<String, Integer> getall();

    @Insert("insert into student(name,age) values('ss','2')")
    public void insert();
}
