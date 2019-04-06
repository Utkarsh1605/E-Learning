<!DOCTYPE html>
<html>
<title>E-Learning</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}

body, html {
  height: 100%;
  line-height: 1.8;
}

/* Full height image header */
.bgimg-1 {
  background-position: center;
  background-size: cover;
  background-image: url("im1.jpg");
  min-height: 100%;
}

.w3-bar .w3-button {
  padding: 16px;
}
</style>
<body>
    <%
    session.setAttribute("username","");
    session.setAttribute("usernamet","");
    session.setAttribute("id","");
    session.setAttribute("idt","");
    session.setAttribute("dss","");
    session.setAttribute("aasub","");
    session.setAttribute("fnn","");
    session.setAttribute("subb","");
    
    %>
<!-- Navbar (sit on top) -->

<div class="w3-top">
  <div class="w3-bar w3-white w3-card" id="myNavbar">
      <h2> <a href="#home" class="w3-bar-item w3-button w3-wide">Educators</a></h2>
    <!-- Right-sided navbar links -->
    <div class="w3-right w3-hide-small">
      <a href="#about" class="w3-bar-item w3-button">ABOUT</a>
      <a href="#work" class="w3-bar-item w3-button"><i class="fa fa-th"></i>Work</a>
      <a href="#contact" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i> CONTACT</a>
      <a href="#pricing" class="w3-bar-item w3-button"><i class="fa fa-group"></i>STUDENT-TEACHER</a>
    </div>
    <!-- Hide right-floated links on small screens and replace them with a menu icon -->

    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
      <i class="fa fa-bars"></i>
    </a>
  </div>
</div>

<!-- Sidebar on small screens when clicking the menu icon -->
<nav class="w3-sidebar w3-bar-block w3-black w3-card w3-animate-left w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button w3-large w3-padding-16">Close ×</a>
  <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button">ABOUT</a>
  <a href="#work" onclick="w3_close()" class="w3-bar-item w3-button">WORK</a>
  <a href="#pricing" onclick="w3_close()" class="w3-bar-item w3-button">STUDENT-TEACHER</a>
  <a href="#contact" onclick="w3_close()" class="w3-bar-item w3-button">CONTACT</a>
  <a href="#" onclick="w3_close()" class="w3-bar-item w3-button">Sign-Up</a>
  <a href="#" onclick="w3_close()" class="w3-bar-item w3-button">Sign-In</a>
</nav>
<br><br><br><br>
 <h1 >General Knowledge</h1>
<!-- start sw-rss-feed code --> 
<script type="text/javascript"> 
<!-- 
rssfeed_url = new Array(); 
rssfeed_url[0]="https://news.google.com/news/rss/headlines/section/geo/India";  
rssfeed_frame_width="600"; 
rssfeed_frame_height="400"; 
rssfeed_scroll="on"; 
rssfeed_scroll_step="2"; 
rssfeed_scroll_bar="on"; 
rssfeed_target="_blank"; 
rssfeed_font_size="12"; 
rssfeed_font_face=""; 
rssfeed_border="on"; 
rssfeed_css_url="https://feed.surfing-waves.com/css/style2a.css"; 
rssfeed_title="off"; 
rssfeed_title_name="News Updates!!!"; 
rssfeed_title_bgcolor="#3366ff"; 
rssfeed_title_color="#fff"; 
rssfeed_title_bgimage=""; 
rssfeed_footer="off"; 
rssfeed_footer_name="rss feed"; 
rssfeed_footer_bgcolor="#fff"; 
rssfeed_footer_color="#333"; 
rssfeed_footer_bgimage=""; 
rssfeed_item_title_length="50"; 
rssfeed_item_title_color="#666"; 
rssfeed_item_bgcolor="#fff"; 
rssfeed_item_bgimage=""; 
rssfeed_item_border_bottom="on"; 
rssfeed_item_source_icon="off"; 
rssfeed_item_date="off"; 
rssfeed_item_description="on"; 
rssfeed_item_description_length="120"; 
rssfeed_item_description_color="#666"; 
rssfeed_item_description_link_color="#333"; 
rssfeed_item_description_tag="off"; 
rssfeed_no_items="0"; 
rssfeed_cache = "142153ab8b340e99266702aa09cc5c30"; 
//--> 
</script> 
<script type="text/javascript" src="//feed.surfing-waves.com/js/rss-feed.js"></script> 
<!-- The link below helps keep this service FREE, and helps other people find the SW widget. Please be cool and keep it! Thanks. --> 
<div style="color:#ccc;font-size:10px; text-align:right; width:600px;">powered by <a href="https://surfing-waves.com" rel="noopener" target="_blank" style="color:#ccc;">Surfing Waves</a></div> 
<!-- end sw-rss-feed code -->
<!-- About Section -->
<div class="w3-container" style="padding:128px 16px" id="about">
  <h3 class="w3-center">ABOUT Us</h3>
  <p class="w3-center w3-large">Key Features of our portal</p>
  <div class="w3-row-padding w3-center" style="margin-top:64px">
    <div class="w3-quarter">
      <i class="fa fa-desktop w3-margin-bottom w3-jumbo w3-center"></i>
      <p class="w3-large">Make a Quiz</p>
      <p>Teachers can make a quiz of any topic for the students.</p>
    </div>
    
    <div class="w3-quarter">
      <i class="fa fa-pencil w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">Take a Quiz </p>
      <p>Students can attempt the quiz and hone their skills. </p>
    </div>
      <div class="w3-quarter">
      <i class="fa fa-book w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">Study with us</p>
      <p>Study material is also being provided by the faculty to the students, which they can download and study</p>
    </div>
    <div class="w3-quarter">
      <i class="fa fa-comment w3-margin-bottom w3-jumbo"></i>
      <p class="w3-large">Doubt clearance</p>
      <p>Students can interact with the faculty and can clear their doubts.</p>
    </div>
  </div>
