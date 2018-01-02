package com.ty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.TransferDao;
import com.ty.entity.Person;

@Service
public class TransferService {
	@Autowired
	private TransferDao transferDao;
	/**
	 * 通过id查询一个人
	* @Function: TransferService.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午7:36:13 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	public Person queryOnePeopel(Integer id){
		return transferDao.QueryAccount(id);
	}
	/**
	 * 增加一个人
	* @Function: TransferService.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午7:39:14 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	public void createOnePerson(String name,Integer account){
		transferDao.createPerson(name,account);
	}
	/**
	 * 通过id删除一个人
	* @Function: TransferService.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午7:41:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	public void deleteOnePerson(Integer id){
		transferDao.deleteOnePerson(id);
	}
	/**
	 * 通过id更新一个人信息
	* @Function: TransferService.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午7:44:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	public void updateOnePerson(String name, Integer account,Integer id){
		transferDao.updateOnePerson(name, account, id);
	}
	/**
	 * 查询全部人
	* @Function: TransferService.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: water
	* @date: 2018年1月2日 下午7:53:10 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年1月2日       water           v1.0.0               修改原因
	 */
	public List<Person> queryAllPerons(){
		return transferDao.queryAllPerson();
	}
//	@Transactional
	public void TranstMoney(){
		transferDao.minutMonney();
//		int i = 1/0;
		transferDao.addMonney();
	}
}
