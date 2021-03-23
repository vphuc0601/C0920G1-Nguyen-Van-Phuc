<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/18/2021
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Tạo mới</title>
    <!-- Required meta tags -->
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
                    <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
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
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>
<%--Body--%>
<div style="position: relative;top: 135px ">
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
            <h1>Quản lý nhân viên</h1>

        </div>
        <div align="center" >
            <form method="post">
                <caption>
                    <h2>Thêm mới nhân viên</h2>
                </caption>
                <table class="table-sm">
                    <tr>
                        <th>Mã nhân viên:</th>
                        <td>
                            <input placeholder="NV-0000,NV-1111,..." type="text" name="ma_nhanvien" id="ma_nhanvien"
                                    class="form-control" required/>
                            <p>
                                <c:if test='${messageMa_NhanVien != ""}'>
                                    <span style="color: red">${messageMa_NhanVien}</span>
                                </c:if>
                            </p>
                    </tr>
                    <tr>
                        <th>Tên nhân viên:</th>
                        <td>
                            <input placeholder="Nguyễn Văn A,..." type="text" name="tennhanvien" id="tennhanvien"
                                    class="form-control" required/>
<%--                            <p>--%>
<%--                                <c:if test='${message2 != ""}'>--%>
<%--                                    <span style="color: red" class="message">${message2}</span>--%>
<%--                                </c:if>--%>
<%--                            </p>--%>
                        </td>
                    </tr>
                    <tr>
                        <th>Ngày sinh:</th>
                        <td>
                            <input placeholder="YYYY-MM-DD" type="date" name="ngaysinhnhanvien" id="ngaysinhnhanvien"
                                    class="form-control" required/>
                            <p>
                                <c:if test='${messageNgaySinh != ""}'>
                                    <span style="color: red" class="message">${messageNgaySinh}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>CMND:</th>
                        <td>
                            <input placeholder="000000000,111111111,..." type="text" name="cmnd"
                                   id="cmnd"  class="form-control" required/>
                            <p>
                                <c:if test='${messageCmnd != ""}'>
                                    <span style="color: red" class="message">${messageCmnd}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Lương:</th>
                        <td>
                            <input type="text" name="luong" id="luong"
                                   class="form-control" required/>
<%--                            <p>--%>
<%--                                <c:if test='${message5 != ""}'>--%>
<%--                                    <span style="color: red" class="message">${message5}</span>--%>
<%--                                </c:if>--%>
<%--                            </p>--%>
                        </td>
                    </tr>
                    <tr>
                        <th>Email:</th>
                        <td>
                            <input placeholder="abc@abc.abc" type="text" name="email" id="email"
                                    class="form-control" required/>
                            <p>
                                <c:if test='${messageEmail != ""}'>
                                    <span style="color: red" class="message">${messageEmail}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Địa chỉ:</th>
                        <td>
                            <input  type="text" name="diachinhanvien" id="diachinhanvien"
                                   class="form-control" required/>
                        </td>
                    </tr>
                    <tr>
                        <th>Vị trí:</th>
                        <td>
                            <%--                    <input type="text" name="customer_type_id" id="customer_type_id" size="45"/>--%>
                            <select id="vitri_id" name="vitri_id" class="form-control">
                                <option value="1">1.Lễ tân</option>
                                <option value="2">2.Phục vụ</option>
                                <option value="3">3.Chuyên viên</option>
                                <option value="4">4.Giám sát</option>
                                <option value="5">5.Quản lý</option>
                                <option value="6">6.Giám đốc</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Trình độ:</th>
                        <td>
                            <%--                    <input type="text" name="customer_type_id" id="customer_type_id" size="45"/>--%>
                            <select id="trinhdo_id" name="trinhdo_id" class="form-control">
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
                            <%--                    <input type="text" name="customer_type_id" id="customer_type_id" size="45"/>--%>
                            <select id="bophan_id" name="bophan_id" class="form-control">
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
                               class="btn btn-outline-secondary">Close</a>
                            <button type="submit" name="action" value="create"
                               class="btn btn-outline-secondary">Create</button>
<%--                            <input type="submit" value="Create" class="btn btn-outline-success"/>--%>
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
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
