package com.fred.scalingdoodle

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class MyPluginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog(
            "Hello from your new plugin, Fred!",
            "Scaling Doodle",
            Messages.getInformationIcon()
        )
    }
}
