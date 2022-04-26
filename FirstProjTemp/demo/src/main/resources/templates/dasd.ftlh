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

    <#list result as category>
        <tr>
            <td> ${category.id}</td>
            <td>${category.dob}</td>
            <td>${category.email}</td>
            <td>${category.name}</td>
        </tr>
    </#list>
</table>

</body>
</html>