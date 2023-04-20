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
$ ./gradlew clean nativeTest

> Task :processTestAot
00:58:49.118 [main] INFO org.springframework.test.context.aot.TestClassScanner -- Scanning for Spring test classes in all packages in classpath roots [/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/resources/test, /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/classes/java/test]
00:58:49.589 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using TestExecutionListeners for test class [AddRemoveDatasourceTest]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
00:58:49.599 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Neither @ContextConfiguration nor @ContextHierarchy found for test class [AddRemoveDatasourceTest]: using SpringBootContextLoader
00:58:49.601 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader -- Could not detect default resource locations for test class [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:58:49.624 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using ContextCustomizers for test class [AddRemoveDatasourceTest]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer]
00:58:49.725 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using TestExecutionListeners for test class [LoadDatasourceFromJDBCTest]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
00:58:49.727 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Neither @ContextConfiguration nor @ContextHierarchy found for test class [LoadDatasourceFromJDBCTest]: using SpringBootContextLoader
00:58:49.727 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader -- Could not detect default resource locations for test class [com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:58:49.730 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using ContextCustomizers for test class [LoadDatasourceFromJDBCTest]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer]
00:58:49.733 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using TestExecutionListeners for test class [NestDataSourceTest]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
00:58:49.734 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Neither @ContextConfiguration nor @ContextHierarchy found for test class [NestDataSourceTest]: using SpringBootContextLoader
00:58:49.735 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader -- Could not detect default resource locations for test class [com.lingh.dynamicdatasourcenativetest.NestDataSourceTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:58:49.737 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using ContextCustomizers for test class [NestDataSourceTest]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer]
00:58:49.740 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using TestExecutionListeners for test class [SPELTest]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
00:58:49.741 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Neither @ContextConfiguration nor @ContextHierarchy found for test class [SPELTest]: using SpringBootContextLoader
00:58:49.741 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader -- Could not detect default resource locations for test class [com.lingh.dynamicdatasourcenativetest.SPELTest]: no resource found for suffixes {-context.xml, Context.groovy}.
00:58:49.745 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using ContextCustomizers for test class [SPELTest]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer]
00:58:49.748 [main] DEBUG org.springframework.test.context.aot.TestContextAotGenerator -- Generating AOT artifacts for test classes [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T00:58:50.033+08:00  INFO 5777 --- [           main] c.l.d.AddRemoveDatasourceTest            : Starting AddRemoveDatasourceTest using Java 17.0.6 with PID 5777 (/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/classes/java/test started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T00:58:50.035+08:00  INFO 5777 --- [           main] c.l.d.AddRemoveDatasourceTest            : No active profile set, falling back to 1 default profile: "default"

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T00:58:51.867+08:00  INFO 5777 --- [           main] c.l.d.LoadDatasourceFromJDBCTest         : Starting LoadDatasourceFromJDBCTest using Java 17.0.6 with PID 5777 (/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/classes/java/test started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T00:58:51.868+08:00  INFO 5777 --- [           main] c.l.d.LoadDatasourceFromJDBCTest         : No active profile set, falling back to 1 default profile: "default"

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T00:58:52.335+08:00  INFO 5777 --- [           main] c.l.d.NestDataSourceTest                 : Starting NestDataSourceTest using Java 17.0.6 with PID 5777 (/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/classes/java/test started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T00:58:52.335+08:00  INFO 5777 --- [           main] c.l.d.NestDataSourceTest                 : No active profile set, falling back to 1 default profile: "default"

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T00:58:52.729+08:00  INFO 5777 --- [           main] c.l.d.SPELTest                           : Starting SPELTest using Java 17.0.6 with PID 5777 (/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/classes/java/test started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T00:58:52.730+08:00  INFO 5777 --- [           main] c.l.d.SPELTest                           : No active profile set, falling back to 1 default profile: "default"

> Task :compileAotTestJava
注: 某些输入文件使用或覆盖了已过时的 API。
注: 有关详细信息, 请使用 -Xlint:deprecation 重新编译。

> Task :test
2023-04-21T00:58:59.977+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource start closing ....
2023-04-21T00:58:59.977+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown initiated...
2023-04-21T00:58:59.980+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown completed.
2023-04-21T00:58:59.980+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown initiated...
2023-04-21T00:58:59.981+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown completed.
2023-04-21T00:58:59.981+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown initiated...
2023-04-21T00:58:59.982+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown completed.
2023-04-21T00:58:59.982+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown initiated...
2023-04-21T00:58:59.983+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown completed.
2023-04-21T00:58:59.984+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource all closed success,bye
2023-04-21T00:58:59.995+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource start closing ....
2023-04-21T00:58:59.995+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown initiated...
2023-04-21T00:58:59.996+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown completed.
2023-04-21T00:58:59.996+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown initiated...
2023-04-21T00:58:59.997+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown completed.
2023-04-21T00:58:59.998+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown initiated...
2023-04-21T00:58:59.999+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown completed.
2023-04-21T00:58:59.999+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown initiated...
2023-04-21T00:59:00.000+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown completed.
2023-04-21T00:59:00.000+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource all closed success,bye
2023-04-21T00:59:00.005+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource start closing ....
2023-04-21T00:59:00.005+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown initiated...
2023-04-21T00:59:00.006+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown completed.
2023-04-21T00:59:00.006+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : teacher - Shutdown initiated...
2023-04-21T00:59:00.009+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : teacher - Shutdown completed.
2023-04-21T00:59:00.009+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown initiated...
2023-04-21T00:59:00.012+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown completed.
2023-04-21T00:59:00.012+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown initiated...
2023-04-21T00:59:00.013+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown completed.
2023-04-21T00:59:00.014+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : student - Shutdown initiated...
2023-04-21T00:59:00.016+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : student - Shutdown completed.
2023-04-21T00:59:00.016+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown initiated...
2023-04-21T00:59:00.017+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown completed.
2023-04-21T00:59:00.017+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource all closed success,bye
2023-04-21T00:59:00.023+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource start closing ....
2023-04-21T00:59:00.023+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown initiated...
2023-04-21T00:59:00.024+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db1 - Shutdown completed.
2023-04-21T00:59:00.024+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown initiated...
2023-04-21T00:59:00.025+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db3 - Shutdown completed.
2023-04-21T00:59:00.025+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown initiated...
2023-04-21T00:59:00.026+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : db2 - Shutdown completed.
2023-04-21T00:59:00.026+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant1_1 - Shutdown initiated...
2023-04-21T00:59:00.031+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant1_1 - Shutdown completed.
2023-04-21T00:59:00.031+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant1_2 - Shutdown initiated...
2023-04-21T00:59:00.035+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant1_2 - Shutdown completed.
2023-04-21T00:59:00.036+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant2_1 - Shutdown initiated...
2023-04-21T00:59:00.046+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant2_1 - Shutdown completed.
2023-04-21T00:59:00.047+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant2_2 - Shutdown initiated...
2023-04-21T00:59:00.048+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : tenant2_2 - Shutdown completed.
2023-04-21T00:59:00.049+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown initiated...
2023-04-21T00:59:00.060+08:00  INFO 5828 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : master - Shutdown completed.
2023-04-21T00:59:00.060+08:00  INFO 5828 --- [ionShutdownHook] c.b.d.d.DynamicRoutingDataSource         : dynamic-datasource all closed success,bye

> Task :generateTestResourcesConfigFile
[native-image-plugin] Resources configuration written into /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/native/generated/generateTestResourcesConfigFile/resource-config.json

> Task :nativeTestCompile
[native-image-plugin] GraalVM Toolchain detection is disabled
[native-image-plugin] GraalVM location read from environment variable: JAVA_HOME
[native-image-plugin] Native Image executable path: /home/linghengqian/.sdkman/candidates/java/22.3.1.r17-grl/lib/svm/bin/native-image
========================================================================================================================
GraalVM Native Image: Generating 'dynamic-datasource-nativetest-tests' (executable)...
========================================================================================================================
Warning: Could not resolve kotlin.jvm.JvmInline for reflection configuration. Reason: java.lang.ClassNotFoundException: kotlin.jvm.JvmInline.
Warning: Could not resolve org.mockito.configuration.MockitoConfiguration for reflection configuration. Reason: java.lang.ClassNotFoundException: org.mockito.configuration.MockitoConfiguration.
Warning: Method com.zaxxer.hikari.HikariConfig.getScheduledExecutorService() not found.
Warning: Method com.zaxxer.hikari.HikariConfig.isInitializationFailFast() not found.
Warning: Method com.zaxxer.hikari.HikariConfig.isJdbc4ConnectionTest() not found.
Warning: Method com.zaxxer.hikari.HikariConfig.setInitializationFailFast(boolean) not found.
Warning: Method com.zaxxer.hikari.HikariConfig.setJdbc4ConnectionTest(boolean) not found.
Warning: Method com.zaxxer.hikari.HikariConfig.setScheduledExecutorService(ScheduledThreadPoolExecutor) not found.
[1/7] Initializing...                                                                                   (25.4s @ 0.39GB)
 Version info: 'GraalVM 22.3.1 Java 17 CE'
 Java version info: '17.0.6+10-jvmci-22.3-b13'
 C compiler: gcc (linux, x86_64, 11.3.0)
 Garbage collector: Serial GC
 2 user-specific feature(s)
 - org.graalvm.junit.platform.JUnitPlatformFeature
 - org.springframework.aot.nativex.feature.PreComputeFieldFeature
[junit-platform-native] Running in 'test listener' mode using files matching pattern [junit-platform-unique-ids*] found in folder [/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/test-results/test/testlist] and its subfolders.
Field org.springframework.boot.logging.log4j2.Log4J2LoggingSystem$Factory#PRESENT set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#romePresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jaxb2Present set to true at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jackson2Present set to true at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jackson2XmlPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jackson2SmilePresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jackson2CborPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#gsonPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#jsonbPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#kotlinSerializationCborPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#kotlinSerializationJsonPresent set to false at build time
Field org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#kotlinSerializationProtobufPresent set to false at build time
Field org.springframework.core.NativeDetector#imageCode set to true at build time
Field org.apache.commons.logging.LogAdapter#log4jSpiPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#log4jSlf4jProviderPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#slf4jSpiPresent set to true at build time
Field org.apache.commons.logging.LogAdapter#slf4jApiPresent set to true at build time
Field org.springframework.cglib.core.AbstractClassGenerator#imageCode set to true at build time
Field org.springframework.boot.logging.logback.LogbackLoggingSystem$Factory#PRESENT set to true at build time
Field org.springframework.boot.test.web.reactive.server.WebTestClientContextCustomizerFactory#webClientPresent set to false at build time
Field org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener#MOCKITO_IS_PRESENT set to true at build time
Field org.springframework.test.context.web.socket.MockServerContainerContextCustomizerFactory#webSocketPresent set to true at build time
Field org.springframework.boot.logging.java.JavaLoggingSystem$Factory#PRESENT set to true at build time
Field org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#jta12Present set to false at build time
Field org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#ejb3Present set to false at build time
Field org.springframework.core.KotlinDetector#kotlinPresent set to false at build time
Field org.springframework.core.KotlinDetector#kotlinReflectPresent set to false at build time
Field org.springframework.web.context.support.StandardServletEnvironment#jndiPresent set to true at build time
Field org.springframework.web.servlet.view.InternalResourceViewResolver#jstlPresent set to false at build time
Field org.springframework.http.converter.json.Jackson2ObjectMapperBuilder#jackson2XmlPresent set to false at build time
Field org.springframework.format.support.DefaultFormattingConversionService#jsr354Present set to false at build time
Field org.springframework.web.context.support.WebApplicationContextUtils#jsfPresent set to false at build time
Field org.springframework.transaction.interceptor.TransactionAspectSupport#vavrPresent set to false at build time
Field org.springframework.transaction.interceptor.TransactionAspectSupport#reactiveStreamsPresent set to false at build time
Field org.springframework.web.context.request.RequestContextHolder#jsfPresent set to false at build time
Field org.springframework.web.client.RestTemplate#romePresent set to false at build time
Field org.springframework.web.client.RestTemplate#jaxb2Present set to true at build time
Field org.springframework.web.client.RestTemplate#jackson2Present set to true at build time
Field org.springframework.web.client.RestTemplate#jackson2XmlPresent set to false at build time
Field org.springframework.web.client.RestTemplate#jackson2SmilePresent set to false at build time
Field org.springframework.web.client.RestTemplate#jackson2CborPresent set to false at build time
Field org.springframework.web.client.RestTemplate#gsonPresent set to false at build time
Field org.springframework.web.client.RestTemplate#jsonbPresent set to false at build time
Field org.springframework.web.client.RestTemplate#kotlinSerializationCborPresent set to false at build time
Field org.springframework.web.client.RestTemplate#kotlinSerializationJsonPresent set to false at build time
Field org.springframework.web.client.RestTemplate#kotlinSerializationProtobufPresent set to false at build time
Field org.springframework.boot.web.client.ClientHttpRequestFactories#APACHE_HTTP_CLIENT_PRESENT set to false at build time
Field org.springframework.boot.web.client.ClientHttpRequestFactories#OKHTTP_CLIENT_PRESENT set to false at build time
Field org.springframework.context.event.ApplicationListenerMethodAdapter#reactiveStreamsPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#jaxb2Present set to true at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#jackson2Present set to true at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#jackson2XmlPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#jackson2SmilePresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#gsonPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#jsonbPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#kotlinSerializationCborPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#kotlinSerializationJsonPresent set to false at build time
Field org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter#kotlinSerializationProtobufPresent set to false at build time
Field org.springframework.boot.autoconfigure.web.format.WebConversionService#JSR_354_PRESENT set to false at build time
Field org.springframework.web.servlet.support.RequestContext#jstlPresent set to false at build time
Field org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator#USER_PROVIDED_ERROR_CODES_FILE_PRESENT set to false at build time
Field org.springframework.core.ReactiveAdapterRegistry#reactorPresent set to false at build time
Field org.springframework.core.ReactiveAdapterRegistry#rxjava3Present set to false at build time
Field org.springframework.core.ReactiveAdapterRegistry#kotlinCoroutinesPresent set to false at build time
Field org.springframework.core.ReactiveAdapterRegistry#mutinyPresent set to false at build time
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
Field org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler#isContextPropagationPresent set to false at build time
Field org.springframework.boot.logging.logback.LogbackLoggingSystemProperties#JBOSS_LOGGING_PRESENT set to false at build time
[2/7] Performing analysis...  [***********]                                                            (154.8s @ 2.80GB)
  22,044 (92.39%) of 23,859 classes reachable
  35,528 (67.88%) of 52,341 fields reachable
 104,717 (62.52%) of 167,500 methods reachable
     970 classes,   814 fields, and 5,384 methods registered for reflection
      67 classes,    74 fields, and    57 methods registered for JNI access
       4 native libraries: dl, pthread, rt, z
[3/7] Building universe...                                                                              (12.1s @ 4.01GB)
[4/7] Parsing methods...      [***]                                                                      (9.6s @ 2.51GB)
[5/7] Inlining methods...     [***]                                                                      (4.8s @ 3.03GB)
[6/7] Compiling methods...    [*********]                                                               (80.7s @ 3.93GB)
[7/7] Creating image...                                                                                 (12.4s @ 1.83GB)
  48.00MB (51.43%) for code area:    70,318 compilation units
  41.46MB (44.43%) for image heap:  455,381 objects and 190 resources
   3.86MB ( 4.13%) for other data
  93.32MB in total
------------------------------------------------------------------------------------------------------------------------
Top 10 packages in code area:                               Top 10 object types in image heap:
   1.64MB sun.security.ssl                                    10.38MB byte[] for code metadata
   1.16MB java.util                                            5.29MB java.lang.Class
 917.39KB java.lang.invoke                                     4.43MB java.lang.String
 721.70KB com.sun.crypto.provider                              3.90MB byte[] for java.lang.String
 591.43KB org.h2.table                                         3.46MB byte[] for general heap data
 582.64KB org.h2.command                                       2.25MB byte[] for embedded resources
 561.26KB org.apache.catalina.core                             1.85MB com.oracle.svm.core.hub.DynamicHubCompanion
 554.98KB jdk.proxy4                                           1.19MB byte[] for reflection metadata
 519.77KB org.apache.tomcat.util.net                         889.26KB java.lang.String[]
 509.63KB java.util.concurrent                               780.86KB c.o.svm.core.hub.DynamicHub$ReflectionMetadata
  39.83MB for 922 more packages                                6.77MB for 4675 more object types
------------------------------------------------------------------------------------------------------------------------
                        26.2s (8.4% of total time) in 55 GCs | Peak RSS: 5.95GB | CPU load: 4.11
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
 /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/native/nativeTestCompile/dynamic-datasource-nativetest-tests (executable)
 /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/native/nativeTestCompile/dynamic-datasource-nativetest-tests.build_artifacts.txt (txt)
========================================================================================================================
Finished generating 'dynamic-datasource-nativetest-tests' in 5m 10s.
    [native-image-plugin] Native Image written to: /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/native/nativeTestCompile

> Task :nativeTest FAILED
JUnit Platform on Native Image - report
----------------------------------------

01:04:13.692 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Neither @ContextConfiguration nor @ContextHierarchy found for test class [AddRemoveDatasourceTest]: using SpringBootContextLoader
01:04:13.692 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader -- Could not detect default resource locations for test class [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest]: no resource found for suffixes {-context.xml, Context.groovy}.
01:04:13.692 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using ContextCustomizers for test class [AddRemoveDatasourceTest]: [DisableObservabilityContextCustomizer, PropertyMappingContextCustomizer, Customizer, ExcludeFilterContextCustomizer, DuplicateJsonObjectContextCustomizer, MockitoContextCustomizer, TestRestTemplateContextCustomizer]
01:04:13.694 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Using TestExecutionListeners for test class [AddRemoveDatasourceTest]: [ServletTestExecutionListener, DirtiesContextBeforeModesTestExecutionListener, ApplicationEventsTestExecutionListener, MockitoTestExecutionListener, DependencyInjectionTestExecutionListener, DirtiesContextTestExecutionListener, TransactionalTestExecutionListener, SqlScriptsTestExecutionListener, EventPublishingTestExecutionListener, RestDocsTestExecutionListener, MockRestServiceServerResetTestExecutionListener, MockMvcPrintOnlyOnFailureTestExecutionListener, WebDriverTestExecutionListener, MockWebServiceServerTestExecutionListener, ResetMocksTestExecutionListener]
01:04:13.694 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener -- Before test class: class [AddRemoveDatasourceTest], class annotated with @DirtiesContext [false] with mode [null]
01:04:13.694 [main] DEBUG org.springframework.test.context.support.DependencyInjectionTestExecutionListener -- Performing dependency injection for test class com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest
01:04:13.694 [main] DEBUG org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate -- Loading ApplicationContext for AOT runtime for test class com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T01:04:13.708+08:00  INFO 6174 --- [           main] c.l.d.AddRemoveDatasourceTest            : Starting AOT-processed AddRemoveDatasourceTest using Java 17.0.6 with PID 6174 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T01:04:13.708+08:00  INFO 6174 --- [           main] c.l.d.AddRemoveDatasourceTest            : No active profile set, falling back to 1 default profile: "default"
2023-04-21T01:04:13.746+08:00  INFO 6174 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2023-04-21T01:04:13.752+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-21T01:04:13.752+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-21T01:04:13.765+08:00  INFO 6174 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-21T01:04:13.765+08:00  INFO 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 57 ms
2023-04-21T01:04:13.787+08:00  WARN 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
2023-04-21T01:04:13.787+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-04-21T01:04:13.788+08:00 ERROR 6174 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext001_Autowiring.apply(UserController__TestContext001_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]



        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

    None


Negative matches:
-----------------

    None


Exclusions:
-----------

    None
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]


Unconditional classes:
----------------------
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]

    None



        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted

2023-04-21T01:04:13.792+08:00 ERROR 6174 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener] to prepare test instance [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest@42aaceaf]

java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@222b5a70 testClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest__TestContext001_ApplicationContextInitializer, original = [WebMergedContextConfiguration@42ab8814 testClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext001_Autowiring.apply(UserController__TestContext001_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 68 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T01:04:13.811+08:00  INFO 6174 --- [           main] c.l.d.LoadDatasourceFromJDBCTest         : Starting AOT-processed LoadDatasourceFromJDBCTest using Java 17.0.6 with PID 6174 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T01:04:13.812+08:00  INFO 6174 --- [           main] c.l.d.LoadDatasourceFromJDBCTest         : No active profile set, falling back to 1 default profile: "default"
2023-04-21T01:04:13.859+08:00  INFO 6174 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2023-04-21T01:04:13.863+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-21T01:04:13.863+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-21T01:04:13.866+08:00  INFO 6174 --- [           main] o.a.c.c.C.[Tomcat-1].[localhost].[/]     : Initializing Spring embedded WebApplicationContext
2023-04-21T01:04:13.866+08:00  INFO 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 54 ms
2023-04-21T01:04:13.873+08:00  WARN 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
2023-04-21T01:04:13.873+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-04-21T01:04:13.874+08:00 ERROR 6174 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext002_Autowiring.apply(UserController__TestContext002_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]

        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]


============================
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

    None


Negative matches:
-----------------
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]

    None


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    None



        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted

2023-04-21T01:04:13.876+08:00 ERROR 6174 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener] to prepare test instance [com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest@4da71f87]

java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@72e12634 testClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest__TestContext002_ApplicationContextInitializer, original = [WebMergedContextConfiguration@4166ab8c testClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext002_Autowiring.apply(UserController__TestContext002_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 68 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T01:04:13.887+08:00  INFO 6174 --- [           main] c.l.d.NestDataSourceTest                 : Starting AOT-processed NestDataSourceTest using Java 17.0.6 with PID 6174 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T01:04:13.887+08:00  INFO 6174 --- [           main] c.l.d.NestDataSourceTest                 : No active profile set, falling back to 1 default profile: "default"
2023-04-21T01:04:13.919+08:00  INFO 6174 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2023-04-21T01:04:13.921+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-21T01:04:13.921+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-21T01:04:13.925+08:00  INFO 6174 --- [           main] o.a.c.c.C.[Tomcat-2].[localhost].[/]     : Initializing Spring embedded WebApplicationContext
2023-04-21T01:04:13.925+08:00  INFO 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 38 ms
2023-04-21T01:04:13.941+08:00  WARN 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
2023-04-21T01:04:13.941+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-04-21T01:04:13.942+08:00 ERROR 6174 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]



============================
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext003_Autowiring.apply(UserController__TestContext003_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]

        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
    None
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]

        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]

