package com.example.grabngo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VendorRegistration extends AppCompatActivity {

    TextInputLayout Fname, Lname, Email, Pass, cpass;
    Button signup, Emaill;
    FirebaseAuth FAuth;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    String fname, lname, emailId, password, confpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_registration);

        Fname = (TextInputLayout) findViewById(R.id.Firstname);
        Lname = (TextInputLayout) findViewById(R.id.Lastname);
        Email = (TextInputLayout) findViewById(R.id.Email);
        Pass = (TextInputLayout) findViewById(R.id.Pwd);
        cpass = (TextInputLayout) findViewById(R.id.Cpass);

        signup = (Button) findViewById(R.id.Signup);
        Emaill = (Button) findViewById(R.id.email);

        // firebase automatically create parent as "vendor" in which data of vendor will be stored
        databaseReference = firebaseDatabase.getInstance().getReference("vendor");
        FAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                fname = Fname.getEditText().getText().toString().trim();
                lname = Lname.getEditText().getText().toString().trim();
                emailId = Email.getEditText().getText().toString().trim();
                password = Pass.getEditText().getText().toString().trim();
                confpassword = cpass.getEditText().getText().toString().trim();

                // logic for isValid






            }
        });

    }





    String emailpattern = "[a-zA-z0-9,_-]+@[a-z]+\\.+[a-z]+";

    public boolean isValid() {
        Email.setErrorEnabled(false);
        Email.setError("");
        Fname.setErrorEnabled(false);
        Fname.setError("");
        Lname.setErrorEnabled(false);
        Lname.setError("");
        Pass.setErrorEnabled(false);
        Pass.setError("");
        cpass.setErrorEnabled(false);
        cpass.setError("");

        boolean isValidname=false,isValidlname=false, isValidemail=false, isValidpassword=false, isValidconfpassword=false;
        if(TextUtils.isEmpty(fname)){
            Fname.setErrorEnabled(true);
            Fname.setError("Enter First Name");
        }
        else
        {
            isValidname = true;
        }

        if(TextUtils.isEmpty(lname)) {
            Lname.setErrorEnabled(true);
            Lname.setError("Enter Last Name");
        }
        else
        {
            isValidlname = true;
        }
        if(TextUtils.isEmpty(emailId)) {
            Email.setErrorEnabled(true);
            Email.setError("Email is Required");
        }
        else
        {
            if(emailId.matches(emailpattern)){
                isValidemail = true;
            }
            else {
                Email.setErrorEnabled(true);
                Email.setError("Enter a Valid Email Address");
            }

        }
        if(TextUtils.isEmpty(password)){
            Pass.setErrorEnabled(true);
            Pass.setError("Enter Password");
        }else{
            if(password.length()<8){
                Pass.setErrorEnabled(true);
                Pass.setError("Password is Weak");
            }else{
                isValidpassword = true;
            }
        }
        if(TextUtils.isEmpty(confpassword)){
            cpass.setErrorEnabled(true);
            cpass.setError("Enter Password Again");
        }else{
            if(!password.equals(confpassword)){
                cpass.setErrorEnabled(true);
                cpass.setError("Password Dosen't Match");
            }else{
                isValidconfpassword = true;
            }
        }

        boolean isValid = (isValidconfpassword && isValidpassword && isValidemail && isValidname && isValidlname) ? true : false;
        return isValid;
    }
}