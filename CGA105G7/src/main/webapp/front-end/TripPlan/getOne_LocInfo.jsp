<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

     <!-- loc info start -->
     <div class="col-3 locInfo-title collapse" id="loc-info">
        <div class="row">
          <ul class="nav nav-pills p-0" id="pills-tab" role="tablist">
            <li class="nav-item w-50" role="presentation">
              <button class="btn trip-btn w-100 active" id="locInfo-tab" data-bs-toggle="pill" data-bs-target="#locInfo"
                type="button" role="tab" aria-controls="locInfo" aria-selected="true">
                <i class="bi bi-geo-alt-fill fa-2x"></i>
                <p class="m-0 d-inline">地點</p>
              </button>
            </li>
            <li class="nav-item w-50" role="presentation">
              <button class="btn trip-btn w-100" id="cusLoc-tab" data-bs-toggle="pill" data-bs-target="#cusLoc"
                type="button" role="tab" aria-controls="cusLoc" aria-selected="false">
                <i class="bi bi-pencil-fill fa-2x"></i>
                <p class="m-0 d-inline">自訂地點</p>
              </button>
            </li>
          </ul>

          <div class="tab-content h-100 p-0" id="pills-tabContent">
            <div class="tab-pane fade show active" id="locInfo" role="tabpanel" aria-labelledby="locInfo-tab">

              <div id="loc-pic" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                  <button type="button" data-bs-target="#loc-pic" data-bs-slide-to="0" class="active"
                    aria-current="true"></button>
                  <button type="button" data-bs-target="#loc-pic" data-bs-slide-to="1"></button>
                  <button type="button" data-bs-target="#loc-pic" data-bs-slide-to="2"></button>
                  <button type="button" data-bs-target="#loc-pic" data-bs-slide-to="3"></button>
                </div>
                <div class="carousel-inner">
                  <div class="carousel-item active" style="height: 250px;">
                    <img src="./images/dog.jpeg" class="d-block w-100 h-100" alt="...">
                  </div>
                  <div class="carousel-item" style="height: 250px;">
                    <img src="./images/bgremove_Logo.jpg" class="d-block w-100 h-100" alt="...">
                  </div>
                  <div class="carousel-item" style="height: 250px;">
                    <img src="./images/Logo.jpg" class="d-block w-100 h-100" alt="...">
                  </div>
                  <div class="carousel-item" style="height: 250px;">
                    <img src="./images/website.jpg" class="d-block w-100 h-100" alt="...">
                  </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#loc-pic" data-bs-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#loc-pic" data-bs-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                </button>
              </div>

              <div class="row my-3">
                <p class="col-12 fs-5 text-center text-truncate">緯育TibaMe附設中壢職訓中心</p>
                <p class="col-12 fs-5 text-center text-truncate">地點地址 : XXXXX地點地址 : XXXXX地點地址 : XXXXX地點地址 : XXXXX地點地址 :
                </p>
                <p class="col-12 fs-5 text-center text-truncate">電話 : XXXXX電話: XXXXX地電話 : XXXXX地電話 : XXXXX電話 : XXXXX</p>
              </div>

              <div class="row justify-content-center">
                <button class="col-8 btn trip-btn fw-bold border-dark" data-bs-toggle="modal"
                  data-bs-target="#exampleModal">加入行程</button>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                  aria-hidden="true">
                  <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title fw-bold" id="exampleModalLabel">加入行程</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                      </div>
                      <form action="" method="post">
                        <div class="modal-body">
                          <div class="text-center m-2">
                            <label for="">預計到達時間 : </label>
                            <input type="text">
                          </div>
                          <div class="text-center m-2">
                            <label for="">預計離開時間 : </label>
                            <input type="text">
                          </div>
                          <div class="text-center m-2">
                            <label for="">預計停留時間 : </label>
                            <input type="text" disabled>
                          </div>

                        </div>
                        <div class="modal-footer">
                          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
                          <button type="submit" class="btn btn-primary">確定</button>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- loc info end -->

            <!-- custom location start -->
            <div class="tab-pane fade container  overflow-auto" style="height: calc(100vh - 66px - 65px);" id="cusLoc"
              role="tabpanel" aria-labelledby="cusLoc-tab">
              <form action="#" method="post" class="row">
                <h3 class="fw-bold p-0 mt-3">建立新景點</h3>
                <p class="text-danger">* 星號為必填欄位</p>
                <input type="text" class="col-12 newLoc-input" placeholder="*請輸入地點名稱">
                <input type="text" class="col-12 newLoc-input" placeholder="*請輸入地址">
                <input type="text" class="col-12 newLoc-input" placeholder="請輸入電話">
                <button class="btn trip-btn mt-3 border-dark">建立</button>
              </form>
              <!-- custom location end -->

              <div class="row">
                <h4 class="fw-bold mt-3 p-0">我的自訂地點</h4>
                <!--customLocation btn start -->
                <button class="custom-loc btn trip-btn col-12 d-flex align-items-center bg-cblue my-2">
                  <div class="col-3">
                    <img src="./images/dog.jpeg" alt="..." class="w-100">
                  </div>
                  <div class="col-8 px-2">
                    <p class="text-start text-truncate m-1">地點名稱</p>
                    <p class="text-start text-truncate m-1">地點地址</p>
                  </div>
                </button>
                <!--customLocation btn end -->
              </div>
            </div>
          </div>
        </div>
      </div>
    