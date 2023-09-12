


<!DOCTYPE html>
<html lang="en">
<head>
<title>http.//Enfachzauberer/.org.in</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 
{
font-family: "Roboto", sans-serif; text-align: left; margin-right:100px; 
}
.w3-sidebar 
{
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}
img
{
text-align: left;
}
</style>
</head>
<body>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="AdminLogin.jsp" class="w3-bar-item w3-button w3-theme-l1">Admin Login</a>
    <a href="EmpLogin.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Emoployee Login</a>
    <a href="Contact.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Contact</a>
  </div>
</div>
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<div class="w3-main" style="margin-left:250px">

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
    <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAwFBMVEX/////UQBVliQruLP/QQD/5eDg69hRlB2FsmZMkQ1ry8eo3NoatbAHs66T2NW20KXi8/JFjwDm7uL/6uaBz8uyy6SFsWz+1MX/SQBmoTv1+fJbmim81K5so0T+ooX+vKz+kWz+zbz+taD/aDi75uTG2rj/285Mv7v/+fX/OwD+4tf+q5D/XBX+nX7/8u3+sJf/XCKnxpN9rVvw9uz+i2L/KAA2iAD/Zi3+g1r+vab+bjv+eUn+lnT+1sj+dkf+xLEF7KU4AAAErklEQVR4nO3da18SQRzFcZA1xUuKWGyapmYKqGh5LTXf/7vqUzsh1FnYnQt7Rs/vUU8Y+Yb4Z5ZdqNVn0ucabK05F7iFxZqEEkoooYQSSvjKhEmwehc5wptWkJpYmHTmw4WFWxth+trEwpy7EWFrEkafhPEnYfxJGH8Sxp+EWRuL7wO0uMEjfNNaCFDrDZEwyO60yfQYSiihhBJKKKGEEr5A4baXFniFzbUtL80CaCn8OJP75icJsyRkTsIsCZmTMEtC5iTMkpA5CbMkZE7CLAmZkzBLQuYkzJKQOQmzJGROwiwJmZMw69UJ5z7sOPaNXTjnemrpDr3QMQkllFBCCSWUUEIJZyBsrl26xi588bsnCakiEPY7nmuzCa96nj8A55xNuJfWvZYeSCihhBJKKKGEk4S9YdcvSDj8LL+bCe+WxCwsloQSzlSY0AmvktSynMewPf1nzlbY+WTZGSQmHZs7QXkUo3sLgSdWi1EK79BDmN7ZLcYoPEnQQ3g6sFuNUNiBwLRvuRyfcID/yny3XY9P+AM+Cfes16MTPkBgzieFF4lN+B0+Ces2o95EJuzDJ2G677Akl7B7Cv/K7LqsySXEo/7eaU0qIR719a7TokzCfTzqj9xWJRK24QNoP+pNRELfo970r/CLh7tq1wP6HU1vndf97yxoP22X/p/Coz6ZNOrXl4cd1g6fG/8cLu9nQWe1ygrxqE8mjvrl1RXT6lJtZdjq+mShn8r+tndvkXDKqF9eafxtqTb8Z4NTeGUz6mMSnuNRP2VXH5HwsQefhNN29fEIB/ABnH74Nx7hT8tRH40QHv5Nb6e/3o5F+IT/yhT4goNIhH38WqbIrj4OYffCYtSXE7aaISr8qg2P+p+FbltMePkuTAW//sFu1JcSVlvOAfyCu/oIhLaj3hSBEO/qr4renF94Bnf1p4VvTy/Eo77Ee/Xswj5+Ej4VX4FciHf16VmJJciFLqPexC10GvUmauERfr1d7gA+s3CA30U7n37L0ZiF926j3kQs3IWj/qLsu2i8wid4aC0t/bWFtMI2PoBfYtSbWIU5B/DLjHoTqxCeVpv+sFiJVHjg77Q8TiEe9anVubGUwi7ylR71JkohHvWW58YyCvGoP7U8YYZQmLOrtz03lk84j5+E5Ue9iU+Id/UP1uvRCf2NehObEI/61PIM/N+RCY/w6+1HhyW5hAP8LprdqDdxCb1eBmOiEsJRX7cd9SYm4T4+Yab0rn48ImGgc2OJhPBdtMR+1Jt4hPgyGIdRb6IR5lwG4zDqTSzCnBNmrHb145EIcy6DsbvidTwSYYhRb+IQwstgyh/Ah1EIcy6Dsd3Vj8cgDDTqTQxCvKvf87Q6gRCPevfLYEzVC4ONelPlwgBXvI5XtRCfG5s67erHq1oIR329vuvU2eicqViYc8Vr3fYTa7J6o7/j1Qrx623nEh4hPngooYQSSiihhBJKKKGEEvrt0fPXIpiueYTddphGDyVXvccPn4TxJ2H8SRh/EsafhPHHIzzcDNNxAwpXNt8GaxkLnz8bz28NLGyE+Wl/Os4Rjt6XMI0JAyZhuCT0lYThktBXr1cYaOI/t1qxcOQTjUN1+Av0cn6XbG5b4wAAAABJRU5ErkJggg==" alt="" width="200" height="200">
      <h1>Einfachzauberer Technologies pvt ltd</h1>
      <pre> <h5>                       Einfachzauberer Technologies Private Limited is a fast growing, innovative and 
      vibrant software company. provide process automation and management software that facilitates 
      products on multiple channels, different industries and large entities, while seamlessly integrating 
      with various solutions and eCommerce platforms. Einfachzauberer Technologies Private Limited has offices 
      in Bangalore, Chennai, Hyderabad and Cochin and teams in various geographies as well.
      We look after many customers around the world and We believe passionately in our culture and values - they 
      flow through everything we do and how we do it - our people are our greatest strength.</h5></pre>
    </div>
  </div>

</div>

<script>
var mySidebar = document.getElementById("mySidebar");

var overlayBg = document.getElementById("myOverlay");

function w3_open() 
{
  if (mySidebar.style.display === 'block') 

  {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } 
  else 
  {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

function w3_close() 
{
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>
