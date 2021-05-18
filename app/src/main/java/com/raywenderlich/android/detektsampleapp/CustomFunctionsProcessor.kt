//package com.raywenderlich.android.detektsampleapp
//
//import io.gitlab.arturbosch.detekt.api.DetektVisitor
//import io.gitlab.arturbosch.detekt.api.FileProcessListener
//import org.jetbrains.kotlin.com.intellij.openapi.util.Key
//import org.jetbrains.kotlin.psi.KtFile
//import org.jetbrains.kotlin.psi.KtNamedFunction
//
//class CustomFunctionsProcessor: FileProcessListener {
//
//    override fun onProcess(file: KtFile) {
//        val visitor = FunctionsVisitor()
//        file.accept(visitor)
//        file.putUserData(numberOfMethodsKey, visitor.methods)
//    }
//
//    companion object {
//        val numberOfMethodsKey = Key<Int>("number of loops")
//    }
//
//    class FunctionsVisitor : DetektVisitor() {
//
//        internal var methods = 0
//
//        override fun visitNamedFunction(function: KtNamedFunction) {
//            super.visitNamedFunction(function)
//            methods ++
//        }
//    }
//}