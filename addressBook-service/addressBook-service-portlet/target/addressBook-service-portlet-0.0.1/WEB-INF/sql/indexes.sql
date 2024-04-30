create index IX_44D08A58 on addressbook_data (groupId);
create index IX_16B4D2E2 on addressbook_data (uuid_);
create index IX_D2C1F006 on addressbook_data (uuid_, companyId);
create unique index IX_BDF2C008 on addressbook_data (uuid_, groupId);