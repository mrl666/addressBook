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

This is the <b>addressBook-service</b>.

<table>
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Age</th>
    <th>Message</th>
    <th></th>
  </tr>
  <c:forEach var="addressBook" items="${addressBooks}">
    <tr>
      <td>${addressBook.name}</td>
      <td>${addressBook.email}</td>
      <td>${addressBook.age}</td>
      <td>${addressBook.message}</td>
      <td>
        <portlet:actionURL var="deleteRecordURL" name="deleteRecordAction">
          <portlet:param name="addressBookId" value="${addressBook.addressBookId}" />
        </portlet:actionURL>
        <a href="<%= deleteRecordURL %>" onclick="return confirm('Are you sure you want to delete this record?')">Delete</a>
      </td>
    </tr>
  </c:forEach>
</table>