package com.book.address.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddressBookLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddressBookLocalService
 * @generated
 */
public class AddressBookLocalServiceWrapper implements AddressBookLocalService,
    ServiceWrapper<AddressBookLocalService> {
    private AddressBookLocalService _addressBookLocalService;

    public AddressBookLocalServiceWrapper(
        AddressBookLocalService addressBookLocalService) {
        _addressBookLocalService = addressBookLocalService;
    }

    /**
    * Adds the address book to the database. Also notifies the appropriate model listeners.
    *
    * @param addressBook the address book
    * @return the address book that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook addAddressBook(
        com.book.address.model.AddressBook addressBook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.addAddressBook(addressBook);
    }

    /**
    * Creates a new address book with the primary key. Does not add the address book to the database.
    *
    * @param addressBookId the primary key for the new address book
    * @return the new address book
    */
    @Override
    public com.book.address.model.AddressBook createAddressBook(
        long addressBookId) {
        return _addressBookLocalService.createAddressBook(addressBookId);
    }

    /**
    * Deletes the address book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressBookId the primary key of the address book
    * @return the address book that was removed
    * @throws PortalException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook deleteAddressBook(
        long addressBookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.deleteAddressBook(addressBookId);
    }

    /**
    * Deletes the address book from the database. Also notifies the appropriate model listeners.
    *
    * @param addressBook the address book
    * @return the address book that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook deleteAddressBook(
        com.book.address.model.AddressBook addressBook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.deleteAddressBook(addressBook);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _addressBookLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.book.address.model.AddressBook fetchAddressBook(
        long addressBookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.fetchAddressBook(addressBookId);
    }

    /**
    * Returns the address book with the matching UUID and company.
    *
    * @param uuid the address book's UUID
    * @param companyId the primary key of the company
    * @return the matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook fetchAddressBookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.fetchAddressBookByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the address book matching the UUID and group.
    *
    * @param uuid the address book's UUID
    * @param groupId the primary key of the group
    * @return the matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook fetchAddressBookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.fetchAddressBookByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the address book with the primary key.
    *
    * @param addressBookId the primary key of the address book
    * @return the address book
    * @throws PortalException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook getAddressBook(long addressBookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getAddressBook(addressBookId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the address book with the matching UUID and company.
    *
    * @param uuid the address book's UUID
    * @param companyId the primary key of the company
    * @return the matching address book
    * @throws PortalException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook getAddressBookByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getAddressBookByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the address book matching the UUID and group.
    *
    * @param uuid the address book's UUID
    * @param groupId the primary key of the group
    * @return the matching address book
    * @throws PortalException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook getAddressBookByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getAddressBookByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the address books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @return the range of address books
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.book.address.model.AddressBook> getAddressBooks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getAddressBooks(start, end);
    }

    /**
    * Returns the number of address books.
    *
    * @return the number of address books
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAddressBooksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.getAddressBooksCount();
    }

    /**
    * Updates the address book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param addressBook the address book
    * @return the address book that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.book.address.model.AddressBook updateAddressBook(
        com.book.address.model.AddressBook addressBook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBookLocalService.updateAddressBook(addressBook);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _addressBookLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _addressBookLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _addressBookLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AddressBookLocalService getWrappedAddressBookLocalService() {
        return _addressBookLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAddressBookLocalService(
        AddressBookLocalService addressBookLocalService) {
        _addressBookLocalService = addressBookLocalService;
    }

    @Override
    public AddressBookLocalService getWrappedService() {
        return _addressBookLocalService;
    }

    @Override
    public void setWrappedService(
        AddressBookLocalService addressBookLocalService) {
        _addressBookLocalService = addressBookLocalService;
    }
}