Negative matches:
-----------------

    None


Exclusions:
-----------

    None


Unconditional classes:
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
----------------------

    None



        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted

2023-04-21T01:04:13.944+08:00 ERROR 6174 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener] to prepare test instance [com.lingh.dynamicdatasourcenativetest.NestDataSourceTest@2923fe5]

java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@3ff8e3aa testClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest__TestContext003_ApplicationContextInitializer, original = [WebMergedContextConfiguration@55d48186 testClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.NestApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext003_Autowiring.apply(UserController__TestContext003_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 68 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-21T01:04:13.952+08:00  INFO 6174 --- [           main] c.l.d.SPELTest                           : Starting AOT-processed SPELTest using Java 17.0.6 with PID 6174 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest)
2023-04-21T01:04:13.953+08:00  INFO 6174 --- [           main] c.l.d.SPELTest                           : No active profile set, falling back to 1 default profile: "default"
2023-04-21T01:04:13.971+08:00  INFO 6174 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2023-04-21T01:04:13.973+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-21T01:04:13.973+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-21T01:04:13.976+08:00  INFO 6174 --- [           main] o.a.c.c.C.[Tomcat-3].[localhost].[/]     : Initializing Spring embedded WebApplicationContext
2023-04-21T01:04:13.976+08:00  INFO 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 23 ms
2023-04-21T01:04:13.983+08:00  WARN 6174 --- [           main] w.s.c.ServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
2023-04-21T01:04:13.984+08:00  INFO 6174 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2023-04-21T01:04:13.985+08:00 ERROR 6174 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null


        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]

