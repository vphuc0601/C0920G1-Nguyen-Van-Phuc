<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: ledinhthinh--%>
<%--  Date: 12/17/2020--%>
<%--  Time: 11:47--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Customer Management Application</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div style="text-align: center;">--%>
<%--    <h1>Customer Management</h1>--%>
<%--    <h2>--%>
<%--        <a href="customer?action=customers">List All Customer</a>--%>
<%--    </h2>--%>
<%--</div>--%>
<%--<div align="center">--%>
<%--    <form method="post">--%>
<%--        <table class="table">--%>
<%--            <caption>--%>
<%--                <h2>--%>
<%--                    Edit Customer--%>
<%--                </h2>--%>
<%--            </caption>--%>
<%--            <c:if test="${ customer != null}">--%>
<%--                <input type="hidden" name="id" value="<c:out value='${customer.id}' />"/>--%>
<%--            </c:if>--%>
<%--            <tr>--%>
<%--                <th>Customer Name:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="name" size="45"--%>
<%--                           value="<c:out value='${customer.name}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Birthday:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="birthday" size="45"--%>
<%--                           value="<c:out value='${customer.birthday}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Gender:</th>--%>
<%--                <td>--%>
<%--                    <select id="gender" name="gender">--%>
<%--                        <option><c:out value='${customer.gender}' /></option>--%>
<%--                        <option value="Nam">Nam</option>--%>
<%--                        <option value="Nu">Nu</option>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Id card:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="id_card" size="45"--%>
<%--                           value="<c:out value='${customer.id_card}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Phone:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="phone" size="45"--%>
<%--                           value="<c:out value='${customer.phone}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Email:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="email" size="45"--%>
<%--                           value="<c:out value='${customer.email}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer Address:</th>--%>
<%--                <td>--%>
<%--                    <input type="text" name="address" size="45"--%>
<%--                           value="<c:out value='${customer.address}' />"--%>
<%--                    />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <th>Customer type:</th>--%>
<%--                <td>--%>
<%--                    <select id="customer_type_id" name="customer_type_id">--%>
<%--                        <option value="${customer.customerType.idCustomerType}"><c:out value='${customer.customerType.nameCustomerType}'/></option>--%>
<%--                        <option value="1">Diamond</option>--%>
<%--                        <option value="2">Platinium</option>--%>
<%--                        <option value="3">Gold</option>--%>
<%--                        <option value="4">Silver</option>--%>
<%--                        <option value="5">Member</option>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan="2" align="center">--%>
<%--                    <input type="submit" value="Save"/>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>


<%--
  Created by IntelliJ IDEA.
  User: ledinhthinh
  Date: 12/17/2020
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <%--    <a class="navbar-brand" href="#">Navbar</a>--%>
        <%--    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">--%>
        <%--        <span class="navbar-toggler-icon"></span>--%>
        <%--    </button>--%>

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
                <%--            <li class="nav-item">--%>
                <%--                <a class="nav-link" href="#">Link</a>--%>
                <%--            </li>--%>
                <%--            <li class="nav-item dropdown">--%>
                <%--                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
                <%--                    Dropdown--%>
                <%--                </a>--%>
                <%--                <div class="dropdown-menu" aria-labelledby="navbarDropdown">--%>
                <%--                    <a class="dropdown-item" href="#">Action</a>--%>
                <%--                    <a class="dropdown-item" href="#">Another action</a>--%>
                <%--                    <div class="dropdown-divider"></div>--%>
                <%--                    <a class="dropdown-item" href="#">Something else here</a>--%>
                <%--                </div>--%>
                <%--            </li>--%>
                <%--            <li class="nav-item">--%>
                <%--                <a class="nav-link disabled" href="#">Disabled</a>--%>
                <%--            </li>--%>
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
            <h1>Employee Management</h1>

        </div>
        <div align="center">
            <form method="post">
                <caption>
                    <h2>
                        Edit Employee
                    </h2>
                </caption>
                <table class="table-sm">
                    <c:if test="${ employee != null}">
                        <input type="hidden" name="employee_id" value="<c:out value='${employee.id}' />"/>
                    </c:if>
                    <tr>
                        <th>Employee Name:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_name" size="45"
                                   value="<c:out value='${employee.name}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Employee Birthday:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_birthday" size="45"
                                   value="<c:out value='${employee.birthday}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Employee Id card:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_id_card" size="45"
                                   value="<c:out value='${employee.id_card}' />"/>

                        </td>
                    </tr>
                    <tr>
                        <th>Employee Salary:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_salary" size="45"
                                   value="<c:out value='${employee.salary}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Employee Phone:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_phone" size="45"
                                   value="<c:out value='${employee.phone}' />"
                            />
                        </td>
                    </tr>

                    <tr>
                        <th>Employee Email:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_email" size="45"
                                   value="<c:out value='${employee.email}' />"
                            />

                        </td>
                    </tr>
                    <tr>
                        <th>Employee Address:</th>
                        <td>
                            <input class="form-control" type="text" name="employee_address" size="45"
                                   value="<c:out value='${employee.address}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Position:</th>
                        <td>
                            <select id="position_id" name="position_id" class="form-control">
                                <option value="${employee.position.position_id}">
                                    <c:out value='${employee.position.position_name}'/>
                                </option>
                                <option value="1">Receptionist</option>
                                <option value="2">Service</option>
                                <option value="3">Expert</option>
                                <option value="4">Monitoring</option>
                                <option value="5">Manage</option>
                                <option value="6">President</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Education Degree:</th>
                        <td>

                            <select id="education_degree_id" name="education_degree_id" type="id" class="form-control">
                                <option value="${employee.education_degree.education_degree_id}">
                                    <c:out value='${employee.education_degree.education_degree_name}'/>
                                </option>
                                <option value="1">Intermediate level</option>
                                <option value="2">Colleges</option>
                                <option value="3">University</option>
                                <option value="4">Experienced</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Division:</th>
                        <td>
                            <select id="division_id" name="division_id" type="id" class="form-control">
                                <option value="${employee.division.division_id}">
                                    <c:out value='${employee.division.division_name}'/>
                                </option>
                                <option value="1">Sale-Maketing</option>
                                <option value="2">Administrative</option>
                                <option value="3">Service</option>
                                <option value="4">Manage</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <a href="customer?action=customers" class="btn btn-outline-secondary"
                               type="button">Close</a>
                            <input class="btn btn-outline-success" type="submit" value="Save"/>
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
