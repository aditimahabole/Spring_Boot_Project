

---

# ✨ **Setter Injection using XML Configuration**

1. We created two Java classes:
    - `Specification` (with properties `make` and `model` + getters and setters).
    - `Car` (depends on `Specification`, with a **setter method** `setSpecification()`).

2. In the XML file (`applicationSetterInjection.xml`):
    - Defined a **bean** for `Specification`, setting `make` and `model` using `<property>`.
    - Defined a **bean** for `Car`, using `<property name="specification" ref="carSpecification"/>` to inject `Specification` through the **setter method**.

3. In the `App` (main class):
    - Loaded the XML using `ApplicationContext`.
    - Retrieved the `Car` bean with `context.getBean("myCar")`.
    - Called `car.displayDetails()` to print the injected `Specification` details.

---

# ✨ **Key Points to Remember**

| Step | Action |
|:---|:---|
| 1 | Create dependent class (`Specification`) and main class (`Car`) with a **setter** |
| 2 | In XML, define `Specification` bean with properties |
| 3 | Define `Car` bean and inject `Specification` using `<property name="specification" ref="carSpecification"/>` |
| 4 | In the main method, load XML and get the `Car` bean from context |

---

