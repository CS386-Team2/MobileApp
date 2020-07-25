public class firstPage extends AppCompatActivity {
    Button btn_register;
    Button to_login; 
    EditText user_name,psw1,psw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_success);
        init();
    }
