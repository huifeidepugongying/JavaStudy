package JDBCTemp;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.LvpStore;
import utils.JDBCUtils;

import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM lvc_14");
//        System.out.println(maps);
        List<LvpStore> query = jdbcTemplate.query("select * from lvp_14", new BeanPropertyRowMapper<>(LvpStore.class));
        for (LvpStore lvpStore : query) {
            System.out.println(lvpStore);
        }
        Long count = jdbcTemplate.queryForObject("select count(1) from lvc_14", Long.class);
        System.out.println(count);
//        for (int i = 0; i < query.size(); i++) {
//            LvpStore lvpStore = query.get(i);
//        }
    }
}
