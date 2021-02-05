package _05_access_modifier_static_java.practices.access_modifier._default.pack;

public class A {
//    Nếu bạn không sử dụng bất kỳ modifier nào, nó được coi là mặc định. Default chỉ có thể truy cập trong Package. Nó không thể được truy cập từ bên ngoài Package. Nó cung cấp khả năng tiếp cận nhiều hơn Private. Nhưng, nó hạn chế hơn Protected và Public.
//
//    Trong ví dụ này, chúng ta sẽ tạo ra hai Package pack và mypack. Chúng ta đang truy cập lớp A từ bên ngoài Package của nó, vì lớp A không là Public, vì vậy nó không thể được truy cập từ bên ngoài Package:


    void msg(){System.out.println("Hello");}
}
