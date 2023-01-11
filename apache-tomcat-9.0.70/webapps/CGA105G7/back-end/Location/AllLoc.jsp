<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>景點管理</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
  <link rel="stylesheet" href="../css/back.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
  <link rel="stylesheet" href="../css/listAllLoc.css">
  <link rel="website icon" href="../images/logo.png">

</head>





<body>


  <!-- ---------------------aside body區 start--------------------->
  <aside class="aside">

    <img src="../images/logo.png" width="80%">

    <ul class="aside_list">
      <li><a href="#">員工管理</a></li>
      <li><a href="#">會員管理</a></li>
      <li><a href="#">客服管理</a></li>
      <li><a href="#">優惠管理</a></li>
      <li><a href="#">論壇管理</a></li>
      <li><a href="#">揪團管理</a></li>
      <li><a href="#">訂房管理</a></li>
      <li><a href="./aside.jsp" class="bg-lblue">景點管理</a></li>

    </ul>
    <h1 style="margin: 0;">使用者 &#58 empName</h1>
    <button><a href="#">登出</a></button>
    <button><a href="#">修改密碼</a></button>

  </aside>

  <div class="right"></div>
  <!-- ---------------------aside body區 end--------------------->


  <!-- ---------------------function body區 start--------------------->
  <div class="function sticky-top">

  </div>
  <!-- ---------------------function body區 end--------------------->

  <!-- ---------------------main body區 start--------------------->
  <div class="workplace mt-2">
    <div class="container">
      <div class="row">
        <div class="col">
          <h3 class="fw-bold text-start">景點資訊管理</h3>
        </div>
      </div>

      <div class="row align-middle">
        <div class="col text-end">
          <button type="button" class="btn btn-primary py-1 px-2" data-bs-toggle="modal"
            data-bs-target="#add">新增景點</button>
        </div>
      </div>

      <div class="row mt-2">
        <div class="col text-start">
          <div class="d-inline">每頁</div>
          <select name="">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="5">4</option>
          </select>
          <div class="d-inline">筆資料</div>
        </div>

        <div class="col text-end">
          <form action="#">
            <label for="searchLoc">關鍵字搜尋 : </label>
            <input type="text" placeholder="請輸入" id="searchLoc">
            <button class="btn btn-primary py-1 px-2" type="submit">
              <i class="bi bi-search"></i>
            </button>
          </form>
        </div>
      </div>

      <div class="row">
        <table class="table">
          <thead>
            <tr>
              <th scope="col">編號</th>
              <th scope="col">景點名稱</th>
              <th scope="col">地址</th>
              <th scope="col">景點狀態</th>
              <th scope="col">圖片</th>
              <th scope="col">編輯</th>

            </tr>
          </thead>
          <tbody>
            <tr class="align-middle">
              <td>1</td>
              <td class="text-truncate">桃園市中壢桃園市中壢桃園市中壢</td>
              <td class="text-truncate">桃園市中壢壢桃園市中壢</td>
              <td>上架</td>
              <td>
                <button type="button" class="btn btn-primary py-1 px-2" data-bs-toggle="modal"
                  data-bs-target="#updatePic">預覽編輯圖片</button>
              </td>
              <td>
                <button type="button" class="btn btn-primary py-1 px-2" data-bs-toggle="modal"
                  data-bs-target="#update">編輯</button>
              </td>
            </tr>
          </tbody>
        </table>
      </div>

      <!-- 新增 content start -->
      <div class="modal fade" id="add" tabindex="-1" aria-labelledby="addLoc" aria-hidden="true">
        <div class="modal-dialog">

          <form action="" class="modal-content" method="post">
            <div class="modal-header">
              <h5 class="modal-title fw-bold" id="addLoc">新增景點</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">

              <div class="container">
                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Aloc_name">景點名稱 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="loc_name" id="Aloc_name" maxlength="15" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Alongitude">經度 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="longitude" id="Alongitude" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Alatitude">緯度 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="latitude" id="Alatitude" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Aaddress">地址 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="address" id="Aaddress" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Aphone">連絡電話 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="phone" id="Aphone" maxlength="15">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="input-group p-4 pt-1">
                  <label class="input-group-text" for="Apicture">景點圖片 : </label>
                  <input type="file" class="form-control" name="picture" id="Apicture" accept=".jpg,.png,.jpeg" multiple>
                </div>
                
              </div>

            </div>
            <input type="hidden" name="action" value="insert">
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
              <button type="submit" class="btn btn-primary">送出</button>
            </div>
          </form>

        </div>
      </div>
      <!-- 新增 content end -->


  <!-- 編輯圖片 content start -->
  <div class="modal fade" id="updatePic" tabindex="-1" aria-labelledby="pic" aria-hidden="true">
    <div class="modal-dialog">

      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title fw-bold" id="pic">編輯圖片</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">

          <div id="viewPic" class="carousel slide carousel-dark" data-bs-interval="false">
            <div class="carousel-indicators">
              <button type="button" data-bs-target="#viewPic" data-bs-slide-to="0" class="active" aria-current="true"></button>
              <button type="button" data-bs-target="#viewPic" data-bs-slide-to="1"></button>
              <button type="button" data-bs-target="#viewPic" data-bs-slide-to="2"></button>
              
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img src="../images/JavaTime.png" class="d-block w-100">
              </div>
              <div class="carousel-item">
                <img src="../images/JavaTime.png" class="d-block w-100">
              </div>
              <div class="carousel-item">
                <img src="../images/JavaTime.png" class="d-block w-100">
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#viewPic" data-bs-slide="prev">
              <span class="carousel-control-prev-icon"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#viewPic" data-bs-slide="next">
              <span class="carousel-control-next-icon"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
          
          <form class="mt-2" method="post" action="">
            <input type="checkbox" id="pic1" >
            <label for="pic1" class="align-baseline m-1">圖片1</label>

            <input type="checkbox" id="pic2" >
            <label for="pic2" class="align-baseline m-1">圖片2</label>

            <input type="checkbox" id="pic3" >
            <label for="pic3" class="align-baseline m-1">圖片3</label>

            <button type="submit" class="btn btn-danger py-1 px-2">刪除圖片 </button>
          </form>

        </div>

        <div class="input-group p-3">
          <label class="input-group-text" for="addpic">新增圖片</label>
          <input type="file" class="form-control" id="addpic" multiple>
        </div>
        <input type="hidden" name="action" value="updatePic">
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">送出</button>
        </div>
      </div>

    </div>
  </div>
  <!-- 新增 content end -->


      <!-- 編輯 content start -->
      <div class="modal fade" id="update" tabindex="-1" aria-labelledby="updateLoc" aria-hidden="true">
        <div class="modal-dialog">

          <form action="" class="modal-content" method="post">
            <div class="modal-header">
              <h5 class="modal-title fw-bold" id="updateLoc">編輯景點</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">

              <div class="container">
                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Uloc_name">景點名稱 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="loc_name" id="Uloc_name" maxlength="15" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Ulongitude">經度 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="longitude" id="Ulongitude" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Ulatitude">緯度 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="latitude" id="Ulatitude" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Uaddress">地址 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="address" id="Uaddress" maxlength="30" placeholder="必填" value="">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-end p-0">
                    <label for="Uphone">連絡電話 : </label>
                  </div>
                  <div class="col">
                    <input type="text" name="phone" id="Uphone" maxlength="15">
                  </div>
                  <div class="col text-start p-0">
                    <span>錯誤訊息</span>
                  </div>
                </div>

                <div class="row m-2">
                  <div class="col text-center p-0">
                    <div>景點狀態 : </div>
                  </div>
                  <div class="col-3 text-start">
                    <input type="radio" name="status" id="puton" value="上架">
                    <label for="puton">上架</label>
                  </div>
                  <div class="col text-start">
                    <input type="radio" name="status" id="putoff" value="下架">
                    <label for="putoff">下架</label>
                  </div>
                </div>


              </div>

            </div>
            <input type="hidden" name="action" value="update">
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
              <button type="submit" class="btn btn-primary">送出</button>
            </div>
          </form>

        </div>
      </div>
      <!-- 編輯燈箱 content end -->



    </div>
  </div>
  <!-- ---------------------main body區 end--------------------->

  <script src="https://kit.fontawesome.com/616f19a0b0.js" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
    crossorigin="anonymous"></script>
  <script>

    $(".aside_list li").click(function () {
      $(this).css("background", "#041427").siblings().css("background", "");
    })
  </script>
</body>

</html>