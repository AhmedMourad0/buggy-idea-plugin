package com.ahmedmourad.buggy.idea

import com.intellij.codeInspection.InspectionSuppressor
import com.intellij.codeInspection.SuppressQuickFix
import com.intellij.psi.PsiElement

val LOG by lazy { com.intellij.openapi.diagnostic.Logger.getInstance("#mirror.test") }
class DataClassPrivateConstructorInspectionSuppressor : InspectionSuppressor {

    override fun isSuppressedFor(element: PsiElement, toolId: String): Boolean {
        LOG.info("xxxxxxxxxxxxx - $toolId\t$element")
        return true
    }

    override fun getSuppressActions(element: PsiElement?, toolId: String): Array<SuppressQuickFix> {
        return SuppressQuickFix.EMPTY_ARRAY
    }

    companion object {
        private const val TOOL_ID = "DataClassPrivateConstructor"
    }
}
