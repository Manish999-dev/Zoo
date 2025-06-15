# Zoo

# 🐾 Animal Behavior Java Project

This project demonstrates core **Object-Oriented Programming (OOP)** concepts in Java such as **abstraction**, **inheritance**, **interfaces**, and **polymorphism** by modeling animal behaviors like walking, swimming, and eating.

---

## ⚙️ Technical Details

### 🔹 Class: `Animal`
- **Type:** `abstract class`
- **Purpose:** Base class representing general properties of an animal.
- **May Include:** Common attributes or methods such as `name`, `species`, or `displayInfo()`.

### 🔹 Interface: `Eat`
- **Method:** `void eat();`
- **Implemented By:** `Tiger`, `Dolphin`
- **Purpose:** Defines eating behavior (polymorphic behavior based on species).

### 🔹 Interface: `Walk`
- **Method:** `void walk();`
- **Implemented By:** `Tiger`
- **Purpose:** Represents the ability to walk, relevant to land animals.

### 🔹 Interface: `Swim`
- **Method:** `void swim();`
- **Implemented By:** `Dolphin`
- **Purpose:** Represents the ability to swim, relevant to aquatic animals.

### 🔹 Class: `Tiger`
- **Extends:** `Animal`
- **Implements:** `Walk`, `Eat`
- **Overrides:** Behavior specific to tigers, such as `walk()` and `eat()`.

### 🔹 Class: `Dolphin`
- **Extends:** `Animal`
- **Implements:** `Swim`, `Eat`
- **Overrides:** Behavior specific to dolphins, such as `swim()` and `eat()`.

### 🔹 Class: `Main`
- **Contains:** `public static void main(String[] args)`
- **Purpose:** Creates instances of `Tiger` and `Dolphin`, and invokes their behaviors.

---

## 🧪 Example Output
Tiger is walking.
Tiger is eating meat.
Dolphin is swimming.
Dolphin is eating fish.


---

## 💡 Key Concepts Demonstrated

- **Abstraction:** `Animal` provides a template for all animals.
- **Inheritance:** `Tiger` and `Dolphin` inherit from `Animal`.
- **Interfaces:** Behavior is defined using separate interfaces (`Eat`, `Walk`, `Swim`).
- **Polymorphism:** Each animal class implements behavior differently.
- **Clean Architecture:** Promotes modularity and separation of concerns using interfaces.

---

## ▶️ How to Run

1. Open a terminal in the project directory.
2. Compile all `.java` files:

   ```bash
   javac *.java
3. Run the program:

    ```bash
    java Main
## 👤 Author
Manish Kumar Dangal Magar

Created as an educational project for learning Java OOP principles.

## 🎯 Future Goals

This project has room for further development and enhancements. Here are some ideas for future improvements:

- [ ] **Add More Animals**  
  Introduce new animal classes like `Bird`, `Fish`, `Frog`, etc., each with unique behaviors and abilities.

- [ ] **Introduce a `Fly` Interface**  
  Create a new `Fly` interface and implement it in classes like `Eagle` or `Parrot` to demonstrate flying behavior.

- [ ] **Add Animal Properties**  
  Include additional attributes such as `name`, `age`, `habitat`, and `speed`, and display them using a `displayInfo()` method.

- [ ] **Use Collections**  
  Manage animals using Java Collections like `ArrayList<Animal>` to store and iterate through multiple objects polymorphically.

- [ ] **Implement a GUI**  
  Build a graphical version using JavaFX or Swing to allow users to select and interact with animals through buttons and menus.

- [ ] **Add Unit Testing**  
  Use JUnit to write test cases for behaviors like `eat()`, `walk()`, and `swim()` to ensure correctness and maintainability.

- [ ] **Introduce a Behavior Simulation Loop**  
  Use polymorphism to loop through animals and invoke their behaviors dynamically (e.g., in a simulation or virtual zoo).

- [ ] **Add Sound or Console Animation**  
  Include simple console animations or sound effects to simulate actions like walking or swimming.

- [ ] **Create a Configurable Ecosystem**  
  Allow users to configure and simulate interactions in a basic ecosystem, modeling food chains or environmental responses.

- [ ] **Generate JavaDocs**  
  Add JavaDoc comments and generate HTML documentation for better maintainability and developer understanding.

Feel free to fork, extend, or customize the project!



