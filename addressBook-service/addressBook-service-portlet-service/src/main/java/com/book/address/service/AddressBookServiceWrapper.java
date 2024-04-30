package com.book.address.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressBookService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddressBookService
 * @generated
 */
public class AddressBookServiceWrapper implements AddressBookService,
    ServiceWrapper<AddressBookService> {
    private AddressBookService _addressBookService;

    public AddressBookServiceWrapper(AddressBookService addressBookService) {
        _addressBookService = addressBookService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _addressBookService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _addressBookService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _addressBookService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AddressBookService getWrappedAddressBookService() {
        return _addressBookService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAddressBookService(
        AddressBookService addressBookService) {
        _addressBookService = addressBookService;
    }

    @Override
    public AddressBookService getWrappedService() {
        return _addressBookService;
    }

    @Override
    public void setWrappedService(AddressBookService addressBookService) {
        _addressBookService = addressBookService;
    }
}
