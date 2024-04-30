create table addressbook_data (
	uuid_ VARCHAR(75) null,
	addressBookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	age INTEGER,
	message VARCHAR(75) null
);