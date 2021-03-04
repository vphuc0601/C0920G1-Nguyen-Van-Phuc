create database quan_ly_cong_trinh;
use quan_ly_cong_trinh;
create table cong_trinh
(mact varchar(45) not null primary key,
tenct varchar(45),
diadiem varchar(45),
ngaycapgp date,
ngaykc date,
ngayht date,
manv varchar(45),
foreign key (mact) references nhan_vien(manv)
);
create table nhan_vien
(manv varchar(45) not null primary key,
hoten varchar(45),
ngaysinh date,
gioitinh varchar(45),
diachi varchar(45),
mapb varchar(45),
foreign key (mapb) references phong_ban(mapb),
mabh varchar(45),
foreign key (mabh) references bao_hiem(mabh)
);
create table phong_ban
(mapb varchar(45) not null primary key,
tenpb varchar(45)
);
create table bao_hiem
(mabh varchar(45) not null primary key,
ngaycap date,
thoihan date
);
create table cham_cong
(manv varchar(45),
mact varchar(45),
primary key (manv,mact),
foreign key (manv) references nhan_vien(manv),
foreign key (mact) references cong_trinh(mact),
socong int
);
drop database quan_ly_cong_trinh;