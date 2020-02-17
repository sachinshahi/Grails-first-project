
        <div class="container">
          <div class="row">
            <div class="col-sm-12">
              <asset:image src="banner.png"/>
            </div>
          </div>

          <div class="row">
            <div class="col-sm-5 col-sm-offset-1">
              <h4> Welcome back Mike.</h4>
              <p> <h4>You have 3 points.</h4></p>
            </div>
            <div class="col-sm-6">
              <div class="row">
                <div class="col-sm-12">
                  <g:textField id="phone" name="phone" placeholder="Enter your cell number to check in" class="form-control" value="${phone}"></g:textField>
                </div>
              </div>

              <div class="row">
                <h4></h4>
              </div>
              <div class="row">
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="1" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="2" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="3" onclick="padkey(this.value)"/></div>
              </div>


              <div class="row">
                <h4></h4>
              </div>
              <div class="row">
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="4" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="5" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="6" onclick="padkey(this.value)"/></div>
              </div>

              <div class="row">
                <h4></h4>
              </div>
              <div class="row">
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="7" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="8" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="9" onclick="padkey(this.value)"/></div>
              </div>

              <div class="row">
                <h4></h4>
              </div>
              <div class="row">
                <div class="col-sm-4"><input class="btn btn-danger btn-lg btn-block" type="button" name="pad" value="Del"/></div>
                <div class="col-sm-4"><input class="btn btn-primary btn-lg btn-block" type="button" name="pad" value="0" onclick="padkey(this.value)"/></div>
                <div class="col-sm-4"><input class="btn btn-success btn-lg btn-block" type="button" name="pad" value="Go"/></div>
              </div>
            </div>
          </div>
        </div> 

        <script>
          function padkey(num) {
            var txt= document.getElementById("phone").value;
            txt = txt + num;
            document.getElementById("phone").value = txt;
          }
        </script>