package com.book.address.service.persistence;

import com.book.address.model.AddressBook;
import com.book.address.service.AddressBookLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AddressBookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AddressBookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AddressBookLocalServiceUtil.getService());
        setClass(AddressBook.class);

        setClassLoader(com.book.address.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("addressBookId");
    }
}
