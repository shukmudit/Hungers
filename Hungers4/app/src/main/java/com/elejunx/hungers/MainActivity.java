package com.elejunx.hungers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.api.graphql.model.ModelMutation;
import com.amplifyframework.api.graphql.model.ModelQuery;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.Priority;
import com.amplifyframework.datastore.generated.model.Todo;

public class MainActivity extends AppCompatActivity {
    Intent sign_up_activity,home_activity;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSApiPlugin());
            Amplify.addPlugin(new AWSDataStorePlugin());
            Amplify.configure(getApplicationContext());

            Log.i("Tutorial", "Initialized Amplify");
        } catch (AmplifyException e) {
            Log.e("Tutorial", "Could not initialize Amplify", e);
        }

        Amplify.Auth.fetchAuthSession(
                result -> Log.i("AmplifyQuickstart", result.toString()),
                error -> Log.e("AmplifyQuickstart", error.toString())
        );

        Button btn_sign_up = (Button) findViewById(R.id.button_sign_up);
        Button btn_login = (Button) findViewById(R.id.button_login);
        email = findViewById(R.id.email_signup);
        password = findViewById(R.id.pass_signup);


        /* Sign Up Activity */
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign_up_activity =new Intent(MainActivity.this,SignUp.class
                );
                startActivity(sign_up_activity);
            }
        });
        /* Sign Up Activity */

        /* Log In Activity */
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                home_activity =new Intent(MainActivity.this,Home.class
                );
                startActivity(home_activity);

            }
        });
        /* Log In Activity */

        /* Crete an Item */
        /*Todo item = Todo.builder()
                .name("Finish quarterly taxes")
                .priority(Priority.HIGH)
                .description("Taxes are due for the quarter next week")
                .build();
        Amplify.DataStore.save(item,
                success -> Log.i("Tutorial", "Saved item: " + success.item().getName()),
                error -> Log.e("Tutorial", "Could not save item to DataStore", error)
        );
*/
        /* Update an Item */
       /* Amplify.DataStore.query(Todo.class, Where.matches(Todo.PRIORITY.contains("NORMAL")),
                matches -> {
                    if (matches.hasNext()) {
                        Todo original = matches.next();
                        Todo edited = original.copyOfBuilder()
                                .name("New Title")
                                .build();
                        Amplify.DataStore.save(edited,
                                updated -> Log.i("MyAmplifyApp", "Updated a post."),
                                failure -> Log.e("MyAmplifyApp", "Update failed.", failure)
                        );
                    }
                },
                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
        );*/
    /* Delete an Item */
     /*   Amplify.DataStore.query(Todo.class, Where.matches(Todo.NAME.beginsWith("New")),
                matches -> {
                    if (matches.hasNext()) {
                        Todo todo = matches.next();
                        Amplify.DataStore.delete(todo,
                                deleted -> Log.i("MyAmplifyApp", "Deleted a post."),
                                failure -> Log.e("MyAmplifyApp", "Delete failed.", failure)
                        );
                    }
                },
                failure -> Log.e("MyAmplifyApp", "Query failed.", failure)
        );*/
        /* Query List of Items */
        Amplify.DataStore.query(Todo.class,
                todos -> {
                    while (todos.hasNext()) {
                        Todo todo = todos.next();

                        Log.i("Tutorial", "==== Todo ====");
                        Log.i("Tutorial", "Name: " + todo.getName());

                        if (todo.getPriority() != null) {
                            Log.i("Tutorial", "Priority: " + todo.getPriority().toString());
                        }

                        if (todo.getDescription() != null) {
                            Log.i("Tutorial", "Description: " + todo.getDescription());
                        }
                    }
                },
                failure -> Log.e("Tutorial", "Could not query DataStore", failure)
        );

        /* Symc with Cloud */
        Amplify.DataStore.observe(Todo.class,
                started -> Log.i("Tutorial", "Observation began."),
                change -> Log.i("Tutorial", change.item().toString()),
                failure -> Log.e("Tutorial", "Observation failed.", failure),
                () -> Log.i("Tutorial", "Observation complete.")
        );

    }
}