<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/23/2021
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<div style="position: fixed;z-index: 9;margin: 0 ;width: 100%" >
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <a class="navbar-brand" href="#">
            <img src="https://phuongviethcm.com/wp-content/uploads/2019/07/FURAMA.png" width="50" height="50"
                 class="d-inline-block align-top" alt="1">
        </a>
        <p style="font-size: 20px ;margin-right: 30px"> Nguyễn Văn Phúc</p>
    </nav>

    <%--Header-link--%>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/nhanvien">Nhân viên <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/khachhang">Khách hàng <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/dichvu">Dịch vụ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/hopdong">Hợp đồng <span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0" method="post" action="/nhanvien?action=search">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm" aria-label="Search" name="hoten">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Tìm kiếm</button>
            </form>
        </div>
    </nav>
</div>
<%--Body--%>
<div style="position: relative;top: 135px" class="row">
    <%--Body-left--%>
    <div class="row">
        <div class="col-md-2">
            <div class="card">
                <%--    <img class="card-img-top" src="https://bazantravel.com/cdn/medias/uploads/53/53114-furama-resort-da-nang-11.jpg" alt="Card image cap">--%>
                <div id="myCarousel" class="carousel slide border" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100"
                                 src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-nha-hang.jpg"
                                 alt="1">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100"
                                 src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang.jpg"
                                 alt="2">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100"
                                 src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang_1.jpg"
                                 alt="3">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100"
                                 src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-spa.jpg"
                                 alt="3">
                        </div>

                    </div>
                </div>
                <div class="card-body; text-center" >
                    <h5 class="card-title">Furama Da Nang</h5>
                    <p class="card-text" > Furama Resort Đà Nẵng là resort 5 sao với những tiêu chuẩn dịch vụ tốt nhất cho du
                        khách khi du lịch Đà Nẵng. Những căn phòng tiện nghi, hồ bơi rộng lớn, vị trí tuyệt vời nằm cạnh bãi
                        biển và còn nhiều hơn nữa những điều thú vị chờ du khách phá.</p>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                        <p><img src="https://www.flaticon.com/svg/static/icons/svg/968/968374.svg" width="20px">
                            103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam</p>
                    </li>
                    <li class="list-group-item">
                        <p><img src="http://simpleicon.com/wp-content/uploads/phone-1.png" width="20px"> 84-236-3847 333/888</p>
                    </li>
                    <li class="list-group-item"><img src="https://cdn.icon-icons.com/icons2/2098/PNG/512/mail_icon_128820.png"
                                                     width="20px">
                        reservation@furamavietnam.com
                    </li>
                </ul>
                <div class="card-body" style="text-align: left">
                    <a href="https://www.facebook.com/furamaresort" class="card-link">
                        <img src="https://cdn2.iconfinder.com/data/icons/social-media-2285/512/1_Facebook_colored_svg_copy-128.png"
                             width="30px">
                        /furamaresort
                    </a><br><br>
                    <a href="https://www.instagram.com/furama_resort_danang/" class="card-link">
                        <img src="https://cdn3.iconfinder.com/data/icons/2018-social-media-logotypes/1000/2018_social_media_popular_app_logo_instagram-128.png"
                             width="30px">
                        /furama_resort_danang
                    </a>
                    <br><br>
                    <a href="https://www.tripadvisor.com.vn/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html"
                       class="card-link">
                        <img src="https://www.flaticon.com/premium-icon/icons/svg/2504/2504944.svg" width="30px">
                        /furama_resort_danang
                    </a>
                </div>
            </div>
        </div>

        <%--Body right--%>
        <div class="col-md-10">
            <div class="">
                <div style="text-align: center;">
                    <h1>Quản lý Nhân Viên</h1>
                </div>
                <div align="center">
                    <caption><h2>Danh sách Nhân Viên</h2></caption>
                    <a href="/nhanvien?action=create" class="btn btn-outline-success btn-sm w-25 ">Thêm mới Nhân viên</a>
                    <table id="nhanvien" class=" table table-striped table-bordered">
                        <thead>
                        <tr class="table-active" style="text-align: center">
                            <th>Mã nhân viên</th>
                            <th>Họ tên</th>
                            <th>Vị trí</th>
                            <th>Trình độ</th>
                            <th>Bộ phận</th>
                            <th>Ngày sinh</th>
                            <th>CMND</th>
                            <th>Lương</th>
                            <th>Email</th>
                            <th>Địa chỉ</th>
                            <%--                        <th>UserName</t/h>--%>
                            <th>Action</th>
                        </tr>
                        </thead>
                        <tbody style="text-align: center">
                        <c:forEach var="nhanvien" items="${list}">
                            <tr>
                                <td><c:out value="${nhanvien.getMa_nhanvien()}"/></td>
                                <td><c:out value="${nhanvien.getHoten()}"/></td>
                                <td><c:out value="${nhanvien.getVitri_id()}"/></td>
                                <td><c:out value="${nhanvien.getTrinhdo_id()}"/></td>
                                <td><c:out value="${nhanvien.getBophan_id()}"/></td>
                                <td><c:out value="${nhanvien.getNgaySinh()}"/></td>
                                <td><c:out value="${nhanvien.getCmnd()}"/></td>
                                <td><c:out value="${nhanvien.getLuong()}"/></td>
                                <td><c:out value="${nhanvien.getEmail()}"/></td>
                                <td><c:out value="${nhanvien.getDiachi()}"/></td>
                                    <%--                            <td><c:out value="${nhanvien.getUsername()}"/></td>--%>
                                <td>
                                    <a href="/nhanvien?action=update&id=${nhanvien.getId()} "
                                       class="btn btn-outline-info">Sửa</a>
                                    <button type="button" class="btn btn-outline-danger" data-toggle="modal"
                                            data-target="#exampleModal">
                                        Xóa
                                    </button>
                                    <!-- Modal -->
                                    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
                                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="exampleModalLabel">XÓA</h5>
                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                        <span aria-hidden="true">&times;</span>
                                                    </button>
                                                </div>
                                                <div class="modal-body">
                                                    Bạn có chắc muốn xóa chứ!!!?
                                                </div>
                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close
                                                    </button>
                                                    <a type="button" href="/nhanvien?action=delete&id=${nhanvien.getId()}"
                                                       class="btn btn-outline-danger">Xóa</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <br>
                </div>
            </div>
        </div>
    </div>
    <%--Footer--%>

    <div class="row card col-md-12" style="margin-top: 0%" >
        <div class="card-body" style="text-align: center">
            ©copyright-nguyenvanphuc
        </div>
    </div>
</div>




<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../bootstrap413/js/popper.min.js"></script>
<script src="../datatables/js/jquery.dataTables.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.js"></script>
<script src="../bootstrap413/js/bootstrap.js"></script>
<script src="../bootstrap413/js/bootstrap.bundle.js"></script>
<script>
    $(document).ready(function () {
        $('#nhanvien').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        })
    })
</script>
</body>
</html>
