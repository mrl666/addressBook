package com.book.address.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddressBook}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressBook
 * @generated
 */
public class AddressBookWrapper implements AddressBook,
    ModelWrapper<AddressBook> {
    private AddressBook _addressBook;

    public AddressBookWrapper(AddressBook addressBook) {
        _addressBook = addressBook;
    }

    @Override
    public Class<?> getModelClass() {
        return AddressBook.class;
    }

    @Override
    public String getModelClassName() {
        return AddressBook.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("addressBookId", getAddressBookId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("email", getEmail());
        attributes.put("age", getAge());
        attributes.put("message", getMessage());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long addressBookId = (Long) attributes.get("addressBookId");

        if (addressBookId != null) {
            setAddressBookId(addressBookId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        Integer age = (Integer) attributes.get("age");

        if (age != null) {
            setAge(age);
        }

        String message = (String) attributes.get("message");

        if (message != null) {
            setMessage(message);
        }
    }

    /**
    * Returns the primary key of this address book.
    *
    * @return the primary key of this address book
    */
    @Override
    public long getPrimaryKey() {
        return _addressBook.getPrimaryKey();
    }

    /**
    * Sets the primary key of this address book.
    *
    * @param primaryKey the primary key of this address book
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _addressBook.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this address book.
    *
    * @return the uuid of this address book
    */
    @Override
    public java.lang.String getUuid() {
        return _addressBook.getUuid();
    }

    /**
    * Sets the uuid of this address book.
    *
    * @param uuid the uuid of this address book
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _addressBook.setUuid(uuid);
    }

    /**
    * Returns the address book ID of this address book.
    *
    * @return the address book ID of this address book
    */
    @Override
    public long getAddressBookId() {
        return _addressBook.getAddressBookId();
    }

    /**
    * Sets the address book ID of this address book.
    *
    * @param addressBookId the address book ID of this address book
    */
    @Override
    public void setAddressBookId(long addressBookId) {
        _addressBook.setAddressBookId(addressBookId);
    }

    /**
    * Returns the group ID of this address book.
    *
    * @return the group ID of this address book
    */
    @Override
    public long getGroupId() {
        return _addressBook.getGroupId();
    }

    /**
    * Sets the group ID of this address book.
    *
    * @param groupId the group ID of this address book
    */
    @Override
    public void setGroupId(long groupId) {
        _addressBook.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this address book.
    *
    * @return the company ID of this address book
    */
    @Override
    public long getCompanyId() {
        return _addressBook.getCompanyId();
    }

    /**
    * Sets the company ID of this address book.
    *
    * @param companyId the company ID of this address book
    */
    @Override
    public void setCompanyId(long companyId) {
        _addressBook.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this address book.
    *
    * @return the user ID of this address book
    */
    @Override
    public long getUserId() {
        return _addressBook.getUserId();
    }

    /**
    * Sets the user ID of this address book.
    *
    * @param userId the user ID of this address book
    */
    @Override
    public void setUserId(long userId) {
        _addressBook.setUserId(userId);
    }

    /**
    * Returns the user uuid of this address book.
    *
    * @return the user uuid of this address book
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _addressBook.getUserUuid();
    }

    /**
    * Sets the user uuid of this address book.
    *
    * @param userUuid the user uuid of this address book
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _addressBook.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this address book.
    *
    * @return the user name of this address book
    */
    @Override
    public java.lang.String getUserName() {
        return _addressBook.getUserName();
    }

    /**
    * Sets the user name of this address book.
    *
    * @param userName the user name of this address book
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _addressBook.setUserName(userName);
    }

    /**
    * Returns the create date of this address book.
    *
    * @return the create date of this address book
    */
    @Override
    public java.util.Date getCreateDate() {
        return _addressBook.getCreateDate();
    }

    /**
    * Sets the create date of this address book.
    *
    * @param createDate the create date of this address book
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _addressBook.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this address book.
    *
    * @return the modified date of this address book
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _addressBook.getModifiedDate();
    }

    /**
    * Sets the modified date of this address book.
    *
    * @param modifiedDate the modified date of this address book
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _addressBook.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this address book.
    *
    * @return the name of this address book
    */
    @Override
    public java.lang.String getName() {
        return _addressBook.getName();
    }

    /**
    * Sets the name of this address book.
    *
    * @param name the name of this address book
    */
    @Override
    public void setName(java.lang.String name) {
        _addressBook.setName(name);
    }

    /**
    * Returns the email of this address book.
    *
    * @return the email of this address book
    */
    @Override
    public java.lang.String getEmail() {
        return _addressBook.getEmail();
    }

    /**
    * Sets the email of this address book.
    *
    * @param email the email of this address book
    */
    @Override
    public void setEmail(java.lang.String email) {
        _addressBook.setEmail(email);
    }

    /**
    * Returns the age of this address book.
    *
    * @return the age of this address book
    */
    @Override
    public int getAge() {
        return _addressBook.getAge();
    }

    /**
    * Sets the age of this address book.
    *
    * @param age the age of this address book
    */
    @Override
    public void setAge(int age) {
        _addressBook.setAge(age);
    }

    /**
    * Returns the message of this address book.
    *
    * @return the message of this address book
    */
    @Override
    public java.lang.String getMessage() {
        return _addressBook.getMessage();
    }

    /**
    * Sets the message of this address book.
    *
    * @param message the message of this address book
    */
    @Override
    public void setMessage(java.lang.String message) {
        _addressBook.setMessage(message);
    }

    @Override
    public boolean isNew() {
        return _addressBook.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _addressBook.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _addressBook.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _addressBook.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _addressBook.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _addressBook.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _addressBook.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _addressBook.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _addressBook.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _addressBook.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _addressBook.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AddressBookWrapper((AddressBook) _addressBook.clone());
    }

    @Override
    public int compareTo(com.book.address.model.AddressBook addressBook) {
        return _addressBook.compareTo(addressBook);
    }

    @Override
    public int hashCode() {
        return _addressBook.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.book.address.model.AddressBook> toCacheModel() {
        return _addressBook.toCacheModel();
    }

    @Override
    public com.book.address.model.AddressBook toEscapedModel() {
        return new AddressBookWrapper(_addressBook.toEscapedModel());
    }

    @Override
    public com.book.address.model.AddressBook toUnescapedModel() {
        return new AddressBookWrapper(_addressBook.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _addressBook.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _addressBook.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _addressBook.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressBookWrapper)) {
            return false;
        }

        AddressBookWrapper addressBookWrapper = (AddressBookWrapper) obj;

        if (Validator.equals(_addressBook, addressBookWrapper._addressBook)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _addressBook.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AddressBook getWrappedAddressBook() {
        return _addressBook;
    }

    @Override
    public AddressBook getWrappedModel() {
        return _addressBook;
    }

    @Override
    public void resetOriginalValues() {
        _addressBook.resetOriginalValues();
    }
}
