pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('whatIsInYourFridgeJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'http://www.github.com/josegbel/sample-spring-kotlin'
                    }
                    branch 'master'
                }
            }
        }
    }
}