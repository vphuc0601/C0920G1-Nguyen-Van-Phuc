<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/23/2021
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/18/2021
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
  <title>Danh sách Nhân Viên</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
  <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
</head>
<body>


  <%--Body-left--%>
<%--  <div class="row">--%>
<%--    <div class="col-md-2">--%>
<%--      <div class="card">--%>
<%--        &lt;%&ndash;    <img class="card-img-top" src="https://bazantravel.com/cdn/medias/uploads/53/53114-furama-resort-da-nang-11.jpg" alt="Card image cap">&ndash;%&gt;--%>
<%--        <div id="myCarousel" class="carousel slide border" data-ride="carousel">--%>
<%--          <div class="carousel-inner">--%>
<%--            <div class="carousel-item active">--%>
<%--              <img class="d-block w-100"--%>
<%--                   src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-nha-hang.jpg"--%>
<%--                   alt="1">--%>
<%--            </div>--%>
<%--            <div class="carousel-item">--%>
<%--              <img class="d-block w-100"--%>
<%--                   src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang.jpg"--%>
<%--                   alt="2">--%>
<%--            </div>--%>
<%--            <div class="carousel-item">--%>
<%--              <img class="d-block w-100"--%>
<%--                   src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/07_2019/phong-ngu-o-furama-resort-da-nang_1.jpg"--%>
<%--                   alt="3">--%>
<%--            </div>--%>
<%--            <div class="carousel-item">--%>
<%--              <img class="d-block w-100"--%>
<%--                   src="https://luhanhvietnam.com.vn/du-lich-free-easy/vnt_upload/tour/08_2019/furama-spa.jpg"--%>
<%--                   alt="3">--%>
<%--            </div>--%>

<%--          </div>--%>
<%--        </div>--%>
<%--        <div class="card-body; text-center" >--%>
<%--          <h5 class="card-title">Furama Da Nang</h5>--%>
<%--          <p class="card-text" > Furama Resort Đà Nẵng là resort 5 sao với những tiêu chuẩn dịch vụ tốt nhất cho du--%>
<%--            khách khi du lịch Đà Nẵng. Những căn phòng tiện nghi, hồ bơi rộng lớn, vị trí tuyệt vời nằm cạnh bãi--%>
<%--            biển và còn nhiều hơn nữa những điều thú vị chờ du khách phá.</p>--%>
<%--        </div>--%>
<%--&lt;%&ndash;        <ul class="list-group list-group-flush">&ndash;%&gt;--%>
<%--&lt;%&ndash;          <li class="list-group-item">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <p><img src="https://www.flaticon.com/svg/static/icons/svg/968/968374.svg" width="20px">&ndash;%&gt;--%>
<%--&lt;%&ndash;              103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;          </li>&ndash;%&gt;--%>
<%--&lt;%&ndash;          <li class="list-group-item">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <p><img src="http://simpleicon.com/wp-content/uploads/phone-1.png" width="20px"> 84-236-3847 333/888</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;          </li>&ndash;%&gt;--%>
<%--&lt;%&ndash;          <li class="list-group-item"><img src="https://cdn.icon-icons.com/icons2/2098/PNG/512/mail_icon_128820.png"&ndash;%&gt;--%>
<%--&lt;%&ndash;                                           width="20px">&ndash;%&gt;--%>
<%--&lt;%&ndash;            reservation@furamavietnam.com&ndash;%&gt;--%>
<%--&lt;%&ndash;          </li>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </ul>&ndash;%&gt;--%>
<%--        <div class="card-body" style="text-align: left">--%>
<%--          <a href="https://www.facebook.com/furamaresort" class="card-link">--%>
<%--            <img src="https://cdn2.iconfinder.com/data/icons/social-media-2285/512/1_Facebook_colored_svg_copy-128.png"--%>
<%--                 width="30px">--%>
<%--            /furamaresort--%>
<%--          </a><br><br>--%>
<%--          <a href="https://www.instagram.com/furama_resort_danang/" class="card-link">--%>
<%--            <img src="https://cdn3.iconfinder.com/data/icons/2018-social-media-logotypes/1000/2018_social_media_popular_app_logo_instagram-128.png"--%>
<%--                 width="30px">--%>
<%--            /furama_resort_danang--%>
<%--          </a>--%>
<%--          <br><br>--%>
<%--          <a href="https://www.tripadvisor.com.vn/Hotel_Review-g298085-d302750-Reviews-Furama_Resort_Danang-Da_Nang.html"--%>
<%--             class="card-link">--%>
<%--            <img src="https://www.flaticon.com/premium-icon/icons/svg/2504/2504944.svg" width="30px">--%>
<%--            /furama_resort_danang--%>
<%--          </a>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--    </div>--%>

    <%--Body right--%>
    <div class="col-md-10">
      <div class="">
        <div style="text-align: center;">
          <h1>Quản lý Phòng Trọ</h1>
        </div>
        <div align="center">
          <caption><h2>Danh sách Phòng Trọ</h2></caption>
          <a href="/phongtro?action=create" class="btn btn-outline-success btn-sm w-25 ">Thêm mới Phòng Trọ</a>
          <table id="phongtro" class=" table table-striped table-bordered">
            <thead>
            <tr class="table-active" style="text-align: center">
              <th>Mã phòng trọ</th>
              <th>Tên người thuê trọ</th>
              <th>Số điện thoại</th>
              <th>Ngày bắt đầu thuê/th>
              <th>Hình thức thanh toán</th>
              <th>Ghi chú</th>
              <th>Action</th>
            </tr>
            </thead>
            <tbody style="text-align: center">
            <c:forEach var="phongtro" items="${phongTroList}">
              <tr>
                <td><c:out value="${phongtro.getMa_phong()}"/></td>
                <td><c:out value="${phongtro.getTen_thue()}"/></td>
                <td><c:out value="${phongtro.getDienthoai()}"/></td>
                <td><c:out value="${phongtro.getNgaythue()}"/></td>
                <td><c:out value="${phongtro.getThanhtoan_id()}"/></td>
                <td><c:out value="${phongtro.getGhichu()}"/></td>
                  <%--                            <td><c:out value="${nhanvien.getUsername()}"/></td>--%>
                <td>
                  <a href="/phongtro?action=update&id=${nhanvien.getId()} "
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
                          <a type="button" href="/phongtro?action=delete&id=${phongtro.getId()}"
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
</script>

</body>
</html>