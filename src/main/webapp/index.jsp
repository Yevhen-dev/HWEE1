<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Form</title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<form action="/usersResponse" method="POST">

    <div class="form__wrap">
        <label for="name">Name: </label>
        <input type="text" id="name" name="name">
    </div>


    <div class="form__wrap">
        <label for="lastname">Lastname: </label>
        <input type="text" id="lastname" name="lastname">
    </div>


    <div class="form__wrap">
        <label for="age">Age: </label>
        <input type="text" id="age" name="age">
    </div>

    <div class="form__wrap">
        <label for="fruits">Your favourite fruit: </label>
        <select id="fruits" name="fruits">
            <option value="no">No</option>
            <option value="apple">Apple</option>
            <option value="banana">Banana</option>
            <option value="orange">Orange</option>
        </select>
    </div>

    <div class="form__wrap">
        <label for="animal">What animal do you have: </label>
        <select id="animal" name="animal">
            <option value="no">No</option>
            <option value="cat">Cat</option>
            <option value="dog">Dog</option>
        </select>
    </div>

    <input type="submit">
</form>

</body>
</html>
