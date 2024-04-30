package com.book.address.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.book.address.service.http.AddressBookServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.book.address.service.http.AddressBookServiceSoap
 * @generated
 */
public class AddressBookSoap implements Serializable {
    private String _uuid;
    private long _addressBookId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _email;
    private int _age;
    private String _message;

    public AddressBookSoap() {
    }

    public static AddressBookSoap toSoapModel(AddressBook model) {
        AddressBookSoap soapModel = new AddressBookSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setAddressBookId(model.getAddressBookId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setEmail(model.getEmail());
        soapModel.setAge(model.getAge());
        soapModel.setMessage(model.getMessage());

        return soapModel;
    }

    public static AddressBookSoap[] toSoapModels(AddressBook[] models) {
        AddressBookSoap[] soapModels = new AddressBookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AddressBookSoap[][] toSoapModels(AddressBook[][] models) {
        AddressBookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AddressBookSoap[models.length][models[0].length];
        } else {
            soapModels = new AddressBookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AddressBookSoap[] toSoapModels(List<AddressBook> models) {
        List<AddressBookSoap> soapModels = new ArrayList<AddressBookSoap>(models.size());

        for (AddressBook model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AddressBookSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _addressBookId;
    }

    public void setPrimaryKey(long pk) {
        setAddressBookId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getAddressBookId() {
        return _addressBookId;
    }

    public void setAddressBookId(long addressBookId) {
        _addressBookId = addressBookId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        _age = age;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(String message) {
        _message = message;
    }
}
