package go.greet.salem;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InfoRepository {

    @Select("SELECT text FROM info WHERE id=#{id}")

    String findById(@Param("id") int id);

}
