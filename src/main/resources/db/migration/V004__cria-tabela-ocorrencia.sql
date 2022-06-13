create table ocorrencia (
	id bigserial not null primary key,
	entrega_id bigserial not null,
	taxa decimal(10,2) not null,
	descricao text not null,
	data_registro timestamp not null	
);

alter table ocorrencia add constraint fk_ocorrencia_entrega 
foreign key (entrega_id) references entrega (id);