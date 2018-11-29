create table conversation
(
   id integer not null,
   psid varchar(255) not null,
   noeud integer not null,
   response varchar(255) not null,
   primary key(id)
);