============================
CONDITIONS EVALUATION REPORT
============================

        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext004_Autowiring.apply(UserController__TestContext004_Autowiring.java:14) ~[na:na]

        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
Positive matches:
-----------------

    None

        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]

Negative matches:
-----------------

    None

        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]

Exclusions:
-----------

    None


Unconditional classes:
----------------------

    None



        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted

2023-04-21T01:04:13.987+08:00 ERROR 6174 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.support.DependencyInjectionTestExecutionListener] to prepare test instance [com.lingh.dynamicdatasourcenativetest.SPELTest@2250bd2b]

java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@1f066a5a testClass = com.lingh.dynamicdatasourcenativetest.SPELTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.SPELTest__TestContext004_ApplicationContextInitializer, original = [WebMergedContextConfiguration@38b08148 testClass = com.lingh.dynamicdatasourcenativetest.SPELTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.SPELApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127) ~[na:na]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:382) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:377) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[dynamic-datasource-nativetest-tests:na]
        at java.base@17.0.6/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:376) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:289) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:288) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:278) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at java.base@17.0.6/java.util.Optional.orElseGet(Optional.java:364) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:277) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:105) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:104) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:68) ~[dynamic-datasource-nativetest-tests:5.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at java.base@17.0.6/java.util.ArrayList.forEach(ArrayList.java:1511) ~[dynamic-datasource-nativetest-tests:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[na:na]
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[dynamic-datasource-nativetest-tests:1.9.2]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102) ~[na:na]
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:95) ~[na:na]
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:91) ~[na:na]
        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:60) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74) ~[na:na]
        at org.graalvm.junit.platform.NativeImageJUnitLauncher.main(NativeImageJUnitLauncher.java:129) ~[na:na]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195) ~[na:na]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167) ~[na:na]
        at com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext004_Autowiring.apply(UserController__TestContext004_Autowiring.java:14) ~[na:na]
        at org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:973) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:917) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1388) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:545) ~[na:na]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.boot.test.context.SpringBootContextLoader.loadContextForAotRuntime(SpringBootContextLoader.java:119) ~[dynamic-datasource-nativetest-tests:3.0.5]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInAotMode(DefaultCacheAwareContextLoaderDelegate.java:214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:115) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 68 common frames omitted
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267) ~[na:na]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202) ~[na:na]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1158) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:189) ~[na:na]
        ... 96 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1417) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1337) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:327) ~[na:na]
        ... 111 common frames omitted
