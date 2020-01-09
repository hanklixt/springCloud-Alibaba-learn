# profile(如果进行此项配置)
 - 默认先加载${spring.application.name}+file-extension
 - 后加载${spring.application.name}+file-extension
 - 取值为后取值会覆盖之前取值，即以profile环境为准
#group
 - 未配置使用group配置时，使用DEFAULT_GROUP作为默认组
 - 可以在控制台进行配置
#namespace
 - 未配置时不启该选项，配置之后启用该项，配置时需要配置id  
 