</div>




<!-- Promo Section "Statistics" -->
<div class="w3-container w3-row w3-center w3-dark-grey w3-padding-64">
  <div class="w3-quarter">
    <span class="w3-xxlarge">14+</span>
    <br>Institutions
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">150+</span>
    <br>Faculty Support
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">10,000+</span>
    <br>Students
  </div>
  <div class="w3-quarter">
    <span class="w3-xxlarge">24x7</span>
    <br>Support
  </div>
</div>


<!-- Modal for full size images on click-->
<div id="modal01" class="w3-modal w3-black" onclick="this.style.display='none'">
  <span class="w3-button w3-xxlarge w3-black w3-padding-large w3-display-topright" title="Close Modal Image">×</span>
  <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
    <img id="img01" class="w3-image">
    <p id="caption" class="w3-opacity w3-large"></p>
  </div>
</div>

<!-- Skills Section -->
<div class="w3-container w3-light-grey w3-padding-64">
  <div class="w3-row-padding">
    <div class="w3-col m6">
      <h3>Develop Your skills</h3>
      <p>Skill development by giving n-number of quixes </p>
      <p>Manage and hone your progress</p>
    </div>
    <div class="w3-col m6">
      <p class="w3-wide"><i class="fa fa-chevron-right w3-margin-right"></i>Design and Analysis of Algorithms</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:90%">90%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-chevron-right w3-margin-right"></i>Compiler Design</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:85%">85%</div>
      </div>
      <p class="w3-wide"><i class="fa fa-chevron-right w3-margin-right"></i>Aptitude</p>
      <div class="w3-grey">
        <div class="w3-container w3-dark-grey w3-center" style="width:75%">75%</div>
      </div>
    </div>
  </div>
</div>

<!-- STUDENT-TEACHER -->
<div class="w3-container w3-center w3-dark-grey" style="padding:100px 16px" id="pricing">
  <h3>STUDENT-TEACHER</h3>
  <p class="w3-large">The two domains of our portal</p>
  <div class="w3-row-padding" style="margin-top:64px">
    <div class="w3-third w3-section">
      <ul class="w3-ul w3-white w3-hover-shadow">
        <li class="w3-black w3-xlarge w3-padding-32">Student</li>
        <li class="w3-padding-16"><b>1000s</b> of questions</li>
        <li class="w3-padding-16"><b>Various</b> subjects</li>
        <li class="w3-padding-16"><b>24x7</b> doubt clearance</li>
        <li class="w3-padding-16"><b>24x7</b> Notes Download</li>
        <li class="w3-light-grey w3-padding-24">
            <a href="login.jsp"> <button  class="w3-button w3-black w3-padding-large">Sign in</button></a>
        </li>
      </ul>
    </div>
      <div>
          <hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr><hr>
      </div>
    <div class="w3-third w3-section">
      <ul class="w3-ul w3-white w3-hover-shadow">
        <li class="w3-black w3-xlarge w3-padding-32">Teacher</li>
        <li class="w3-padding-16"><b>Simplified</b> quiz generation</li>
        <li class="w3-padding-16"><b>E-</b> Tutoring</li>
        <li class="w3-padding-16"><b>Doubt</b> clearance</li>
        <li class="w3-padding-16"><b>Notes Upload</b> </li>
        
        <li class="w3-light-grey w3-padding-24">
            <a href="logint.jsp"> <button class="w3-button w3-black w3-padding-large">Sign in</button></a>
        </li>
      </ul>
    </div>
      <img src="C:\Users\admin\Documents\NetBeansProjects\WebApplication8\photos\im1.jpg" alt="studentteacher pic">
  </div>
</div>

<!-- Contact Section -->
<div class="w3-container w3-light-grey" style="padding:128px 16px" id="contact">
  <h3 class="w3-center">CONTACT</h3>
  <p class="w3-center w3-large">For any queries or assistance, Contact us:</p>
  <div style="margin-top:48px">
    <p><i class="fa fa-map-marker fa-fw w3-xxlarge w3-margin-right"></i> GLA UNIVERSITY,Mathura</p>
    <p><i class="fa fa-phone fa-fw w3-xxlarge w3-margin-right"></i> Phone: 7014857734</p>
    <p><i class="fa fa-envelope fa-fw w3-xxlarge w3-margin-right"> </i> Email: educators@gla.ac.in</p>
    <br>
    <form action="action.jsp" target="_blank">
      <p><input class="w3-input w3-border" type="text" placeholder="Name" required name="name"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Email" required name="email"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Subject" required name="subject"></p>
      <p><input class="w3-input w3-border" type="text" placeholder="Message" required name="mssg"></p>
      <p>
        <button class="w3-button w3-black" type="submit">
          <i class="fa fa-paper-plane"></i> SEND MESSAGE
        </button>
      </p>
    </form>
   
  </div>
</div>

<!-- Footer -->
<footer class="w3-center w3-black w3-padding-64">
  <a href="#" class="w3-button w3-light-grey"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  
  <p>Powered by <a href="https://www.gla.ac.in" title="GLA University" target="_blank" class="w3-hover-text-green">GLA University</a></p>
</footer>
 
<script>
// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}


// Toggle between showing and hiding the sidebar when clicking the menu icon
var mySidebar = document.getElementById("mySidebar");

function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
  } else {
    mySidebar.style.display = 'block';
  }
}

// Close the sidebar with the close button
function w3_close() {
    mySidebar.style.display = "none";
}
</script>
                    
</body>
</html>
