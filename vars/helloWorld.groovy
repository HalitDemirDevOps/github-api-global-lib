def call(Map config = [:]) {
    sh "echo Halit ${config.name}. Today is ${config.dayOfWeek}."
}
