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
    <title>Update</title>



    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div style="position: fixed;z-index: 9;margin: 0 ;width: 100%">
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
                    <a class="nav-link" href="#">Dịch vụ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#">Hợp đồng <span class="sr-only">(current)</span></a>
                </li>

            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm kiếm</button>
            </form>
        </div>
    </nav>
</div>
<%--Body--%>
<div style="position: relative;top: 135px">
    <%--Body-left--%>
    <div class="card" style="width: 18rem;position: absolute;float: left">
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
        <div class="card-body">
            <h5 class="card-title">Furama Da Nang</h5>
            <p class="card-text">Furama Resort Đà Nẵng là resort 5 sao với những tiêu chuẩn dịch vụ tốt nhất cho du
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
    <%--Body right--%>
    <div class="card" style="width: 81%; margin-left: 18rem ; height: 115%">
        <div style="text-align: center;">
            <h1>Quản lý Nhân viên</h1>

        </div>
        <div align="center">
            <form method="post">
                <caption>
                    <h2>
                        Chỉnh sửa Nhân viên
                    </h2>
                </caption>
                <table class="table-sm">
                    <c:if test="${ nhanVien != null}">
                        <input type="hidden" name="id" value="<c:out value='${nhanVien.id}' />"/>
                    </c:if>
                    <tr>
                        <th>Mã nhân viên:</th>
                        <td>
                            <input class="form-control" type="text" name="ma_nhanvien" size="45"
                                   value="<c:out value='${nhanVien.ma_nhanvien}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Họ tên:</th>
                        <td>
                            <input class="form-control" type="text" name="hoten" size="45"
                                   value="<c:out value='${nhanVien.hoten}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Ngày sinh:</th>
                        <td>
                            <input class="form-control" type="text" name="ngaysinh" size="45"
                                   value="<c:out value='${nhanVien.ngaySinh}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>CMND:</th>
                        <td>
                            <input class="form-control" type="text" name="cmnd" size="45"
                                   value="<c:out value='${nhanVien.cmnd}' />"/>

                        </td>
                    </tr>
                    <tr>
                        <th>Lương:</th>
                        <td>
                            <input class="form-control" type="text" name="luong" size="45"
                                   value="<c:out value='${nhanVien.luong}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Email:</th>
                        <td>
                            <input class="form-control" type="text" name="email" size="45"
                                   value="<c:out value='${nhanVien.email}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Địa chỉ:</th>
                        <td>
                            <input class="form-control" type="text" name="diachi" size="45"
                                   value="<c:out value='${nhanVien.diachi}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Vị trí:</th>
                        <td>
                            <select id="vitri_id" name="vitri_id" class="form-control">
                                <option value="${nhanVien.vitri_id}">
                                    <c:out value='${nhanvien.vitri_id}'/>
                                </option>
                                <option value=1>1.Lễ tân</option>
                                <option value=2>2.Phục vụ</option>
                                <option value=3>3.Chuyên viên</option>
                                <option value=4>4.Giám sát</option>
                                <option value=5>5.Quản lý</option>
                                <option value=6>6.Giám đốc</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Trình độ:</th>
                        <td>

                            <select id="trinhdo_id" name="trinhdo_id" type="id" class="form-control">
                                <option value="${nhanVien.trinhdo_id}">
                                    <c:out value='${nhanVien.trinhdo_id}'/>
                                </option>
                                <option value=1>1.Trung cấp</option>
                                <option value=2>2.Cao đẳng</option>
                                <option value=3>3.Đại học</option>
                                <option value=4>4.Sau đại học</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Bộ phận:</th>
                        <td>
                            <select id="bophan_id" name="bophan_id" type="id" class="form-control">
                                <option value="${nhanVien.bophan_id}">
                                    <c:out value='${nhanVien.bophan_id}'/>
                                </option>
                                <option value=1>1.Sale-Maketing</option>
                                <option value=2>2.Hành chính</option>
                                <option value=3>3.Phục vụ</option>
                                <option value=4>4.Quản lý</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">

                            <a type="button" href="/nhanvien"
                               class="btn btn-outline btn-primary">Close</a>
                            <%--                            <input type="hidden" name="action" value="update">--%>
                            <button type="submit" class="btn btn-outline btn-success">UPDATE</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <%--Footer--%>
    <div class="card" style="margin-top: 0%">
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
        $('#user').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        })
    })
    // user la id cua table, dung cho phan trang
</script>
</body>
</html>
