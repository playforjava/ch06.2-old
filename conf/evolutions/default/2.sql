# --- Sample dataset

# --- !Ups

insert into warehouse (id,name) values (  1,' Warehouse St Quentin');

insert into product (id,name,description,ean) values (  1,' Stainless steel paperclips', 'Paperclips', 'abcde12f123123123');
insert into product (id,name,description,ean) values (  2,' Plastic paperclips', 'Paperclips', 'abcdea12312312321');
insert into product (id,name,description,ean) values (  3,' Red color paperclips ', 'Paperclips', 'abcdeb13s1231233');

insert into stock_item (id, warehouse_id, product_id , quantity) values (  1, 1, 1, 120);
insert into stock_item (id, warehouse_id, product_id , quantity) values (  2, 1, 2, 190);
insert into stock_item (id, warehouse_id, product_id , quantity) values (  3, 1, 3, 200);


# --- !Downs

delete from stock_item;
delete from warehouse;
delete from product;