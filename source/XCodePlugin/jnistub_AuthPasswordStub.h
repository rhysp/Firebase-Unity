/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jnistub_AuthPasswordStub */

#ifndef _Included_jnistub_AuthPasswordStub
#define _Included_jnistub_AuthPasswordStub
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jnistub_AuthPasswordStub
 * Method:    onAuthenticated
 * Signature: (JLcom/firebase/client/AuthData;)V
 */
JNIEXPORT void JNICALL Java_jnistub_AuthPasswordStub_onAuthenticated
  (JNIEnv *, jobject, jlong, jobject);

/*
 * Class:     jnistub_AuthPasswordStub
 * Method:    onAuthenticationError
 * Signature: (JLcom/firebase/client/FirebaseError;)V
 */
JNIEXPORT void JNICALL Java_jnistub_AuthPasswordStub_onAuthenticationError
  (JNIEnv *, jobject, jlong, jobject);

#ifdef __cplusplus
}
#endif
#endif