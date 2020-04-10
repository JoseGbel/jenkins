pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkpace('pipelineJob.groovy'))
            sandbox()
        }
    }
}