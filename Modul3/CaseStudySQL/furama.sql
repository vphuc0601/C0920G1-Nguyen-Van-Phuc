create database furama;
use furama;
create table nhan_vien
(id int not null auto_increment primary key,
hoten varchar (50),
vitri_id int,
trinhdo_id int,
bophan_id int,
ngaysinh date,
CMND varchar(45),
luong varchar(45),
email varchar(45),
diachi varchar(45),
foreign key (vitri_id) references vitri(vitri_id),
foreign key (trinhdo_id) references trinhdo(trinhdo_id),
foreign key (bophan_id)references bophan(bophan_id)
);
create table vitri
(vitri_id int not null auto_increment primary key,
tenvitri varchar(45)
);
create table trinhdo
(trinhdo_id int not null auto_increment primary key,
trinhdo varchar(45)
);
create table bophan
(bophan_id int not null auto_increment primary key,
bophan varchar(45)
);
create table khach_hang
(id int not null auto_increment primary key,
hoten varchar(45),
ngaysinh date,
CMND varchar(45),
phone varchar(10),
email varchar(45),
diachi varchar(45),
loaikhach_id int,
foreign key (loaikhach_id)references loaikhach(loaikhach_id)
);
create table loaikhach
(loaikhach_id int not null auto_increment primary key,
tenloaikhach varchar(45)
);
create table dich_vu
(id int auto_increment not null primary key,
tendichvu varchar(45),
dientich int,
sotang int,
nguoitoida int,
chiphithue double,
trangthai varchar(45),
kieuthue_id varchar(45),
loaidichvu_id int,
foreign key (kieuthue_id) references kieuthue(kieuthue_id),
foreign key (loaidichvu_id) references loaidichvu(loaidichvu_id)
);
create table kieuthue
(kieuthue_id varchar(45) not null primary key,
tenkieuthue varchar(45),
gia double
);
create table loaidichvu
(loaidichvu_id int not null auto_increment primary key,
loaidichvu varchar(45)
);
create table hop_dong
(id int auto_increment not null primary key,
nhanvien_id int,
khachhang_id int,
dichvu_id int,
hopdong_id int,
ngaylamhopdong date,
ngayketthuc date,
tiencoc double,
tongtien double,
foreign key (hopdong_id) references hopdongchitiet(id),
foreign key (dichvu_id) references dich_vu(id),
foreign key (khachhang_id) references khach_hang(id),
foreign key (nhanvien_id) references nhan_vien(id)
);
use furama;
drop table hopdongchitiet;
create table hopdongchitiet
(id int auto_increment not null primary key,
dichvudikem_id int,
soluong int,
foreign key(dichvudikem_id) references dichvudikem(id)
);
create table dichvudikem
(id int not null auto_increment primary key,
tendichvudikem varchar(45),
gia double,
donvi varchar(45),
trangthaikhadung varchar(45)
);
drop database furama;