Caused by: java.lang.NullPointerException: null
        at com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[dynamic-datasource-nativetest-tests:6.0.7]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[dynamic-datasource-nativetest-tests:6.0.7]
        ... 121 common frames omitted

com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest > testAddAndRemoveDataSource() FAILED

com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest > testExistDataSource() FAILED

com.lingh.dynamicdatasourcenativetest.NestDataSourceTest > testNest() FAILED

com.lingh.dynamicdatasourcenativetest.SPELTest > testSPEL() FAILED


Failures (4):
  JUnit Jupiter:AddRemoveDatasourceTest:testAddAndRemoveDataSource()
    MethodSource [className = 'com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest', methodName = 'testAddAndRemoveDataSource', methodParameterTypes = '']
    => java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@222b5a70 testClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest__TestContext001_ApplicationContextInitializer, original = [WebMergedContextConfiguration@42ab8814 testClass = com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.AddRemoveDatasourceApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
       org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142)
       org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94)
       org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195)
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167)
       com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext001_Autowiring.apply(UserController__TestContext001_Autowiring.java:14)
       org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214)
       [...]
     Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520)
       org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326)
       org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
       [...]
     Caused by: java.lang.NullPointerException
       com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766)
       [...]
  JUnit Jupiter:LoadDatasourceFromJDBCTest:testExistDataSource()
    MethodSource [className = 'com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest', methodName = 'testExistDataSource', methodParameterTypes = '']
    => java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@72e12634 testClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest__TestContext002_ApplicationContextInitializer, original = [WebMergedContextConfiguration@4166ab8c testClass = com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.LoadDatasourceFromJDBCApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
       org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142)
       org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94)
       org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195)
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167)
       com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext002_Autowiring.apply(UserController__TestContext002_Autowiring.java:14)
       org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214)
       [...]
     Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520)
       org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326)
       org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
       [...]
     Caused by: java.lang.NullPointerException
       com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766)
       [...]
  JUnit Jupiter:NestDataSourceTest:testNest()
    MethodSource [className = 'com.lingh.dynamicdatasourcenativetest.NestDataSourceTest', methodName = 'testNest', methodParameterTypes = '']
    => java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@3ff8e3aa testClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest__TestContext003_ApplicationContextInitializer, original = [WebMergedContextConfiguration@55d48186 testClass = com.lingh.dynamicdatasourcenativetest.NestDataSourceTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.NestApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
       org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142)
       org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94)
       org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195)
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167)
       com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext003_Autowiring.apply(UserController__TestContext003_Autowiring.java:14)
       org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214)
       [...]
     Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520)
       org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326)
       org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
       [...]
     Caused by: java.lang.NullPointerException
       com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766)
       [...]
  JUnit Jupiter:SPELTest:testSPEL()
    MethodSource [className = 'com.lingh.dynamicdatasourcenativetest.SPELTest', methodName = 'testSPEL', methodParameterTypes = '']
    => java.lang.IllegalStateException: Failed to load ApplicationContext for [AotMergedContextConfiguration@1f066a5a testClass = com.lingh.dynamicdatasourcenativetest.SPELTest, contextInitializerClass = com.lingh.dynamicdatasourcenativetest.SPELTest__TestContext004_ApplicationContextInitializer, original = [WebMergedContextConfiguration@38b08148 testClass = com.lingh.dynamicdatasourcenativetest.SPELTest, locations = [], classes = [com.lingh.dynamicdatasourcenativetest.SPELApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceLocations = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true", "server.port=0"], contextCustomizers = [org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@9da1, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@497c75f0, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@47fbe6fa, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@6f99e91c, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@2114510, org.springframework.boot.test.context.SpringBootTestAnnotation@ce9458b6], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]]
       org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:142)
       org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:127)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependenciesInAotMode(DependencyInjectionTestExecutionListener.java:148)
       org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:94)
       org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:241)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userController': Unsatisfied dependency expressed through field 'userService': Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveValue(AutowiredFieldValueResolver.java:195)
       org.springframework.beans.factory.aot.AutowiredFieldValueResolver.resolveAndSet(AutowiredFieldValueResolver.java:167)
       com.lingh.dynamicdatasourcenativetest.controller.UserController__TestContext004_Autowiring.apply(UserController__TestContext004_Autowiring.java:14)
       org.springframework.beans.factory.support.InstanceSupplier$1.get(InstanceSupplier.java:83)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       [...]
     Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userService': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:343)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:267)
       org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:202)
       org.springframework.beans.factory.support.DefaultListableBeanFactory.obtainInstanceFromSupplier(DefaultListableBeanFactory.java:947)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1214)
       [...]
     Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource': null
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520)
       org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326)
       org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
       [...]
     Caused by: java.lang.NullPointerException
       com.baomidou.dynamic.datasource.DynamicRoutingDataSource.afterPropertiesSet(DynamicRoutingDataSource.java:224)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816)
       org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766)
       [...]

Test run finished after 312 ms
[         5 containers found      ]
[         0 containers skipped    ]
[         5 containers started    ]
[         0 containers aborted    ]
[         5 containers successful ]
[         0 containers failed     ]
[         4 tests found           ]
[         0 tests skipped         ]
[         4 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         4 tests failed          ]


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':nativeTest'.
> Process 'command '/home/linghengqian/TwinklingLiftWorks/git/public/dynamic-datasource-nativetest/build/native/nativeTestCompile/dynamic-datasource-nativetest-tests'' finished with non-zero exit value 1

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.6.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 5m 28s
11 actionable tasks: 11 executed
```
