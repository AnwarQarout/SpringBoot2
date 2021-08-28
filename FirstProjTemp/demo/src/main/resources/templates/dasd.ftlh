<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://www.thymeleaf.org
http://www.thymeleaf.org ">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>
            Id
        </th>
        <th>
            Dob
        </th>
        <th>
            email
        </th>
        <th>
            name
        </th>
    </tr>

    <#list result as student>
        <tr>
            <td> ${student.id}</td>
            <td>${student.dob}</td>
            <td>${student.email}</td>
            <td>${student.name}</td>
        </tr>
    </#list>
</table>

</body>
</html>