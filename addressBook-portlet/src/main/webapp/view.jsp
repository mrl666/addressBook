<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

This is the <b>addressBook-portlet</b>.

<portlet:actionURL var="submitURL" />

<div class="container">
     <h2>Address Form</h2>
     <aui:form action="${submitURL}" method="post">
         <div class="form-group">
             <label class="form-label" for="name">Name:</label>
             <aui:input id="name" class="form-input" label="" name="name" >
                <aui:validator name="required" errorMessage="Please enter your name" />
             </aui:input>
         </div>
         <div class="form-group">
             <label class="form-label" for="email">Email:</label>
             <aui:input id="email" class="form-input" label="" name="email" >
                <aui:validator name="required" errorMessage="Please enter your email" />
             </aui:input>
         </div>
         <div class="form-group">
             <label class="form-label" for="age">Age:</label>
             <aui:input id="age" class="form-input" label="" name="age" type="number" >
                <aui:validator name="required" errorMessage="Please enter your age" />
             </aui:input>
         </div>
         <div class="form-group">
             <label class="form-label" for="message">Message:</label>
             <aui:input id="message" class="form-textarea" label="" name="message" type="textarea"  >
                <aui:validator name="required" errorMessage="Please enter your message" />
             </aui:input>
         </div>
         <div class="form-group">
             <aui:button class="form-button" type="submit" value="Submit" />
         </div>
     </aui:form>
 </div>