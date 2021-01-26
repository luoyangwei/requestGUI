package com.github.luoyangwei.requestgui.services

import com.github.luoyangwei.requestgui.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
