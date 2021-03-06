/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.core.pcrservice.dao;

import java.sql.SQLException;

import org.skife.jdbi.v2.DBI;

import com.wso2telco.core.pcrservice.model.UserDTO;


/**
 * The Class UserDAO.
 */
public class UserDAO {

	/**
	 * Save new User.
	 *
	 * @param userDTO the User DTO
	 * @return the int
	 * @throws SQLException the SQL exception
	 */
	public int saveNewUser(UserDTO userDTO) throws SQLException{
		DBI dbi = JDBIUtil.getInstance();
		UserHandler userHandler = dbi.onDemand(UserHandler.class);
		
		return userHandler.createNewUser(userDTO);
	}
	
	/**
	 * Check User exists.
	 *
	 * @param userDTO the User DTO
	 * @return true, if successful
	 * @throws SQLException the SQL exception
	 */
	public boolean checkUserExists(UserDTO userDTO) throws SQLException{
		DBI dbi = JDBIUtil.getInstance();
		UserHandler userHandler = dbi.onDemand(UserHandler.class);
		
		return userHandler.checkUserExists(userDTO);
	}
	
	
	/**
	 * Check User active.
	 * @param userDTO the User DTO
	 * @return true, if successful
	 * @throws SQLException the SQL exception
	 */
	public boolean checkUserActive(UserDTO userDTO) throws SQLException{
		DBI dbi = JDBIUtil.getInstance();
		UserHandler userHandler = dbi.onDemand(UserHandler.class);
		
		return userHandler.checkUserActive(userDTO);
	}
	
	/**
	 * Sets the User active.
	 * @param userDTO the new User active
	 * @throws SQLException the SQL exception
	 */
	public void setUserActive(UserDTO userDTO) throws SQLException{
		DBI dbi = JDBIUtil.getInstance();
		UserHandler userHandler = dbi.onDemand(UserHandler.class);
		
		userHandler.setUserActive(userDTO);
	}
	
	/**
	 * Sets the User inctive.
	 *
	* @param userDTO the user DTO
	 * @throws SQLException the SQL exception
	 */
	public void setUserInactive(UserDTO userDTO) throws SQLException{
		DBI dbi = JDBIUtil.getInstance();
		UserHandler userHandler = dbi.onDemand(UserHandler.class);
		
		userHandler.setUserInactive(userDTO);
	}
	
	
}
