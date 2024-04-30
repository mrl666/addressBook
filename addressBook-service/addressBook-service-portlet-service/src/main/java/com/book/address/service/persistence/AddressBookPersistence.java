package com.book.address.service.persistence;

import com.book.address.model.AddressBook;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the address book service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressBookPersistenceImpl
 * @see AddressBookUtil
 * @generated
 */
public interface AddressBookPersistence extends BasePersistence<AddressBook> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AddressBookUtil} to access the address book persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the address books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the address books where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @return the range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the address books where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address books before and after the current address book in the ordered set where uuid = &#63;.
    *
    * @param addressBookId the primary key of the current address book
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next address book
    * @throws com.book.address.NoSuchAddressBookException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook[] findByUuid_PrevAndNext(
        long addressBookId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the address books where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of address books where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching address books
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address book where uuid = &#63; and groupId = &#63; or throws a {@link com.book.address.NoSuchAddressBookException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the address book where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the address book that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of address books where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching address books
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the address books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the address books where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @return the range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the address books where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address books before and after the current address book in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param addressBookId the primary key of the current address book
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next address book
    * @throws com.book.address.NoSuchAddressBookException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook[] findByUuid_C_PrevAndNext(
        long addressBookId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the address books where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of address books where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching address books
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the address books where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the address books where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @return the range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the address books where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address book in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book
    * @throws com.book.address.NoSuchAddressBookException if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByGroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address book in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address book, or <code>null</code> if a matching address book could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address books before and after the current address book in the ordered set where groupId = &#63;.
    *
    * @param addressBookId the primary key of the current address book
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next address book
    * @throws com.book.address.NoSuchAddressBookException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook[] findByGroupId_PrevAndNext(
        long addressBookId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the address books where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of address books where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching address books
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the address book in the entity cache if it is enabled.
    *
    * @param addressBook the address book
    */
    public void cacheResult(com.book.address.model.AddressBook addressBook);

    /**
    * Caches the address books in the entity cache if it is enabled.
    *
    * @param addressBooks the address books
    */
    public void cacheResult(
        java.util.List<com.book.address.model.AddressBook> addressBooks);

    /**
    * Creates a new address book with the primary key. Does not add the address book to the database.
    *
    * @param addressBookId the primary key for the new address book
    * @return the new address book
    */
    public com.book.address.model.AddressBook create(long addressBookId);

    /**
    * Removes the address book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressBookId the primary key of the address book
    * @return the address book that was removed
    * @throws com.book.address.NoSuchAddressBookException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook remove(long addressBookId)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.book.address.model.AddressBook updateImpl(
        com.book.address.model.AddressBook addressBook)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address book with the primary key or throws a {@link com.book.address.NoSuchAddressBookException} if it could not be found.
    *
    * @param addressBookId the primary key of the address book
    * @return the address book
    * @throws com.book.address.NoSuchAddressBookException if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook findByPrimaryKey(
        long addressBookId)
        throws com.book.address.NoSuchAddressBookException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address book with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param addressBookId the primary key of the address book
    * @return the address book, or <code>null</code> if a address book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.book.address.model.AddressBook fetchByPrimaryKey(
        long addressBookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the address books.
    *
    * @return the address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.book.address.model.AddressBook> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the address books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.book.address.model.impl.AddressBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of address books
    * @param end the upper bound of the range of address books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of address books
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.book.address.model.AddressBook> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the address books from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of address books.
    *
    * @return the number of address books
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
