<html>
<head>
</head>
<body>
<form name="loginForm" method="post" action="servletRequest">

    <table class="login-input-container">
        <tr>
            <td>AD
            <input type='text' name='ad'/> <br/>
            </td>
        </tr>
        <tr>
            <td >SOYAD
            <input type='text' name='soyad'/> <br/>
            </td>
        </tr>
        <tr>
        <tr>
            <td>TEL NO
            <input type='text' name='telno'/> <br/>
            </td>
        </tr>
        </tr>
    </table>
    <table id="container">
<tr>
    <td>

    </td>
</tr>
    </table>
    <input type="button" class="buttons" value="TelEkle" onclick="telNoEkle()"/> <br/>
    <input type="submit" value="submit"/>

</form>
<script>
    function telNoEkle() {
        document.getElementById("container").outerHTML += "TEL NO  <input type='text' name='telno'/> <br/>";
    }
</script>
</body>
</html>