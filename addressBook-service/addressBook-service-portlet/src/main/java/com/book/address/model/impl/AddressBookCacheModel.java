package com.book.address.model.impl;

import com.book.address.model.AddressBook;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddressBook in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AddressBook
 * @generated
 */
public class AddressBookCacheModel implements CacheModel<AddressBook>,
    Externalizable {
    public String uuid;
    public long addressBookId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String email;
    public int age;
    public String message;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", addressBookId=");
        sb.append(addressBookId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", email=");
        sb.append(email);
        sb.append(", age=");
        sb.append(age);
        sb.append(", message=");
        sb.append(message);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AddressBook toEntityModel() {
        AddressBookImpl addressBookImpl = new AddressBookImpl();

        if (uuid == null) {
            addressBookImpl.setUuid(StringPool.BLANK);
        } else {
            addressBookImpl.setUuid(uuid);
        }

        addressBookImpl.setAddressBookId(addressBookId);
        addressBookImpl.setGroupId(groupId);
        addressBookImpl.setCompanyId(companyId);
        addressBookImpl.setUserId(userId);

        if (userName == null) {
            addressBookImpl.setUserName(StringPool.BLANK);
        } else {
            addressBookImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            addressBookImpl.setCreateDate(null);
        } else {
            addressBookImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            addressBookImpl.setModifiedDate(null);
        } else {
            addressBookImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            addressBookImpl.setName(StringPool.BLANK);
        } else {
            addressBookImpl.setName(name);
        }

        if (email == null) {
            addressBookImpl.setEmail(StringPool.BLANK);
        } else {
            addressBookImpl.setEmail(email);
        }

        addressBookImpl.setAge(age);

        if (message == null) {
            addressBookImpl.setMessage(StringPool.BLANK);
        } else {
            addressBookImpl.setMessage(message);
        }

        addressBookImpl.resetOriginalValues();

        return addressBookImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        addressBookId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        email = objectInput.readUTF();
        age = objectInput.readInt();
        message = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(addressBookId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        objectOutput.writeInt(age);

        if (message == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(message);
        }
    }
}
