package com.book.address.model;

import com.book.address.service.AddressBookLocalServiceUtil;
import com.book.address.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AddressBookClp extends BaseModelImpl<AddressBook>
    implements AddressBook {
    private String _uuid;
    private long _addressBookId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _email;
    private int _age;
    private String _message;
    private BaseModel<?> _addressBookRemoteModel;
    private Class<?> _clpSerializerClass = com.book.address.service.ClpSerializer.class;

    public AddressBookClp() {
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
    public long getPrimaryKey() {
        return _addressBookId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAddressBookId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _addressBookId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_addressBookRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAddressBookId() {
        return _addressBookId;
    }

    @Override
    public void setAddressBookId(long addressBookId) {
        _addressBookId = addressBookId;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setAddressBookId", long.class);

                method.invoke(_addressBookRemoteModel, addressBookId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_addressBookRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_addressBookRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_addressBookRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_addressBookRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_addressBookRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_addressBookRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_addressBookRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_addressBookRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAge() {
        return _age;
    }

    @Override
    public void setAge(int age) {
        _age = age;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setAge", int.class);

                method.invoke(_addressBookRemoteModel, age);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMessage() {
        return _message;
    }

    @Override
    public void setMessage(String message) {
        _message = message;

        if (_addressBookRemoteModel != null) {
            try {
                Class<?> clazz = _addressBookRemoteModel.getClass();

                Method method = clazz.getMethod("setMessage", String.class);

                method.invoke(_addressBookRemoteModel, message);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                AddressBook.class.getName()));
    }

    public BaseModel<?> getAddressBookRemoteModel() {
        return _addressBookRemoteModel;
    }

    public void setAddressBookRemoteModel(BaseModel<?> addressBookRemoteModel) {
        _addressBookRemoteModel = addressBookRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _addressBookRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_addressBookRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AddressBookLocalServiceUtil.addAddressBook(this);
        } else {
            AddressBookLocalServiceUtil.updateAddressBook(this);
        }
    }

    @Override
    public AddressBook toEscapedModel() {
        return (AddressBook) ProxyUtil.newProxyInstance(AddressBook.class.getClassLoader(),
            new Class[] { AddressBook.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AddressBookClp clone = new AddressBookClp();

        clone.setUuid(getUuid());
        clone.setAddressBookId(getAddressBookId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setEmail(getEmail());
        clone.setAge(getAge());
        clone.setMessage(getMessage());

        return clone;
    }

    @Override
    public int compareTo(AddressBook addressBook) {
        int value = 0;

        if (getAddressBookId() < addressBook.getAddressBookId()) {
            value = -1;
        } else if (getAddressBookId() > addressBook.getAddressBookId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressBookClp)) {
            return false;
        }

        AddressBookClp addressBook = (AddressBookClp) obj;

        long primaryKey = addressBook.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", addressBookId=");
        sb.append(getAddressBookId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", age=");
        sb.append(getAge());
        sb.append(", message=");
        sb.append(getMessage());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.book.address.model.AddressBook");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>addressBookId</column-name><column-value><![CDATA[");
        sb.append(getAddressBookId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>age</column-name><column-value><![CDATA[");
        sb.append(getAge());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>message</column-name><column-value><![CDATA[");
        sb.append(getMessage());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
