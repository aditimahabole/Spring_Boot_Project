Here's a concise list of **important points for `autowire="constructor"`** based on how Spring XML autowiring works:

---

### ✅ **Key Points for `autowire="constructor"`**

1. **Injection is based on constructor argument types**
    - Spring matches constructor parameters by **type**, not name.
    - Example:
      ```java
      public Car(Specification specification) { ... }
      ```

2. **Only one matching bean per constructor parameter type must exist**
    - If multiple beans of the same type exist, Spring gets confused and throws an error.

3. **Constructor must exist**
    - Spring will use the constructor with the **most arguments** that can be satisfied.

4. **Setter is not used**
    - No need for setters; injection is done via constructor directly.

5. **Bean name is irrelevant**
    - The bean name (`id`) in XML does not need to match anything.

6. **Best for immutable dependencies**
    - Encourages good design where dependencies are provided at creation time.

---

### ❌ What to Avoid

- **Multiple beans of the same type** in the XML when using constructor injection.
  ```xml
  <bean id="spec1" class="Specification"/>
  <bean id="spec2" class="Specification"/>
  ```
  ⛔ Will throw `NoUniqueBeanDefinitionException`.

---

### 📝 XML Example

```xml
<bean id="specification" class="com.example.Specification">
    <property name="make" value="Toyota"/>
    <property name="model" value="Corolla"/>
</bean>

<bean id="myCar" class="com.example.Car" autowire="constructor" />
```

### 🧾 Java Example

```java
public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
        System.out.println("Constructor called in Car");
    }
}
```

---
