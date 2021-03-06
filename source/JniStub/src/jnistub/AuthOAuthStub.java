/*
Copyright 2015 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package jnistub;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by benwu on 9/10/15.
 */
public class AuthOAuthStub {
    public AuthOAuthStub(Firebase ref, final long callbackToken, String provider, String authToken) {
        ref.authWithOAuthToken(provider, authToken, new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                AuthOAuthStub.this.onAuthenticated(callbackToken, authData);
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                AuthOAuthStub.this.onAuthenticationError(callbackToken, firebaseError);

            }
        });

    }

    public native void onAuthenticated(long token, AuthData authData);

    public native void onAuthenticationError(long token, FirebaseError firebaseError);

}
