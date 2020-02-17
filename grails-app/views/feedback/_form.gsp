 <div class="fieldcontain">
      <label for="firstName">
        First Name
      </label>
      <g:textField name="firstName" value="${firstName}"></g:textField>
    </div>
    <div class="fieldcontain">
      <label for="comments">
        Comments
      </label>
      <g:textArea name="comments" value="${comments}"/>
    </div>

    <div class = "fieldcontain">
      <label for="password">
        Password
      </label>
      <g:passwordField name="password" value="${password}"></g:passwordField>
    </div>

<div class="fieldcontain">
      <label for="notify">
        Do you want e-mail notifications?
      </label>
      <g:checkBox name="notify" value="${notify}">checkbox1</g:checkBox>
    </div>

    <div class="fieldcontain">
      <label for="gender">
        Gender:
      </label>
      <g:radioGroup labels="['Male', 'Female']" values="['M', 'F']" value="${gender}" name="gender">
        ${it.label} ${it.radio}
      </g:radioGroup>
    </div>
	
	<div class="fieldcontain">
      <label for="marketing">
        How did you hear about us?
      </label>
      <g:select name="marketing" value="${marketing}" from="['Internet', 'Friend', 'Other']">

      </g:select>

    </div>