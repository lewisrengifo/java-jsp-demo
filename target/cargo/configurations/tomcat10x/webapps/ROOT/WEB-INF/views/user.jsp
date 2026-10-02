<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Info</title>
    <style>
        body   { font-family: Arial, sans-serif; background: #f4f4f9; text-align: center; padding-top: 60px; }
        .card  { display: inline-block; background: #fff; padding: 30px 50px; border-radius: 10px;
                 box-shadow: 0 2px 8px rgba(0,0,0,0.15); }
        h1     { color: #333; margin-top: 0; }
        table  { margin: 0 auto; border-collapse: collapse; }
        td     { padding: 6px 14px; text-align: left; }
        .label { font-weight: bold; color: #555; }
        .time  { margin-top: 20px; color: #888; font-size: 0.9em; }
    </style>
</head>
<body>
    <div class="card">
        <h1>User Info (from the server)</h1>
        <table>
            <tr><td class="label">Name:</td><td>${user.name}</td></tr>
            <tr><td class="label">Role:</td><td>${user.role}</td></tr>
            <tr><td class="label">Age:</td><td>${user.age}</td></tr>
        </table>
        <p class="time">Rendered by JSP at ${serverTime}</p>
    </div>

    <div class="card">
        <h1>Course info</h1>
        <table>
            <tr><td class="label">Name:</td><td>${materia.name}</td></tr>
            <tr><td class="label">Semester:</td><td>${materia.semester}</td></tr>
            <tr><td class="label">Creditos:</td><td>${materia.credits}</td></tr>
        </table>
        <p class="time">Rendered by JSP at ${serverTime}</p>
    </div>

    <div class="card">
        <h1>Equipo info</h1>
        <table>
            <tr><td class="label">Name:</td><td>${equipo.nombre}</td></tr>
            <tr><td class="label">Area:</td><td>${equipo.area}</td></tr>
        </table>
        <p class="time">Rendered by JSP at ${serverTime}</p>
    </div>
</body>
</html>
