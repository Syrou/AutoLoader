# AutoLoader
## A project demonstration how to automaticly load modules
Making a decoupled application and structures can be a bit confusing.
More so when you quickly want to be able to turn off/on features with CI easily.

The following project is using a scheme which will allow modules to inject themselves into an application, meaning the main application only needs to write
compile project (":moduleNAme") or compile 'xx.domain.name' in order for the module to be loaded into the project, no extra method call or allocation is needed to be added by the coder into the main application.

This project illstrate a basic usecase where we want to connect to different type of devices, but the main application should never be aware of what those connections should look like.
