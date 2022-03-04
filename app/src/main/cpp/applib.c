#include <jni.h>

#include "answer.h"

JNIEXPORT jint JNICALL
Java_nl_biancavanschaik_prefabtestapp_AppLib_intFromJNI(JNIEnv *env, jobject thiz) {
    return get_the_answer();
}
