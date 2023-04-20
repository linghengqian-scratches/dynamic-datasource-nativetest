# dynamic-datasource-nativetest
## TODO as yet unsettled
- For https://github.com/baomidou/dynamic-datasource-spring-boot-starter/issues/465
- Demonstrate executing the nativeTest of Dynamic Datasource Spring Boot Starter, that is, executing unit tests under
  Native Image.
- You can complete the verification on a new instance of Ubuntu 22.04.2 by following the steps below.
```shell
cd /tmp
sudo apt install unzip zip curl sed -y
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 22.3.1.r17-grl
sdk use java 22.3.1.r17-grl
gu install native-image
sudo apt-get install build-essential libz-dev zlib1g-dev -y

cd ~
git clone git@github.com:linghengqian/dynamic-datasource-nativetest.git
cd ./dynamic-datasource-nativetest/
./gradlew clean nativeTest
```
- You can see that the Dynamic Datasource Spring Boot Starter behaves normally in the nativeTest Task of the GraalVM Native Build Tools.
```shell

```
