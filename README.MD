# 🛒 WebApp Kinh Doanh Laptop

## Giới thiệu
Dự án **WebApp Kinh Doanh Laptop** là một hệ thống thương mại điện tử giúp người dùng dễ dàng mua sắm laptop trực tuyến. Ứng dụng được xây dựng bằng **Spring Boot** và sử dụng **MySQL** làm cơ sở dữ liệu, hỗ trợ đầy đủ các chức năng quản lý sản phẩm, giỏ hàng, đơn hàng và thanh toán.

## Công nghệ sử dụng
- **Ngôn ngữ lập trình**: Java
- **Framework**: Spring Boot 3.2.2
- **Cơ sở dữ liệu**: MySQL
- **Giao diện**: JSP (Sử dụng template từ [ThemeWagon](https://themewagon.com/))
- **Bảo mật**: Spring Security (Authorization, Session, Remember Me)
- **ORM**: Hibernate với JPA
- **Cấu trúc dự án**: Maven
- **Kiểm tra dữ liệu đầu vào**: Validate form input

## Chức năng
### Dành cho Quản Trị Viên (Admin)
- **Quản lý người dùng**: Thêm, cập nhật, xóa (CRUD)
- **Quản lý sản phẩm**: Thêm, cập nhật, xóa, tải lên hình ảnh sản phẩm
- **Quản lý danh mục sản phẩm**
- **Quản lý đơn hàng**: Xem danh sách đơn hàng, thay đổi trạng thái đơn hàng

### Dành cho Người Dùng
- **Xem danh sách sản phẩm**
- **Thêm sản phẩm vào giỏ hàng**
- **Tăng/giảm số lượng sản phẩm trong giỏ**
- **Đặt hàng và thanh toán**
- **Xem lịch sử mua hàng**

## Hướng dẫn cài đặt
### 1️⃣ Yêu cầu hệ thống
- **Java**: 17
- **Spring Boot**: 3.2.2
- **Cài đặt đầy đủ dependencies trong `pom.xml`**

### 2️⃣ Cài đặt và chạy dự án
#### Clone repository
```bash
git clone https://github.com/NgnTienDat/springmvc-hoidanit-course.git
cd springmvc-hoidanit-course
```
#### Cấu hình cơ sở dữ liệu
- Tạo một database MySQL mới
- Cập nhật thông tin kết nối trong `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
spring.datasource.username=root
spring.datasource.password=<password>
```
#### Chạy dự án
Bạn có thể chạy dự án trên **IntelliJ IDEA** hoặc **Visual Studio Code**.

** Khuyến khích sử dụng Visual Studio Code với các bước sau:**
1. Mở thư mục dự án trong **Visual Studio Code**.
2. Cài đặt **Extension Pack for Java** (nếu chưa có).
3. Mở terminal và chạy lệnh:
   ```bash
   mvn spring-boot:run
   ```
4. Hoặc chạy trực tiếp bằng file `LaptopshopApplication.java` trong thư mục:
   ```
   src/main/java/com/example/laptopshop/
   ```

### 3️⃣ Truy cập ứng dụng
- **Trang Admin**: [http://localhost:8080/admin](http://localhost:8080/admin)
- **Trang Người Dùng**: [http://localhost:8080/home](http://localhost:8080/home)

### 4️⃣ Cơ sở dữ liệu mẫu
Dự án đi kèm với một file **SQL** chứa dữ liệu mẫu để bạn dễ dàng thiết lập cơ sở dữ liệu.

#### File cơ sở dữ liệu
- **Vị trí**: `database/laptopshop.sql`(sẽ cập nhật sau)
- **Cách import vào MySQL**:
  1. Mở **MySQL Workbench**.
  2. Tạo một database mới với lệnh:
     ```sql
     CREATE DATABASE laptopshop;
     ```
  3. Trong MySQL Workbench, vào **Server** → **Data Import** → Chọn file `laptopshop.sql` và nhấn **Start Import**.


## Liên hệ
Mọi thắc mắc trong quá trình tải hoặc cài đặc dự án vui lòng liên hệ qua email 2251012143trung@ou.edu.vn hoặc 2251012034dat@ou.edu.vn. 

