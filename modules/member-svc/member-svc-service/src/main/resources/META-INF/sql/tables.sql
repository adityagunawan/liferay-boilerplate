create table Boilerplate_Member (
	uuid_ VARCHAR(75) null,
	memberId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	fullName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);