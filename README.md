# Servlet JSP Project Example

一個 Servlet JSP 專案的範例

### Run Project

```
./gradlew build --refresh-dependencies
./gradlew tomcatRun
```

瀏覽器進入 http://localhost:8189/login

- 帳號：admin
- 密碼：1234

### build class (tomcatRun 執行過程中，能 auto reload class)

```
./gradlew build
```

### 打包成WAR檔

```
./gradlew war
```

檔案會產生在 `build/libs/` 資料夾中

### 資料夾結構

- `src/main/java/Filter` 裡面放 filter class
- `src/main/java/Servlet/Api` 裡面放 api 的 servlet class
- `src/main/java/Servlet/Pages` 裡面放 page 的 servlet class
- `src/main/webapp/WEB-INF/jsp` 裡面放不直接存取的jsp
