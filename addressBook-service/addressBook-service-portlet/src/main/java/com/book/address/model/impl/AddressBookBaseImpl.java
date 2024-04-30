package com.book.address.model.impl;

import com.book.address.model.AddressBook;
import com.book.address.service.AddressBookLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the AddressBook service. Represents a row in the &quot;addressbook_data&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddressBookImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressBookImpl
 * @see com.book.address.model.AddressBook
 * @generated
 */
public abstract class AddressBookBaseImpl extends AddressBookModelImpl
    implements AddressBook {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a address book model instance should use the {@link AddressBook} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AddressBookLocalServiceUtil.addAddressBook(this);
        } else {
            AddressBookLocalServiceUtil.updateAddressBook(this);
        }
    }
}
