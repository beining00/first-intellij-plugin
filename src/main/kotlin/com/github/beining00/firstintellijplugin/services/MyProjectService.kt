package com.github.beining00.firstintellijplugin.services

import com.github.beining00.firstintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
