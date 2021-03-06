/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.email.bean;

import java.io.Serializable;

public class UserNewAccountConfirmationEmailBean extends AbstractCustomerEmailBean implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = -1890252657487021821L;
    
	private String userDetailsUrl;

	public String getUserDetailsUrl() {
        return userDetailsUrl;
    }
	
	public void setUserDetailsUrl(String userDetailsUrl) {
        this.userDetailsUrl = userDetailsUrl;
    }
	
}