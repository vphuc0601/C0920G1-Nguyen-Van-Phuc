<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FURAMA RESORT</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<!-- Header -->
<div style="position: fixed;z-index: 9;margin: 0 ;width: 100%">
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <a class="navbar-brand" href="#">
            <img src="https://phuongviethcm.com/wp-content/uploads/2019/07/FURAMA.png" width="50" height="50"
                 class="d-inline-block align-top" alt="1">
        </a>
        <p style="font-size: 20px ;margin-right: 30px"> Lê Đình Thịnh</p>
    </nav>

    <%--Header-link--%>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">


        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/employee">Employee <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/customer">Customer <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#">Service <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#">Contract <span class="sr-only">(current)</span></a>
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
            <h1>Customer Management</h1>

        </div>
        <div align="center">
            <form method="post">
                <caption>
                    <h2>Add New Customer</h2>
                </caption>
                <table class="table-sm">
                    <tr>
                        <th>Customer ID:</th>
                        <td>
                            <input type="text" name="customer_id" id="customer_id" value="${customer.id}"
                                   placeholder="KH-0000,KH-1111,..." class="form-control" required/>
                            <p>
                                <c:if test='${message1 != ""}'>
                                    <span style="color: red" class="message">${message1}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Name:</th>
                        <td>
                            <input placeholder="Nguyễn Văn A,..." type="text" name="customer_name"
                                   value="${customer.name}" id="customer_name"
                                   class="form-control" required/>
                            <p>
                                <c:if test='${message2!= ""}'>
                                    <span style="color: red" class="message">${message2}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Birthday:</th>
                        <td>
                            <input placeholder="yyyy-mm-dd" type="text" name="customer_birthday"
                                   value="${customer.birthday}" id="customer_birthday" class="form-control" required/>
                            <p>
                                <c:if test='${message3!= ""}'>
                                    <span style="color: red" class="message">${message3}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Gender:</th>
                        <td>
                            <select id="customer_gender" name="customer_gender" class="form-control">
                                <option value="Male" ${customer.gender == 'Male'? 'selected':''}>Male</option>
                                <option value="Female" ${customer.gender == 'Female'? 'selected':''}>Female</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Id Card:</th>
                        <td>
                            <input placeholder="000000000,111111111,..." type="text" name="customer_id_card"
                                   id="customer_id_card" value="${customer.id_card}" class="form-control" required/>
                            <p>
                                <c:if test='${message4!= ""}'>
                                    <span style="color: red" class="message">${message4}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Phone:</th>
                        <td>
                            <input type="text" name="customer_phone" id="customer_phone"
                                   value="${customer.phone}" class="form-control" required/>
                            <p>
                                <c:if test='${message5!= ""}'>
                                    <span style="color: red" class="message">${message5}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Email:</th>
                        <td>
                            <input placeholder="abc@abc.abc" type="text" name="customer_email"
                                   id="customer_email" value="${customer.email}" class="form-control" required/>
                            <p>
                                <c:if test='${message6!= ""}'>
                                    <span style="color: red" class="message">${message6}</span>
                                </c:if>
                            </p>
                        </td>
                    </tr>
                    <tr>
                        <th>Customer Address:</th>
                        <td>
                            <input value="${customer.address}" type="text" name="customer_address" id="customer_address"
                                   class="form-control" required/>
                        </td>
                    </tr>
                    <tr>
                        <th>Type Customer:</th>
                        <td>
                            <%--                    <input type="text" name="customer_type_id" id="customer_type_id" size="45"/>--%>
                            <select id="customer_type_id" name="customer_type_id" class="form-control">
                                <option value="1" ${customer.customerType.idCustomerType == '1'? 'selected':''}>
                                    Diamond
                                </option>
                                <option value="2" ${customer.customerType.idCustomerType == '2'? 'selected':''}>
                                    Platinium
                                </option>
                                <option value="3" ${customer.customerType.idCustomerType == '3'? 'selected':''}>Gold
                                </option>
                                <option value="4" ${customer.customerType.idCustomerType == '4'? 'selected':''}>Silver
                                </option>
                                <option value="5" ${customer.customerType.idCustomerType == '5'? 'selected':''}>Member
                                </option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <a type="button" href="customer?action=customers"
                               class="btn btn-outline-secondary">Close</a>
                            <input type="submit" value="Save" class="btn btn-outline-success"/>

                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <%--Footer--%>
    <div class="card" style="margin-top: 0%">
        <div class="card-body" style="text-align: center">
            ©copyright-ledinhthinh
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
