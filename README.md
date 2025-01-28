<h1>Student Management System</h1>

The backend of this application is built with Spring Boot, providing a RESTful API to handle student data management. It supports CRUD (Create, Read, Update, Delete) operations, allowing users to interact with student records. The backend is designed to be secure, efficient, and easy to scale.

<h3>Features</h3>
<ol><li>
  <b>Create Student:</b> Adds new student records to the database
</li>
  <li>
  <b>Read Student:</b> Retrieves individual student records or all students from the database
</li><li>
  <b>Update Student:</b>  Modifies existing student records using the student ID.
</li><li>
  <b>Delete Student:</b> Removes a student record based on the student ID.
</li>
</ol>


<h3>Technologies Used</h3>
<ul><li>
  <b>Spring Boot</b> for building RESTful APIs
</li>
  <li>
  <b>Spring Data JPA</b> for database operations
</li><li>
  <b>MySQL</b> for database.
</li><li>
  <b>Validation</b> anotations to ensure data integrity and consistency
</li>
</ul>


<h3>API Endpoints</h3>
<ol><li>
  <b>POST /students:</b> Create a new student record
</li>
  <li>
  <b>GET /students:</b> Fetch all student records
</li><li>
  <b>GET /students/{id}:</b>  Fetch a student record by ID
</li>
  <li>
  <b>PUT /update/{id}:</b> Update an existing student record
</li>
  <li>
  <b>Delete /students/{id}:</b> Delete a student record by ID.
</li>
</ol>
