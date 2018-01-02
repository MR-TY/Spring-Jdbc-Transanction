package com.ty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ty.entity.Person;

@Repository
public class TransferDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Person QueryAccount(Integer id){
		System.out.println(jdbcTemplate);
		String sql = "select * from t_person where id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Person.class),id);
	}
	
	public void createPerson(String name,Integer account){
		String sql = "insert into t_person(name,account) values(?,?)";
		jdbcTemplate.update(sql,name,account);
	}
	
	public void deleteOnePerson(Integer id){
		String sql = "delete from t_person where id=?";
		jdbcTemplate.update(sql,id);
	}
	
	public void updateOnePerson(String name , Integer account,Integer id){
		String sql = "update t_person set name = ?,account=? where id=?";
		jdbcTemplate.update(sql,name,account,id);
	}
	
	public List<Person> queryAllPerson(){
		String sql = "select * from t_person";
		List<Person> persons = jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Person mapRow(ResultSet set, int id)
					throws SQLException {
				    Person person=new Person();
					String name=set.getString("name");
					Integer account=set.getInt("account");
					person.setName(name);
					person.setAccount(account);
					return person;
			}
		});
		return persons;
	}
	
	public void addMonney(){
		String sql = "update t_person set account = account-1000 where id = ?";
		jdbcTemplate.update(sql,1);
	}
	
	public void minutMonney(){
		String sql = "update t_person set account = account-1000 where id = ?";
		jdbcTemplate.update(sql,2);
	}
}
