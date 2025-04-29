
Here’s a **simple, beginner-friendly explanation** of what I did:

---

# ✨ **Loose Coupling using Interface and Spring XML**

### 1. Java Classes and Interface
- `UserDataProviderInterface` — an **interface** that defines `getUserDetails()`.
- Three classes **implement** this interface:
    - `UserDatabase`
    - `AnotherDatabase`
    - `WebServiceDataProvider`

Each class gives its own way of fetching user details.

- `UserManager` class **depends** on `UserDataProviderInterface`.
    - It has a **constructor** that accepts `UserDataProviderInterface`.
    - So, when you create a `UserManager` object, you must give it **which provider** to use.

---

### 2. XML Configuration (`applicationIocLooseCoupling.xml`)
- Created **beans** for the three provider classes:
  ```xml
  <bean id="userDB" class="com.ioc.loose.coupling.UserDatabase"/>
  <bean id="anotherDB" class="com.ioc.loose.coupling.AnotherDatabase"/>
  <bean id="webService" class="com.ioc.loose.coupling.WebServiceDataProvider"/>
  ```

- Created **three beans** for `UserManager`, each with **different dependency injected**:
  ```xml
  <bean id="userManagerWithUserDB" class="com.ioc.loose.coupling.UserManager">
      <constructor-arg ref="userDB" />
  </bean>

  <bean id="userManagerWithAnotherDB" class="com.ioc.loose.coupling.UserManager">
      <constructor-arg ref="anotherDB" />
  </bean>

  <bean id="userManagerWithWebService" class="com.ioc.loose.coupling.UserManager">
      <constructor-arg ref="webService" />
  </bean>
  ```

✅ **Here, `ref` means inject that particular object into the constructor of `UserManager`.**

---

### 3. Main Class (`IocExample.java`)
- **Load the XML** using `ApplicationContext`.
- **Ask for a bean** using `context.getBean("beanId")`.
- Get three different `UserManager` objects, each wired with a different data provider.

```java
UserManager userWithUserDB = (UserManager) context.getBean("userManagerWithUserDB");
UserManager userWithAnotherDB = (UserManager) context.getBean("userManagerWithAnotherDB");
UserManager userWithWebService = (UserManager) context.getBean("userManagerWithWebService");
```

- When you call `getUserInfo()`, it internally calls the `getUserDetails()` method of the injected provider.

---

# 🛠 **Summary (Step-by-Step)**

| Step | Action |
|:---|:---|
| 1 | Created an interface and multiple classes implementing it |
| 2 | Made a dependent class (`UserManager`) which needs an object of interface |
| 3 | In XML, created beans for the three implementations |
| 4 | Also created three `UserManager` beans injecting different providers |
| 5 | In Main class, loaded XML, got the beans, and used them |

---

# 🌟 **Key Concept**
- Spring manages your objects (**Inversion of Control**).
- Dependency is injected **automatically** at runtime by Spring (no need for `new` keyword).
- You can **easily switch** the underlying provider without touching `UserManager` code — **Loose Coupling**!

---

